import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

// TODO: Kay CJ 'to! - CJ
public class AmenitiesDAO {

    private Statement statement;

    public AmenitiesDAO() {
        this.statement = DBManager.getNewStatement();
    }

    public void insertAmenity(String amenityName) {
        String sql = "INSERT INTO amenities (amenity_name) " +
                     "VALUES (?) ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, amenityName);
            ps.executeUpdate();
            System.out.println("Amenity record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteAmenity(int amenity_id) {
        String sql = "DELETE FROM amenities " +
                     "WHERE amenity_id = ? ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, amenity_id);
            ps.executeUpdate();
            System.out.println("Amenity record deleted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void updateAmenityID(int oldID, int newID) {

    }

    public void updateAmenityName(String oldName, String newName) {
        String sql = "UPDATE amenities " +
                     "SET ? = ? " +
                     "WHERE ? = ? ";


    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
