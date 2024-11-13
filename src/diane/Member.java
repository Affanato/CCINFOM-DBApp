import java.sql.*;

public class Member {
    private Connection con;
    private Statement state;

    public Member(Connection con) {
        this.con = con;
        try {
            this.state = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to insert a new member record
    public void insertMember(String name, String birthday, String sex, String phoneNumber, String street, String city, String region, String country) {
        String insertQuery = "INSERT INTO Member (name, birthday, sex, phonenumber, street, city, region, country) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(insertQuery)) {
            ps.setString(1, name);
            ps.setDate(2, Date.valueOf(birthday));
            ps.setString(3, sex);
            ps.setString(4, phoneNumber);
            ps.setString(5, street);
            ps.setString(6, city);
            ps.setString(7, region);
            ps.setString(8, country);
            ps.executeUpdate();
            System.out.println("New member record inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting member record: " + e.getMessage());
        }
    }

    // Method to update a new member record
    public void updateMember(int memberid, String name, String birthday, String sex, String phoneNumber, String street, String city, String region, String country) {
        String updateQuery = "UPDATE Member SET name = ?, birthday = ?, sex = ?, phonenumber = ?, street = ?, city = ?, region = ?, country = ? WHERE memberid = ?";

        try (PreparedStatement ps = con.prepareStatement(updateQuery)) {
            ps.setString(1, name);
            ps.setDate(2, Date.valueOf(birthday));
            ps.setString(3, sex);
            ps.setString(4, phoneNumber);
            ps.setString(5, street);
            ps.setString(6, city);
            ps.setString(7, region);
            ps.setString(8, country);
            ps.setInt(9, memberid);
            ps.executeUpdate();
            System.out.println("Member record updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating member record: " + e.getMessage());
        }
    }

    // Method to delete a member record
    public void deleteMember(int memberid) {
        String deleteMembership = "DELETE FROM Membership WHERE memberid = " + memberid;
        String deleteQuery = "DELETE FROM Member WHERE memberid = " + memberid;

        try (PreparedStatement ps = con.prepareStatement(deleteMembership); PreparedStatement ps2 = con.prepareStatement(deleteQuery)) {
            ps.executeUpdate();
            ps2.executeUpdate();
            System.out.println("Member record deleted successfully."); // need to delete all 
        } catch (SQLException e) {
            System.out.println("Error deleting member record: " + e.getMessage());
        }
    }

    // Method to select all member records
    public void selectAllMembers() {
        String selectQuery = "SELECT * FROM Member";

        try (ResultSet rs = state.executeQuery(selectQuery)) {
            while (rs.next()) {
                int memberid = rs.getInt("memberid");
                String name = rs.getString("name");
                String birthday = rs.getString("birthday");
                String sex = rs.getString("sex");
                String phoneNumber = rs.getString("phonenumber");
                String street = rs.getString("street");
                String city = rs.getString("city");
                String region = rs.getString("region");
                String country = rs.getString("country");

                System.out.printf("Member ID: %d, Name: %s, Birthday: %s, Sex: %s, Phone Number: %s, Street: %s, City: %s, Region: %s, Country: %s\n",
                                  memberid, name, birthday, sex, phoneNumber, street, city, region, country);
            }
        } catch (SQLException e) {
            System.out.println("Error selecting product records: " + e.getMessage());
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
