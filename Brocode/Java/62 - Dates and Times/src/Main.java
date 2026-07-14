import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Instant;
public class Main {
	public static void main(String[] args) {
		
		// Java Dates & Times Tutorial
		// (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
		
		// LocalDate => A calendar date in year-month-day format
		//			    eg. 1998 March 28 or 1998-03-28
		
		// LocalTime => A day time without time zone
		//		        eg. 6:45pm and 30 secs,
		//				    represented as: 06:45:30
		
		// LocalDateTime => Both the caldendar date and the
		//				    time of day
		
		// UTC time => The "coordinated"/"central" time zone,
		//			   primarily based on its predecessor, Greenwich time
		//			   in the United Kingdom. 
		
		// Side note: these things use 24 hour time!!!
		
		LocalDate date = LocalDate.now(); // Gives the current day
		System.out.println(date);
		
		LocalTime time = LocalTime.now(); // Gives the hour/min/sec of now
		System.out.println(time);
		
		// Gives BOTH the calendar 
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		// getting UTC time
		Instant instant = Instant.now();
		System.out.println(instant);
		
		// Custom format (making it more readable)
		
		// Make sure to use the docs for the pattern strings you want!!!
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyyG HH:mm:ss");
		
		// Get a customized string by calling the .format method
		// from the time object, and pass in the formatter object!
		String displayDateTime = dateTime.format(formatter);
		System.out.println(displayDateTime);
		
		
		// Local date example:
		LocalDateTime christmas = LocalDateTime.of(2026, 12, 25, 0, 0);
		System.out.println(christmas);
		
		LocalDateTime newYearsDay = LocalDateTime.of(2027, 1, 1, 0, 0);
		System.out.println(newYearsDay);
		
		LocalDateTime date1 = LocalDateTime.of(2027, 1, 1, 0, 2);
		LocalDateTime date2 = LocalDateTime.of(2027, 1, 1, 0, 1);
		
		// Comparing dates:
		if (date1.isBefore(date2)) {
			System.out.println(date1 + " is earlier than " + date2);
		}
		else if (date1.isAfter(newYearsDay)) {
			System.out.println(date1 + " is later than " + date2);
		}
		else if (date1.isEqual(date2)) {
			System.out.println(date1 + " is equal to " + date2);
		}
	}
}
