import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// Java Alarm Clock Program!!
		//
		// Will include:
		//	- Read world time, adjusted for timezones
		//	  using DateTime related objects
		//	- Functioning alarm, music playing when alarms
		//    are up
		//  - Multiple alarms that can be set?
		//	  (Multithreaded alarm tasks)
		
		// Prepare a formatter and time var for user time input
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime alarmTime;
		
		// Extract the desired alarmTime from the user!!
		alarmTime = extractAlarmTime(formatter);
		
		System.out.println("Alarm now set for " + alarmTime);
		
		scanner.close();
	}
	
	/** Function that returns a LocalTime object by asking the user
	 * repeatedly for a valid Hour-Minute-Second string
	 * @param formatter : specifies a custom input format, 
	 * 					  eg. "HH:mm:ss" if semicolons need to be typed,
	 * 						  or "HH mm ss" if spaces are desired
	 */
	private static LocalTime extractAlarmTime(DateTimeFormatter formatter) {
		LocalTime time = LocalTime.now();
		boolean isPrompting = true;
		while (isPrompting) {
			System.out.print("Enter an alarm time (HH:MM:SS): ");
			try {
				String inputTime = scanner.nextLine();
				time = LocalTime.parse(inputTime, formatter);
				isPrompting = false;
			} catch (DateTimeParseException e) {
				System.out.println("That is an invalid time format. Please try again!");
			}
		}
		return time;
	}
}
