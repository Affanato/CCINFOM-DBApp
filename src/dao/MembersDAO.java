import java.sql.Statement;

public class MembersDAO {

    private Statement statement;

    public MembersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Provide methods that updates the foreign keys of all Memberships records with an old foreign key (if applicable).

    // TODO: Provide methods that deletes all Memberships records with a given foreign key (if applicable).

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
