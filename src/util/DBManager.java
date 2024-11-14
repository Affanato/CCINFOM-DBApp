import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

/**
 * Establishes and manages a databaseConnection to the database.
 */
public class DBManager {

    // TODO: Yep, these are actual credentials to my testing connection.
    //       Please replace with your own in a separate branch. - CJ
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/dbgym";
    private static final String DB_USER = "db_admin";
    private static final String DB_PASSWORD = "AkoSiGymAppDBAdmin";
    private static final String SQL_FILEPATH = "dbgym_script.sql";

    private static Connection connection = null;

    private DBManager() {}

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
            return null;
        }
    }

    /**
     * Gets a new PreparedStatement instance given a SQL query.
     * @return a new PreparedStatement instance of a SQL query
     */
    public static PreparedStatement getNewPreparedStatement(String sql) {
        try {
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    /**
     * Initializes the database in case it has not yet been initialized.
     */
    public static void initializeDatabase() {
        try (Statement statement = getNewStatement()) {
            String sql = Files.readString(Paths.get(SQL_FILEPATH));
            statement.executeUpdate(sql);
        } catch (IOException | SQLException e) {
            ExceptionHandler.handleException(e);
        }
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
