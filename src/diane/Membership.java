import java.sql.*;

public class Membership {
    private Connection con;
    private Statement state;

    public Membership(Connection con) {
        this.con = con;
        try {
            this.state = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to create the Membership table
    private void createMembershipTable() {
        String queryMembership = "CREATE TABLE IF NOT EXISTS Membership (" +
                "membershipid INT NOT NULL AUTO_INCREMENT, " +
                "branchid INT, " +
                "memberid INT, " +
                "startdate DATE, " +
                "enddate DATE, " +
                "type VARCHAR(50), " +
                "status VARCHAR(20), " +
                "price DECIMAL(10, 2), " +
                "trainerid INT, " +
                "trainerperformancerating DECIMAL(3, 2), " +
                "PRIMARY KEY (membershipid), " +
                "FOREIGN KEY (branchid) REFERENCES Branch(branchid), " +
                "FOREIGN KEY (memberid) REFERENCES Member(memberid))";

        try {
            state.executeUpdate(queryMembership);
            System.out.println("Membership table created successfully or already exists.");
        } catch (SQLException e) {
            System.out.println("Error creating Membership table: " + e.getMessage());
        }
    }

    // Method to insert a new membership record
    public void insertMembership(int branchid, int memberid, String startdate, String enddate, String type,
                                 String status, double price, int trainerid, double trainerperformancerating) {
        String insertQuery = "INSERT INTO Membership (branchid, memberid, startdate, enddate, type, status, price, trainerid, trainerperformancerating) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(insertQuery)) {
            ps.setInt(1, branchid);
            ps.setInt(2, memberid);
            ps.setDate(3, Date.valueOf(startdate));
            ps.setDate(4, Date.valueOf(enddate));
            ps.setString(5, type);
            ps.setString(6, status);
            ps.setDouble(7, price);
            ps.setInt(8, trainerid);
            ps.setDouble(9, trainerperformancerating);
            ps.executeUpdate();
            System.out.println("New membership record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting membership record: " + e.getMessage());
        }
    }

    // Method to end a membership
    public void endMembership(int membershipid, String enddate) {
        String updateQuery = "UPDATE Membership SET enddate = ?, status = ? WHERE membershipid = ?";

        try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
            ps.setDate(1, Date.valueOf(enddate));
            ps.setString(2, "Expired");
            ps.setInt(3, membershipid);
            ps.executeUpdate();
            System.out.println("Membership record updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error ending membership: " + e.getMessage());
        }
    }

    public void updateMembership(int membershipid, double trainerperformancerating) {
        String updateQuery = "UPDATE Membership SET trainerperformancerating = ? WHERE membershipid = ?";

        try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
            ps.setDouble(1, trainerperformancerating);
            ps.setInt(2, membershipid);
            ps.executeUpdate();
            System.out.println("Membership record updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating membership record: " + e.getMessage());
        }
    }

    // Method to delete a membership record
    public void deleteMembership(int membershipid) {
        String deleteQuery = "DELETE FROM Membership WHERE membershipid = ?";

        try (PreparedStatement ps = con.prepareStatement(deleteQuery)) {
            ps.setInt(1, membershipid);
            ps.executeUpdate();
            System.out.println("Membership record deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting membership record: " + e.getMessage());
        }
    }

    // Method to select all membership records
    public void selectAllMemberships() {
        String selectQuery = "SELECT * FROM Membership";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int membershipid = rs.getInt("membershipid");
                int branchid = rs.getInt("branchid");
                int memberid = rs.getInt("memberid");
                Date startdate = rs.getDate("startdate");
                Date enddate = rs.getDate("enddate");
                String type = rs.getString("type");
                String status = rs.getString("status");
                double price = rs.getDouble("price");
                int trainerid = rs.getInt("trainerid");
                double trainerperformancerating = rs.getDouble("trainerperformancerating");

                System.out.printf("Membership ID: %d, Branch ID: %d, Member ID: %d, Start Date: %s, End Date: %s, Type: %s, Status: %s, Price: %.2f, Trainer ID: %d, Trainer Performance Rating: %.2f%n",
                        membershipid, branchid, memberid, startdate, enddate, type, status, price, trainerid, trainerperformancerating);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting membership records: " + e.getMessage());
        }
    }

    // Method to select all membership records
    public void selectBranchMemberships(int month, int year) {
        String selectQuery = "SELECT b.branchid, b.branchname, COUNT(DISTINCT m.memberid) AS totalSubscribers, " +
                            "COUNT(IF(MONTH(m.startdate) = " + month + " AND YEAR(m.startdate) = " + year + ", 1, NULL)) AS newSubscribers " +
                            "FROM branch b " +
                            "LEFT JOIN membership m ON b.branchid=m.branchid " +
                            "GROUP BY b.branchid " +
                            "ORDER BY b.branchid";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int branchid = rs.getInt("branchid");
                String branchname = rs.getString("branchname");
                int totalSubscribers = rs.getInt("totalSubscribers");
                int newSubscribers = rs.getInt("newSubscribers");

                System.out.printf("Branch ID: %d, Branch Name: %s, Total Subscribers: %d, New Subscribers %d%n",
                        branchid, branchname, totalSubscribers, newSubscribers);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting membership records: " + e.getMessage());
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
