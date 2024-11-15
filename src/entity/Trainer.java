import java.time.LocalDate;

public record Trainer(
        int trainerID,
        String lastName,
        String firstName,
        LocalDate birthdate,
        Sex sex,
        String phoneNumber,
        String street,
        String barangay,
        String city,
        String province,
        String programSpecialty,
        Status trainerStatus
) {
    // TODO: Validate attributes (if needed).
}
