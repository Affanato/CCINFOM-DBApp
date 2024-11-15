public enum Status {

    ACTIVE,
    INACTIVE;

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

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
