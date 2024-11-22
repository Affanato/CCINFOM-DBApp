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

    public static boolean hasDescription(String desc) {
        for (Status s : Status.values()) {
            if (s.getDescription().equalsIgnoreCase(desc)) {
                return true;
            }
        }
        return false;
    }
}
