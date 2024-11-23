import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SubscriptionTypeAmenitiesDAO {

    private final Statement statement;

    public SubscriptionTypeAmenitiesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public boolean insertSubscriptionTypeAmenity(SubscriptionTypeAmenity s) {
        String sql = "INSERT INTO subscription_type_amenities (subscription_type_id, amenity_id) " +
                     "VALUES (?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, s.subscriptionTypeID());
            ps.setInt(2, s.amenityID());

            ps.executeUpdate();
            System.out.println("'subscription_type_amenities' record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    public boolean deleteSubscriptionTypeAmenity(SubscriptionTypeAmenity s) {
        String sql = "DELETE FROM subscription_type_amenities " +
                     "WHERE subscription_type_id = ? AND " +
                     "      amenity_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, s.subscriptionTypeID());
            ps.setInt(2, s.amenityID());

            ps.executeUpdate();
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
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

    public Object[][] selectAllSubscriptionTypeAmenities() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("subscription_type_amenities");
        assert rs != null;
        return DBUtils.to2DObjectArray(Objects.requireNonNull(mapResultSetToSubscriptionTypeAmenityList(rs)));
    }

    public static Object[][] selectAllAmenityNamesOfASubscriptionType(int subscriptionTypeID) {
        String sql = "SELECT a.amenity_name " +
                     "FROM subscription_types st " +
                     "JOIN subscription_type_amenities sta " +
                     "ON st.subscription_type_id = sta.subscription_type_id " +
                     "JOIN amenities a " +
                     "ON a.amenity_id = sta.amenity_id " +
                     "WHERE st.subscription_type_id = ? ";

        List<Object[]> amenityNames = new ArrayList<>();

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;

            ps.setInt(1, subscriptionTypeID);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    amenityNames.add(new Object[] {rs.getString("amenity_name")});
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return amenityNames.toArray(new Object[0][]);
    }

    public static String[] selectAllAmenityIDsOfASubscriptionType(int subscriptionTypeID) {
        String sql = "SELECT a.amenity_id " +
                "FROM subscription_types st " +
                "JOIN subscription_type_amenities sta " +
                "ON st.subscription_type_id = sta.subscription_type_id " +
                "JOIN amenities a " +
                "ON a.amenity_id = sta.amenity_id " +
                "WHERE st.subscription_type_id = ? ";

        List<String> amenityNames = new ArrayList<>();

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;

            ps.setInt(1, subscriptionTypeID);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    amenityNames.add(rs.getString("amenity_id"));
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return amenityNames.toArray(new String[0]);
    }

    // UTILITY METHODS //
    public static SubscriptionTypeAmenity mapResultSetToSubscriptionTypeAmenity(ResultSet rs) {
        try {
            if (!rs.next()) {
                System.out.println("No SubscriptionTypeAmenity ResultSet data.\n");
                return null;
            }

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
        if (!SubscriptionTypesDAO.subscriptionTypeExists(subscriptionTypeID)) return false;
        if (!AmenitiesDAO.amenityExists(amenityID)) return false;

        Object[][] amenityNames = selectAllAmenityNamesOfASubscriptionType(subscriptionTypeID);
        String amenityName = AmenitiesDAO.selectAmenity(amenityID).amenityName();

        for (Object[] name : amenityNames) {
            if (name[0].equals(amenityName)) {
                return true;
            }
        }
        return false;
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
