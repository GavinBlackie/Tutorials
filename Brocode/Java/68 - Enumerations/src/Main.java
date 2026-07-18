import java.time.LocalDate;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Enums =>	A special kind of class representing 
		//			fixed set of constants.
		//			Logically they are just integers in most languages
		//			But can be expanded upon in Java!! (unlike C/C++)
		//			
		//			Improves code readability, easy to maintain
		//			Frequently paired with switch statements!
		//			More efficient with switches when comparing Strings?
	
		// Enums are also built-into LocalDate
		LocalDate today = LocalDate.now();
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getClass().getSimpleName());
	
		System.out.println("\n***********************\n");
		
		//Day day1 = new Day(6); // doesn't work
		Day day = Day.FRIDAY;
		
		System.out.println(day);
		System.out.println(day.getDayNumber() + "\n");
		
		// "Using enums is faster than using Strings"
		displayWeekDayOrEnd(day);
		displayWeekDayOrEnd(Day.WEDNESDAY);
		displayWeekDayOrEnd(Day.SATURDAY);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a day of the week: ");
		String response = scanner.nextLine().toUpperCase().trim();
		System.out.println("You entered: " + response);
		
		try {
			// Use Day.valueOf(str) to convert strings to enums
			Day day2 = Day.valueOf(response);		
			displayWeekDayOrEnd(day2);
		}
		catch (IllegalArgumentException e) {
			System.out.println("That's not a valid day. Please enter a valid day. ");
		}
		
		scanner.close();
	}
	
	static void displayWeekDayOrEnd(Day day) {
		switch (day) {
			case MONDAY, 
				 TUESDAY, 
				 WEDNESDAY, 
				 THURSDAY, 
				 FRIDAY ->
				System.out.println("It is a weekday. ");
			case SATURDAY, 
				 SUNDAY, 
				 SPONGEBOBDAY->
				System.out.println("It is the weekend!");
		}
	}
}
