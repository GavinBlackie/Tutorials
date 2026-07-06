import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Main {
	public static void main(String[] args) {
		
		// Writing to Files in Java (4 Popular Options): 

		// 1. FileWriter = Good for small or medium-sized text files
		// 2. BufferedWriting = Better performance for large amounts of text
		// 3. PrintWriter = Best for structured data, like reports or logs
		// 4. FileOutputStream = Best for binary files (eg. images, audio files)
		
		// Choose the right option for the right task!!!

		fileWriterDemo();


	}

	private static void fileWriterDemo() {
		// NOTE: file path can be relative or absolute	
		//       test.txt   C:\\Parojects\\test.txt <= causes IOError
		// follow try-catch pattern (interacting with files is naturally dangerous)
		
		String filePath = "test.txt";
		String textContent = """
				I like pineapples
				Spongebob and Patrick were here
				
				Roses are red
				Violets are blue
				BOOTY BOOTY BOOTY
				I'm here for you
				""";
		
		try (FileWriter writer = new FileWriter(filePath)) {
			writer.write(textContent);
			System.out.println("File has been written to. ");
		}
		catch (FileNotFoundException e) {
			System.out.println("Can't find a file at " + filePath);
		}
		catch (IOException e) { // the topmost exception for all IO
			System.out.println("Could not write to file!");
		}

	}
}
