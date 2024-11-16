public record Product(
        int productID,
        String productBrand,
        String productName,
        String productDescription,
        double productPrice,
        int availableQuantity
) implements ConvertibleToObjectArray {
    @Override
    public Object[] toObjectArray() {
        return new Object[] {
                productID,
                productBrand,
                productName,
                productDescription,
                productPrice,
                availableQuantity
        };
    }
}
