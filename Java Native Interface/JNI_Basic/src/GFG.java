import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class GFG {
	
	// Perplexity helped a lot in setting this up
	// since the tutorial is using an outdated IDE
	// that can no longer be accessed without online risks!
	// https://www.perplexity.ai/search/90c3b3fa-2fd4-484b-bb24-84b74c179553
	
	// This website from GeeksForGeeks also helped:
	// https://www.geeksforgeeks.org/java/java-native-interface/
	
	static {
		System.loadLibrary("hello");
	}
	
	// keyword: native -> like an abstract method -> but no implementation
	public native void print_Hello();
	
	public native double multiply(double a, double b);
	
	public static void main(String[] args) {
		
		System.out.println("Java & C++ JNI Test!");
		GFG gfg = new GFG();
		gfg.print_Hello();
		System.out.println(gfg.multiply(2.5, 6.3));
		
		
		runPython();
		
		System.out.println();
		
	}
	
	/* A custom procedure to automatically compile
	 * the Java header file and the C code into its
	 * .dll file. Intended to reduce cmd compile
	 * repetition after every multi-language change.
	 * 
	 * Website that helped here!:
	 * https://www.baeldung.com/run-shell-command-in-java
	 */
	private static void autoCompileJNICode() {
		
		// First, find out if this is running on windows:
		System.out.println("Running on: " + System.getProperty("os.name") + "\n");
		boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");
		
		// Perform respective commands based on OS: (but they are mostly the same for my purposes)
		String homeDirectory = System.getProperty("user.home");
		
		Process process = null;
		try {
			if (isWindows) {
				// String.format is related to printf
				String[] commands = {
						String.format("echo \"banana\" "),
						String.format("cmd.exe /c dir %s", homeDirectory) };
				process = Runtime.getRuntime()
						.exec(commands);
				
			} else { // else is mac or linux
				String[] commands = {String.format("/bin/sh -c ls %s", homeDirectory) };
				process = Runtime.getRuntime().exec(commands);
			}
			
			int exitCode = process.waitFor();
			
		}
		catch (InterruptedException e) {
			System.out.println("An interruption occured");
		}
		catch (IOException e) {
			System.out.println("An IO error occured when executing commands");
			System.out.println(e);
		}
		
		StreamGobbler streamGobbler =
				new StreamGobbler(process.getInputStream(), 
						System.out::println);
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<?> future = executor.submit(streamGobbler);
		
		streamGobbler.run();
	}
	
	/* Runs the helloJava.py program as a
	 * separate process
	 * 
	 * https://www.baeldung.com/java-working-with-python
	 */ 
	private static void runPython() {
		
		// Website reference I used:
		// https://marjavamitjava.com/using-processbuilder-and-jython-to-run-python-scripts-from-java/
		List<String> command = new ArrayList<>();
        command.add("python"); // Use "python3" if needed
        command.add("src/helloJava.py");
		
		// A processbuilder is used to create a whole new running program!!
		// (next step up from a thread)
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		
		// Redirect output and error streams
		// https://stackoverflow.com/questions/1732455/redirect-process-output-to-stdout
		processBuilder.inheritIO(); // auto sets the output and input to be from the same source
		processBuilder.redirectErrorStream(true);
		
		// Try to start the Python process, catch relevant exceptions coming from it
		try {
			Process process = processBuilder.start();
			int exitCode = process.waitFor();
			System.out.println("Python program ended with exit code: " + exitCode);
		}
		catch (InterruptedException e) {
			System.out.println("The process was interrupted before it could finish");
		}
		catch (IOException e) {
			System.out.println("An IO error occured when interacting with the file");
			System.out.println(e);
		}
	}
}
