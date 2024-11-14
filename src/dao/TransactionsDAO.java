import java.sql.Statement;

// TODO: Kay CJ 'to! - CJ
public class TransactionsDAO {

    private final Statement statement;

    public TransactionsDAO() {
        this.statement = DBManager.getNewStatement();
    }

    // TODO: Provide methods that updates the foreign keys of all Memberships records with an old foreign key.

    // TODO: Provide methods that deletes all Memberships records with a given foreign key.

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
