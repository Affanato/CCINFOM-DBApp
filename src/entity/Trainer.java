import java.time.LocalDate;

public record Trainer(
        int trainerID,
        String lastName,
        String firstName,
        LocalDate birthdate,
        char sex,
        String phoneNumber,
        String street,
        String barangay,
        String city,
        String province,
        String programSpecialty,
        String availabilitySchedule,
        LocalDate workStartDate,
        LocalDate workEndDate
) {
    // TODO: Validate attributes (if needed).
}
