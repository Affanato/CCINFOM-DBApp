import java.sql.Connection;
import java.sql.Statement;

public class MembershipsDAO {

    private Connection connection;
    private Statement statement;

    public MembershipsDAO() {
        this.connection = DBManager.getConnection();
        this.statement = DBManager.getNewStatement();
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
