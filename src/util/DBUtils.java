import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.time.format.DateTimeFormatter;

/**
 * Establishes and manages a databaseConnection to the database.
 */
public class DBUtils {

    // TODO: Yep, these are actual credentials to my testing connection.
    //       Please replace with your own in a separate branch. - CJ
    private static final String DB_URL = "jdbc:mysql://localhost:3306/dbgym";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Mathmathh8";
    private static final String SQL_FILEPATH = "dbgym_script.sql";

    private static Connection connection = null;

    private DBUtils() {}

    // GETTER METHODS
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

    // CONNECTION METHODS
    /**
     * Initializes the database in case it has not yet been initialized.
     */
    public static void initializeDatabase() {
        try (Statement statement = getNewStatement()) {
            String sql = Files.readString(Paths.get(SQL_FILEPATH));
            assert statement != null;
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

    // SQL METHODS
    /**
     * Updates the foreign key of a table's records with a particular foreign key value.
     * @param table - name of the table
     * @param foreignKey - name of the foreign key
     * @param oldID - the old ID
     * @param newID - the new ID
     */
    public static void updateTableForeignKey(String table, String foreignKey, int oldID, int newID) {
        String sql = "UPDATE " + table + " " +
                     "SET " + foreignKey + " = ? " +
                     "WHERE " + foreignKey + " = ? ";

        try (PreparedStatement ps = getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, newID);
            ps.setInt(2, oldID);

            ps.executeUpdate();
            System.out.printf("'%s' records with given '%s' updated successfully.", table, foreignKey);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public static void invalidateTableForeignKey(String table, String foreignKey, int oldID) {
        updateTableForeignKey(table, foreignKey, oldID, 1);
    }

    /**
     * Deletes all records of a table with a particular key and key value.
     * @param table - name of the table
     * @param key - name of the foreign key
     * @param targetID - key value of the records being deleted
     */
    public static void deleteTableRecordsByKey(String table, String key, int targetID) {
        String sql = "DELETE FROM " + table + " " +
                     "WHERE " + key + " = ? ";

        try (PreparedStatement ps = getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, targetID);

            ps.executeUpdate();
            System.out.printf("'%s' records with given '%s' deleted successfully.", table, key);
        } catch(SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    /**
     * Checks whether a primary key value exists in a given table.
     */
    public static boolean primaryKeyExistsInATable(String table, String primaryKeyName, int targetID) {
        String sql = "SELECT COUNT(*) " +
                     "FROM " + table + " " +
                     "WHERE " + primaryKeyName + " = ? ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, targetID);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    boolean primaryKeyExists = rs.getInt(1) > 0;
                    if (primaryKeyExists) {
                        System.out.printf("Key %s with value %d exists in table %s.", primaryKeyExists, targetID, table);
                    } else {
                        System.out.printf("Key %s with value %d does not exist in table %s.", primaryKeyExists, targetID, table);
                    }
                    return primaryKeyExists;
                }
            } catch (SQLException e) {
                ExceptionHandler.handleException(e);
                return false;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return false;
    }

    public static ResultSet selectAllRecordsFromTable(String table) {
        String sql = "SELECT * " +
                     "FROM " + table + "; ";

        try {
            ResultSet rs = Objects.requireNonNull(getNewStatement()).executeQuery(sql);
            System.out.printf("All '%s' records retrieved successfully.\n", table);
            return rs;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ResultSet selectAllRecordsFromTable(String table, String condition) {
        String sql = "SELECT * " +
                     "FROM " + table + " " +
                     condition + "; ";

        try {
            ResultSet rs = Objects.requireNonNull(getNewStatement()).executeQuery(sql);
            System.out.printf("All records from '%s' with condition retrieved successfully.\n", table);
            return rs;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ResultSet selectAllRecordsFromInnerJoinedTables(String table1, String table2, String table1Field, String table2Field) {
        String sql = "SELECT * " +
                     "FROM " + table1 + " JOIN " + table2 + " " +
                     "ON " + table1Field + " = " + table2Field + " ";

        try {
            ResultSet rs = Objects.requireNonNull(getNewStatement()).executeQuery(sql);
            System.out.printf("All records from '%s' joined with '%s' retrieved successfully.", table1, table2);
            return rs;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ResultSet selectAllRecordsFromInnerJoinedTables(String table1, String table2, String table1Field, String table2Field, String condition) {
        String sql = "SELECT * " +
                     "FROM " + table1 + " JOIN " + table2 + " " +
                     "ON " + table1Field + " = " + table2Field + " " +
                     "WHERE " + condition + " ";

        try {
            ResultSet rs = Objects.requireNonNull(getNewStatement()).executeQuery(sql);
            System.out.printf("All records from '%s' joined with '%s' with condition retrieved successfully.", table1, table2);
            return rs;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static String[] selectAllKeysFromTable(String table, String key) {
        ResultSet rs = DBUtils.selectAllRecordsFromTable(table);
        assert rs != null;
        List<String> sList = new ArrayList<String>();

        try {
            while (rs.next()) {
                sList.add(rs.getString(key));
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        try {
            rs.close();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return sList.toArray(new String[0]);
    }

    public static String[] selectAllKeysFromTable(String table, String key, String condition) {
        ResultSet rs = DBUtils.selectAllRecordsFromTable(table, condition);
        assert rs != null;
        List<String> sList = new ArrayList<String>();

        try {
            while (rs.next()) {
                sList.add(rs.getString(key));
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        try {
            rs.close();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }

        return sList.toArray(new String[0]);
    }

    // CONVERTER METHODS //
    public static Object[][] to2DObjectArray(ArrayList<? extends ConvertibleToObjectArray> list) {
        Object[][] result = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i).toObjectArray();
        }
        return result;
    }

    public static LocalDateTime convertStringToLocalDateTime(String dateTimeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.parse(dateTimeString, formatter);
    }

    public static LocalDate convertStringToLocalDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(dateString, formatter);
    }
}
