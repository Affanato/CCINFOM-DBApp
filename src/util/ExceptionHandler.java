/**
 * Centralized exception handler.
 */
public class ExceptionHandler {

    private ExceptionHandler() {}

    public static void handleException(Exception e) {
        System.err.printf("Error: %s", e.getMessage());
        e.printStackTrace(); // TODO (optional): Replace with more robust logging.
    }

    public static void handleException(Exception e, String message) {
        System.out.println(message);
        System.err.printf("Error: %s", e.getMessage());
        e.printStackTrace(); // TODO (optional): Replace with more robust logging.
    }
}
