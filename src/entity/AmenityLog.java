import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        return new Object[] {
                amenityLogID,
                memberID,
                amenityID,
                usageStartDateTime.format(formatter),
                usageDurationHours,
                usageTotalPrice
        };
    }
}
