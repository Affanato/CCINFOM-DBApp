import java.sql.Statement;

public class ProductPurchasesDAO {

    private final Statement statement;

    public ProductPurchasesDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
