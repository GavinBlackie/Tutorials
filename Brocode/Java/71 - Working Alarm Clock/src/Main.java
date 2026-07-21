import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Java Alarm Clock Program!!
		//
		// Will include:
		//	- Read world time using LocalTime objects
		//	- Functioning alarm, music playing when alarms
		//    are up
		//  - Multiple alarms that can be set?
		//	  (Multithreaded alarm tasks)
		
		// Prepare a formatter and time var for user time input
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime alarmTime;
		
		String filePath = "Lithium _ YouTube Audio Library.wav";
		// ^ got the music from youtube's audio library
		//   Music ⓒ - Kevin MacLeod
		
		System.out.println("The current local time is: " + LocalTime.now().format(formatter));
		// Extract the desired alarmTime from the user!!
		alarmTime = extractAlarmTime(formatter); 
		System.out.println("Alarm now set for " + alarmTime);
		displayAlarmTimeDifference(alarmTime);
		
		// Create a new thread for the clock and start it
		Thread alarmThread = new Thread(new AlarmClock(alarmTime, filePath));
		alarmThread.start();
	}
	
	/** Function that returns a LocalTime object by asking the user
	 * repeatedly for a valid Hour-Minute-Second string
	 * @param formatter : specifies a custom input format, 
	 * 					  eg. "HH:mm:ss" if semicolons need to be typed,
	 * 						  or "HH mm ss" if spaces are desired
	 */
	private static LocalTime extractAlarmTime(DateTimeFormatter formatter) {
		LocalTime time = null;
		while (time == null) { // Continually ask for input until time is not empty
			System.out.print("Enter an alarm time (HH:MM:SS): ");
			try {
				String inputTime = scanner.nextLine();
				time = LocalTime.parse(inputTime, formatter);
			} catch (DateTimeParseException e) {
				System.out.println("That is an invalid time format. Please try again!");
			}
		}
		return time;
	}
	
	/** Procedure to display the difference in time between
	 *  now and the alarm time in a readable format.
	 *  Only works for alarms in the same day.
	 */
	private static void displayAlarmTimeDifference(LocalTime alarmTime) {
		Duration duration = Duration.between(LocalTime.now(), alarmTime);
		
		// long seconds = duration.toSeconds() % 60;
		long seconds = duration.toSecondsPart(); // there are builtin methods for this!! :0
		long minutes = duration.toMinutesPart();
		long hours = duration.toHoursPart();
		System.out.println("Alarm will ring in " + hours + " hours, " +
							minutes + " mins, " + seconds + " secs ");
	}
}
