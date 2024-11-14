import java.sql.Connection;
import java.sql.Statement;

public class MembersDAO {

    private Connection connection;
    private Statement statement;

    public MembersDAO() {
        this.connection = DBManager.getConnection();
        this.statement = DBManager.getNewStatement();
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
