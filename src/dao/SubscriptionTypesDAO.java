import java.sql.*;
import java.util.ArrayList;
import java.util.Objects;

public class SubscriptionTypesDAO {

    private final Statement statement;

    public SubscriptionTypesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public boolean insertSubscriptionType(String name, double price) {
        String sql = "INSERT INTO subscription_types (subscription_type_name, subscription_type_price) " +
                     "VALUES (?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, name);
            ps.setDouble(2, price);

            ps.executeUpdate();
            System.out.println("'subscription_types' record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    public boolean deleteSubscriptionType(int subscriptionTypeID) {
        if (!subscriptionTypeExists(subscriptionTypeID)) return false;
        DBUtils.invalidateTableForeignKey("subscription_type_amenities", "subscription_type_id", subscriptionTypeID);
        DBUtils.invalidateTableForeignKey("subscriptions", "subscription_type_id", subscriptionTypeID);
        DBUtils.deleteTableRecordsByKey("subscription_types", "subscription_type_id", subscriptionTypeID);
        return true;
    }

    public boolean updateSubscriptionType(int subscriptionTypeID, String name, double price) {
        String sql = "UPDATE subscription_types " +
                     "SET subscription_type_name = ?, " +
                     "    subscription_type_price = ? " +
                     "WHERE subscription_type_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, subscriptionTypeID);

            ps.executeUpdate();
            System.out.println("'subscription_types' record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    // SELECT QUERIES //
    public String[] getComboBoxSubscriptionTypeIDs() {
        return DBUtils.selectAllKeysFromTable("subscription_types", "subscription_type_id");
    }

    public static SubscriptionType selectSubscriptionType(int subscriptionTypeID) {
        String condition = "WHERE subscription_type_id = " + subscriptionTypeID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_types", condition);
        assert rs != null;
        return mapResultSetToSubscriptionType(rs);
    }

    public Object[][] selectAllSubscriptionTypes() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_types");
        assert rs != null;
        return DBUtils.to2DObjectArray(Objects.requireNonNull(mapResultSetToSubscriptionTypeList(rs)));
    }

    // UTILITY METHODS //
    public static boolean subscriptionTypeExists(int subscriptionTypeID) {
        return selectSubscriptionType(subscriptionTypeID) != null;
    }

    public static SubscriptionType mapResultSetToSubscriptionType(ResultSet rs) {
        try {
            if (!rs.next()) {
                System.out.println("No SubscriptionType ResultSet data.\n");
                return null;
            }

            int subscriptionTypeID = rs.getInt("subscription_type_id");
            String subscriptionTypeName = rs.getString("subscription_type_name");
            double subscriptionTypePrice = rs.getDouble("subscription_type_price");

            return new SubscriptionType(subscriptionTypeID, subscriptionTypeName, subscriptionTypePrice);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<SubscriptionType> mapResultSetToSubscriptionTypeList(ResultSet rs) {
        ArrayList<SubscriptionType> subscriptionTypeList = new ArrayList<SubscriptionType>();
        try {
            while (rs.next()) {
                subscriptionTypeList.add(mapResultSetToSubscriptionType(rs));
            }
            return subscriptionTypeList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
