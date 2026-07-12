import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Audio Player Program!!! (.wav, .au, .aiff)
		//							^ not compatible with mp3s
		
		String filePath = "src\\Lithium _ YouTube Audio Library.wav";
		// ^ got the music from youtube's audio library
		//   Music ⓒ - Kevin MacLeod
		
		File file = new File(filePath);
		
		// Accessing files can be unpredictable!!
		// Use "try-with-resources"
		try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
			Scanner scanner = new Scanner(System.in)) {
			
			// A "clip" is like a music or sound player
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			// clip.start(); // a clip needs to be looped!
			
			// Continually present options to the user,
			// allow clip to continually play
			String response = "";
			while (!response.equals("Q")) {
				System.out.println("P => Play");
				System.out.println("S => Stop");
				System.out.println("R => Reset");
				System.out.println("Q => Quit");
				System.out.print("Enter your choice: ");
				
				response = scanner.next().strip().toUpperCase();
				
				// Process the option (don't need to account for quitting)
				switch (response) {
					case "P" -> clip.start();
					case "S" -> clip.stop();
					case "R" -> clip.setMicrosecondPosition(0); // Sets to the 0th microsecond, "Resets" 
				}
			}
		}
		catch (UnsupportedAudioFileException e) {
			System.out.println("Audio file type is not supported");
		}
		catch (LineUnavailableException e) {
			System.out.println("Unable to access audio resource");
		}
		catch (FileNotFoundException e) {
			System.out.println("Could not locate the file at " + filePath);
		}
		catch (IOException e) {
			System.out.println("Something went wrong when interacting with the file");
		}
		finally {
			System.out.println("Exiting audio player program. Goodbye!");
		}
	}
}
