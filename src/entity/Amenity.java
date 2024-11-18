import java.time.LocalTime;

public record Amenity (
        int amenityID,
        String amenityName,
        double walkInPrice,
        LocalTime openingTime,
        LocalTime closingTime,
        Status amenityStatus
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                amenityID,
                amenityName,
                walkInPrice,
                openingTime,
                closingTime,
                amenityStatus
        };
    }
}