import java.sql.Statement;

public class ProductsDAO {

    private Statement statement;

    public ProductsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Provide methods that updates the foreign keys of all Memberships records with an old foreign key (if applicable).

    // TODO: Provide methods that deletes all Memberships records with a given foreign key (if applicable).

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}