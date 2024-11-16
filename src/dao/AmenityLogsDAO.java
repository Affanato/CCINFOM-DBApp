import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AmenityLogsDAO {

    private final Statement statement;

    public AmenityLogsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public void insertAmenity(Amenity a) {

    }

    public void deleteAmenity(int amenityID) {

    }

    public void updateAmenity(int amenityID, Amenity a) {

    }

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {}

    public void updateAmenityID(int oldID, int newID) {}

    public void deleteByMemberID(int memberID) {}

    public void deleteByAmenityID(int amenityID) {}

    // SELECT QUERIES //
    public Amenity selectAmenity(int amenityID) {}

    public ArrayList<Amenity> selectAllAmenities() {}

    public ArrayList<Amenity> selectAllActiveAmenities() {}

    // UTILITY METHODS //
    private Amenity mapResultSetToAmenity(ResultSet rs) {}

    private ArrayList<Amenity> mapResultSetToAmenityList(ResultSet rs) {}

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
