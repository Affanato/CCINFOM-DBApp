import java.sql.*;

public class Sales {
    private Connection con;
    private Statement state;

    public Sales(Connection con) {
        this.con = con;
        try {
            this.state = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } 

    // Method to insert a new trainer record
    public boolean insertSale(int memberid, int productid, int quantity) {
        String insertQuery = "INSERT INTO SALES (saledate, memberid, productid, quantity, priceeach, totalprice) " +
                             "VALUES (?, ?, ?, ?, ?, ?)";
        String selectQuery = "SELECT productprice FROM Product p WHERE productid = ?"; 
        boolean result = false;
    
        try (PreparedStatement insertStmt = con.prepareStatement(insertQuery);
             PreparedStatement selectStmt = con.prepareStatement(selectQuery)) {
            
            // Set the product id for the select query
            selectStmt.setInt(1, productid); 
    
            try (ResultSet select = selectStmt.executeQuery()) { // Execute the select query
                if (select.next()) { 
                    double priceeach = select.getDouble("productprice");
    
                    // Insert the current date
                    insertStmt.setDate(1, new Date(System.currentTimeMillis()));
                    insertStmt.setInt(2, memberid);
                    insertStmt.setInt(3, productid);
                    insertStmt.setInt(4, quantity);
                    insertStmt.setDouble(5, priceeach);
                    insertStmt.setDouble(6, priceeach * quantity);
                    
                    // Execute the insert statement
                    insertStmt.executeUpdate(); 

                    Product product = new Product(con);
                    product.subtractQuantity(productid, quantity);
                    result = true;
                } else {
                    System.out.println("No product found with id: " + productid);
                }
            }
    
        } catch (SQLException e) {
            System.out.println("Error inserting sale: " + e.getMessage());
        }
        return result;
    }
    
    public void dailySubscription(int day, int month, int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, COALESCE(SUM(s.quantity), 0) AS Subscribers, COALESCE(SUM(s.quantity), 0) * COALESCE(p.productprice, 0) AS TotalRevenue " +
                                "FROM branch b " +
                                "LEFT JOIN product p ON b.branchid = p.branchid AND p.productname LIKE '%Subscription%' " + 
                                "LEFT JOIN sales s ON p.productid = s.productid AND DAY(s.saledate) = " + day + "AND MONTH(s.saledate) = " + month + " AND YEAR(s.saledate) = " + year + 
                                " GROUP BY b.branchid, b.branchname, p.productid " +
                                " ORDER BY productname";

                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        int subscribers = rs.getInt("subscribers");
                                        Double totalrevenue = rs.getDouble("totalrevenue");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Subscribers: %d, Total Revenue: %f%n",
                                        branchid, branchname, subscribers, totalrevenue);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }

    public void monthlySubscription(int month, int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, COALESCE(SUM(s.quantity), 0) AS Subscribers, COALESCE(SUM(s.quantity), 0) * COALESCE(p.productprice, 0) AS TotalRevenue " +
                                "FROM branch b " +
                                "LEFT JOIN product p ON b.branchid = p.branchid AND p.productname LIKE '%Subscription%' " + 
                                "LEFT JOIN sales s ON p.productid = s.productid AND MONTH(s.saledate) = " + month + " AND YEAR(s.saledate) = " + year + 
                                " GROUP BY b.branchid, b.branchname, p.productid " +
                                " ORDER BY productname";

                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        int subscribers = rs.getInt("subscribers");
                                        Double totalrevenue = rs.getDouble("totalrevenue");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Subscribers: %d, Total Revenue: %f%n",
                                        branchid, branchname, subscribers, totalrevenue);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }
    
    public void annualSubscription(int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, COALESCE(SUM(s.quantity), 0) AS Subscribers, COALESCE(SUM(s.quantity), 0) * COALESCE(p.productprice, 0) AS TotalRevenue " +
                                "FROM branch b " +
                                "LEFT JOIN product p ON b.branchid = p.branchid AND p.productname LIKE '%Subscription%' " + 
                                "LEFT JOIN sales s ON p.productid = s.productid AND YEAR(s.saledate) = " + year + 
                                " GROUP BY b.branchid, b.branchname, p.productid " +
                                " ORDER BY productname";

                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        int subscribers = rs.getInt("subscribers");
                                        Double totalrevenue = rs.getDouble("totalrevenue");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Subscribers: %d, Total Revenue: %f%n",
                                        branchid, branchname, subscribers, totalrevenue);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }
    
    public void dailySales(int day, int month, int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, IF(SUM(s.quantity) IS NOT NULL, SUM(s.quantity), 0) AS totalSales " +
                                "FROM branch b " +
                                "LEFT JOIN product p ON b.branchid = p.branchid " +
                                "LEFT JOIN sales s ON p.productid = s.productid AND DAY(s.saledate) = " + day + "AND MONTH(s.saledate) = " + month + " AND YEAR(s.saledate) = " + year + 
                                " GROUP BY b.branchid " +
                                " ORDER BY totalSales DESC, b.branchid ASC;";

                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        Double totalSales = rs.getDouble("totalrevenue");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Total Sales: %f%n",
                                        branchid, branchname, totalSales);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }

    public void monthlySales(int month, int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, IF(SUM(s.quantity) IS NOT NULL, SUM(s.quantity), 0) AS totalSales " +
                                "FROM branch b " +
                                "LEFT JOIN product p ON b.branchid = p.branchid " + 
                                "LEFT JOIN sales s ON p.productid = s.productid AND MONTH(s.saledate) = " + month + " AND YEAR(s.saledate) = " + year + 
                                " GROUP BY b.branchid " +
                                " ORDER BY totalSales DESC, b.branchid ASC;";

                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        Double totalSales = rs.getDouble("totalSales");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Total Sales: %f%n",
                                        branchid, branchname, totalSales);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }


    public void annualSales(int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, IF(SUM(s.quantity) IS NOT NULL, SUM(s.quantity), 0) AS totalSales " +
                                "FROM branch b " +
                                "LEFT JOIN product p ON b.branchid = p.branchid " + 
                                "LEFT JOIN sales s ON p.productid = s.productid AND YEAR(s.saledate) = " + year + 
                                " GROUP BY b.branchid " +
                                " ORDER BY totalSales DESC, b.branchid ASC;";

                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        Double totalSales = rs.getDouble("totalSales");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Total Sales: %f%n",
                                        branchid, branchname, totalSales);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }

    public void allTimeSales() {
        String selectQuery =  "SELECT b1.branchid, b1.branchname, productname, COALESCE(SUM(s.quantity), 0) AS quantitysold " + 
                                "FROM Branch b1 " + 
                                "LEFT JOIN Product p ON b1.branchid = p.branchid " + 
                                "LEFT JOIN Sales s ON s.productid = p.productid " +
                                "GROUP BY b1.branchid, s.productid, productname " +
                                "HAVING COALESCE(SUM(s.quantity), 0) IN (SELECT COALESCE(MAX(quantity.sum), 0) " +
                                    "FROM (SELECT SUM(s.quantity) AS sum " +
                                    "FROM Branch b2 " +
                                    "LEFT JOIN Product p ON b2.branchid = p.branchid " +
                                    "LEFT JOIN Sales s ON s.productid = p.productid " +
                                    "WHERE b1.branchid = b2.branchid " +
                                "GROUP BY b2.branchid, s.productid) AS quantity)";


                                try (ResultSet rs = state.executeQuery(selectQuery)) {
                                    while (rs.next()) {
                                        int branchid = rs.getInt("branchid");
                                        String branchname = rs.getString("branchname");
                                        String productname = rs.getString("productname");
                                        int quantitysold = rs.getInt("quantitysold");
                        
                                        System.out.printf("Branch ID: %d, Branch Name: %s, Product Name: %s, Quantity Sold: %d%n",
                                        branchid, branchname, productname, quantitysold);
                                    }
                                } catch (SQLException e) {
                                    System.out.println("Error selecting products: " + e.getMessage());
                                }
    }
}
