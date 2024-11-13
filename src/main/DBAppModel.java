import java.sql.Connection;
import java.sql.SQLException;

public class DBAppModel {

    private Connection databaseConnection;

    public DBAppModel() {
        try {
            this.databaseConnection = DBManager.getDatabaseConnection();
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public Connection getDatabaseConnection() {
        return databaseConnection;
    }

    public void closeDatabaseConnection() {
        DBManager.closeDatabaseConnection();
    }
}