import java.sql.Connection;
import java.sql.SQLException;

public class DBAppModel {

    private Connection databaseConnection;
    private final MembersDAO membersDAO;
    private final MembershipsDAO membershipsDAO;
    private final ProductsDAO productsDAO;
    private final TrainersDAO trainersDAO;
    private final TransactionsDAO transactionsDAO;

    public DBAppModel() {
        try {
            this.databaseConnection = DBManager.getDatabaseConnection();
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
        }
        membersDAO = new MembersDAO();
        membershipsDAO = new MembershipsDAO();
        productsDAO = new ProductsDAO();
        trainersDAO = new TrainersDAO();
        transactionsDAO = new TransactionsDAO();
    }

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public MembersDAO getMembersDAO() {
        return membersDAO;
    }

    public MembershipsDAO getMembershipsDAO() {
        return membershipsDAO;
    }

    public ProductsDAO getProductsDAO() {
        return productsDAO;
    }

    public TrainersDAO getTrainersDAO() {
        return trainersDAO;
    }

    public TransactionsDAO getTransactionsDAO() {
        return transactionsDAO;
    }

    public void closeDatabaseConnection() {
        DBManager.closeDatabaseConnection();
    }
}