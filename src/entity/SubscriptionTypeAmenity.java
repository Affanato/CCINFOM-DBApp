public record SubscriptionTypeAmenity(
        int subscriptionTypeID,
        int amenityID
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                subscriptionTypeID,
                amenityID
        };
    }
}