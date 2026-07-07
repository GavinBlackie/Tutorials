import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Main {
	public static void main(String[] args) {
	
		// How to read a file in Java! (3 Options)

		// 1. FileReader + BuffferedReader: Good for reading text files line-by-line
		//    
		// 2. FileInputStream: Best for binary files (eg. images, audio)
		// 3. RandomAccessFile: Best for read/write specific portions of a large file

		fileAndBufferReaderDemo();
	}

	private static void fileAndBufferReaderDemo() {
	
		String filePath = "C:\\Projects\\Personal\\Tutorials\\Brocode\\Java\\59 - Reading Files\\spongebobTest.txt";
		
		// FileReader fileReader = new FileReader(filePath); // must give the file path here	

		// You can't create a BufferedReader object without a reader object as its parameter!!
		// BufferedReader reader = new BufferedReader(fileReader);
		
		// this layout is similar to a "with" statement in python
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath) );) {
			System.out.println("The file exists and can be read from!");
		
			// You read files "line-by-line"
			String line;
			while ( (line = reader.readLine() ) != null ) {
				// ^ readLine gives strings until it runs out, then it will be null!!!
				System.out.println(line);
			}
		}
		catch (FileNotFoundException e) { // If we can't find the file,
			System.out.println("Could not locate file at " + filePath);
		}
		catch (IOException e) { // the more generalized exception for file IO interactions!!
			System.out.println("Something went wrong when interacting with the file. ");
		}


	}
}
