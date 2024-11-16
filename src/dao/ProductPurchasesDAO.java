import java.sql.Statement;

public class ProductPurchasesDAO {

    private final Statement statement;

    public ProductPurchasesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: Code related methods. Refer to SubscriptionsDAO.

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
