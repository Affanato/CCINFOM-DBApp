public class DBAppModel {

    private final AmenitiesDAO amenitiesDAO;
    private final MembersDAO membersDAO;
    private final MembershipsDAO membershipsDAO;
    private final MembershipTypesDAO membershipTypesDAO;
    private final ProductsDAO productsDAO;
    private final TrainersDAO trainersDAO;
    private final TransactionsDAO transactionsDAO;

    public DBAppModel() {
        amenitiesDAO = new AmenitiesDAO();
        membersDAO = new MembersDAO();
        membershipsDAO = new MembershipsDAO();
        membershipTypesDAO = new MembershipTypesDAO();
        productsDAO = new ProductsDAO();
        trainersDAO = new TrainersDAO();
        transactionsDAO = new TransactionsDAO();
    }

    public AmenitiesDAO getAmenitiesDAO() {
        return amenitiesDAO;
    }

    public MembersDAO getMembersDAO() {
        return membersDAO;
    }

    public MembershipsDAO getMembershipsDAO() {
        return membershipsDAO;
    }

    public MembershipTypesDAO getMembershipTypesDAO() {
        return membershipTypesDAO;
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