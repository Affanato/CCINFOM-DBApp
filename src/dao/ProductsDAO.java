import java.sql.Statement;

public class ProductsDAO {

    private Statement statement;

    public ProductsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to SubscriptionsDAO.

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
