import java.sql.Statement;

public class TrainersDAO {

    private Statement statement;

    public TrainersDAO() {
        this.statement = DBManager.getNewStatement();
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
