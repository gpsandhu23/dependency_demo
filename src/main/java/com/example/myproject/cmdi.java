import java.io.*;

public class CommandInjection {

    public static void directRuntimeExec(String userInput) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        String[] cmd = {"/bin/sh", "-c", "ping " + userInput};
runtime.exec(cmd);
    }
}
