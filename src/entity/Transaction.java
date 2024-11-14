import java.time.LocalDate;

public record Transaction(
        int transactionID,
        int memberID,
        int productID,
        int quantitySold,
        LocalDate transactionDate
) {
    // TODO: Validate attributes (if needed).
}
