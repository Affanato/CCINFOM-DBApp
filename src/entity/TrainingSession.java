import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record TrainingSession(
        int trainingSessionID,
        int subscriptionID,
        int trainerID,
        LocalDateTime sessionStartDateTime,
        LocalDateTime sessionEndDateTime
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return new Object[] {
                trainingSessionID,
                subscriptionID,
                trainerID,
                sessionStartDateTime.format(formatter),
                sessionEndDateTime.format(formatter)
        };
    }
}
