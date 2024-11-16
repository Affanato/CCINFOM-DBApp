import java.time.LocalDateTime;

public record TrainingSession(
        int trainingSessionID,
        int subscriptionID,
        int trainerID,
        LocalDateTime sessionStartDateTime,
        LocalDateTime sessionEndDateTime
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                trainingSessionID,
                subscriptionID,
                trainerID,
                sessionStartDateTime,
                sessionEndDateTime
        };
    }
}
