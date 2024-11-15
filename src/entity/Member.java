import java.time.LocalDate;

public record Member(
        int memberID,
        String lastName,
        String firstName,
        LocalDate birthdate,
        Sex sex,
        String phoneNumber,
        String street,
        String barangay,
        String city,
        String province
) {
    // TODO: Validate attributes (if needed).
}
