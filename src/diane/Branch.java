import java.sql.*;

public class Branch {
    private Connection con;
    private Statement state;

    public Branch(Connection con) {
        this.con = con;
        try {
            this.state = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertBranch(String branchName, String street, String city, String region, 
                            String country, String telephone, String emailAddress, 
                            String status, String businessHours, String managerName, 
                            String managerContact, String membershipPlans) {
        String insertQuery = "INSERT INTO Branch (branchname, street, city, region, country," + 
                        "telephone, emailaddress, status, businesshours, managername, managercontact, membershipplans) " +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
            pstmt.setString(1, branchName);
            pstmt.setString(2, street);
            pstmt.setString(3, city);
            pstmt.setString(4, region);
            pstmt.setString(5, country);
            pstmt.setString(6, telephone);
            pstmt.setString(7, emailAddress);
            pstmt.setString(8, status);
            pstmt.setString(9, businessHours);
            pstmt.setString(10, managerName);
            pstmt.setString(11, managerContact);
            pstmt.setString(12, membershipPlans);
            pstmt.executeUpdate();
            System.out.println("New branch record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting branch record: " + e.getMessage());
        }
    }

    public void updateBranch(int branchid, String branchName, String street, String city, String region, 
                            String country, String telephone, String emailAddress, 
                            String status, String businessHours, String managerName, 
                            String managerContact, String membershipPlans) {
        String insertQuery = "UPDATE Branch SET branchname = ?, street = ?, city = ?, region = ?, country = ?," + 
                        "telephone = ?, emailaddress = ?, status = ?, businesshours = ?, managername = ?, managercontact = ?, membershipplans = ? " +
                        "WHERE branchid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
            pstmt.setString(1, branchName);
            pstmt.setString(2, street);
            pstmt.setString(3, city);
            pstmt.setString(4, region);
            pstmt.setString(5, country);
            pstmt.setString(6, telephone);
            pstmt.setString(7, emailAddress);
            pstmt.setString(8, status);
            pstmt.setString(9, businessHours);
            pstmt.setString(10, managerName);
            pstmt.setString(11, managerContact);
            pstmt.setString(12, membershipPlans);
            pstmt.setInt(13, branchid);
            pstmt.executeUpdate();
            System.out.println("New branch record updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating branch record: " + e.getMessage());
        }
    }

    // Method to delete a branch record
    public void deleteBranch(int branchid) {
        String deleteQuery = "DELETE FROM Branch WHERE branchid = ?";

        try (PreparedStatement ps = con.prepareStatement(deleteQuery)) {
            ps.setInt(1, branchid);
            ps.executeUpdate();
            System.out.println("Branch record deleted successfully."); // need to delete other records pa
        } catch (SQLException e) {
            System.out.println("Error deleting branch record: " + e.getMessage());
        }
    }

    // Method to select all branch records
    public void selectAllBranch() {
        String selectQuery = "SELECT * FROM Branch";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int branchid = rs.getInt("branchid");
                String branchName = rs.getString("branchName");
                String street = rs.getString("street");
                String city = rs.getString("city");
                String region = rs.getString("region");
                String country = rs.getString("country");
                String telephone = rs.getString("telephone");
                String emailAddress = rs.getString("emailAddress");
                String status = rs.getString("status");
                String businessHours = rs.getString("businessHours");
                String managerName = rs.getString("managerName");
                String managerContact = rs.getString("managerContact");
                String membershipPlans = rs.getString("membershipPlans");
                
                
                System.out.printf("Branch ID = %d, Branch Name = %s, Street = %s, City = %s, Region = %s, Country = %s, Telephone = %s, Email Address = %s, Status = %s, Business Hours = %s, Manager Name = %s, Manager Contact = %s, Membership Plans = %s\n",
                branchid, branchName, street, city, region, country, telephone, emailAddress, status, businessHours, managerName, managerContact, membershipPlans);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting product records: " + e.getMessage());
        }
    }

    public void selectBranches(String city, String region, String country) {
        String selectQuery = "SELECT branchname, CONCAT(city, ', ', region, ', ', country) AS address, telephone " +
                                "FROM branch " +
                                "WHERE city LIKE '%" + city + "%'"  +
                                "AND region LIKE '%" + region + "%'"  +
                                "AND country LIKE '%" + country + "%'"  +
                                "ORDER BY branchname";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                String branchname = rs.getString("branchname");
                String address = rs.getString("address");
                String telephone = rs.getString("telephone");

                System.out.printf("Branch name: %s, Address: %s, Telephone: %s%n",
                                  branchname, address, telephone);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting branches: " + e.getMessage());
        }
    }

    public void selectTrainers(int branchid) {
        String selectQuery = "SELECT name, speciality, availabilityschedule " +
                                "FROM trainer " +
                                "WHERE branchid =" + branchid +
                                " ORDER BY name";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                String name = rs.getString("name");
                String speciality = rs.getString("speciality");
                String availabilityschedule = rs.getString("availabilityschedule");

                System.out.printf("Name: %s, Speciality: %s, Availability Schedule: %s%n",
                                    name, speciality, availabilityschedule);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting trainers: " + e.getMessage());
        }
    }

    public void selectProducts(int branchid) {
        String selectQuery = "SELECT productname, productdescription, brand, availablequantity, productprice " +
                                "FROM Product " +
                                "WHERE branchid =" + branchid +
                                " ORDER BY productname";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                String productname = rs.getString("productname");
                String productdescription = rs.getString("productdescription");
                String brand = rs.getString("brand");
                String availablequantity = rs.getString("availablequantity");
                Double productprice = rs.getDouble("productprice");

                System.out.printf("Product Name: %s, Product Description: %s, brand: %s, availablequantity: %s, productprice: %f%n",
                productname, productdescription, brand, availablequantity, productprice);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting products: " + e.getMessage());
        }
    }

    public void numOfMembers() {
        String selectQuery = "SELECT b.branchid, b.branchname, COUNT(DISTINCT m.memberid) AS numOfMembers " +
                        "FROM Branch b " +
                        "LEFT JOIN Membership m ON b.branchid=m.branchid " +
                        "GROUP BY b.branchid";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int branchid = rs.getInt("branchid");
                String branchname = rs.getString("branchname");
                int numOfMembers = rs.getInt("numOfMembers");

                System.out.printf("Branch ID: %d, Branch Name: %s, Number of Members: %d%n",
                        branchid, branchname, numOfMembers);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting member records: " + e.getMessage());
        }
    }

    public void numOfTrainers() {
        String selectQuery = "SELECT b.branchid, b.branchname, COUNT(DISTINCT t.trainerid) AS numOfTrainers " +
                        "FROM Branch b " +
                        "LEFT JOIN Trainer t ON b.branchid=t.branchid " +
                        "GROUP BY b.branchid";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                int branchid = rs.getInt("branchid");
                                String branchname = rs.getString("branchname");
                                int numOfTrainers = rs.getInt("numOfTrainers");
                
                                System.out.printf("Branch ID: %d, Branch Name: %s, Number of Trainers: %d%n",
                                        branchid, branchname, numOfTrainers);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting trainer records: " + e.getMessage());
                        }
    }

    public void branchesByCity() {
        String selectQuery = "SELECT CONCAT(b1.city, ', ', b1.region, ', ', b1.country) AS address, COUNT(b2.branchid) AS numOfBranches " +
                        "FROM Branch b1 " +
                        "LEFT JOIN Branch b2 ON b1.branchid = b2.branchid " +
                        "GROUP BY address";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                String address = rs.getString("address");
                                int numOfBranches = rs.getInt("numOfBranches");
                
                                System.out.printf("Address: %s, Number of Branches: %d%n",
                                address, numOfBranches);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting branch records: " + e.getMessage());
                        }
    }

    public void branchesByRegion() {
        String selectQuery = "SELECT CONCAT(b1.region, ', ', b1.country) AS address, COUNT(b2.branchid) AS numOfBranches " +
                        "FROM Branch b1 " +
                        "LEFT JOIN Branch b2 ON b1.branchid = b2.branchid " +
                        "GROUP BY address";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                String address = rs.getString("address");
                                int numOfBranches = rs.getInt("numOfBranches");
                
                                System.out.printf("Address: %s, Number of Branches: %d%n",
                                address, numOfBranches);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting branch records: " + e.getMessage());
                        }
    }

    public void branchesByCountry() {
        String selectQuery = "SELECT b1.country, COUNT(b2.branchid) AS numOfBranches " +
                        "FROM Branch b1 " +
                        "LEFT JOIN Branch b2 ON b1.branchid = b2.branchid " +
                        "GROUP BY b1.country";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                String country = rs.getString("country");
                                int numOfBranches = rs.getInt("numOfBranches");
                
                                System.out.printf("Country: %s, Number of Branches: %d%n",
                                country, numOfBranches);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting branch records: " + e.getMessage());
                        }
    }

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
