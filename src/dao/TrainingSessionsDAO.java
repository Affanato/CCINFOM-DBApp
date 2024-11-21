import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class TrainingSessionsDAO {

    private final Statement statement;

    public TrainingSessionsDAO() {
        this.statement = DBUtils.getNewStatement();
    }

    // TODO: In Progress
    // TODO: Code related methods. Refer to any implemented DAO.
    // SINGLE UPDATE QUERIES
    public void insertTrainingSession(int memberID, int trainerID, String sessionStartDate, String sessionEndDate) {
        String sql = "INSERT INTO training_sessions (subscription_id, trainer_id, session_start_date_time, session_end_date_time) " +
                "VALUES (?, ?, ?, ?)";

        int subscriptionID;

        if (MembersDAO.getSubscription(memberID) == -1) {
            subscriptionID = 0;
            System.out.println("Invalid Member ID; Member may not have subscription or ID does not exist.");
            return;
        }

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, MembersDAO.getSubscription(memberID));
            ps.setInt(2, trainerID);
            ps.setTimestamp(3, Timestamp.valueOf(DBUtils.convertStringToLocalDateTime(sessionStartDate)));
            ps.setTimestamp(4, Timestamp.valueOf(DBUtils.convertStringToLocalDateTime(sessionEndDate)));

            ps.executeUpdate();
            System.out.println("Training session record inserted successfully.");
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
    }

    public void deleteTrainingSession(int trainingSessionID) {
        DBUtils.deleteTableRecordsByKey("training_sessions", "training_session_id", trainingSessionID);
    }

    public void updateTrainingSession(int trainingSessionID, TrainingSession ts) {
        if (!DBUtils.primaryKeyExistsInATable("training_sessions", "training_session_id", trainingSessionID)) {
            System.out.println("Training session ID not found. No action taken.");
            return;
        }

        String sql = "UPDATE training_sessions " +
                    "SET subscription_id = ?, " +
                    "    trainer_id = ?, " +
                    "    session_start_date_time = ?, " +
                    "    session_end_date_time = ? " +
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
        }
    }

    // MASS UPDATE QUERIES
    public void updateTrainerID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("training_sessions", "member_id", oldID, newID);
    }

    public void updateSubscriptionID(int oldID, int newID) {
        DBUtils.updateTableForeignKey("training_sessions", "subscription_id", oldID, newID);
    }

    public void deleteTrainerID(int trainerID) {
        DBUtils.deleteTableRecordsByKey("training_sessions", "trainer_id", trainerID);
    }

    public void deleteBySubscriptionID(int subscriptionID) {
        DBUtils.deleteTableRecordsByKey("training_sessions", "subscription_id", subscriptionID);
    }

    // SELECT QUERIES
    public static TrainingSession selectTrainingSession(int trainingSessionID) {
        String condition = "WHERE training_session_id = " + trainingSessionID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return mapResultSetToTrainingSession(rs);
    }

    public Object[][] selectAllTrainingSessions() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions");
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainingSessionList(rs));
    }

    public Object[][] selectAllActiveTrainingSessions() {
        String condition = "WHERE session_start_date_time <= NOW() AND session_end_date_time >= NOW()";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainingSessionList(rs));
    }

    public Object[][] selectAllUpcomingTrainingSessions() {
        String condition = "WHERE session_end_date_time > NOW()";  // Active sessions are those that have not ended yet
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return DBUtils.to2DObjectArray(mapResultSetToTrainingSessionList(rs));
    }

    // TRANSACTIONS
    public void scheduleTrainingSession(int memberID, int trainerID, String startDateTime, String endDateTime) {
        // Check if the trainer ID exists
        if (!DBUtils.primaryKeyExistsInATable("trainers", "trainer_id", trainerID)) {
            System.out.println("The Trainer ID " + trainerID + " does not exist.");
            return;
        }

        // dateTime parser
        LocalDateTime sessionStartDateTime = DBUtils.convertStringToLocalDateTime(startDateTime);
        LocalDateTime sessionEndDateTime = DBUtils.convertStringToLocalDateTime(endDateTime);

        // Check if the end time is after the start time
        if (sessionEndDateTime.isBefore(sessionStartDateTime)) {
            System.out.println("The session end time cannot be earlier than the start time.");
            return;
        }

        // Validate trainer availability for the given time
        if (isTrainerUnavailable(trainerID, sessionStartDateTime, sessionEndDateTime)) {
            System.out.println("The Trainer ID " + trainerID + " is unavailable for the selected time slot.");
            return;
        }

        // Insert the new session into the database
        insertTrainingSession(memberID, trainerID, startDateTime, endDateTime);
        System.out.println("Training session successfully scheduled.");
    }

    // UTILITY METHODS
    public static TrainingSession mapResultSetToTrainingSession(ResultSet rs) {
        try {
            if (rs.next()) {
                int trainingSessionID = rs.getInt("training_session_id");
                int subscriptionID = rs.getInt("subscription_id");
                int trainerID = rs.getInt("trainer_id");
                LocalDateTime sessionStartDateTime = rs.getTimestamp("session_start_date_time").toLocalDateTime();
                LocalDateTime sessionEndDateTime = rs.getTimestamp("session_end_date_time").toLocalDateTime();

                return new TrainingSession(trainingSessionID, subscriptionID, trainerID, sessionStartDateTime, sessionEndDateTime);
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
        return null;
    }

    public static ArrayList<TrainingSession> mapResultSetToTrainingSessionList(ResultSet rs) {
        ArrayList<TrainingSession> trainingSessionList = new ArrayList<>();
        try {
            while (rs.next()) {
                int trainingSessionID = rs.getInt("training_session_id");
                int subscriptionID = rs.getInt("subscription_id");
                int trainerID = rs.getInt("trainer_id");
                LocalDateTime sessionStartDateTime = rs.getTimestamp("session_start_date_time").toLocalDateTime();
                LocalDateTime sessionEndDateTime = rs.getTimestamp("session_end_date_time").toLocalDateTime();

                trainingSessionList.add(new TrainingSession(trainingSessionID, subscriptionID, trainerID, sessionStartDateTime, sessionEndDateTime));
            }
        } catch (SQLException e) {
            ExceptionHandler.handleException(e);
        }
        return trainingSessionList;
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
