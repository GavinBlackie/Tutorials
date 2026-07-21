import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.awt.Toolkit;
import java.time.LocalTime;
/** Represents a currently running alarm clock, runs
 * a counter in seconds until it reaches a specified time
 */
public class AlarmClock implements Runnable{
	
	private final LocalTime alarmTime;
	private final String audioFilePath;
	
	public AlarmClock(LocalTime alarmTime, String filePath) {
		this.alarmTime = alarmTime;
		this.audioFilePath = filePath;
	}
	
	@Override
	public void run() {
		
		// While right now is before the given alarm time, sleep a second
		while(LocalTime.now().isBefore(this.alarmTime)) {
			try {
				Thread.sleep(1000);
				
				// Display a "countdown" every second in a clean format
				LocalTime now = LocalTime.now();
				System.out.printf("\r%02d:%02d:%02d", 
						now.getHour(), 
						now.getMinute(), 
						now.getSecond());
			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
		System.out.println("\n---ALARM TIME *BEEP* *BEEP* ----\n");
		// Do a simple beep using the Toolkit
		Toolkit.getDefaultToolkit().beep();
		
		try {
			Thread.sleep(1000); // Sleep a second
		} catch (InterruptedException e) {
			System.out.println("Thread was interrupted");
		}
		playAudio(); // Play the music!
	}
	
	// Plays the audio at the specified location!!
	private void playAudio() {
		File audioFile = new File(this.audioFilePath); // get the audio file
		
		// Try-with-resources to play the audio from the file
		try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);) {
			// Get a clip object that can open and start playing the audioStream resource
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			
			// Wait for the user to hit enter before stopping
			System.out.print("Press *Enter* to stop the alarm: ");
			Main.scanner.nextLine();
			clip.stop();
		} 
		catch (UnsupportedAudioFileException e) {
			System.out.println("Audio file format not supported");
		}
		catch (LineUnavailableException e) {
			System.out.println("Audio is unavailable");
		}
		catch (FileNotFoundException e) {
			System.out.println("Could not locate the audio file");
		}
		catch (IOException e) {
			System.out.println("Something went wrong with I/O operations");
		}
		finally { // finally close the main scanner (the whole program ends here)
			Main.scanner.close();
		}
	}
}
