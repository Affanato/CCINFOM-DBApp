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
    public void insertTrainer(
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
        }
    }

    public void deleteTrainer(int trainerID) {
        DBUtils.deleteTableRecordsByKey("trainers", "trainer_id", trainerID);
    }

    public void updateTrainer(int trainerID, Trainer t) {
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            return;
        }

        String sql = "UPDATE trainers " +
                     "SET last_name = ?, " +
                     "    program_specialty = ?, " +
                     "WHERE trainer_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, t.lastName());
            ps.setString(2, t.programSpecialty());
            ps.setInt(3, trainerID);

            ps.executeUpdate();
            System.out.println("Trainer record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    // SELECT QUERIES
    public static Trainer selectTrainer(int trainerID) {
        String condition = "WHERE trainer_id = " + trainerID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers", condition);
        assert rs != null;
        return mapResultSetToTrainer(rs);
    }

    public Object[][] selectAllTrainers() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers");
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainerList(rs));
    }

    public Object[][] selectAllActiveTrainers() {
        String condition = "WHERE trainer_status = 'Active'";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("trainers", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainerList(rs));
    }

    // REC MANAGEMENT & TRANSACTIONS
    public void fireTrainer(int trainerID) {
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            return;
        }

        String sql = "UPDATE trainers " +
                "SET trainer_status = ? " +
                "WHERE trainer_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setString(1, "inactive");
            ps.setInt(2, trainerID);

            System.out.println("Trainer record set to inactive successfully.");
            ps.executeUpdate();
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
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

    // UTILITY METHODS
    public static Trainer mapResultSetToTrainer(ResultSet rs) {
        try {
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
            Status trainerStatus = Status.valueOf(rs.getString("trainer_status"));

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



    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
