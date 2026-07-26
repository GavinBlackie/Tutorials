import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
	
	// https://www.baeldung.com/java-working-with-python
	private static void runPython() {
		
		List<String> command = new ArrayList<>();
        command.add("python"); // Use "python3" if needed
        command.add("src/helloJava.py");
		
		// A processbuilder is used to create a whole new running program!!
		// (next step up from a thread)
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		//File file = new File("C:/Projects/Personal/Tutorials/Java Native Interface/JNI_Basic/src/");
		//processBuilder.directory(file);
		//System.out.println(processBuilder.directory());
		
		
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
