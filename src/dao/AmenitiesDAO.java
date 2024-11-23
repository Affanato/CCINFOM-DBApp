import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

// TODO: DONE FOR NOW!!!
// TODO: Verify if the methods are implemented correctly.
public class AmenitiesDAO {

    private final Statement statement;

    public AmenitiesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES
    public boolean insertAmenity(String amenityName, double walkInPricePerHour, String openingTime, String closingTime, String amenityStatus) {
        if (!isValidAmenityInsertion(walkInPricePerHour, openingTime, closingTime, amenityStatus)) {
            return false;
        }

        String sql = "INSERT INTO amenities (amenity_name, walk_in_price_per_hour, opening_time, closing_time, amenity_status) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, amenityName);
            ps.setDouble(2, walkInPricePerHour);
            ps.setTime(3, Time.valueOf(openingTime));
            ps.setTime(4, Time.valueOf(closingTime));
            ps.setString(5, amenityStatus);

            ps.executeUpdate();
            System.out.println("'amenities' record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    public boolean deleteAmenity(int amenityID) {
        if (!amenityExists(amenityID)) return false;
        DBUtils.invalidateTableForeignKey("amenity_logs", "amenity_id", amenityID);
        DBUtils.invalidateTableForeignKey("subscription_type_amenities", "amenity_id", amenityID);
        DBUtils.deleteTableRecordsByKey("amenities", "amenity_id", amenityID);
        return true;
    }

    public boolean updateAmenity(int amenityID, String amenityName, double walkInPricePerHour, String openingTime, String closingTime, String amenityStatus) {
        if (!isValidAmenityInsertion(walkInPricePerHour, openingTime, closingTime, amenityStatus)) {
            return false;
        }

        String sql = "UPDATE amenities " +
                     "SET amenity_name = ?, " +
                     "    walk_in_price_per_hour = ?, " +
                     "    opening_time = ?, " +
                     "    closing_time = ?, " +
                     "    amenity_status = ?, " +
                     "WHERE amenity_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, amenityName);
            ps.setDouble(2, walkInPricePerHour);
            ps.setTime(3, Time.valueOf(openingTime));
            ps.setTime(4, Time.valueOf(closingTime));
            ps.setString(5, amenityStatus);

            ps.executeUpdate();
            System.out.println("'amenities' record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    // SELECT QUERIES //
    public String[] getComboBoxAmenityIDs() {
        return DBUtils.selectAllKeysFromTable("amenities", "amenity_id");
    }

    public static Amenity selectAmenity(int amenityID) {
        String condition = "WHERE amenity_id = " + amenityID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities", condition);
        assert rs != null;
        return mapResultSetToAmenity(rs);
    }

    public Object[][] selectAllAmenities() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities");
        assert rs != null;
        return DBUtils.to2DObjectArray(Objects.requireNonNull(mapResultSetToAmenityList(rs)));
    }

    public Object[][] selectAllActiveAmenities() {
        String condition = "WHERE amenity_status = 'Active'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(Objects.requireNonNull(mapResultSetToAmenityList(rs)));
    }

    // TRANSACTIONS //
    public boolean changeAmenityStatus(int amenityID, String status) {
        if (!Status.hasDescription(status)) return false;
        Amenity oldA = selectAmenity(amenityID);
        Amenity newA = new Amenity(
                oldA.amenityID(),
                oldA.amenityName(),
                oldA.walkInPricePerHour(),
                oldA.openingTime(),
                oldA.closingTime(),
                Status.fromString(status)
        );
        updateAmenity(amenityID, newA);
        return true;
    }

    // REPORTS //
    public Object[][] queryAmenitiesUsageLifetime() {
        String sql = "SELECT        a.amenity_name, COUNT(*) AS total_usages " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "GROUP BY      a.amenity_name " +
                     "ORDER BY      total_usages DESC; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                String amenityName = rs.getString("amenity_name");
                int totalUsages = rs.getInt("total_usages");

                Object[] elem = {amenityName, totalUsages};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] queryAmenitiesUsagePerMonthPerYear() {
        String sql = "SELECT        YEAR(al.usage_start_datetime) AS year, " +
                     "              MONTH(al.usage_start_datetime) AS month, " +
                     "              a.amenity_name, " +
                     "              COUNT(*) AS total_usages " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "GROUP BY      year, month, a.amenity_name " +
                     "ORDER BY      year, month, a.amenity_name; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String amenityName = rs.getString("amenity_name");
                int totalUsages = rs.getInt("total_usages");

                Object[] elem = {year, month, amenityName, totalUsages};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] queryAmenitiesRevenueLifetime() {
        String sql = "SELECT        a.amenity_name, SUM(al.usage_total_price) AS total_revenue " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "GROUP BY      a.amenity_name " +
                     "ORDER BY      total_revenue DESC; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                String amenityName = rs.getString("amenity_name");
                int totalRevenue = rs.getInt("total_revenue");

                Object[] elem = {amenityName, totalRevenue};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] queryAmenitiesRevenuePerMonthPerYear() {
        String sql = "SELECT        YEAR(al.usage_start_datetime) AS year, " +
                     "              MONTH(al.usage_start_datetime) AS month, " +
                     "              a.amenity_name, " +
                     "              SUM(al.usage_total_price) AS total_revenue " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "GROUP BY      year, month, a.amenity_name " +
                     "ORDER BY      year, month, a.amenity_name; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String amenityName = rs.getString("amenity_name");
                int totalUsages = rs.getInt("total_usages");

                Object[] elem = {year, month, amenityName, totalUsages};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // UTILITY METHODS //
    public boolean isValidAmenityInsertion(double walkInPricePerHour, String openingTime, String closingTime, String amenityStatus) {
        if (!Status.hasDescription(amenityStatus)) return false;

        LocalTime openTime;
        LocalTime closeTime;
        try {
            openTime = LocalTime.parse(openingTime); // Default format: HH:mm[:ss]
            closeTime = LocalTime.parse(closingTime);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format. Please use 'HH:mm[:ss]'.");
            return false;
        }

        return openTime.isBefore(closeTime);// invalid opening and closing time
    }

    public static boolean amenityExists(int amenityID) {
        return selectAmenity(amenityID) != null;
    }

    public static boolean isActiveAmenity(int amenityID) {
        Amenity a = selectAmenity(amenityID);
        return a != null && a.amenityStatus() == Status.ACTIVE;
    }

    public static boolean isWithinAmenityHours(int amenityID, String usageStartDateTime, int usageDurationHours) {
        if (usageDurationHours <= 0) return false;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalTime usageStartTime = LocalDateTime.parse(usageStartDateTime, formatter).toLocalTime();
        LocalTime usageEndTime = usageStartTime.plusHours(usageDurationHours);
        Amenity a = selectAmenity(amenityID);

        return timeIsBetweenOrEqual(usageStartTime, a.openingTime(), a.closingTime()) &&
               timeIsBetweenOrEqual(usageEndTime, a.openingTime(), a.closingTime());
    }

    public static boolean timeIsBetweenOrEqual(LocalTime target, LocalTime start, LocalTime end) {
        return (target.equals(start) || target.isAfter(start)) && (target.isBefore(end) || target.equals(end));
    }

    public static Amenity mapResultSetToAmenity(ResultSet rs) {
        try {
            int amenityID = rs.getInt("amenity_id");
            String amenityName = rs.getString("amenity_name");
            double walkInPrice = rs.getDouble("walk_in_price");
            LocalTime openingTime = rs.getTime("opening_time").toLocalTime();
            LocalTime closingTime = rs.getTime("closing_time").toLocalTime();
            Status amenityStatus = Status.valueOf(rs.getString("amenity_status"));

            return new Amenity(amenityID, amenityName, walkInPrice, openingTime, closingTime, amenityStatus);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<Amenity> mapResultSetToAmenityList(ResultSet rs) {
        ArrayList<Amenity> amenityList = new ArrayList<Amenity>();
        try {
            while (rs.next()) {
                amenityList.add(mapResultSetToAmenity(rs));
            }
            return amenityList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
