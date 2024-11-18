import java.time.LocalDateTime;

public record AmenityLog(
        int amenityLogID,
        int memberID,
        int amenityID,
        LocalDateTime usageStartDateTime,
        int usageDurationHours,
        double usageTotalPrice
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                amenityLogID,
                memberID,
                amenityID,
                usageStartDateTime,
                usageDurationHours,
                usageTotalPrice
        };
    }
}
