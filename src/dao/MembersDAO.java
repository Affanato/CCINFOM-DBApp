import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MembersDAO {

    private Statement statement;

    public MembersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to any implemented DAO.


    // UTIL METHODS
    public static int getCurrentSubscriptionTypeID(int memberID) {
        String sql = "SELECT\t\t\ts.subscription_type_id " +
                     "FROM\t\t\tmembers m " +
                     "JOIN\t\t\tsubscriptions s ON m.member_id = s.member_id " +
                     "WHERE\t\t\tm.member_id = ? " +
                     "AND\t\t\t\tCURRENT_DATE BETWEEN s.subscription_start_date AND s.subscription_end_date; ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, memberID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
                return -1;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return -1;
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
