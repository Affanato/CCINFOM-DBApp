import java.time.LocalDate;

public record Membership(
        int membershipID,
        int memberID,
        int membershipTypeID,
        int trainerID,
        LocalDate membershipStartDate,
        LocalDate membershipEndDate
) {
    // TODO: Validate attributes (if needed).
}
