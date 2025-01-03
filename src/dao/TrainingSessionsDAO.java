import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class TrainingSessionsDAO {

    private final Statement statement;

    public TrainingSessionsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // SINGLE UPDATE QUERIES
    public boolean insertTrainingSession(int memberID, int trainerID, String startDateTimeString, String endDateTimeString) {
        // Check if the trainer ID exists
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            return false;
        }

        // dateTime parser
        LocalDateTime sessionStartDateTime = DBUtils.convertStringToLocalDateTime(startDateTimeString);
        LocalDateTime sessionEndDateTime = DBUtils.convertStringToLocalDateTime(endDateTimeString);
        Trainer selectedTrainer = TrainersDAO.selectTrainer(trainerID);

        // Check if the end time is after the start time
        if (sessionEndDateTime.isBefore(sessionStartDateTime)) {
            System.out.println("The session end time cannot be earlier than the start time.\n");
            return false;
        }

        // Validate trainer availability for the given time
        if (isTrainerUnavailable(trainerID, sessionStartDateTime, sessionEndDateTime) || selectedTrainer.trainerStatus().toString().equalsIgnoreCase("INACTIVE")) {
            System.out.println("Chosen trainer is unavailable during the chosen time.\n");
            return false;
        }

        String sql = "INSERT INTO training_sessions (subscription_id, trainer_id, session_start_datetime, session_end_datetime) " +
                "VALUES (?, ?, ?, ?)";

        if (MembersDAO.getCurrentSubscriptionID(memberID) == -1) {
            System.out.println("\nInvalid Member ID; Member may not have subscription or ID does not exist.\n");
            return false;
        }

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, MembersDAO.getCurrentSubscriptionID(memberID));
            ps.setInt(2, trainerID);
            ps.setTimestamp(3, Timestamp.valueOf(sessionStartDateTime));
            ps.setTimestamp(4, Timestamp.valueOf(sessionEndDateTime));

            ps.executeUpdate();
            System.out.println("Training session record inserted successfully.\n");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    public boolean deleteTrainingSession(int trainingSessionID) {
        if (selectTrainingSession(trainingSessionID) == null) return false;
        DBUtils.deleteTableRecordsByKey("training_sessions", "training_session_id", trainingSessionID);
        return true;
    }

    public boolean updateTrainingSession(int trainingSessionID, TrainingSession ts) {
        if (!DBUtils.primaryKeyExistsInATable("training_sessions", "training_session_id", trainingSessionID)) {
            return false;
        }

        String sql = "UPDATE training_sessions " +
                    "SET subscription_id = ?, " +
                    "    trainer_id = ?, " +
                    "    session_start_datetime = ?, " +
                    "    session_end_datetime = ? " +
                    "WHERE training_session_id = ?";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, ts.subscriptionID());
            ps.setInt(2, ts.trainerID());
            ps.setTimestamp(3, Timestamp.valueOf(ts.sessionStartDateTime()));
            ps.setTimestamp(4, Timestamp.valueOf(ts.sessionEndDateTime()));
            ps.setInt(5, trainingSessionID);

            ps.executeUpdate();
            System.out.println("Training session record updated successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return false;
        }
        return true;
    }

    // MASS UPDATE QUERIES
    public void updateByTrainerID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("training_sessions", "member_id", oldID, newID);
    }

    public void updateBySubscriptionID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("training_sessions", "subscription_id", oldID, newID);
    }

    public void deleteByTrainerID(int trainerID) {
        DBUtils.deleteTableRecordsByKey("training_sessions", "trainer_id", trainerID);
    }

    public void deleteBySubscriptionID(int subscriptionID) {
        DBUtils.deleteTableRecordsByKey("training_sessions", "subscription_id", subscriptionID);
    }

    // TRANSACTIONS AND REC MANANGEMENT
    // add session is insertTrainingSession
    // delete session is deleteTrainingSession
    public boolean updateTrainingSession(int trainingsessionID, int newTrainerID, String newStartTime, String newEndTime) {
        if (selectTrainingSession(trainingsessionID) == null) return false;

        TrainingSession oldTS = selectTrainingSession(trainingsessionID);
        TrainingSession newTS = new TrainingSession(
                trainingsessionID,
                oldTS.subscriptionID(),
                newTrainerID,
                DBUtils.convertStringToLocalDateTime(newStartTime),
                DBUtils.convertStringToLocalDateTime(newEndTime)
        );
        return updateTrainingSession(trainingsessionID, newTS);
    }

    // SELECT QUERIES
    public static TrainingSession selectTrainingSession(int trainingSessionID) {
        String condition = "WHERE training_session_id = " + trainingSessionID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;

        try {
            if (rs.next()) {
                return mapResultSetToTrainingSession(rs);
            } else {
                System.out.println("No TrainingSession ResultSet data for trainingSessionID: " + trainingSessionID);
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static TrainingSession selectTrainingSession(String lastname) {
        String condition = "WHERE lastname = " + lastname;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;

        try {
            if (rs.next()) {
                return mapResultSetToTrainingSession(rs);
            } else {
                System.out.println("No TrainingSession ResultSet data for lastname: " + lastname);
                return null;
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public Object[][] selectAllTrainingSessions() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions");
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainingSessionList(rs));
    }

    public Object[][] selectAllActiveTrainingSessions() {
        String condition = "WHERE session_start_datetime <= NOW() AND session_end_datetime >= NOW()";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainingSessionList(rs));
    }

    public Object[][] selectAllUpcomingTrainingSessions() {
        String condition = "WHERE session_end_datetime > NOW()";  // Active sessions are those that have not ended yet
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainingSessionList(rs));
        // TODO: I have confirmed that this method works. Frontend display issue 'to. - CJ
    }

    // UTILITY METHODS
    public String[] getComboBoxTrainingSessionIDs() {
        return DBUtils.selectAllKeysFromTable("training_sessions", "training_session_id");
    }

    public String[] getComboBoxTrainerIDs() {
        return DBUtils.removeFirstElement(DBUtils.selectAllKeysFromTable("trainers", "trainer_id"));
    }

    public static TrainingSession mapResultSetToTrainingSession(ResultSet rs) {
        try {
            int trainingSessionID = rs.getInt("training_session_id");
            int subscriptionID = rs.getInt("subscription_id");
            int trainerID = rs.getInt("trainer_id");
            LocalDateTime sessionStartDateTime = rs.getTimestamp("session_start_datetime").toLocalDateTime();
            LocalDateTime sessionEndDateTime = rs.getTimestamp("session_end_datetime").toLocalDateTime();

            return new TrainingSession(trainingSessionID, subscriptionID, trainerID, sessionStartDateTime, sessionEndDateTime);
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    public static ArrayList<TrainingSession> mapResultSetToTrainingSessionList(ResultSet rs) {
        ArrayList<TrainingSession> trainingSessionList = new ArrayList<TrainingSession>();
        try {
            while (rs.next()) {
                trainingSessionList.add(mapResultSetToTrainingSession(rs));
            }
            return trainingSessionList;
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
            return null;
        }
    }

    private boolean isTrainerUnavailable(int trainerID, LocalDateTime start, LocalDateTime end) {
        String sql = "SELECT COUNT(*) FROM training_sessions " +
                "WHERE trainer_id = ? AND " +
                "      (session_start_datetime < ? AND session_end_datetime > ?)";
        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, trainerID);
            ps.setTimestamp(2, Timestamp.valueOf(end));
            ps.setTimestamp(3, Timestamp.valueOf(start));
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) {
                    return true; // Trainer has a conflicting session
                }
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
        return false;
    }

    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
