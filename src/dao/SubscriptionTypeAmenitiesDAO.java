import java.sql.*;
import java.util.ArrayList;

// TODO: DONE FOR NOW!!!
// TODO: Verify if the methods are implemented correctly.
public class SubscriptionTypeAmenitiesDAO {

    private final Statement statement;

    public SubscriptionTypeAmenitiesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public void insertSubscriptionTypeAmenity(SubscriptionTypeAmenity s) {
        String sql = "INSERT INTO subscription_type_amenities (subscription_type_id, amenity_id) " +
                     "VALUES (?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, s.subscriptionTypeID());
            ps.setInt(2, s.amenityID());

            ps.executeUpdate();
            System.out.println("Subscription type amenity record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteSubscriptionTypeAmenity(SubscriptionTypeAmenity s) {
        String sql = "DELETE FROM subscription_type_amenities " +
                     "WHERE subscription_type_id = ?, " +
                     "      amenity_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, s.subscriptionTypeID());
            ps.setInt(2, s.amenityID());

            ps.executeUpdate();
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // MASS UPDATE QUERIES //
    public void updateSubscriptionTypeID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("subscription_type_amenities", "subscription_type_id", oldID, newID);
    }

    public void updateAmenityID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("subscription_type_amenities", "amenity_id", oldID, newID);
    }

    public void deleteBySubscriptionTypeID(int subscriptionTypeID) {
        DBUtils.deleteTableRecordsByKey("subscription_type_amenities", "subscription_type_id", subscriptionTypeID);
    }

    public void deleteByAmenityID(int amenityID) {
        DBUtils.deleteTableRecordsByKey("subscription_type_amenities", "amenity_id", amenityID);
    }

    // SELECT QUERIES //
    public SubscriptionTypeAmenity selectSubscriptionTypeAmenity(int subscriptionTypeID, int amenityID) {
        String condition = "WHERE subscription_type_id = " + subscriptionTypeID + ", " +
                           "      amenity_id = " + amenityID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_type_amenities", condition);
        assert rs != null;
        return mapResultSetToSubscriptionTypeAmenity(rs);
    }

    public ArrayList<SubscriptionTypeAmenity> selectAllSubscriptionTypeAmenities() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_type_amenities");
        assert rs != null;
        return mapResultSetToSubscriptionTypeAmenityList(rs);
    }

    public static ArrayList<Amenity> selectAllAmenitiesOfASubscriptionType(int subscriptionTypeID) {
        String condition = "WHERE subscription_type_id = " + subscriptionTypeID;
        ResultSet rs = DBUtils.selectAllRecordsFromInnerJoinedTables(
                "subscription_type_amenities", "amenities", "amenity_id", "amenity_id", condition);
        assert rs != null;
        return AmenitiesDAO.mapResultSetToAmenityList(rs);
    }

    // UTILITY METHODS //
    public static SubscriptionTypeAmenity mapResultSetToSubscriptionTypeAmenity(ResultSet rs) {
        try {
            int subscriptionTypeID = rs.getInt(1);
            int amenityID = rs.getInt(2);

            return new SubscriptionTypeAmenity(subscriptionTypeID, amenityID);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<SubscriptionTypeAmenity> mapResultSetToSubscriptionTypeAmenityList(ResultSet rs) {
        ArrayList<SubscriptionTypeAmenity> sList = new ArrayList<SubscriptionTypeAmenity>();
        try {
            while (rs.next()) {
                sList.add(mapResultSetToSubscriptionTypeAmenity(rs));
            }
            return sList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static boolean subscriptionTypeHasAmenity(int subscriptionTypeID, int amenityID) {
        ArrayList<Amenity> aList = selectAllAmenitiesOfASubscriptionType(subscriptionTypeID);
        for (Amenity a : aList) {
            if (a.amenityID() == amenityID) {
                return true;
            }
        }
        return false;
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
