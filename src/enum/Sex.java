public enum Sex {

    M("Male"),
    F("Female"),
    N("Non-Binary"),
    U("Unspecified");

    private final String description;

    Sex(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
