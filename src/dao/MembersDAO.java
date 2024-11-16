import java.sql.Statement;

public class MembersDAO {

    private Statement statement;

    public MembersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to SubscriptionsDAO.

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
