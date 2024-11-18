import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

// TODO: DONE FOR NOW!!!
// TODO: Verify if the methods are implemented correctly.
public class SubscriptionsDAO {

    private final Statement statement;

    public SubscriptionsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public void insertSubscription(Subscription s) {
        String sql = "INSERT INTO subscriptions (member_id, subscription_type_id, subscription_start_date, subscription_end_date) " +
                     "VALUES (?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, s.memberID());
            ps.setInt(2, s.subscriptionTypeID());
            ps.setDate(3, Date.valueOf(s.subscriptionStartDate()));
            ps.setDate(4, Date.valueOf(s.subscriptionEndDate()));

            ps.executeUpdate();
            System.out.println("Subscription record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteSubscription(int subscriptionID) {
        DBUtils.deleteTableRecordsByKey("subscriptions", "subscription_id", subscriptionID);
    }

    public void updateSubscription(int subscriptionID, Subscription s) {
        if (!DBUtils.primaryKeyExistsInATable("subscriptions", "subscription_id", subscriptionID)) {
            return;
        }

        String sql = "UPDATE subscriptions " +
                     "SET member_id = ?, " +
                     "    subscription_type_id = ?, " +
                     "    subscription_start_date = ?, " +
                     "    subscription_end_date = ?, " +
                     "WHERE subscription_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, s.memberID());
            ps.setInt(2, s.subscriptionTypeID());
            ps.setDate(3, Date.valueOf(s.subscriptionStartDate()));
            ps.setDate(4, Date.valueOf(s.subscriptionEndDate()));
            ps.setInt(5, s.subscriptionID());

            ps.executeUpdate();
            System.out.println("Subscription record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public boolean terminateSubscription(int subscriptionID) {
        // Validate the subscription's eligibility for termination.
        if (!canTerminateSubscription(subscriptionID)) {
            System.out.println("Subscription must be ongoing to be eligible for termination.");
            return false;
        }

        String sql = "UPDATE subscriptions " +
                     "SET subscription_end_date = DATE(NOW()) " +
                     "WHERE subscription_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
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

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("subscriptions", "member_id", oldID, newID);
    }

    public void updateSubscriptionTypeID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("subscriptions", "subscription_type_id", oldID, newID);
    }

    public void deleteByMemberID(int memberID) {
        DBUtils.deleteTableRecordsByKey("subscriptions", "member_id", memberID);
        System.out.println("Subscription records with given member_id deleted successfully.");
    }

    public void deleteBySubscriptionTypeID(int subscriptionTypeID) {
        DBUtils.deleteTableRecordsByKey("subscriptions", "subscription_type_id", subscriptionTypeID);
        System.out.println("Subscription records with given subscription_type_id deleted successfully.");
    }

    // SELECT QUERIES //
    public Subscription selectSubscription(int subscriptionID) {
        String condition = "WHERE subscription_id = " + subscriptionID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscriptions", condition);
        assert rs != null;
        return mapResultSetToSubscription(rs);
    }

    public ArrayList<Subscription> selectAllSubscriptions() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscriptions");
        assert rs != null;
        return mapResultSetToSubscriptionList(rs);
    }

    public ArrayList<Subscription> selectActiveSubscriptions() {
        String condition = "WHERE CURRENT_DATE BETWEEN subscription_start_date AND subscription_end_date ";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscriptions", condition);
        assert rs != null;
        return mapResultSetToSubscriptionList(rs);
    }

    // TODO: Implement these!
    // REPORTS
    public Object[][] getTotalSubsPerSubTypePerMonthPerYear() {

    }

    public Object[][] getTotalRevenuePerSubTypePerMonthPerYear() {

    }

    public Object[][] getTotalSubsPerSubType() {

    }

    public Object[][] getTotalRevenuePerSubType() {

    }

    // UTILITY METHODS //
    public static Subscription mapResultSetToSubscription(ResultSet rs) {
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

    public static ArrayList<Subscription> mapResultSetToSubscriptionList(ResultSet rs) {
        ArrayList<Subscription> subscriptionList = new ArrayList<Subscription>();
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

    public boolean canTerminateSubscription(int subscriptionID) {
        Subscription s = selectSubscription(subscriptionID);
        if (s == null) {
            return false;
        }
        return LocalDate.now().isAfter(s.subscriptionStartDate()) &&
               LocalDate.now().isBefore(s.subscriptionEndDate());
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
