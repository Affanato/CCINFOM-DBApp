import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

// TODO: IN PROGRESS!!!
// Verify if the methods are implemented correctly.
public class AmenityLogsDAO {

    private final Statement statement;

    public AmenityLogsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Current.
    // SINGLE UPDATE QUERIES //
    public void insertAmenityLog(int memberID, int amenityID, int usageDurationHours) {
        if (!AmenitiesDAO.isActiveAmenity(amenityID)) {
            System.out.println("Chosen amenity is inactive!");
            return;
        }

        String sql = "INSERT INTO amenity_logs (member_id, amenity_id, usage_start_datetime, usage_duration_hours, usage_total_price) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, amenityID);
            ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            ps.setInt(4, usageDurationHours);
            ps.setDouble(5, getUsageTotalPrice(memberID, amenityID, usageDurationHours));

            ps.executeUpdate();
            System.out.println("'amenity_logs' record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteAmenityLog(int amenityLogID) {
        DBUtils.deleteTableRecordsByKey("amenity_logs", "amenity_log_id", amenityLogID);
    }

    public void updateAmenityLog(int amenityLogID, AmenityLog a) {
        String sql = "UPDATE amenity_logs " +
                     "SET member_id = ?, " +
                     "    amenity_id = ?, " +
                     "    usage_start_datetime = ?, " +
                     "    usage_duration_hours = ?, " +
                     "    usage_total_price = ? " +
                     "WHERE amenity_log_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, a.memberID());
            ps.setInt(2, a.amenityID());
            ps.setTimestamp(3, Timestamp.valueOf(a.usageStartDateTime()));
            ps.setInt(4, a.usageDurationHours());
            ps.setDouble(5, a.usageTotalPrice());
            ps.setInt(6, amenityLogID);

            ps.executeUpdate();
            System.out.println("amenity_log record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("amenity_logs", "member_id", oldID, newID);
    }

    public void updateAmenityID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("amenity_logs", "amenity_id", oldID, newID);
    }

    public void deleteByMemberID(int memberID) {
        DBUtils.deleteTableRecordsByKey("amenity_logs", "member_id", memberID);
    }

    public void deleteByAmenityID(int amenityID) {
        DBUtils.deleteTableRecordsByKey("amenity_logs", "amenity_id", amenityID);
    }

    // SELECT QUERIES //
    public AmenityLog selectAmenityLog(int amenityLogID) {
        String condition = "WHERE amenity_log_id = " + amenityLogID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenity_logs", condition);
        assert rs != null;
        return mapResultSetToAmenityLog(rs);
    }

    public ArrayList<AmenityLog> selectAllAmenityLogs() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenity_logs");
        assert rs != null;
        return mapResultSetToAmenityLogList(rs);
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
