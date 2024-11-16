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
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                trainerID,
                lastName,
                firstName,
                birthdate,
                sex,
                phoneNumber,
                street,
                barangay,
                city,
                province,
                programSpecialty,
                trainerStatus
        };
    }
}
