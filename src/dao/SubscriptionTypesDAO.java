import java.sql.*;
import java.util.ArrayList;

// TODO: DONE FOR NOW!!!
// TODO: Verify if the methods are implemented correctly.
public class SubscriptionTypesDAO {

    private final Statement statement;

    public SubscriptionTypesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES
    public void insertSubscriptionType(SubscriptionType s) {
        String sql = "INSERT INTO subscription_types (subscription_type_name, subscription_type_price) " +
                     "VALUES (?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, s.subscriptionTypeName());
            ps.setDouble(2, s.subscriptionTypePrice());

            ps.executeUpdate();
            System.out.println("subscription_types record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteSubscriptionType(int subscriptionTypeID) {
        DBUtils.deleteTableRecordsByKey("subscription_types", "subscription_type_id", subscriptionTypeID);
    }

    public void updateSubscriptionType(int subscriptionTypeID, SubscriptionType s) {
        String sql = "UPDATE subscription_types " +
                     "SET subscription_type_name = ?, " +
                     "    subscription_type_price = ? " +
                     "WHERE subscription_type_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, s.subscriptionTypeName());
            ps.setDouble(2, s.subscriptionTypePrice());
            ps.setInt(3, subscriptionTypeID);

            ps.executeUpdate();
            System.out.println("subscription_types record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // SELECT QUERIES
    public SubscriptionType selectSubscriptionType(int subscriptionTypeID) {
        String condition = "WHERE subscription_type_id = " + subscriptionTypeID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_types", condition);
        assert rs != null;
        return mapResultSetToSubscriptionType(rs);
    }

    public ArrayList<SubscriptionType> selectAllSubscriptionTypes() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_types");
        assert rs != null;
        return mapResultSetToSubscriptionTypeList(rs);
    }

    // UTILITY METHODS //
    private SubscriptionType mapResultSetToSubscriptionType(ResultSet rs) {
        try {
            int subscriptionTypeID = rs.getInt("subscription_type_id");
            String subscriptionTypeName = rs.getString("subscription_type_name");
            double subscriptionTypePrice = rs.getDouble("subscription_type_price");

            return new SubscriptionType(subscriptionTypeID, subscriptionTypeName, subscriptionTypePrice);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    private ArrayList<SubscriptionType> mapResultSetToSubscriptionTypeList(ResultSet rs) {
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
