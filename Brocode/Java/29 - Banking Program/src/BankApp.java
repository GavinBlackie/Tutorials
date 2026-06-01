import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankApp {
	private final int[] MAIN_MENU_CHOICES = {1, 2, 3, 4};
	
	// Apparently its a good idea to not close a scanner
	// with System.in as its source (especially inside a class)!
	// https://www.w3schools.com/Java/ref_scanner_close.asp
	private Scanner scanner;
	private boolean isRunning;
	private int userChoice;
	private Bank bank;
	
	public BankApp() {
		this.scanner = new Scanner(System.in);
		this.isRunning = true;
		this.userChoice = 0;
		this.bank = new Bank();
	}
	
	// Runs the entire Bank App
	public void mainMenu() {
		while (this.isRunning == true) {
			this.extractChoice(MAIN_MENU_CHOICES, new MainMenuMsg());
			this.processMainMenuChoice();
		}
	}
	
	// Procedure to process a user's validated main menu choice
	private void processMainMenuChoice() {
		switch (this.userChoice) {
			case 1:
				this.displayAllAccounts();
				break;
			case 2:
				this.selectAccount();
				break;
			case 3:
				this.displayHelp();
				break;
			case 4:
				isRunning = false;
				break;
		}
	}
	
	// Procedure to make the user select an account from the Bank
	private void selectAccount() {
		String userInput;
		System.out.print("Enter the account holder name: ");
		this.scanner.nextLine();
		userInput = this.scanner.nextLine();
		
		try {
			Account account = linearSearchAccount(this.bank.getAccounts(), userInput);
			displayAccount(account);
		} catch (NullPointerException e) {
			System.out.println("An account under that name does not exist. ");
		} finally {
			this.promptContinue();
		}
	}
	
	// Displays all accounts in this BankApp's bank
	private void displayAllAccounts() {
		ArrayList<Account> accounts = this.bank.getAccounts();
		
		for (int iAcc = 0; iAcc < accounts.size(); iAcc++) {
			displayAccount(accounts.get(iAcc));
		}
		this.promptContinue(); // delay next output so this func's output is more clear!
	}
	
	// Basic procedure to display account info
	private static void displayAccount(Account account) {
		System.out.printf("\n--- Account ---\n");
		System.out.printf("Owner: %s\n", account.getOwner());
		System.out.printf("Balance: %.2f\n", account.getBalance());
		System.out.printf("\n---------------\n");
	}
	
	// Procedure to display the help menu
	private void displayHelp() {
		System.out.println("""
				
			Welcome to Mr. Krab's Bank App!
			Enter in different numbers to navigate the menus,
			select accounts, and add money or withdrawl from them.
			
			"Enjoy the bank, because I like Money" - Mr Krabs
		""");
		
		this.promptContinue();
	}
	
	// Simple prompt procedure to prompt user to continue 
	// (used to delay outputs) :-)
	private void promptContinue() {
		System.out.print("Type anything to continue: ");
		this.scanner.next();
	}
	
	/* Extracts a menu choice from the user.
	 * Function that takes in an integer input and validates 
	 * it based on the given "callback" function.
	 * Uses this BankApp's userChoice field! (also returns it)
	 */
	private int extractChoice(int[] choices, Message msg) {
		boolean isPrompting = true;
		while (isPrompting) {
			try {
				msg.displayInputPrompt(); // show choices to user!
				this.userChoice = this.scanner.nextInt(); // get the next integer from user
				validateChoice(choices); // validate the selected choice!
				isPrompting = false; // Prompt was successful here!
			} catch (InputMismatchException e) {
				msg.notANumber();
				this.scanner.nextLine(); // flush buffer
			} catch (IllegalArgumentException e) {
				msg.invalidNumber();
				this.scanner.nextLine(); // flush buffer
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
	// Linear search varient for account holder names
	private static Account linearSearchAccount(ArrayList<Account> arr, String target) {
		Account foundAccount = null;
		for (Account account : arr) {
			if (account.getOwner().equals(target)) {
				return account;
			}
		}
		return foundAccount;
	}
}
