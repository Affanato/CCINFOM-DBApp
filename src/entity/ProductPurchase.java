import java.time.LocalDateTime;

public record ProductPurchase(
        int productPurchaseID,
        int memberID,
        int productID,
        int quantitySold,
        LocalDateTime purchaseDateTime
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                productPurchaseID,
                memberID,
                productID,
                quantitySold,
                purchaseDateTime
        };
    }
}
