import java.time.ZonedDateTime;

public record AmenityLog(
        int amenityLogID,
        int memberID,
        int amenityID,
        ZonedDateTime usageStartDatetime,
        ZonedDateTime usageEndDatetime
) {
    // TODO: Validate attributes (if needed).
}
