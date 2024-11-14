import java.sql.Connection;
import java.sql.Statement;

public class TrainersDAO {

    private Connection connection;
    private Statement statement;

    public TrainersDAO() {
        this.connection = DBManager.getConnection();
        this.statement = DBManager.getNewStatement();
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
