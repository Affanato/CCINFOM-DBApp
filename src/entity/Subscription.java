import java.time.LocalDate;

public record Subscription(
        int subscriptionID,
        int memberID,
        int subscriptionTypeID,
        LocalDate subscriptionStartDate,
        LocalDate subscriptionEndDate
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                subscriptionID,
                memberID,
                subscriptionTypeID,
                subscriptionStartDate,
                subscriptionEndDate
        };
    }
}
