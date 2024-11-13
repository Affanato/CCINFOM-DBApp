import java.sql.*;

public class Trainer {
    private Connection con;
    private Statement state;

    public Trainer(Connection con) {
        this.con = con;
        try {
            this.state = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } 

    // Method to insert a new trainer record
    public void insertTrainer(int branchid, String name, String speciality, String availabilityschedule) {
        String insertQuery = "INSERT INTO Trainer (branchid, name, speciality, availabilityschedule) " +
                "VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
            pstmt.setInt(1, branchid);
            pstmt.setString(2, name);
            pstmt.setString(3, speciality);
            pstmt.setString(4, availabilityschedule);
            pstmt.executeUpdate();
            System.out.println("New trainer record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting trainer record: " + e.getMessage());
        }
    }

    // Method to update an existing trainer record
    public void updateTrainer(int trainerid, int branchid, String name, String speciality, String availabilityschedule) {
        String updateQuery = "UPDATE Trainer SET name = ?, speciality = ?, availabilityschedule = ? WHERE trainerid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(updateQuery)) {
            pstmt.setInt(1, branchid);
            pstmt.setString(2, name);
            pstmt.setString(3, speciality);
            pstmt.setString(4, availabilityschedule);
            pstmt.setInt(5, trainerid);
            pstmt.executeUpdate();
            System.out.println("Trainer record updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating trainer record: " + e.getMessage());
        }
    }

    // Method to delete a trainer record
    public void deleteTrainer(int trainerid) {
        String deleteQuery = "DELETE FROM Trainer WHERE trainerid = ?";

        try (PreparedStatement pstmt = con.prepareStatement(deleteQuery)) {
            pstmt.setInt(1, trainerid);
            pstmt.executeUpdate();
            System.out.println("Trainer record deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting trainer record: " + e.getMessage());
        }
    }

    // Method to select all trainer records
    public void selectAllTrainers() {
        String selectQuery = "SELECT * FROM Trainer";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int trainerid = rs.getInt("trainerid");
                int branchid = rs.getInt("branchid");
                String name = rs.getString("name");
                String speciality = rs.getString("speciality");
                String availabilityschedule = rs.getString("availabilityschedule");

                System.out.printf("Trainer ID: %d, Branch ID: %d, Name: %s, Speciality: %s, Availability Schedule: %s%n",
                        trainerid, branchid, name, speciality, availabilityschedule);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting trainer records: " + e.getMessage());
        }
    }

    public void numOfMembers() {
        String selectQuery = "SELECT t.trainerid, t.name, t.speciality, COUNT(DISTINCT m.memberid) AS numOfMembers " +
                        "FROM Trainer t " +
                        "LEFT JOIN Membership m ON t.trainerid=m.trainerid " +
                        "GROUP BY t.trainerid";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int trainerid = rs.getInt("trainerid");
                String name = rs.getString("name");
                String speciality = rs.getString("speciality");
                int numOfMembers = rs.getInt("numOfMembers");

                System.out.printf("Trainer ID: %d, Name: %s, Speciality: %s, Number of Members: %d%n",
                        trainerid, name, speciality, numOfMembers);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting trainer records: " + e.getMessage());
        }
    }

    public void averageRating() {
        String selectQuery = "SELECT t.trainerid, t.name, t.speciality, FORMAT(AVG(m.trainerperformancerating), 2) AS avgRating " +
                        "FROM Trainer t " +
                        "LEFT JOIN Membership m ON t.trainerid=m.trainerid " +
                        "GROUP BY t.trainerid";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int trainerid = rs.getInt("trainerid");
                String name = rs.getString("name");
                String speciality = rs.getString("speciality");
                double avgRating = rs.getDouble("avgRating");

                System.out.printf("Trainer ID: %d, Name: %s, Speciality: %s, Average Rating: %f%n",
                        trainerid, name, speciality, avgRating);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting trainer records: " + e.getMessage());
        }
    }
    
    public void trainersByCity() {
        String selectQuery = "SELECT CONCAT(b.city, ', ', b.region, ', ', b.country) AS address, COUNT(t.trainerid) AS numOfTrainers " +
                        "FROM Branch b " +
                        "LEFT JOIN Trainer t ON b.branchid = t.branchid " +
                        "GROUP BY address";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                String address = rs.getString("address");
                                int numOfTrainers = rs.getInt("numOfTrainers");
                
                                System.out.printf("Address: %s, Number of Trainers: %d%n",
                                address, numOfTrainers);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting trainer records: " + e.getMessage());
                        }
    }

    public void trainersByRegion() {
        String selectQuery = "SELECT CONCAT(b.region, ', ', b.country) AS address, COUNT(t.trainerid) AS numOfTrainers " +
                        "FROM Branch b " +
                        "LEFT JOIN Trainer t ON b.branchid = t.branchid " +
                        "GROUP BY address";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                String address = rs.getString("address");
                                int numOfTrainers = rs.getInt("numOfTrainers");
                
                                System.out.printf("Address: %s, Number of Trainers: %d%n",
                                address, numOfTrainers);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting trainer records: " + e.getMessage());
                        }
    }

    public void trainersByCountry() {
        String selectQuery = "SELECT b.country, COUNT(t.trainerid) AS numOfTrainers " +
                        "FROM Branch b " +
                        "LEFT JOIN Trainer t ON b.branchid = t.branchid " +
                        "GROUP BY country";

                        try (ResultSet rs = state.executeQuery(selectQuery)) {
                            while (rs.next()) {
                                String country = rs.getString("country");
                                int numOfTrainers = rs.getInt("numOfTrainers");
                
                                System.out.printf("Address: %s, Number of Trainers: %d%n",
                                country, numOfTrainers);
                            }
                        } catch (SQLException e) {
                            System.out.println("Error selecting trainer records: " + e.getMessage());
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
