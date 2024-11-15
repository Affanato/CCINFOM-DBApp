import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

// TODO: Verify if the methods are implemented correctly.
public class SubscriptionsDAO {

    private final Statement statement;

    public SubscriptionsDAO() {
        this.statement = DBManager.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public void insertMembership(int memberID, int membershipTypeID, int trainerID, String membershipStartDate, String membershipEndDate) {
        String sql = "INSERT INTO memberships (member_id, membership_type_id, trainer_id, membership_start_date, membership_end_date) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, membershipTypeID);
            ps.setInt(3, trainerID);
            ps.setDate(4, Date.valueOf(membershipStartDate));
            ps.setDate(5, Date.valueOf(membershipEndDate));
            ps.executeUpdate();
            System.out.println("Membership record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteMembership(int membershipID) {
        String sql = "DELETE FROM memberships " +
                     "WHERE membership_id = ? ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, membershipID);
            ps.executeUpdate();
            System.out.println("Membership record deleted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // SELECT QUERIES //
    public ArrayList<Subscription> selectAllMemberships() {
        String sql = "SELECT * " +
                     "FROM memberships ";

        try (ResultSet rs = statement.executeQuery(sql)) {
            ArrayList<Subscription> subscriptionList = mapResultSetToMembershipList(rs);
            System.out.println("All membership records retrieved successfully.");
            return subscriptionList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public ArrayList<Subscription> selectActiveMemberships() {
        String sql = "SELECT * " +
                     "FROM memberships " +
                     "WHERE DATE(NOW()) <= membership_start_date ";

        try (ResultSet rs = statement.executeQuery(sql)) {
            ArrayList<Subscription> activeSubscriptionList = mapResultSetToMembershipList(rs);
            System.out.println("All active membership records retrieved successfully.");
            return activeSubscriptionList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {
        DBManager.updateTableForeignKey("memberships", "member_id", oldID, newID);
        System.out.println("Memberships records with given member_id updated successfully.");
    }

    public void updateMembershipTypeID(int oldID, int newID) {
        DBManager.updateTableForeignKey("memberships", "membership_type_id", oldID, newID);
        System.out.println("Memberships records with given membership_type_id updated successfully.");
    }

    public void updateTrainerID(int oldID, int newID) {
        DBManager.updateTableForeignKey("memberships", "trainer_id", oldID, newID);
        System.out.println("Memberships records with given trainer_id updated successfully.");
    }

    public void deleteByMemberID(int targetID) {
        DBManager.deleteTableRecordsByForeignKey("memberships", "member_id", targetID);
        System.out.println("Memberships records with given member_id deleted successfully.");
    }

    public void deleteByMembershipTypeID(int targetID) {
        DBManager.deleteTableRecordsByForeignKey("memberships", "membership_type_id", targetID);
        System.out.println("Memberships records with given membership_type_id deleted successfully.");
    }

    public void deleteByTrainerID(int targetID) {
        DBManager.deleteTableRecordsByForeignKey("memberships", "trainer_id", targetID);
        System.out.println("Memberships records with given trainer_id updated successfully.");
    }

    // UTILITY METHODS
    private ArrayList<Subscription> mapResultSetToMembershipList(ResultSet rs) {
        ArrayList<Subscription> subscriptionList = new ArrayList<>();
        try {
            while (rs.next()) {
                int membershipID = rs.getInt("membership_id");
                int memberID = rs.getInt("member_id");
                int membershipTypeID = rs.getInt("membership_type_id");
                int trainerID = rs.getInt("trainer_id");
                LocalDate membershipStartDate = rs.getDate("membership_start_date").toLocalDate();
                LocalDate membershipEndDate = rs.getDate("membership_end_date").toLocalDate();
                subscriptionList.add(new Subscription(membershipID, memberID, membershipTypeID, trainerID, membershipStartDate, membershipEndDate));
            }
            return subscriptionList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
