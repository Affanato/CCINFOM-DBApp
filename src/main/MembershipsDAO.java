import java.sql.Connection;
import java.sql.Statement;

public class MembershipsDAO {

    private Statement statement;

    public MembershipsDAO() {
        this.statement = DBManager.getNewStatement();
    }

    // TODO: CJ will code the associated methods here.
    private void createTable() {

    }

    public void insertMembership() {

    }

    public void removeMembership() {

    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
