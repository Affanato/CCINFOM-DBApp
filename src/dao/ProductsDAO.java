import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductsDAO {

    private Statement statement;

    public ProductsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to any implemented DAO.
    // SINGLE UPDATE QUERIES
    public boolean insertProduct(String productBrand, String productName, String productDescription, double productPrice, int availableQuantity) {
        if (productPrice <= 0 || availableQuantity < 0) {
            System.out.println("Invalid price or quantity");
            return false;
        }

        String sql = "INSERT INTO products (product_brand, product_name, product_description, product_price, available_quantity) " +
                "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, productBrand);
            ps.setString(2, productName);
            ps.setString(3, productDescription);
            ps.setDouble(4, productPrice);
            ps.setInt(5, availableQuantity);

            ps.executeUpdate();
            System.out.println("Product record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    public boolean deleteProduct(int productID) {
        if (selectProduct(productID) == null) return false;
        DBUtils.invalidateTableForeignKey("product_purchases", "product_id", productID);
        DBUtils.deleteTableRecordsByKey("products", "product_id", productID);
        return true;
    }

    public boolean updateProduct(int productID, Product product) {
        if (!DBUtils.primaryKeyExistsInATable("products", "product_id", productID)) {
            return false;
        }

        String sql = "UPDATE products " +
                "SET product_brand = ?, " +
                "    product_name = ?, " +
                "    product_description = ?, " +
                "    product_price = ?, " +
                "    available_quantity = ? " +
                "WHERE product_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, product.productBrand());        // product_brand
            ps.setString(2, product.productName());         // product_name
            ps.setString(3, product.productDescription());  // product_description
            ps.setDouble(4, product.productPrice());        // product_price
            ps.setInt(5, product.availableQuantity());      // available_quantity
            ps.setInt(6, productID);                        // product_id

            ps.executeUpdate();
            System.out.println("Product record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    // TRANSACTIONS
    // NOTE: addProduct is just insertProduct
    public boolean sellProduct(int productID, int quantitySold) {
        // EDGE/INVALID CASES (invalid product id, insufficient stock)
        if (!DBUtils.primaryKeyExistsInATable("products", "product_id", productID)) {
            System.out.println("The Product ID " + productID + " does not exist.");
            return false;
        }

        Product product = selectProduct(productID);
        if (product.availableQuantity() < quantitySold) {
            System.out.println("Insufficient stock for Product ID: " + productID + ".");
            return false;
        }

        // Calculate the new available quantity
        int newQuantity = product.availableQuantity() - quantitySold;

        // Create an updated Product object with the new quantity
        Product updatedProduct = new Product(
                product.productID(),
                product.productBrand(),
                product.productName(),
                product.productDescription(),
                product.productPrice(),
                newQuantity
        );

        // Update the product in the database
        updateProduct(productID, updatedProduct);

        return true;
    }

    public boolean restockProduct(int productID, int quantityAdded) {
        if (!DBUtils.primaryKeyExistsInATable("products", "product_id", productID)) {
            return false;
        }

        Product product = selectProduct(productID);
        Product updatedProduct = new Product(
                product.productID(),
                product.productBrand(),
                product.productName(),
                product.productDescription(),
                product.productPrice(),
                product.availableQuantity() + quantityAdded
        );

        updateProduct(productID, updatedProduct);
        return true;
    }

    // REPORTS
    public Object[][] selectProductsByYearlyQuantitySold(int year) {
        String sql = "SELECT p.product_brand, p.product_name, " +
                    "       SUM(pp.quantity_sold) AS totalQuantitySold " +
                    "FROM products p " +
                    "JOIN product_purchases pp ON pp.product_id = p.product_id " +
                    "WHERE YEAR(pp.purchase_datetime) = ? " +
                    "GROUP BY p.product_id " +
                    "ORDER BY totalQuantitySold DESC, p.product_brand, p.product_name;";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            ps.setInt(1, year);  // Set the year parameter

            try (ResultSet rs = ps.executeQuery()) {
                List<Object[]> tempList = new ArrayList<>();

                while (rs.next()) {
                    int productId = rs.getInt("product_id");
                    String productBrand = rs.getString("product_brand");
                    String productName = rs.getString("product_name");
                    int totalQuantitySold = rs.getInt("totalQuantitySold");

                    Object[] elem = {productId, productBrand, productName, totalQuantitySold};
                    tempList.add(elem);
                }

                return tempList.toArray(new Object[0][]);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectProductsByMonthlyQuantitySold(int year, int month) {
        String sql = "SELECT p.product_brand, p.product_name, " +
                    "       SUM(pp.quantity_sold) AS totalQuantitySold " +
                    "FROM products p " +
                    "JOIN product_purchases pp ON pp.product_id = p.product_id " +
                    "WHERE YEAR(pp.purchase_datetime) = ? " +
                    "       AND MONTH(pp.purchase_datetime) = ? " +
                    "GROUP BY p.product_id " +
                    "ORDER BY totalQuantitySold DESC, p.product_brand, p.product_name;";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            ps.setInt(1, year);  // Set the year parameter
            ps.setInt(2, month); // Set the month parameter

            try (ResultSet rs = ps.executeQuery()) {
                List<Object[]> tempList = new ArrayList<>();

                while (rs.next()) {
                    int productId = rs.getInt("product_id");
                    String productBrand = rs.getString("product_brand");
                    String productName = rs.getString("product_name");
                    int totalQuantitySold = rs.getInt("totalQuantitySold");

                    Object[] elem = {productId, productBrand, productName, totalQuantitySold};
                    tempList.add(elem);
                }

                return tempList.toArray(new Object[0][]);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectProductsByYearlyTotalRevenue(int year) {
        String sql = "SELECT p.product_brand, p.product_name, " +
                    "       SUM(pp.quantity_sold) AS totalQuantitySold, p.product_price, " +
                    "       SUM(pp.quantity_sold * p.product_price) AS totalRevenue " +
                    "FROM products p " +
                    "JOIN product_purchases pp ON pp.product_id = p.product_id " +
                    "WHERE YEAR(pp.purchase_datetime) = ? " +
                    "GROUP BY p.product_id " +
                    "ORDER BY totalRevenue DESC, p.product_brand, p.product_name;";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            ps.setInt(1, year);  // Set the year parameter

            try (ResultSet rs = ps.executeQuery()) {
                List<Object[]> tempList = new ArrayList<>();

                while (rs.next()) {
                    int productId = rs.getInt("product_id");
                    String productBrand = rs.getString("product_brand");
                    String productName = rs.getString("product_name");
                    int totalQuantitySold = rs.getInt("totalQuantitySold");
                    double productPrice = rs.getDouble("product_price");
                    double totalRevenue = rs.getDouble("totalRevenue");

                    Object[] elem = {productId, productBrand, productName, totalQuantitySold, productPrice, totalRevenue};
                    tempList.add(elem);
                }

                return tempList.toArray(new Object[0][]);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectProductsByMonthlyTotalRevenue(int year, int month) {
        String sql = "SELECT p.product_brand, p.product_name, " +
                "       SUM(pp.quantity_sold) AS totalQuantitySold, p.product_price, " +
                "       SUM(pp.quantity_sold * p.product_price) AS totalRevenue " +
                "FROM products p " +
                "JOIN product_purchases pp ON pp.product_id = p.product_id " +
                "WHERE YEAR(pp.purchase_datetime) = ? " +
                "AND MONTH(pp.purchase_datetime) = ? " +
                "GROUP BY p.product_id " +
                "ORDER BY totalRevenue DESC, p.product_brand, p.product_name;";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            ps.setInt(1, year);  // Set the year parameter
            ps.setInt(2, month); // Set the month parameter

            try (ResultSet rs = ps.executeQuery()) {
                List<Object[]> tempList = new ArrayList<>();

                while (rs.next()) {
                    int productId = rs.getInt("product_id");
                    String productBrand = rs.getString("product_brand");
                    String productName = rs.getString("product_name");
                    int totalQuantitySold = rs.getInt("totalQuantitySold");
                    double productPrice = rs.getDouble("product_price");
                    double totalRevenue = rs.getDouble("totalRevenue");

                    Object[] elem = {productId, productBrand, productName, totalQuantitySold, productPrice, totalRevenue};
                    tempList.add(elem);
                }

                return tempList.toArray(new Object[0][]);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // newest report!!
    public Object[][] reportMonthlyRevenueByProduct() {
        String sql = "SELECT YEAR(pp.purchase_datetime) as year," +
                    "    MONTH(pp.purchase_datetime) as month," +
                    "    p.product_brand, p.product_name, " +
                    "    SUM(pp.quantity_sold) AS totalQuantitySold " +
                    "FROM products p " +
                    "    JOIN product_purchases pp ON pp.product_id = p.product_id " +
                    "GROUP BY year, month," +
                    "    p.product_id, p.product_brand, p.product_name " +
                    "ORDER BY year DESC, month DESC," +
                    "    totalQuantitySold DESC, p.product_brand, p.product_name;";


        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String productBrand = rs.getString("product_brand");
                String productName = rs.getString("product_name");
                double totalQuantitySold = rs.getDouble("totalQuantitySold");

                Object[] elem = {year, month, productBrand, productBrand, totalQuantitySold};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] reportYearlyRevenueByProduct() {
        String sql = "SELECT YEAR(pp.purchase_datetime) as year," +
                    "    p.product_brand, p.product_name, " +
                    "    SUM(pp.quantity_sold) AS totalQuantitySold " +
                    "FROM products p " +
                    "    JOIN product_purchases pp ON pp.product_id = p.product_id " +
                    "GROUP BY year," +
                    "    p.product_id, p.product_brand, p.product_name " +
                    "ORDER BY year DESC," +
                    "    totalQuantitySold DESC, p.product_brand, p.product_name;";


        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                String productBrand = rs.getString("product_brand");
                String productName = rs.getString("product_name");
                double totalQuantitySold = rs.getDouble("totalQuantitySold");

                Object[] elem = {year, productBrand, productBrand, totalQuantitySold};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // SELECT QUERIES
    public static Product selectProduct(int productID) {
        String condition = "WHERE product_id = " + productID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("products", condition);
        assert rs != null;

        try {
            if (rs.next()) {
                return mapResultSetToProduct(rs);
            } else {
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectAllProducts() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("products");
        assert rs != null;
        return mapResultSetToProductsArr(rs);
    }

    // UTILITY METHODS
    public static Product mapResultSetToProduct(ResultSet rs) {
        try {
            int productID = rs.getInt("product_id");
            String productBrand = rs.getString("product_brand");
            String productName = rs.getString("product_name");
            String productDescription = rs.getString("product_description");
            double productPrice = rs.getDouble("product_price");
            int availableQuantity = rs.getInt("available_quantity");

            return new Product(productID, productBrand, productName, productDescription, productPrice, availableQuantity);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<Product> mapResultSetToProductList(ResultSet rs) {
        ArrayList<Product> productList = new ArrayList<Product>();
        try {
            while (rs.next()) {
                productList.add(mapResultSetToProduct(rs));
            }
            return productList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[] mapResultSetToProductArr(ResultSet rs) {
        try {
            return new Object[] {
                    rs.getInt("product_id"),
                    rs.getString("product_brand"),
                    rs.getString("product_name"),
                    rs.getString("product_description"),
                    rs.getDouble("product_price"),
                    rs.getInt("available_quantity"),
            };
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[][] mapResultSetToProductsArr(ResultSet rs) {
        List<Object[]> amenitiesArr = new ArrayList<Object[]>();

        try {
            while (rs.next()) {
                amenitiesArr.add(mapResultSetToProductArr(rs));
            }
            return amenitiesArr.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public String[] getComboBoxProductIDs() {
        return DBUtils.removeFirstElement(DBUtils.selectAllKeysFromTable("products", "product_id"));
    }

    // PRODUCT PURCHASE <-> PRODUCT CROSS-TABLE UTILITY METHODS
    public static void staticUpdateProduct(int productID, Product product) {
        if (!DBUtils.primaryKeyExistsInATable("products", "product_id", productID)) {
            return;
        }

        String sql = "UPDATE products " +
                "SET product_brand = ?, " +
                "    product_name = ?, " +
                "    product_description = ?, " +
                "    product_price = ?, " +
                "    available_quantity = ? " +
                "WHERE product_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, product.productBrand());        // product_brand
            ps.setString(2, product.productName());         // product_name
            ps.setString(3, product.productDescription());  // product_description
            ps.setDouble(4, product.productPrice());        // product_price
            ps.setInt(5, product.availableQuantity());      // available_quantity
            ps.setInt(6, productID);                        // product_id

            ps.executeUpdate();
            System.out.println("Product record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public static void undoPurchase(int productID, int quantityAdded) {
        if (!DBUtils.primaryKeyExistsInATable("products", "product_id", productID)) {
            return;
        }

        Product product = selectProduct(productID);
        Product updatedProduct = new Product(
                product.productID(),
                product.productBrand(),
                product.productName(),
                product.productDescription(),
                product.productPrice(),
                product.availableQuantity() + quantityAdded
        );

        staticUpdateProduct(productID, updatedProduct);
    }

    public static void removeStock(int productID, int quantitySold) {
        // EDGE/INVALID CASES (invalid product id, insufficient stock)
        if (!DBUtils.primaryKeyExistsInATable("products", "product_id", productID)) {
            System.out.println("The Product ID " + productID + " does not exist.");
            return;
        }

        Product product = selectProduct(productID);
        if (product.availableQuantity() < quantitySold) {
            System.out.println("Insufficient stock for Product ID: " + productID + ".");
            return;
        }

        // Calculate the new available quantity
        int newQuantity = product.availableQuantity() - quantitySold;

        // Create an updated Product object with the new quantity
        Product updatedProduct = new Product(
                product.productID(),
                product.productBrand(),
                product.productName(),
                product.productDescription(),
                product.productPrice(),
                newQuantity
        );

        // Update the product in the database
        staticUpdateProduct(productID, updatedProduct);
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
