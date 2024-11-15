import java.time.LocalDate;

public record ProductPurchases(
        int transactionID,
        int memberID,
        int productID,
        int quantitySold,
        LocalDate transactionDate
) {
    // TODO: Validate attributes (if needed).
}
