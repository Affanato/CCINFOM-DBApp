import java.sql.*;
import java.time.LocalTime;
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
    public void insertAmenity(Amenity a) {
        String sql = "INSERT INTO amenities (amenity_name, walk_in_price_per_hour, opening_time, closing_time, amenity_status) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, a.amenityName());
            ps.setDouble(2, a.walkInPricePerHour());
            ps.setTime(3, Time.valueOf(a.openingTime()));
            ps.setTime(4, Time.valueOf(a.closingTime()));
            ps.setString(5, a.amenityStatus().toString());

            ps.executeUpdate();
            System.out.println("Amenity record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteAmenity(int amenityID) {
        DBUtils.deleteTableRecordsByKey("amenities", "amenity_id", amenityID);
    }

    public void updateAmenity(int amenityID, Amenity a) {
        String sql = "UPDATE amenities " +
                     "SET amenity_name = ?, " +
                     "    walk_in_price_per_hour = ?, " +
                     "    opening_time = ?, " +
                     "    closing_time = ?, " +
                     "    amenity_status = ?, " +
                     "WHERE amenity_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, a.amenityName());
            ps.setDouble(2, a.walkInPricePerHour());
            ps.setTime(3, Time.valueOf(a.openingTime()));
            ps.setTime(4, Time.valueOf(a.closingTime()));
            ps.setString(5, a.amenityStatus().toString());
            ps.setInt(6, amenityID);

            ps.executeUpdate();
            System.out.println("Amenity record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // SELECT QUERIES //
    public static Amenity selectAmenity(int amenityID) {
        String condition = "WHERE amenity_id = " + amenityID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities", condition);
        assert rs != null;
        return mapResultSetToAmenity(rs);
    }

    public ArrayList<Amenity> selectAllAmenities() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities");
        assert rs != null;
        return mapResultSetToAmenityList(rs);
    }

    public ArrayList<Amenity> selectAllActiveAmenities() {
        String condition = "WHERE amenity_status = 'Active'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("amenities", condition);
        assert rs != null;
        return mapResultSetToAmenityList(rs);
    }

    // TRANSACTIONS //
    public void changeAmenityStatus(int amenityID, Status status) {
        Amenity oldA = selectAmenity(amenityID);
        Amenity newA = new Amenity(
                oldA.amenityID(),
                oldA.amenityName(),
                oldA.walkInPricePerHour(),
                oldA.openingTime(),
                oldA.closingTime(),
                status
        );
        updateAmenity(amenityID, newA);
    }

    // REPORTS //
    public Object[][] selectAmenitiesByDecreasingUsage() {
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

    public Object[][] selectAmenitiesByDecreasingRevenue() {
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

    // UTILITY METHODS //
    public static boolean isActiveAmenity(int amenityID) {
        Amenity a = selectAmenity(amenityID);
        return a != null && a.amenityStatus() == Status.ACTIVE;
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
