import java.io.*;

public class CommandInjection {

    public static void directRuntimeExec(String userInput) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        if (userInput != null && userInput.matches("^[a-zA-Z0-9]*$") {
    runtime.exec("ping " + userInput);
} else {
    throw new IllegalArgumentException("Invalid input");
}
    }
}
