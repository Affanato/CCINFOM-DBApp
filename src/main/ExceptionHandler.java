/**
 * Centralized exception handler.
 */
public class ExceptionHandler {

    public static void handleException(Exception e) {
        System.out.printf("Error: %s", e.getMessage());
        e.printStackTrace(); // TODO (optional): Replace with more robust logging.
    }
}
