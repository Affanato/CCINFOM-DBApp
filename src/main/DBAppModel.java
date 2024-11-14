import java.sql.Connection;
import java.sql.SQLException;

public class DBAppModel {

    private final MembersDAO membersDAO;
    private final MembershipsDAO membershipsDAO;
    private final ProductsDAO productsDAO;
    private final TrainersDAO trainersDAO;
    private final TransactionsDAO transactionsDAO;

    public DBAppModel() {
        membersDAO = new MembersDAO();
        membershipsDAO = new MembershipsDAO();
        productsDAO = new ProductsDAO();
        trainersDAO = new TrainersDAO();
        transactionsDAO = new TransactionsDAO();
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
        DBManager.closeConnection();
    }

    public void closeStatements() {
        membersDAO.closeStatement();
        membershipsDAO.closeStatement();
        productsDAO.closeStatement();
        trainersDAO.closeStatement();
        transactionsDAO.closeStatement();
    }
}