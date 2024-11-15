import java.time.LocalTime;

public record Amenity (
        int amenityID,
        String amenityName,
        double walkInPrice,
        LocalTime timeOpen,
        LocalTime timeClose,

) {
    // TODO: Validate attributes (if needed).
}