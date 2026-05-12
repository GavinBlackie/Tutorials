import java.io.InputStream;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// && => AND
		// || => OR
		// !  => NOT
		
		// NOTE: bitwise logical operators are different!
		
		double temp = 20.0;
		boolean isSunny = false;
		
		// Specifying a range with AND
		// as well as checking a boolean value
		if (temp <= 30 && temp >= 0 && isSunny) {
			System.out.println("The weather is GOOD 😊"); // using special windows emoji thingymabobs
			System.out.println("It is SUNNY outside :) 🌞"); // ^ use with "windows key + ."
		}
		else if ( temp <= 30 && temp >= 0 && !isSunny) {
			System.out.println("The weather is OK 😊");
			System.out.println("It is CLOUDY outside ☁️");
		}
		else if ( (temp > 30 || temp < 0) && isSunny) {
			System.out.println("The weather is BAD 😒");
			System.out.println("It is SUNNY outside :) 🌞");
		}
		else if ( (temp > 30 || temp < 0) && !isSunny) {
			System.out.println("The weather is BAD 😒");
			System.out.println("It is CLOUDY outside ☁️");
		}
		
		System.out.println("\n---------------\n");
		
		// Practicing with Mars stuff :) 	(my own example)
		// https://science.nasa.gov/mars/facts/
		double marsTemp = -63;
		boolean isMarsDay = true;
		boolean dustStorm = true;
		
		// You can nest statements to reduce redundancy!!!
		// (but its generally recommended not to nest into oblivion)
		if (isMarsDay) {
			System.out.println("The sun shines on mars 🌞");
			if (marsTemp >= 0) {
				System.out.println("You are in a hot place on Mars! 🌡️");
			} 
			// no need to specify a range here (previous condition already checked)
			else if (marsTemp >= -50) {
				System.out.println("This spot is relatively warm :)");
			}
			else if (marsTemp >= -100) {
				System.out.println("This is an average/cold section of Mars");
			}
			else {
				System.out.println("This is an extremely cold section of Mars. Seek warmth. ");
			}
		}
		else {
			System.out.println("It is nightime on Mars - Seek shelter. :(");
			System.out.println("Reminder: a Martian day is 24.6 Earth hours. ");
		}
		
		if (dustStorm) {
			System.out.println("CAUTION - incoming dust storm!!!");
		}
		
		System.out.println("\n---------------\n");
		
		// Username verification example
		// Except I'm going to use a given string as input instead of System.in !!!
		String exampleUserName = "patrickStar43"; // 13 chars total (invalid)

		ProcessUsername(exampleUserName);
		
		String exampleUserName2 = "spoingBob2"; // 10 chars total (valid, no underscores or spaces)
		ProcessUsername(exampleUserName2);
		
		String exampleUserName3 = "pat_rick4";
		ProcessUsername(exampleUserName3);
		
		// testing again, but with System.in !
		
		ProcessUsername(System.in);
	}
	
	private static void ProcessUsername(String src) {
		Scanner scanner = new Scanner(src);
		
		// Rules:
		// 1. username not between 4-12 chars
		// 2. username doesn't contain spaces or underscores
		
		String username;
		
		System.out.print("Enter your username: ");
		username = scanner.nextLine();
		
		if (username.length() < 4 || username.length() > 12) {
			System.out.println("\nThe username MUST be between 4 and 12 characters!!!");
		}
		
		// NOTE: .contains doesn't work like python methods, you cannot
		// 		 do " _" to check for both spaces and underscore chars - this
		// 		 checks on a string basis!!!!!
		else if (username.contains(" ") || username.contains("_") ) {
			System.out.println("\nUsernames cannot contain spaces or underscores, silly!");
		}
		else {
			System.out.println("\n" + username + " is a valid username. ");
		}
		
		scanner.close();
	}
	
	// Had to overload this for InputStream
	private static void ProcessUsername(InputStream src) {
		Scanner scanner = new Scanner(src);
		
		// Rules:
		// 1. username not between 4-12 chars
		// 2. username doesn't contain spaces or underscores
		
		String username;
		
		System.out.print("Enter your username: ");
		username = scanner.nextLine();
		
		if (username.length() < 4 || username.length() > 12) {
			System.out.println("\nThe username MUST be between 4 and 12 characters!!!");
		}
		else if (username.contains(" ") || username.contains("_") ) {
			System.out.println("\nUsernames cannot contain spaces or underscores, silly!");
		}
		else {
			System.out.println("\n" + username + " is a valid username. ");
		}
		
		scanner.close();
	}
}
