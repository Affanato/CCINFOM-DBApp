import java.time.LocalDateTime;

public record AmenityLog(
        int amenityLogID,
        int memberID,
        int amenityID,
        LocalDateTime usageStartDateTime,
        LocalDateTime usageEndDateTime
) {
    // TODO: Validate attributes (if needed).
}
