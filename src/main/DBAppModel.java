public class DBAppModel {

    private final AmenitiesDAO amenitiesDAO;
    private final MembersDAO membersDAO;
    private final SubscriptionsDAO subscriptionsDAO;
    private final SubscriptionTypesDAO subscriptionTypesDAO;
    private final ProductsDAO productsDAO;
    private final TrainersDAO trainersDAO;

    public DBAppModel() {
        amenitiesDAO = new AmenitiesDAO();
        membersDAO = new MembersDAO();
        subscriptionsDAO = new SubscriptionsDAO();
        subscriptionTypesDAO = new SubscriptionTypesDAO();
        productsDAO = new ProductsDAO();
        trainersDAO = new TrainersDAO();
    }

    public void initializeDatabase() {
        DBUtils.initializeDatabase();
    }

    public void closeDatabaseConnection() {
        DBUtils.closeConnection();
    }

    public void closeStatements() {
        amenitiesDAO.closeStatement();
        membersDAO.closeStatement();
        subscriptionsDAO.closeStatement();
        subscriptionTypesDAO.closeStatement();
        productsDAO.closeStatement();
        trainersDAO.closeStatement();
    }

    public AmenitiesDAO getAmenitiesDAO() {
        return amenitiesDAO;
    }

    public MembersDAO getMembersDAO() {
        return membersDAO;
    }

    public SubscriptionsDAO getMembershipsDAO() {
        return subscriptionsDAO;
    }

    public SubscriptionTypesDAO getMembershipTypesDAO() {
        return subscriptionTypesDAO;
    }

    public ProductsDAO getProductsDAO() {
        return productsDAO;
    }

    public TrainersDAO getTrainersDAO() {
        return trainersDAO;
    }
}