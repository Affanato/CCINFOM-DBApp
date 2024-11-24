import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
                     "    amenity_status = ? " +
                     "WHERE amenity_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, amenityName);
            ps.setDouble(2, walkInPricePerHour);
            ps.setTime(3, Time.valueOf(openingTime));
            ps.setTime(4, Time.valueOf(closingTime));
            ps.setString(5, amenityStatus);
            ps.setInt(6, amenityID);

            ps.executeUpdate();
            System.out.println("'amenities' record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }

        return true;
    }

    // SELECT QUERIES //
    public static String[] getComboBoxAmenityIDs() {
        String condition = "WHERE amenity_id != 1 " +
                           "ORDER BY amenity_id ";
        return DBUtils.selectAllKeysFromTable("amenities", "amenity_id", condition);
    }

    public static Amenity selectAmenity(int amenityID) {
        String condition = "WHERE amenity_id = " + amenityID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities", condition);
        assert rs != null;

        try {
            if (rs.next()) {  // Ensure we move to the first row
                return mapResultSetToAmenity(rs);
            } else {
                System.out.println("No Amenity ResultSet data for amenity_id: " + amenityID);
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectAllAmenities() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities");
        assert rs != null;
        return mapResultSetToAmenitiesArr(rs);
    }

    public Object[][] selectAllActiveAmenities() {
        String condition = "WHERE amenity_status = 'Active'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities", condition);
        assert rs != null;
        return mapResultSetToAmenitiesArr(rs);
    }

    // TRANSACTIONS //
    public boolean changeAmenityStatus(int amenityID, String status) {
        if (!Status.hasDescription(status)) return false;
        Amenity oldA = selectAmenity(amenityID);
        return updateAmenity(
                amenityID, oldA.amenityName(), oldA.walkInPricePerHour(), oldA.openingTime().toString(),
                oldA.closingTime().toString(), status);
    }

    // REPORTS //
    public Object[][] queryAmenitiesUsageLifetime() {
        String sql = "SELECT        a.amenity_name, FORMAT(COUNT(*), 0) AS total_usages " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "WHERE         a.amenity_id != 1 " +
                     "GROUP BY      a.amenity_name " +
                     "ORDER BY      total_usages DESC; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                String amenityName = rs.getString("amenity_name");
                String totalUsages = rs.getString("total_usages");

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
                     "              FORMAT(COUNT(*), 0) AS total_usages " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "WHERE         a.amenity_id != 1 " +
                     "GROUP BY      year, month, a.amenity_name " +
                     "ORDER BY      year, month, a.amenity_name; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String amenityName = rs.getString("amenity_name");
                String totalUsages = rs.getString("total_usages");

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
        String sql = "SELECT        a.amenity_name, FORMAT(SUM(al.usage_total_price), 2) AS total_revenue " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "WHERE         a.amenity_id != 1 " +
                     "GROUP BY      a.amenity_name " +
                     "ORDER BY      total_revenue DESC; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                String amenityName = rs.getString("amenity_name");
                String totalRevenue = rs.getString("total_revenue");

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
                     "              FORMAT(SUM(al.usage_total_price), 2) AS total_revenue " +
                     "FROM          amenity_logs al " +
                     "JOIN          amenities a ON al.amenity_id = a.amenity_id " +
                     "WHERE         a.amenity_id != 1 " +
                     "GROUP BY      year, month, a.amenity_name " +
                     "ORDER BY      year, month, a.amenity_name; ";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String amenityName = rs.getString("amenity_name");
                String totalRevenue = rs.getString("total_revenue");

                Object[] elem = {year, month, amenityName, totalRevenue};
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

        try {
            // DateTimeFormatter for the format including date and time
            DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            // Parse the full DateTime (date and time)
            LocalDateTime parsedDateTime = LocalDateTime.parse(usageStartDateTime, dtFormatter);

            // Extract time from the parsed DateTime
            LocalTime usageStartTime = DBUtils.normalizeTime(parsedDateTime.toLocalTime());
            LocalTime usageEndTime = DBUtils.normalizeTime(usageStartTime.plusHours(usageDurationHours));

            // Retrieve the amenity object using amenityID
            Amenity a = selectAmenity(amenityID);
            if (a == null) {
                System.err.println("Amenity not found with ID: " + amenityID);
                return false;
            }

            LocalTime openingTime = DBUtils.normalizeTime(a.openingTime());
            LocalTime closingTime = DBUtils.normalizeTime(a.closingTime());

            // Debugging output
            DateTimeFormatter tFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

            System.out.println("Start time: " + usageStartTime.format(tFormatter));
            System.out.println("End time: " + usageEndTime.format(tFormatter));
            System.out.println("Opening time: " + openingTime.format(tFormatter));
            System.out.println("Closing time: " + closingTime.format(tFormatter));

            // Check if both start and end times are within the amenity's operating hours
            return timeIsBetweenOrEqual(usageStartTime, openingTime, closingTime) &&
                    timeIsBetweenOrEqual(usageEndTime, openingTime, closingTime);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid usageStartDateTime format: " + usageStartDateTime);
            return false;
        }
    }

    public static boolean timeIsBetweenOrEqual(LocalTime target, LocalTime start, LocalTime end) {
        DateTimeFormatter tFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("\n[NEW TIME]");
        System.out.println("Target: " + target.format(tFormatter));
        System.out.println("Start time: " + start.format(tFormatter));
        System.out.println("End time: " + end.format(tFormatter));

        boolean timeIsBetweenOrEqual = target.equals(start) || target.isAfter(start) && (target.isBefore(end) || target.equals(end));
        System.out.println("Between or equal = " + timeIsBetweenOrEqual);
        return timeIsBetweenOrEqual;
    }

    public static Amenity mapResultSetToAmenity(ResultSet rs) {
        try {
            int amenityID = rs.getInt(1);
            String amenityName = rs.getString(2);
            double walkInPrice = rs.getDouble(3);
            LocalTime openingTime = rs.getTime(4).toLocalTime();
            LocalTime closingTime = rs.getTime(5).toLocalTime();
            Status amenityStatus = Status.fromString(rs.getString(6));

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

    public static Object[] mapResultSetToAmenityArr(ResultSet rs) {
        try {
            return new Object[] {
                    rs.getInt("amenity_id"),
                    rs.getString("amenity_name"),
                    rs.getDouble("walk_in_price_per_hour"),
                    rs.getTime("opening_time").toString(),
                    rs.getTime("closing_time").toString(),
                    rs.getString("amenity_status")
            };
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[][] mapResultSetToAmenitiesArr(ResultSet rs) {
        List<Object[]> amenitiesArr = new ArrayList<Object[]>();

        try {
            while (rs.next()) {
                amenitiesArr.add(mapResultSetToAmenityArr(rs));
            }
            return amenitiesArr.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
