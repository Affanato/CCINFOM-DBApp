import java.sql.Statement;

public class MembersDAO {

    private Statement statement;

    public MembersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to SubscriptionsDAO.


    // UTIL METHODS
    // TODO: URGENT! Create a method that returns a member's current subscription_id (if they have one).
    public static int getCurrentSubscriptionID(int memberID) {

    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
