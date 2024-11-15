import java.time.LocalDateTime;

public record ProductPurchase(
        int productPurchaseID,
        int memberID,
        int productID,
        int quantitySold,
        LocalDateTime purchaseDateTime
) {
    // TODO: Validate attributes (if needed).
}
