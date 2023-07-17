import java.io.*;

public class CommandInjection {

    public static void directRuntimeExec(String userInput) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("ping " + userInput);
    }
}
