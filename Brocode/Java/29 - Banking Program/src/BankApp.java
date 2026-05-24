import java.util.InputMismatchException;
import java.util.Scanner;
public class BankApp {
	public final int[] MAIN_MENU_CHOICES = {1, 2, 3, 4};
	
	// Apparently its a good idea to not close a scanner
	// with System.in as its source!
	// https://www.w3schools.com/Java/ref_scanner_close.asp
	private Scanner scanner;
	
	public BankApp() {
		this.scanner = new Scanner(System.in);
	}
	
	// Procedure to display the menu page
	public void displayMenu() {
		System.out.print("""
				************************
				MR. KRAB's BANK PROGRAM
				By: Gavin
				************************
				1. Show Balance
				2. Deposit
				3. Withdrawl
				4. Exit
				************************
				Enter your choice (1-4): """);
	}
	
	/* Extracts a menu choice from the user.
	 * Function that takes in an integer input and validates 
	 * it based on the given "callback" function.
	 */
	public int extractChoice(int[] choices) {
		System.out.println(); // Prints a generic msg
		
		boolean isPrompting = true;
		int userChoice = 0;
		while (isPrompting) {
			try {
				
				// validate that the choice is valid
				
			} catch (InputMismatchException e) {
				
			}
		}
		return userChoice;
	}
}
