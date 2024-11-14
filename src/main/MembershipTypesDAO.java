import java.sql.Connection;
import java.sql.Statement;

public class MembershipTypesDAO {

    private Connection connection;
    private Statement statement;

    public MembershipTypesDAO() {
        this.connection = DBManager.getConnection();
        this.statement = DBManager.getNewStatement();
    }

    // TODO: CJ will code the associated methods here.


    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
