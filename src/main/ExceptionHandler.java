/**
 * Centralized exception handler.
 */
public class ExceptionHandler {

    public static void handleException(Exception e) {
        System.out.println("Error: " + e.getMessage());
        e.printStackTrace(); // TODO (optional): Replace with more robust logging.
    }
}
