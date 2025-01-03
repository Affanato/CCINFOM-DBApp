import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainersDAO {

    private Statement statement;

    public TrainersDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: In Progress
    // TODO: Code related methods. Refer to any implemented DAO.
    // SINGLE UPDATE QUERIES
    public boolean insertTrainer(
            String lastName,
            String firstName,
            LocalDate birthdate,
            String sex,
            String phoneNumber,
            String street,
            String barangay,
            String city,
            String province,
            String programSpecialty
    ) {
        String sql = "INSERT INTO trainers (last_name, first_name, birthdate, sex, phone_number, street, barangay, city, province, program_specialty, trainer_status) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, lastName);
            ps.setString(2, firstName);
            ps.setDate(3, Date.valueOf(birthdate));
            ps.setString(4, sex);
            ps.setString(5, phoneNumber);
            ps.setString(6, street);
            ps.setString(7, barangay);
            ps.setString(8, city);
            ps.setString(9, province);
            ps.setString(10, programSpecialty);
            ps.setString(11, "Active");

            ps.executeUpdate();
            System.out.println("Trainer record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    public boolean deleteTrainer(int trainerID) {
        if (!trainerExists(trainerID)) return false;
        DBUtils.invalidateTableForeignKey("training_sessions", "trainer_id", trainerID);
        DBUtils.deleteTableRecordsByKey("trainers", "trainer_id", trainerID);
        return true;
    }

    public boolean updateTrainer(int trainerID, Trainer t) {
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            return false;
        }

        String sql = "UPDATE trainers " +
                     "SET last_name = ?, " +
                     "    phone_number = ?, " +
                     "    street = ?, " +
                     "    barangay = ?, " +
                     "    city = ?, " +
                     "    province = ?, " +
                     "    program_specialty = ? " +
                     "WHERE trainer_id = ?; ";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            System.out.printf("\n%s %s %s %s %s %s %s %d\n", t.lastName(), t.phoneNumber(), t.street(), t.barangay(), t.city(), t.province(), t.programSpecialty(), t.trainerID()); // testing
            ps.setString(1, t.lastName());
            ps.setString(2, t.phoneNumber());
            ps.setString(3, t.street());
            ps.setString(4, t.barangay());
            ps.setString(5, t.city());
            ps.setString(6, t.province());
            ps.setString(7, t.programSpecialty());
            ps.setInt(8, t.trainerID());

            ps.executeUpdate();
            System.out.println("Trainer record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    // SELECT QUERIES
    public static Trainer selectTrainer(int trainerID) {
        String condition = "WHERE trainer_id = " + trainerID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers", condition);
        assert rs != null;
        return mapResultSetToTrainer(rs);
    }

    public static Trainer selectTrainer(String lastName, String firstName) {
        String condition = "WHERE last_name = '" + lastName + "' && first_name = '" + firstName + "'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers", condition);
        assert rs != null;
        return mapResultSetToTrainer(rs);
    }

    public static Trainer selectTrainer(String lastName) {
        String condition = "WHERE last_name = '" + lastName + "'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers", condition);
        assert rs != null;
        return mapResultSetToTrainer(rs);
    }

    public Object[][] selectAllTrainers() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers");
        assert rs != null;
        return mapResultSetToTrainersArr(rs);
    }

    public Object[][] selectAllActiveTrainers() {
        String condition = "WHERE trainer_status = 'Active'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers", condition);
        assert rs != null;
        return mapResultSetToTrainersArr(rs);
    }

    // REC MANAGEMENT & TRANSACTIONS
    // create is insertTrainer
    // delete is deleteTrainer
    public boolean updateTrainer(
            int trainerID,
            String lastName,
            LocalDate birthdate,
            String sex,
            String phoneNumber,
            String street,
            String barangay,
            String city,
            String province,
            String programSpecialty
    ) {
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            return false;
        }

        Trainer oldT = selectTrainer(trainerID);
        Trainer updatedTrainer = new Trainer(
                trainerID,
                lastName,
                oldT.firstName(),
                birthdate,
                sex != null ? Sex.valueOf(sex) : oldT.sex(),
                phoneNumber,
                street,
                barangay,
                city,
                province,
                programSpecialty,
                oldT.trainerStatus()
        );
        return updateTrainer(trainerID, updatedTrainer);
    }

    public boolean setTrainerStatus(int trainerID, String status) {
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            return false;
        }

        String sql = "UPDATE trainers " +
                "SET trainer_status = ? " +
                "WHERE trainer_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, status);
            ps.setInt(2, trainerID);

            System.out.println("Trainer record set to " + status + " successfully.");
            ps.executeUpdate();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    // REPORTS
    public Object[][] selectMonthlyMembersTrained(int year, int month) {
        String sql = "SELECT t.trainer_id, t.last_name, t.first_name, t.program_specialty, " +
                    "       COUNT(ts.subscription_id) AS numOfMembersTrained " +
                    "FROM trainers t " +
                    "LEFT JOIN training_sessions ts ON (t.trainer_id = ts.trainer_id) " +
                    "                                  AND (YEAR(ts.session_start_datetime) = ?) " +
                    "                                  AND (MONTH(ts.session_start_datetime) = ?) " +
                    "GROUP BY t.trainer_id " +
                    "ORDER BY numOfMembersTrained DESC, t.program_specialty, t.last_name, t.first_name;";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            ps.setInt(1, year);   // Set the year parameter
            ps.setInt(2, month);   // Set the month parameter

            try (ResultSet rs = ps.executeQuery()) {
                List<Object[]> tempList = new ArrayList<>();

                while (rs.next()) {
                    int trainerId = rs.getInt("trainer_id");
                    String lastName = rs.getString("last_name");
                    String firstName = rs.getString("first_name");
                    String programSpecialty = rs.getString("program_specialty");
                    int numOfMembersTrained = rs.getInt("numOfMembersTrained");

                    Object[] elem = {trainerId, lastName, firstName, programSpecialty, numOfMembersTrained};
                    tempList.add(elem);
                }

                return tempList.toArray(new Object[0][]);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectYearlyMembersTrained(int year) {
        String sql = "SELECT t.trainer_id, t.last_name, t.first_name, t.program_specialty, " +
                    "       COUNT(ts.subscription_id) AS numOfMembersTrained " +
                    "FROM trainers t " +
                    "LEFT JOIN training_sessions ts ON (t.trainer_id = ts.trainer_id) " +
                    "                                  AND (YEAR(ts.session_start_datetime) = ?) " +
                    "GROUP BY t.trainer_id " +
                    "ORDER BY numOfMembersTrained DESC, t.program_specialty, t.last_name, t.first_name;";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            ps.setInt(1, year);

            try (ResultSet rs = ps.executeQuery()) {
                List<Object[]> tempList = new ArrayList<>();

                while (rs.next()) {
                    int trainerId = rs.getInt("trainer_id");
                    String lastName = rs.getString("last_name");
                    String firstName = rs.getString("first_name");
                    String programSpecialty = rs.getString("program_specialty");
                    int numOfMembersTrained = rs.getInt("numOfMembersTrained");

                    Object[] elem = {trainerId, lastName, firstName, programSpecialty, numOfMembersTrained};
                    tempList.add(elem);
                }

                return tempList.toArray(new Object[0][]);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    // new report
    public Object[][] reportMembersTrainedPerTrainerByMonth() {
        String sql = "SELECT YEAR(ts.session_start_datetime) AS year, " +
                    "    MONTH(ts.session_start_datetime) AS month, " +
                    "    t.last_name, t.first_name, " +
                    "    t.program_specialty, " +
                    "    COUNT(ts.subscription_id) AS numOfMembersTrained " +
                    "FROM trainers t LEFT JOIN training_sessions ts " +
                    "                          ON  t.trainer_id = ts.trainer_id " +
                    "WHERE t.trainer_id != 1 " +
                    "GROUP BY YEAR(ts.session_start_datetime), " +
                    "    MONTH(ts.session_start_datetime), " +
                    "    t.trainer_id, " +
                    "    t.last_name, t.first_name, " +
                    "    t.program_specialty " +
                    "ORDER BY year DESC, month DESC, " +
                    "    numOfMembersTrained DESC, " +
                    "    t.program_specialty, " +
                    "    t.last_name, " +
                    "    t.first_name;";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                int month = rs.getInt("month");
                String lastName = rs.getString("last_name");
                String firstName = rs.getString("first_name");
                String programSpecialty = rs.getString("program_specialty");
                int membersTrained = rs.getInt("numOfMembersTrained");

                Object[] elem = {year, month, lastName, firstName, programSpecialty, membersTrained};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] reportMembersTrainedPerTrainerByYear() {
        String sql = "SELECT YEAR(ts.session_start_datetime) AS year, " +
                "    t.last_name, t.first_name, " +
                "    t.program_specialty, " +
                "    COUNT(ts.subscription_id) AS numOfMembersTrained " +
                "FROM trainers t LEFT JOIN training_sessions ts " +
                "                          ON  t.trainer_id = ts.trainer_id " +
                "WHERE t.trainer_id != 1 " +
                "GROUP BY YEAR(ts.session_start_datetime), " +
                "    t.trainer_id, " +
                "    t.last_name, t.first_name, " +
                "    t.program_specialty " +
                "ORDER BY year DESC," +
                "    numOfMembersTrained DESC, " +
                "    t.program_specialty, " +
                "    t.last_name, " +
                "    t.first_name;";

        try (ResultSet rs = Objects.requireNonNull(statement.executeQuery(sql))) {
            List<Object[]> tempList = new ArrayList<>();

            while (rs.next()) {
                int year = rs.getInt("year");
                String lastName = rs.getString("last_name");
                String firstName = rs.getString("first_name");
                String programSpecialty = rs.getString("program_specialty");
                int membersTrained = rs.getInt("numOfMembersTrained");

                Object[] elem = {year, lastName, firstName, programSpecialty, membersTrained};
                tempList.add(elem);
            }

            return tempList.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }


    // UTILITY METHODS
    public String[] getComboBoxTrainerIDs() {
        String condition = "WHERE trainer_id != 1";
        return DBUtils.selectAllKeysFromTable("trainers", "trainer_id", condition);
    }

    public static boolean trainerExists(int trainerID) {
        return selectTrainer(trainerID) != null;
    }

    public static Trainer mapResultSetToTrainer(ResultSet rs) {
        try {
            if (!rs.next()) {
                System.out.println("No Trainer ResultSet data.\n");
                return null;
            }

            int trainerID = rs.getInt("trainer_id");
            String lastName = rs.getString("last_name");
            String firstName = rs.getString("first_name");
            LocalDate birthdate = rs.getDate("birthdate").toLocalDate();
            Sex sex = Sex.valueOf(rs.getString("sex"));
            String phoneNumber = rs.getString("phone_number");
            String street = rs.getString("street");
            String barangay = rs.getString("barangay");
            String city = rs.getString("city");
            String province = rs.getString("province");
            String programSpecialty = rs.getString("program_specialty");
            Status trainerStatus = Status.valueOf(Status.obtainStatus(rs.getString("trainer_status")));

            return new Trainer(trainerID, lastName, firstName, birthdate, sex, phoneNumber, street, barangay, city, province, programSpecialty, trainerStatus);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<Trainer> mapResultSetToTrainerList(ResultSet rs) {
        ArrayList<Trainer> trainerList = new ArrayList<>();
        try {
            while (rs.next()) {
                trainerList.add(mapResultSetToTrainer(rs));
            }
            return trainerList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[] mapResultSetToTrainerArr(ResultSet rs) {
        try {
            return new Object[] {
                    rs.getInt("trainer_id"),
                    rs.getString("last_name"),
                    rs.getString("first_name"),
                    rs.getDate("birthdate").toString(),
                    rs.getString("sex"),
                    rs.getString("phone_number"),
                    rs.getString("street"),
                    rs.getString("barangay"),
                    rs.getString("city"),
                    rs.getString("province"),
                    rs.getString("program_specialty"),
                    rs.getString("trainer_status")
            };
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static Object[][] mapResultSetToTrainersArr(ResultSet rs) {
        List<Object[]> amenitiesArr = new ArrayList<Object[]>();

        try {
            while (rs.next()) {
                amenitiesArr.add(mapResultSetToTrainerArr(rs));
            }
            return amenitiesArr.toArray(new Object[0][]);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
