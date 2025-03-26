// Interface with private methods (Java 9+)
interface Logger {
    default void logInfo(String message) {
        log("INFO: " + message);
    }

    default void logError(String message) {
        log("ERROR: " + message);
    }

    // Private method inside an interface (Java 9+)
    private void log(String message) {
        System.out.println(message);
    }
}

// Implementing class
class ApplicationLogger implements Logger {
    public void logApplicationStart() {
        logInfo("Application started.");
    }

    public void logApplicationError() {
        logError("Application encountered an error!");
    }
}

// Driver class
public class InterfaceExample4 {
    public static void main(String[] args) {
        ApplicationLogger appLogger = new ApplicationLogger();
        appLogger.logApplicationStart();
        appLogger.logApplicationError();
    }
}
