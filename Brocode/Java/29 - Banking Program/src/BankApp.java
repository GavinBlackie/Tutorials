import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankApp {
	private final int[] MAIN_MENU_CHOICES = {1, 2, 3, 4};
	private final int[] ACCOUNT_MENU_CHOICES = {1, 2, 3};
	
	// Apparently its a good idea to not close a scanner
	// with System.in as its source (especially inside a class)!
	// https://www.w3schools.com/Java/ref_scanner_close.asp
	private Scanner scanner;
	private boolean isRunning;
	private boolean runningAccountMenu;
	private int userChoice;
	private Bank bank;
	
	public BankApp() {
		this.scanner = new Scanner(System.in);
		this.isRunning = true;
		this.runningAccountMenu = false;
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
	
	// Runs the account menu for a given account object
	private void accountMenu(Account account) {
		this.runningAccountMenu = true;
		while (this.runningAccountMenu == true) {
			displayAccount(account);
			
			this.extractChoice(ACCOUNT_MENU_CHOICES, new AccountMenuMsg());
			this.processAccountMenuChoice(account);
		}
	}
	
	// Procedure to process a user's validated main menu choice
	// potential TODO: change each case number to an Enumeration
	//				   for better code readability & clarity
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
	
	// Procedure for processing account menu user input :0 :)
	private void processAccountMenuChoice(Account account) {
		double amount = 0.0;
		switch (this.userChoice) {
			case 1:
				// Deposit an amount
				try {
					amount = obtainAmount("deposit");
					account.deposit(amount);
				} catch (AccountException e) {
					System.out.println(e.msg);
				}
				break;
			case 2:
				// Withdraw an amount
				try {
					amount = obtainAmount("withdraw");
					account.withdraw(amount);
				} catch (AccountException e) {
					System.out.println(e.msg);
				}
				break;
			case 3:
			default:
				System.out.println("\nReturning to the main menu...\n");
				this.runningAccountMenu = false;
				break;
		}
	}
	
	// Function to get a specified amount from the user for either
	// withdrawing or depositing to an account!
	private double obtainAmount(String actionWord) {
		double amount = 0.0;
		try {
			System.out.print("Enter the amount to ".concat(actionWord) + ": ");
			amount = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("That's not a valid number, silly!");
		}
		return amount;
	}
	
	// Procedure to make the user select an account from the Bank
	// Will initiate the account menu if an account is properly selected
	private void selectAccount() {
		String userInput;
		System.out.print("Enter the account holder name: ");
		this.scanner.nextLine();
		userInput = this.scanner.nextLine();
		
		try {
			Account account = linearSearchAccount(this.bank.getAccounts(), userInput);
			accountMenu(account);
		} catch (NullPointerException e) {
			System.out.println("An account under that name does not exist. ");
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
		System.out.printf("Balance: %.2f", account.getBalance());
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
