import java.util.InputMismatchException;
import java.util.Scanner;
public class BankApp {
	public final int[] MAIN_MENU_CHOICES = {1, 2, 3, 4};
	
	// Apparently its a good idea to not close a scanner
	// with System.in as its source!
	// https://www.w3schools.com/Java/ref_scanner_close.asp
	private Scanner scanner;
	
	private boolean isRunning;
	private int userChoice;
	
	public BankApp() {
		this.scanner = new Scanner(System.in);
		this.isRunning = true;
		this.userChoice = 0;
	}
	
	// Procedure to process a user's validated main menu choice
	public void processMainMenuChoice() {
		switch (this.userChoice) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			isRunning = false;
			break;
		}
	}
	
	/* Extracts a menu choice from the user.
	 * Function that takes in an integer input and validates 
	 * it based on the given "callback" function.
	 * Uses this BankApp's userChoice field! (also returns it)
	 */
	public int extractChoice(int[] choices, Message msg) {
		boolean isPrompting = true;
		while (isPrompting) {
			try {
				msg.displayInputPrompt(); // show choices to user!
				this.userChoice = this.scanner.nextInt(); // get the next integer from user
				validateChoice(choices); // validate the selected choice!
				isPrompting = false; // Prompt was successful here!
			} catch (InputMismatchException e) {
				msg.invalidNumber();
			} catch (IllegalArgumentException e) {
				msg.notANumber();
			}
		}
		return this.userChoice;
	}
	
	// Validates a user choice based on some array of choices!
	// Throws/raises an IllegalArgumentException if it does not exist!
	private void validateChoice(int[] choices) {
		boolean choiceExists = linearSearch(choices, this.userChoice);
		if (!choiceExists) throw new IllegalArgumentException();
	}
	
	
	/* Linear Search - Performs a basic linear search
	 * on a given integer array and a target value! 
	 * Returns a true or false value if the target
	 * is present in the array. 
	 * ^ :0 I used ASCII values to type these symbols!
	 * Ω(1) best, Θ(n) average, O(n) worst
	 */
	private static boolean linearSearch(int[] arr, int target) {
		boolean isFound = false;
		for (int num : arr) {
			if (num == target) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}
	
	// Accessor for isRunning field!
	public boolean getIsRunning() {
		return this.isRunning;
	}
}
