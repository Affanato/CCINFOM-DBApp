import java.time.LocalDateTime;

public record TrainingSession(
        int trainingSessionID,
        int subscriptionID,
        int trainerID,
        LocalDateTime sessionStartDateTime,
        LocalDateTime sessionEndDateTime
) {
}
