import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class AmenityLogsDAO {

    private final Statement statement;

    public AmenityLogsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public boolean insertAmenityLog(int memberID, int amenityID, String startDateTime, int usageDurationHours) {
        if (!AmenitiesDAO.isActiveAmenity(amenityID)) { // inactive amenity
            System.out.println("Chosen amenity is inactive!");
            return false;
        }

        if (usageDurationHours <= 0) {
            System.out.println("Provide a positive number of usage hours!");
            return false;
        } // invalid usage duration hours

        if (!AmenitiesDAO.isWithinAmenityHours(amenityID, startDateTime, usageDurationHours)) {
            System.out.println("Chosen amenity usage datetime is beyond amenity hours!");
            return false;
        } // goes beyond hours

        String sql = "INSERT INTO amenity_logs (member_id, amenity_id, usage_start_datetime, usage_duration_hours, usage_total_price) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, amenityID);
            ps.setTimestamp(3, Timestamp.valueOf(startDateTime)); // yyyy-MM-dd HH:mm:ss format
            ps.setInt(4, usageDurationHours);
            ps.setDouble(5, getUsageTotalPrice(memberID, amenityID, usageDurationHours));

            ps.executeUpdate();
            System.out.println("'amenity_logs' record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    public boolean deleteAmenityLog(int amenityLogID) {
        try {
            DBUtils.deleteTableRecordsByKey("amenity_logs", "amenity_log_id", amenityLogID);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean updateAmenityLog(int amenityLogID, int memberID, int amenityID, String startDateTime, int usageDurationHours) {
        if (!AmenitiesDAO.isActiveAmenity(amenityID)) { // inactive amenity
            System.out.println("Chosen amenity is inactive!\n");
            return false;
        }

        if (usageDurationHours <= 0) {
            System.out.println("Provide a positive number of usage hours!\n");
            return false;
        } // invalid usage duration hours

        boolean withinHours = AmenitiesDAO.isWithinAmenityHours(amenityID, startDateTime, usageDurationHours);
        if (!withinHours) {
            System.out.println("Chosen amenity usage datetime is beyond amenity hours!\n");
            return false;
        } // goes beyond hours

        String sql = "UPDATE amenity_logs " +
                     "SET member_id = ?, " +
                     "    amenity_id = ?, " +
                     "    usage_start_datetime = ?, " +
                     "    usage_duration_hours = ?, " +
                     "    usage_total_price = ? " +
                     "WHERE amenity_log_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, amenityID);
            ps.setTimestamp(3, Timestamp.valueOf(startDateTime));
            ps.setInt(4, usageDurationHours);
            ps.setDouble(5, getUsageTotalPrice(memberID, amenityID, usageDurationHours));
            ps.setInt(6, amenityLogID);

            ps.executeUpdate();
            System.out.println("'amenity_logs' record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return true;
    }

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("amenity_logs", "member_id", oldID, newID);
    } // might not be needed anymore

    public void updateAmenityID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("amenity_logs", "amenity_id", oldID, newID);
    } // might not be needed anymore

    public void deleteByMemberID(int memberID) {
        DBUtils.deleteTableRecordsByKey("amenity_logs", "member_id", memberID);
    }

    // SELECT QUERIES //
    public String[] getComboBoxAmenityLogIDs() {
        return DBUtils.selectAllKeysFromTable("amenity_logs", "amenity_log_id");
    }

    public AmenityLog selectAmenityLog(int amenityLogID) {
        String condition = "WHERE amenity_log_id = " + amenityLogID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenity_logs", condition);
        assert rs != null;

        try {
            if (rs.next()) {
                return mapResultSetToAmenityLog(rs);
            } else {
                System.out.println("No AmenityLog found with amenity_log_id = " + amenityLogID);
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectAllAmenityLogs() {
        String sql = "SELECT * FROM amenity_logs; ";

        try {
            ResultSet rs = DBUtils.getNewStatement().executeQuery(sql);
            return DBUtils.to2DObjectArray(mapResultSetToAmenityLogList(rs));
        } catch(SQLException | NullPointerException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // UTILITY METHODS //
    public double getUsageTotalPrice(int memberID, int amenityID, int usageDurationHours) {
        int subscriptionTypeID = MembersDAO.getCurrentSubscriptionTypeID(memberID);
        if (SubscriptionTypeAmenitiesDAO.subscriptionTypeHasAmenity(subscriptionTypeID, amenityID)) {
            return 0;
        }
        return AmenitiesDAO.selectAmenity(amenityID).walkInPricePerHour() * usageDurationHours;
    }

    public static AmenityLog mapResultSetToAmenityLog(ResultSet rs) {
        try {
            int amenityLogID = rs.getInt("amenity_log_id");
            int memberID = rs.getInt("member_id");
            int amenityID = rs.getInt("amenity_id");
            LocalDateTime usageStartDateTime = rs.getTimestamp("usage_start_datetime").toLocalDateTime();
            int usageDurationHours = rs.getInt("usage_duration_hours");
            double usageTotalPrice = rs.getDouble("usage_total_price");

            return new AmenityLog(amenityLogID, memberID, amenityID, usageStartDateTime, usageDurationHours, usageTotalPrice);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<AmenityLog> mapResultSetToAmenityLogList(ResultSet rs) {
        ArrayList<AmenityLog> aList = new ArrayList<AmenityLog>();
        try {
            while (rs.next()) {
                aList.add(mapResultSetToAmenityLog(rs));
            }
            return aList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
