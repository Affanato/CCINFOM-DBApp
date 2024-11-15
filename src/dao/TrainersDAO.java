import java.sql.Statement;

public class TrainersDAO {

    private Statement statement;

    public TrainersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
