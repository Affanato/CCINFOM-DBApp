import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record ProductPurchase(
        int productPurchaseID,
        int memberID,
        int productID,
        int quantitySold,
        LocalDateTime purchaseDateTime
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        return new Object[] {
                productPurchaseID,
                memberID,
                productID,
                quantitySold,
                purchaseDateTime.format(formatter)
        };
    }
}
