import java.time.LocalDate;

public record Subscription(
        int subscriptionID,
        int memberID,
        int subscriptionTypeID,
        int trainerID,
        LocalDate subscriptionStartDate,
        LocalDate subscriptionEndDate
) {
    // TODO: Validate attributes (if needed).
}
