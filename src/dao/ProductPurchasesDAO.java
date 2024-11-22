import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ProductPurchasesDAO {

    private final Statement statement;

    public ProductPurchasesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to any implemented DAO.
    // SINGLE QUERY UPDATE
    public void insertProductPurchase(int memberID, int productID, int quantitySold) {
        if (quantitySold <= 0) {
            System.out.println("Product purchase quantity sold is invalid.");
            return;
        }

        String sql = "INSERT INTO product_purchases (member_id, product_id, quantity_sold, purchase_date_time) " +
                "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);              // member_id
            ps.setInt(2, productID);             // product_id
            ps.setInt(3, quantitySold);          // quantity_sold
            ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));  // purchase_date_time

            ps.executeUpdate();
            System.out.println("Product purchase record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteProductPurchase(int productPurchaseID) {
        DBUtils.deleteTableRecordsByKey("product_purchases", "product_purchase_id", productPurchaseID);
    }

    public void updateProductPurchase(int productPurchaseID, ProductPurchase pp) {
        if (!DBUtils.primaryKeyExistsInATable("product_purchases", "product_purchase_id", productPurchaseID)) {
            return;
        }

        String sql = "UPDATE product_purchases " +
                    "SET member_id = ?, " +
                    "    product_id = ?, " +
                    "    quantity_sold = ?, " +
                    "    purchase_date_time = ? " +
                    "WHERE product_purchase_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, pp.memberID());              // member_id
            ps.setInt(2, pp.productID());             // product_id
            ps.setInt(3, pp.quantitySold());          // quantity_sold
            ps.setTimestamp(4, Timestamp.valueOf(pp.purchaseDateTime()));  // purchase_date_time
            ps.setInt(5, productPurchaseID);        // product_purchase_id

            ps.executeUpdate();
            System.out.println("Product purchase record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // MASS QUERY UPDATE
    public void updateProductID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("product_purchases", "product_id", oldID, newID);
    }

    public void updateMemberID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("product_purchases", "member_id", oldID, newID);
    }

    public void deleteByMemberID(int memberID) {
        DBUtils.deleteTableRecordsByKey("product_purchases", "member_id", memberID);
    }

    public void deleteByProductID(int productID) {
        DBUtils.deleteTableRecordsByKey("product_purchases", "product_id", productID);
    }

    // SELECT QUERIES
    public static ProductPurchase selectProductPurchase(int productPurchaseID) {
        String condition = "WHERE product_purchase_id = " + productPurchaseID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("product_purchases", condition);
        assert rs != null;
        return mapResultSetToProductPurchase(rs);
    }

    public Object[][] selectAllProductPurchases() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("product_purchases");
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToProductPurchaseList(rs));
    }

    public Object[][] selectAllProductPurchasesByMemberID(int memberID) {
        String condition = "WHERE member_id = " + memberID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("product_purchases", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToProductPurchaseList(rs));
    }

    public Object[][] selectAllProductPurchasesByProductID(int productID) {
        String condition = "WHERE product_id = " + productID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("product_purchases", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToProductPurchaseList(rs));
    }

    // TRANSACIONS
    // sell is insert
    // delete is delete
    public void cancelProductPurchase(int productPurchaseID) {
        ProductPurchase pp = selectProductPurchase(productPurchaseID);
        int quantity = pp.quantitySold();
        ProductsDAO.undoPurchase(productPurchaseID, quantity);
        deleteProductPurchase(productPurchaseID);
    }

    public void updateProductPurchase(int oldProductID, int newProductID, int quantitySold, int memberID) {
        ProductPurchase oldPP = selectProductPurchase(oldProductID);
        ProductPurchase newPP = new ProductPurchase(
            oldPP.productPurchaseID(),
            memberID,
            newProductID,
            quantitySold,
            oldPP.purchaseDateTime()
        );
        ProductsDAO.undoPurchase(oldProductID, quantitySold);
        ProductsDAO.removeStock(newProductID, quantitySold);
    }

    // UTILITY FUNCTIONS
    public static ProductPurchase mapResultSetToProductPurchase(ResultSet rs) {
        try {
            int productPurchaseID = rs.getInt("product_purchase_id");
            int memberID = rs.getInt("member_id");
            int productID = rs.getInt("product_id");
            int quantitySold = rs.getInt("quantity_sold");
            LocalDateTime purchaseDateTime = rs.getTimestamp("purchase_date_time").toLocalDateTime();

            return new ProductPurchase(productPurchaseID, memberID, productID, quantitySold, purchaseDateTime);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<ProductPurchase> mapResultSetToProductPurchaseList(ResultSet rs) {
        ArrayList<ProductPurchase> productPurchaseList = new ArrayList<ProductPurchase>();
        try {
            while (rs.next()) {
                productPurchaseList.add(mapResultSetToProductPurchase(rs));
            }
            return productPurchaseList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }


    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
