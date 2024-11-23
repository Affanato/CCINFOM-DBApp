import java.util.ArrayList;
import java.util.List;

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

    public static Status fromDisplayName(String description) {
        for (Status status : Status.values()) {
            if (status.getDescription().equalsIgnoreCase(description)) {
                return status; // Return the enum constant (e.g., Status.ACTIVE)
            }
        }
        throw new IllegalArgumentException("No enum constant with display name: " + description);
    }

    public static String[] getPossibleValues() {
        return new String[] {
                M.toString(),
                F.toString(),
                N.toString(),
                U.toString()
        };
    }
}
