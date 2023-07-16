import java.io.*;

public class CommandInjection {

    public static void directRuntimeExec(String userInput) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        String[] cmd = {"/bin/sh", "-c", "ping " + userInput};
ProcessBuilder pb = new ProcessBuilder(cmd);
pb.start();
    }

    public static void processBuilderExec(String userInput) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("ping", userInput);
        pb.start();
    }

    public static void shellCommandExec(String userInput) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("/bin/sh -c echo " + userInput);
    }

    public static void main(String[] args) throws IOException {
        String userInput = args[0]; // user input is directly used

        directRuntimeExec(userInput);
        processBuilderExec(userInput);
        shellCommandExec(userInput);
    }
}
