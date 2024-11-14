import java.sql.Connection;
import java.sql.Statement;

public class ProductsDAO {

    private Connection connection;
    private Statement statement;

    public ProductsDAO() {
        this.connection = DBManager.getConnection();
        this.statement = DBManager.getNewStatement();
    }

    public void closeStatement() {
        DBManager.closeStatement(statement);
    }
}
