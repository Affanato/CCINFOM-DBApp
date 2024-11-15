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
    public void insertSubscription(int memberID, int subscriptionTypeID, LocalDate subscriptionStartDate, LocalDate subscriptionEndDate) {
        String sql = "INSERT INTO subscriptions (member_id, subscription_type_id, subscription_start_date, subscription_end_date) " +
                     "VALUES (?, ?, ?, ?) ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, subscriptionTypeID);
            ps.setDate(3, Date.valueOf(subscriptionStartDate));
            ps.setDate(4, Date.valueOf(subscriptionEndDate));
            ps.executeUpdate();
            System.out.println("Subscription record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteSubscription(int subscriptionID) {
        String sql = "DELETE FROM subscriptions " +
                     "WHERE subscription_id = ? ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, subscriptionID);
            ps.executeUpdate();
            System.out.println("Subscription record deleted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public boolean terminateSubscription(int subscriptionID) {

        // Validate the subscription's eligibility for termination.
        if (!canTerminateSubscription(subscriptionID)) {
            System.out.println("Subscription must be ongoing for termination.");
            return false;
        }

        String sql = "UPDATE subscriptions " +
                     "SET subscription_end_date = DATE(NOW()) " +
                     "WHERE subscription_id = ? ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, subscriptionID);
            ps.executeUpdate();
            System.out.println("Subscription terminated successfully.");
            return true;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
    }

    // SELECT QUERIES //
    public ArrayList<Subscription> selectAllSubscriptions() {
        String sql = "SELECT * " +
                     "FROM subscriptions ";

        try (ResultSet rs = statement.executeQuery(sql)) {
            ArrayList<Subscription> subscriptionList = mapResultSetToSubscriptionList(rs);
            System.out.println("All subscription records retrieved successfully.");
            return subscriptionList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public ArrayList<Subscription> selectActiveSubscriptions() {
        String sql = "SELECT * " +
                     "FROM subscriptions " +
                     "WHERE DATE(NOW()) <= subscription_start_date ";

        try (ResultSet rs = statement.executeQuery(sql)) {
            ArrayList<Subscription> activeSubscriptionList = mapResultSetToSubscriptionList(rs);
            System.out.println("All active subscription records retrieved successfully.");
            return activeSubscriptionList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {
        DBManager.updateTableForeignKey("subscriptions", "member_id", oldID, newID);
        System.out.println("Subscription records with given member_id updated successfully.");
    }

    public void updateSubscriptionTypeID(int oldID, int newID) {
        DBManager.updateTableForeignKey("subscriptions", "subscription_type_id", oldID, newID);
        System.out.println("Subscription records with given subscription_type_id updated successfully.");
    }

    public void updateTrainerID(int oldID, int newID) {
        DBManager.updateTableForeignKey("subscriptions", "trainer_id", oldID, newID);
        System.out.println("Subscription records with given trainer_id updated successfully.");
    }

    public void deleteByMemberID(int memberID) {
        DBManager.deleteTableRecordsByForeignKey("subscriptions", "member_id", memberID);
        System.out.println("Subscription records with given member_id deleted successfully.");
    }

    public void deleteBySubscriptionTypeID(int subscriptionTypeID) {
        DBManager.deleteTableRecordsByForeignKey("subscriptions", "subscription_type_id", subscriptionTypeID);
        System.out.println("Subscription records with given subscription_type_id deleted successfully.");
    }

    public void deleteByTrainerID(int trainerID) {
        DBManager.deleteTableRecordsByForeignKey("subscriptions", "trainer_id", trainerID);
        System.out.println("Subscription records with given trainer_id deleted successfully.");
    }

    // UTILITY METHODS
    public Subscription getSubscription(int targetID) {
        String sql = "SELECT * " +
                     "FROM subscriptions " +
                     "WHERE subscription_id = ? ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, targetID);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }

        try (ResultSet rs = statement.executeQuery(sql)) {
            return mapResultSetToSubscription(rs);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    private Subscription mapResultSetToSubscription(ResultSet rs) {
        try {
            int subscriptionID = rs.getInt("subscription_id");
            int memberID = rs.getInt("member_id");
            int subscriptionTypeID = rs.getInt("subscription_type_id");
            LocalDate subscriptionStartDate = rs.getDate("subscription_start_date").toLocalDate();
            LocalDate subscriptionEndDate = rs.getDate("subscription_end_date").toLocalDate();
            return new Subscription(subscriptionID, memberID, subscriptionTypeID, subscriptionStartDate, subscriptionEndDate);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    private ArrayList<Subscription> mapResultSetToSubscriptionList(ResultSet rs) {
        ArrayList<Subscription> subscriptionList = new ArrayList<>();
        try {
            while (rs.next()) {
                subscriptionList.add(mapResultSetToSubscription(rs));
            }
            return subscriptionList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    private boolean canTerminateSubscription(int subscriptionID) {
        Subscription s = getSubscription(subscriptionID);
        return LocalDate.now().isAfter(s.subscriptionStartDate()) &&
               LocalDate.now().isBefore(s.subscriptionEndDate());
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
