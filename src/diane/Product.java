import java.sql.*;

public class Product {
    private Connection con;
    private Statement state;

    public Product(Connection con) {
        this.con = con;
        try {
            this.state = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to create the Product table
    private void createProductTable() {
        String queryProduct = "CREATE TABLE IF NOT EXISTS Product (" +
                "productid INT NOT NULL AUTO_INCREMENT, " +
                "productname VARCHAR(255), " +
                "productprice DECIMAL(10, 2), " +
                "productdescription TEXT, " +
                "brand VARCHAR(100), " +
                "branchid INT, " +
                "availablequantity INT, " +
                "quantitysold INT, " +
                "productrating DECIMAL(3, 2), " +
                "PRIMARY KEY (productid), " +
                "FOREIGN KEY (branchid) REFERENCES Branch(branchid))";

        try {
            state.executeUpdate(queryProduct);
            System.out.println("Product table created successfully or already exists.");
        } catch (SQLException e) {
            System.out.println("Error creating Product table: " + e.getMessage());
        }
    }

    // Method to insert a new product record
    public void insertProduct(String productname, double productprice, String productdescription, 
                              String brand, int branchid, int availablequantity, int quantitysold, 
                              double productrating) {
        String insertQuery = "INSERT INTO Product (productname, productprice, productdescription, " +
                "brand, branchid, availablequantity, quantitysold, productrating) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
            pstmt.setString(1, productname);
            pstmt.setDouble(2, productprice);
            pstmt.setString(3, productdescription);
            pstmt.setString(4, brand);
            pstmt.setInt(5, branchid);
            pstmt.setInt(6, availablequantity);
            pstmt.setInt(7, quantitysold);
            pstmt.setDouble(8, productrating);
            pstmt.executeUpdate();
            System.out.println("New product record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting product record: " + e.getMessage());
        }
    }

    // Method to update an existing product record
    public void updateProduct(int productid, String productname, double productprice, 
                              String productdescription, String brand, int branchid, int availablequantity, 
                              int quantitysold, double productrating) {
        String updateQuery = "UPDATE Product SET productname = ?, productprice = ?, " +
                "productdescription = ?, brand = ?, branchid = ?, availablequantity = ?, quantitysold = ?, " +
                "productrating = ? WHERE productid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(updateQuery)) {
            pstmt.setString(1, productname);
            pstmt.setDouble(2, productprice);
            pstmt.setString(3, productdescription);
            pstmt.setString(4, brand);
            pstmt.setInt(5, branchid);
            pstmt.setInt(6, availablequantity);
            pstmt.setInt(7, quantitysold);
            pstmt.setDouble(8, productrating);
            pstmt.setDouble(9, productid);
            pstmt.executeUpdate();
            System.out.println("Product record updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating product record: " + e.getMessage());
        }
    }

    // Method to delete a product record
    public void deleteProduct(int productid) {
        String deleteQuery = "DELETE FROM Product WHERE productid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
            pstmt.setInt(1, productid);
            pstmt.executeUpdate();
            System.out.println("Product record deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting product record: " + e.getMessage());
        }
    }

    // Method to select all product records
    public void selectAllProducts() {
        String selectQuery = "SELECT * FROM Product";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int productid = rs.getInt("productid");
                String productname = rs.getString("productname");
                double productprice = rs.getDouble("productprice");
                String productdescription = rs.getString("productdescription");
                String brand = rs.getString("brand");
                int branchid = rs.getInt("branchid");
                int availablequantity = rs.getInt("availablequantity");
                int quantitysold = rs.getInt("quantitysold");
                double productrating = rs.getDouble("productrating");

                System.out.printf("Product ID: %d, Name: %s, Price: %.2f, Description: %s, Brand: %s, " +
                                  "Branch ID: %d, Available Quantity: %d, Quantity Sold: %d, Rating: %.2f%n",
                                  productid, productname, productprice, productdescription, brand,
                                  branchid, availablequantity, quantitysold, productrating);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting product records: " + e.getMessage());
        }
    }

    // Method to select all product records
    public void selectAvailableProducts(String street, String city, String region, String country) {
        String selectQuery = "SELECT * FROM Product p " +
                                "JOIN Branch b ON p.branchid = b.branchid " +
                                "AND street LIKE '%" + street + "%'"  +
                                "AND city LIKE '%" + city + "%'"  +
                                "AND region LIKE '%" + region + "%'"  +
                                "AND country LIKE '%" + country + "%'"  +
                                "WHERE availablequantity > 0";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int productid = rs.getInt("productid");
                String productname = rs.getString("productname");
                double productprice = rs.getDouble("productprice");
                String productdescription = rs.getString("productdescription");
                String brand = rs.getString("brand");
                int branchid = rs.getInt("branchid");
                int availablequantity = rs.getInt("availablequantity");
                int quantitysold = rs.getInt("quantitysold");
                double productrating = rs.getDouble("productrating");

                System.out.printf("Product ID: %d, Name: %s, Price: %.2f, Description: %s, Brand: %s, " +
                                  "Branch ID: %d, Available Quantity: %d, Quantity Sold: %d, Rating: %.2f%n",
                                  productid, productname, productprice, productdescription, brand,
                                  branchid, availablequantity, quantitysold, productrating);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting product records: " + e.getMessage());
        }
    }

    boolean subtractQuantity(int productid, int buyQuantity) {
        String selectQuery = "SELECT availableQuantity FROM Product WHERE productid = " + productid;
        String updateQuery = "UPDATE Product SET availableQuantity = ? WHERE productid = " + productid;
        boolean success = false;
    
        try (PreparedStatement selectStmt = con.prepareStatement(selectQuery);
             PreparedStatement updateStmt = con.prepareStatement(updateQuery)) {
    
            // Retrieve the current available quantity
            ResultSet rs = selectStmt.executeQuery();
    
            if (rs.next()) {
                int availableQuantity = rs.getInt("availableQuantity");
    
                if (availableQuantity >= buyQuantity) {
                    int newQuantity = availableQuantity - buyQuantity;
    
                    updateStmt.setInt(1, newQuantity);
                    int rowsAffected = updateStmt.executeUpdate();
    
                    success = rowsAffected > 0; 
                    System.out.println("Quantity updated successfully.");
                } else {
                    System.out.println("Insufficient quantity available.");
                }
            }
    
        } catch (SQLException e) {
            System.out.println("Error subtracting quantity: " + e.getMessage());
        }
    
        return success;
    }
    

    boolean addQuantity(int productid, int addQ) {
        String selectQuery = "SELECT availableQuantity FROM Product WHERE productid = " + productid;
        String updateQuery = "UPDATE Product SET availableQuantity = ? WHERE productid = " + productid;
        boolean success = false;
    
        try (PreparedStatement selectStmt = con.prepareStatement(selectQuery);
             PreparedStatement updateStmt = con.prepareStatement(updateQuery)) {
    
            // Retrieve the current available quantity
            ResultSet rs = selectStmt.executeQuery();
    
            if (rs.next()) {
                int availableQuantity = rs.getInt("availableQuantity");
                int newQuantity = availableQuantity + addQ; 
    
                updateStmt.setInt(1, newQuantity);
                updateStmt.executeUpdate();
    
                success = true;
                System.out.println("Quantity updated successfully.");

            }
    
        } catch (SQLException e) {
            System.out.println("Error subtracting quantity: " + e.getMessage());
        }
    
        return success;
    }

    // Close resources
    public void close() {
        try {
            if (state != null) {
                state.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.getMessage());
        }
    }
}
