public enum Status {

    ACTIVE("Active"),
    INACTIVE("Inactive");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

    /**
     * Gets a Status enum from a string, if valid.
     * @param name - the name to be converted into a Status enum
     * @return a corresponding Status enum
     */
    public static Status fromString(String name) {
        try {
            return Status.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid status: " + name);
        }
    }

    public static boolean hasDescription(String desc) {
        for (Status s : Status.values()) {
            if (s.getDescription().equalsIgnoreCase(desc)) {
                return true;
            }
        }
        return false;
    }

    public static String obtainStatus(String description) {
        for (Status status : Status.values()) {
            if (status.getDescription().equalsIgnoreCase(description)) {
                return status.name(); // Return the enum constant (e.g., Status.ACTIVE)
            }
        }
        throw new IllegalArgumentException("No enum constant with display name: " + description);
    }

    public static String[] getPossibleValues() {
        return new String[] {
                ACTIVE.toString(),
                INACTIVE.toString()
        };
    }
}
