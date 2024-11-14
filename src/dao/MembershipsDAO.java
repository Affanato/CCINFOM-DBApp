import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

// TODO: Kay CJ 'to! - CJ
public class MembershipsDAO {

    private final Statement statement;

    public MembershipsDAO() {
        this.statement = DBManager.getNewStatement();
    }

    // SINGLE UPDATE QUERIES //
    public void insertMembership(int memberID, int membershipTypeID, int trainerID, String membershipStartDate, String membershipEndDate) {
        String sql = "INSERT INTO memberships (member_id, membership_type_id, trainer_id, membership_start_date, membership_end_date) " +
                     "VALUES (?, ?, ?, ?, ?) ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);
            ps.setInt(2, membershipTypeID);
            ps.setInt(3, trainerID);
            ps.setDate(4, Date.valueOf(membershipStartDate));
            ps.setDate(5, Date.valueOf(membershipEndDate));
            ps.executeUpdate();
            System.out.println("Membership record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteMembership(int membershipID) {
        String sql = "DELETE FROM memberships " +
                     "WHERE membership_id = ? ";

        try (PreparedStatement ps = DBManager.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, membershipID);
            ps.executeUpdate();
            System.out.println("Membership record deleted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // SELECT QUERIES //
    public ArrayList<Membership> selectAllMemberships() {
        String sql = "SELECT * " +
                     "FROM memberships ";

        try (ResultSet rs = statement.executeQuery(sql)) {
            ArrayList<Membership> membershipList = mapResultSetToMembershipList(rs);
            System.out.println("All membership records retrieved successfully.");
            return membershipList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public ArrayList<Membership> selectActiveMemberships() {
        String sql = "SELECT * " +
                     "FROM memberships " +
                     "WHERE DATE(NOW()) <= membership_start_date ";

        try (ResultSet rs = statement.executeQuery(sql)) {
            ArrayList<Membership> activeMembershipList = mapResultSetToMembershipList(rs);
            System.out.println("All active membership records retrieved successfully.");
            return activeMembershipList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // MASS UPDATE QUERIES //
    public void updateOldMemberFKs(int oldID, int newID) {
        
    }

    public void updateOldMembershipTypeFKs(int oldID, int newID) {

    }

    public void updateOldTrainerFKs(int oldID, int newID) {

    }

    public void deleteByMemberFK(int targetID) {

    }

    public void deleteByMembershipFK(int targetID) {

    }

    public void deleteByTrainerFK(int targetID) {

    }

    // UTILITY METHODS
    private ArrayList<Membership> mapResultSetToMembershipList(ResultSet rs) {
        ArrayList<Membership> membershipList = new ArrayList<>();
        try {
            while (rs.next()) {
                int membershipID = rs.getInt("membership_id");
                int memberID = rs.getInt("member_id");
                int membershipTypeID = rs.getInt("membership_type_id");
                int trainerID = rs.getInt("trainer_id");
                LocalDate membershipStartDate = rs.getDate("membership_start_date").toLocalDate();
                LocalDate membershipEndDate = rs.getDate("membership_end_date").toLocalDate();
                membershipList.add(new Membership(membershipID, memberID, membershipTypeID, trainerID, membershipStartDate, membershipEndDate));
            }
            return membershipList;
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
