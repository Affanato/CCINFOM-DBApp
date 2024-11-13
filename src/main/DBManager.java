import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Establishes and manages a databaseConnection to the database.
 * Employs the Singleton design pattern.
 */
public class DBManager {

    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dbgym";
    private static final String DB_USER = "db_admin";
    private static final String DB_PASSWORD = "AkoSiGymAppDBAdmin";

    private static Connection databaseConnection;

    /**
     * Gets the object representing the databaseConnection to the database.
     */
    public static Connection getDatabaseConnection() throws SQLException {
        if (databaseConnection == null || databaseConnection.isClosed()) {
            // Establish the database connection if it has not yet been made or has been closed.
            databaseConnection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection established.");
        }
        return databaseConnection;
    }

    /**
     * Closes the databaseConnection to the database.
     */
    public static void closeDatabaseConnection() {
        try {
            if (databaseConnection != null && !databaseConnection.isClosed()) {
                databaseConnection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }
}
