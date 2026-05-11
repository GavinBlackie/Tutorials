import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Switches = An efficient replacement to many else if
		//			  statements
		
		// Enhanced Switches = A feature of Java14 and onwards
		//  				   that is more advanced?
		
		// badIfElse();
		//enhancedJavaSwitch();
		traditionalSwitch();
	}
	
	private static void badIfElse() {
		String day = "Saturday";
		
		day = day.toLowerCase();
		
		// Remember .equals is a string method
		// but == still works the same
		if (day.equals("monday") ) {
			System.out.println("It is a weekday. ");
		} 
		else if (day.equals("tuesday") ) {
			System.out.println("It is a weekday. ");
		}
		else if (day.equals("wednesday") ) {
			System.out.println("It is a weekday. ");
		}
		else if (day.equals("thursday") ) {
			System.out.println("It is a weekday. ");
		}
		else if (day.equals("friday") ) {
			System.out.println("It is a weekday. ");
		}
		else if (day.equals("saturday") ) {
			System.out.println("It is the weekend. ");
		}
		else if (day.equals("sunday") ) {
			System.out.println("It is the weekend. ");
		}
	}
	
	private static void enhancedJavaSwitch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day: ");
		String day = scanner.nextLine(); // next() gets next word, nextLine gets the whole thing including spaces
		day = day.toLowerCase();
		
		// -> arrows for inline cases without the need of break statements
		// -> and : cannot be used together, but traditional : syntax still works on its own (with necessary break;)
		
		switch (day) {
			case "monday", "tuesday", "wednesday", "thursday", "friday" ->
				System.out.println("It is a weekday 😒");
			case "saturday" -> System.out.println("It is the weekend 😊");
			case "sunday" -> System.out.println("It is the weekend 😊");
			default -> System.out.println(day + " is not a valid day. ");
		}
		scanner.close();
	}
	
	private static void traditionalSwitch() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day: ");
		String day = scanner.nextLine();
		day = day.toLowerCase();
		
		switch (day) {
			case "monday", "mon":
			case "tuesday", "tue", "tues": // Can still have many cases per line!!!
			case "wednesday", "wed":
			case "thursday", "thu", "thur":
			case "friday", "fri":
				System.out.println("It is a weekday 😒");
				break;
			case "saturday", "sat", "sunday", "sun":
				System.out.println("It is the weekend 😊");
				break;
			default:
				System.out.println(day + " is not a valid day. :( ");
				break;
		}
		scanner.close();
	}
}
