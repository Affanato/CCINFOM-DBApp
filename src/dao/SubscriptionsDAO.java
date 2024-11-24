import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubscriptionsDAO {

    private final Statement statement;

    public SubscriptionsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public boolean insertSubscription(int memberID, int subscriptionTypeID, String startDate) {
        LocalDate subscriptionStartDate = DBUtils.convertStringToLocalDate(startDate);
        LocalDate subscriptionEndDate = subscriptionStartDate.plusDays(30);

        String sql = "INSERT INTO subscriptions (member_id, subscription_type_id, subscription_start_date, subscription_end_date) " +
                     "VALUES (?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, subscriptionTypeID);
            ps.setDate(3, Date.valueOf(subscriptionStartDate));
            ps.setDate(4, Date.valueOf(subscriptionEndDate));

            ps.executeUpdate();
            System.out.println("'subscriptions' record inserted successfully.\n");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    public boolean deleteSubscription(int subscriptionID) {
        if (!subscriptionExists(subscriptionID)) return false;
        DBUtils.invalidateTableForeignKey("training_sessions", "subscription_id", subscriptionID);
        DBUtils.deleteTableRecordsByKey("subscriptions", "subscription_id", subscriptionID);
        return true;
    }

    public boolean terminateSubscription(int subscriptionID) {
        // Validate the subscription's eligibility for termination.
        if (!canTerminateSubscription(subscriptionID)) {
            System.out.println("Subscription must be active to be eligible for termination.");
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
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
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
    public String[] getComboBoxSubscriptionIDs() {
        return DBUtils.removeFirstElement(DBUtils.selectAllKeysFromTable("subscriptions", "subscription_id"));
    }

    public String[] getComboBoxActiveSubscriptionIDs() {
        String condition = "WHERE (CURRENT_DATE + INTERVAL 1 DAY) BETWEEN subscription_start_date AND subscription_end_date";
        return DBUtils.selectAllKeysFromTable("subscriptions", "subscription_id", condition);
    }

    public static Subscription selectSubscription(int subscriptionID) {
        String condition = "WHERE subscription_id = " + subscriptionID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscriptions", condition);
        assert rs != null;

        try {
            if (rs.next()) {
                return mapResultSetToSubscription(rs);
            } else {
                System.out.println("No subscription found with ID: " + subscriptionID);
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectAllSubscriptions() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscriptions");
        assert rs != null;

        ArrayList<Subscription> subscriptions = mapResultSetToSubscriptionList(rs);

        if (subscriptions == null) { // no subscriptions found
            System.err.println("subscriptions equals null.");
            return new Object[0][0];
        }

        if (subscriptions.contains(null)) {
            System.err.println("subscriptions contains null.");
            return new Object[0][0];
        }

        return DBUtils.removeFirstElement(DBUtils.to2DObjectArray(subscriptions));
    }

    public Object[][] selectActiveSubscriptions() {
        String condition = "WHERE CURRENT_DATE BETWEEN subscription_start_date AND subscription_end_date ";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscriptions", condition);
        assert rs != null;

        ArrayList<Subscription> subscriptions = mapResultSetToSubscriptionList(rs);

        if (subscriptions == null) { // no subscriptions found
            System.err.println("subscriptions equals null.");
            return new Object[0][0];
        }

        if (subscriptions.contains(null)) {
            System.err.println("subscriptions contains null.");
            return new Object[0][0];
        }

        return DBUtils.to2DObjectArray(subscriptions);
    }

    // REPORTS
    public Object[][] getTotalSubsRevenuePerSubTypePerMonthPerYear() {
        String sql = "SELECT			YEAR(s.subscription_start_date) AS year, " +
                     "                  MONTH(s.subscription_start_date) AS month, " +
                     "                  st.subscription_type_name AS subscription_type, " +
                     "                  COUNT(*) AS total_subscriptions " +
                     "                  COUNT(*) * st.subscription_type_price AS total_revenue " +
                     "FROM              subscriptions s " +
                     "JOIN              subscription_types st ON s.subscription_type_id = st.subscription_type_id " +
                     "GROUP BY          year, month, subscription_type " +
                     "ORDER BY          year, month, subscription_type; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String subscriptionType = rs.getString("subscription_type");
                int totalSubscriptions = rs.getInt("total_subscriptions");
                double totalRevenue = rs.getDouble("total_revenue");

                Object[] elem = {year, month, subscriptionType, totalSubscriptions, totalRevenue};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] getTotalSubsRevenuePerSubTypePerYear() {
        String sql = "SELECT			YEAR(s.subscription_start_date) AS year, " +
                     "                  st.subscription_type_name AS subscription_type, " +
                     "                  COUNT(*) AS total_subscriptions " +
                     "                  COUNT(*) * st.subscription_type_price AS total_revenue " +
                     "FROM              subscriptions s " +
                     "JOIN              subscription_types st ON s.subscription_type_id = st.subscription_type_id " +
                     "GROUP BY          year, subscription_type " +
                     "ORDER BY          year, subscription_type; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                String subscriptionType = rs.getString("subscription_type");
                int totalSubscriptions = rs.getInt("total_subscriptions");
                double totalRevenue = rs.getDouble("total_revenue");

                Object[] elem = {year, subscriptionType, totalSubscriptions, totalRevenue};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] getTotalSubsRevenuePerSubTypeLifetime() {
        String sql = "SELECT			st.subscription_type_name AS subscription_type, " +
                     "                  COUNT(*) AS total_subscriptions " +
                     "                  COUNT(*) * st.subscription_type_price AS total_revenue " +
                     "FROM              subscriptions s " +
                     "JOIN              subscription_types st ON s.subscription_type_id = st.subscription_type_id " +
                     "GROUP BY          subscription_type " +
                     "ORDER BY          total_revenue DESC; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                String subscriptionType = rs.getString("subscription_type");
                int totalSubscriptions = rs.getInt("total_subscriptions");
                double totalRevenue = rs.getDouble("total_revenue");

                Object[] elem = {subscriptionType, totalSubscriptions, totalRevenue};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // UTILITY METHODS //
    public static boolean subscriptionExists(int subscriptionID) {
        return selectSubscription(subscriptionID) != null;
    }

    public static int getMemberID(int subscriptionID) {
        String sql = "SELECT        m.member_id " +
                     "FROM          members m " +
                     "JOIN          subscriptions s ON m.member_id = s.member_id " +
                     "WHERE         s.subscription_id = ? " +
                     "AND           CURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date; ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, subscriptionID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
                return -1;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return -1;
    }

    public static String[] getMemberName(int subscriptionID) {
        String sql = "SELECT        m.last_name, m.first_name " +
                     "FROM          members m " +
                     "JOIN          subscriptions s ON m.member_id = s.member_id " +
                     "WHERE         s.subscription_id = ? " +
                     "AND           CURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date; ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, subscriptionID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String[] name = new String[2];
                    name[0] = rs.getString(1);
                    name[1] = rs.getString(2);
                    return name;
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return null;
    }

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
            return new ArrayList<>();
        }
    }

    public boolean canTerminateSubscription(int subscriptionID) {
        Subscription s = selectSubscription(subscriptionID);
        if (s == null) {
            System.err.println("Subscription not found!");
            return false;
        }
        return (LocalDate.now().isAfter(s.subscriptionStartDate()) || LocalDate.now().equals(s.subscriptionStartDate())) &&
                (LocalDate.now().isBefore(s.subscriptionEndDate()) || LocalDate.now().equals(s.subscriptionEndDate()));
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
