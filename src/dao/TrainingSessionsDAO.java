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
    public void insertTrainingSession(TrainingSession ts) {
        String sql = "INSERT INTO training_sessions (subscription_id, trainer_id, session_start_date_time, session_end_date_time) " +
                "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = DBUtils.getNewPreparedStatement(sql)) {
            assert ps != null;
            ps.setInt(1, ts.subscriptionID());
            ps.setInt(2, ts.trainerID());
            ps.setTimestamp(3, Timestamp.valueOf(ts.sessionStartDateTime()));
            ps.setTimestamp(4, Timestamp.valueOf(ts.sessionEndDateTime()));

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

    // SELECT QUERIES
    public static TrainingSession selectTrainingSession(int trainingSessionID) {
        String condition = "WHERE training_session_id = " + trainingSessionID;
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return mapResultSetToTrainingSession(rs);
    }

    public ArrayList<TrainingSession> selectAllTrainingSessions() {
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions");
        assert rs != null;
        return mapResultSetToTrainingSessionList(rs);
    }

    public ArrayList<TrainingSession> selectAllActiveTrainingSessions() {
        String condition = "WHERE session_start_date_time <= NOW() AND session_end_date_time >= NOW()";
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return mapResultSetToTrainingSessionList(rs);
    }

    public ArrayList<TrainingSession> selectAllUpcomingTrainingSessions() {
        String condition = "WHERE session_end_date_time > NOW()";  // Active sessions are those that have not ended yet
        ResultSet rs = DBUtils.selectAllRecordsFromTable("training_sessions", condition);
        assert rs != null;
        return mapResultSetToTrainingSessionList(rs);
    }

    // TRANSACTIONS
    public void scheduleTrainingSession(TrainingSession ts) {
        insertTrainingSession(ts);
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


    public void closeStatement() {
        DBUtils.closeStatement(statement);
    }
}
