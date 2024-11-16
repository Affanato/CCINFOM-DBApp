public record SubscriptionType(
        int subscriptionTypeID,
        String subscriptionTypeName,
        double subscriptionTypePrice
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                subscriptionTypeID,
                subscriptionTypeName,
                subscriptionTypePrice
        };
    }
}