import java.time.LocalTime;

public record Amenity (
        int amenityID,
        String amenityName,
        double walkInPrice,
        LocalTime openingTime,
        LocalTime closingTime,
        Status amenity_status
) {
    // TODO: Validate attributes (if needed).
}