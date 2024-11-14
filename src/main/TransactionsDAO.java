import java.sql.Connection;
import java.sql.Statement;

public class TransactionsDAO {

    private Connection connection;
    private Statement statement;

    public TransactionsDAO() {
        this.connection = DBManager.getConnection();
        this.statement = DBManager.getNewStatement();
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
