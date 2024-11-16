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
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                memberID,
                lastName,
                firstName,
                birthdate,
                sex,
                phoneNumber,
                street,
                barangay,
                city,
                province
        };
    }
}
