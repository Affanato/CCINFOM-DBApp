import java.time.LocalTime;

public record Amenity (
        int amenityID,
        String amenityName,
        double walkInPricePerHour,
        LocalTime openingTime,
        LocalTime closingTime,
        Status amenityStatus
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                amenityID,
                amenityName,
                walkInPricePerHour,
                openingTime,
                closingTime,
                amenityStatus
        };
    }
}