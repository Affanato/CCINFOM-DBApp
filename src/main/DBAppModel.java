public class DBAppModel {

    private final AmenitiesDAO amenitiesDAO;
    private final AmenityLogsDAO amenityLogsDAO;
    private final MembersDAO membersDAO;
    private final ProductPurchasesDAO productPurchasesDAO;
    private final ProductsDAO productsDAO;
    private final SubscriptionsDAO subscriptionsDAO;
    private final SubscriptionTypeAmenitiesDAO subscriptionTypeAmenitiesDAO;
    private final SubscriptionTypesDAO subscriptionTypesDAO;
    private final TrainersDAO trainersDAO;
    private final TrainingSessionsDAO trainingSessionsDAO;

    public DBAppModel() {
        amenitiesDAO = new AmenitiesDAO();
        amenityLogsDAO = new AmenityLogsDAO();
        membersDAO = new MembersDAO();
        productPurchasesDAO = new ProductPurchasesDAO();
        productsDAO = new ProductsDAO();
        subscriptionsDAO = new SubscriptionsDAO();
        subscriptionTypeAmenitiesDAO = new SubscriptionTypeAmenitiesDAO();
        subscriptionTypesDAO = new SubscriptionTypesDAO();
        trainersDAO = new TrainersDAO();
        trainingSessionsDAO = new TrainingSessionsDAO();
    }

    // GETTER METHODS //
    public AmenitiesDAO getAmenitiesDAO() {
        return amenitiesDAO;
    }

    public AmenityLogsDAO getAmenityLogsDAO() {
        return amenityLogsDAO;
    }

    public MembersDAO getMembersDAO() {
        return membersDAO;
    }

    public ProductPurchasesDAO getProductPurchasesDAO() {
        return productPurchasesDAO;
    }

    public ProductsDAO getProductsDAO() {
        return productsDAO;
    }

    public SubscriptionsDAO getSubscriptionsDAO() {
        return subscriptionsDAO;
    }

    public SubscriptionTypeAmenitiesDAO getSubscriptionTypeAmenitiesDAO() {
        return subscriptionTypeAmenitiesDAO;
    }

    public SubscriptionTypesDAO getSubscriptionTypesDAO() {
        return subscriptionTypesDAO;
    }

    public TrainersDAO getTrainersDAO() {
        return trainersDAO;
    }

    public TrainingSessionsDAO getTrainingSessionsDAO() {
        return trainingSessionsDAO;
    }

    // UTILITY METHODS //
    public void initializeDatabase() {
        DBUtils.initializeDatabase();
    }

    public void closeDatabaseConnection() {
        DBUtils.closeConnection();
    }

    public void closeStatements() {
        amenitiesDAO.closeStatement();
        amenityLogsDAO.closeStatement();
        membersDAO.closeStatement();
        productPurchasesDAO.closeStatement();
        productsDAO.closeStatement();
        subscriptionsDAO.closeStatement();
        subscriptionTypeAmenitiesDAO.closeStatement();
        subscriptionTypesDAO.closeStatement();
        trainersDAO.closeStatement();
        trainingSessionsDAO.closeStatement();
    }
}