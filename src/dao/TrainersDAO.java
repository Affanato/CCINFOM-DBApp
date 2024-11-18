import java.sql.Statement;

public class TrainersDAO {

    private Statement statement;

    public TrainersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to any implemented DAO.

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
