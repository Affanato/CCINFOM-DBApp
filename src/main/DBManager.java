import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Establishes and manages a databaseConnection to the database.
 * Employs the Singleton design pattern.
 */
public class DBManager {

    // Yep, these are actual (test) credentials in my local environment. Please replace with your own.
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dbgym";
    private static final String DB_USER = "db_admin";
    private static final String DB_PASSWORD = "AkoSiGymAppDBAdmin";

    private static Connection connection = null;

    /**
     * Gets the object representing the connection to the database.
     */
    public static Connection getConnection() {
        boolean connectionExists = false;

        try {
            connectionExists = connection != null && !connection.isClosed();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        if (connectionExists) {
            return connection;
        }

        // Establish the database connection if it has not yet been made or has been closed.
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection established.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return connection;
    }

    /**
     * Gets a new Statement instance of the database.
     * @return a new Statement instance of the database
     */
    public static Statement getNewStatement() {
        try {
            return connection.createStatement();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
        return null;
    }

    /**
     * Closes the connection to the database.
     */
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    /**
     * Closes a provided Statement instance.
     * @param statement - the Statement instance to be closed
     */
    public static void closeStatement(Statement statement) {
        if (statement == null) {
            return;
        }

        try {
            statement.close();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }
}
