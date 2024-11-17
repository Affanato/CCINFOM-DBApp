import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Map;

// TODO: DONE FOR NOW!!!
// TODO: Verify if the methods are implemented correctly.
public class AmenitiesDAO {

    private final Statement statement;

    public AmenitiesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES
    public void insertAmenity(Amenity a) {
        String sql = "INSERT INTO amenities (amenity_name, walk_in_price, opening_time, closing_time, amenityStatus) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, a.amenityName());
            ps.setDouble(2, a.walkInPrice());
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
                     "    walk_in_price = ?, " +
                     "    opening_time = ?, " +
                     "    closing_time = ?, " +
                     "    amenityStatus = ?, " +
                     "WHERE amenity_id = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, a.amenityName());
            ps.setDouble(2, a.walkInPrice());
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
    public Amenity selectAmenity(int amenityID) {
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

    // TODO: Implement these!
    // REPORTS //
    //public Map<Amenity, Integer> selectAmenitiesByDecreasingUsage() {}

    //public Map<Amenity, Double> selectAmenitiesByDecreasingRevenue() {}

    // UTILITY METHODS //
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
