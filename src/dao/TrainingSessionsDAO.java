import java.sql.Statement;

public class TrainingSessionsDAO {

    private final Statement statement;

    public TrainingSessionsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to any implemented DAO.

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
