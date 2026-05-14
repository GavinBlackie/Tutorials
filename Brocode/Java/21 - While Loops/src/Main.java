import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		
		// While Loop => Repeat some code forever while
		//				 some condition is true
		
		// Note: forever while loops can exist!!!
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while (name.isEmpty() && name.length() < 10) {
			System.out.print("Enter your name (10 chars max): ");
			name = scanner.nextLine();
		}
		System.out.println("Hello " + name);
		
		
		String gameInput = "";
		
		while ( ! gameInput.equals("Q")) {
			System.out.println("You are playing a game. ");
			System.out.print("Press Q if you want to quit!: ");
			gameInput = scanner.next().toUpperCase(); // to upper to allow lowercase qs to work!
		}
		
		
		int monkeyAge = -1;
		
		System.out.print("Enter the monkey's age: ");
		try {
			monkeyAge = scanner.nextInt();	
		} catch (InputMismatchException e) {
			System.out.println("It must be a number, silly!");
			scanner.next(); // flush buffer
		}
		
		while (monkeyAge < 0) {
			System.out.print("Reenter monkey age, cannot be less than 0: ");
			try {
				monkeyAge = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("It must be a number, silly!");
				scanner.next(); // flush buffer
			}
		}
		
		System.out.printf("The monkey is %d years old. \n", monkeyAge);
		
		// Note: there is also do-while loops (but I've already used them before)
		
		scanner.close();
	}
}
