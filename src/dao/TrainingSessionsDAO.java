import java.sql.Statement;

public class TrainingSessionsDAO {

    private final Statement statement;

    public TrainingSessionsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
