import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

// TODO: IN PROGRESS!!!
// Verify if the methods are implemented correctly.
public class AmenityLogsDAO {

    private final Statement statement;

    public AmenityLogsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public void insertAmenityLog(AmenityLog a) {

    }

    public void deleteAmenityLog(int amenityLogID) {

    }

    public void updateAmenityLog(int amenityLogID, AmenityLog a) {

    }

    // MASS UPDATE QUERIES //
    public void updateMemberID(int oldID, int newID) {}

    public void updateAmenityID(int oldID, int newID) {}

    public void deleteByMemberID(int memberID) {}

    public void deleteByAmenityID(int amenityID) {}

    // SELECT QUERIES //
    public Amenity selectAmenityLog(int amenityLogID) {}

    public ArrayList<AmenityLog> selectAllAmenityLogs() {}

    // UTILITY METHODS //
    public static AmenityLog mapResultSetToAmenityLog(ResultSet rs) {}

    public static ArrayList<AmenityLog> mapResultSetToAmenityLogList(ResultSet rs) {}

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
