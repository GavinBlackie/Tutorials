import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Main {
	// Yes, this could also be done with the scanner
	// (this is just to reduce parameters in methods, but
	// more importantly to use only ONE instance of random where its needed)
	private static Random random = new Random();
	
	public static void main(String[] args) {
		
		// ----- Java Slot Machine -----
		
		// Declare vars
		Scanner scanner = new Scanner(System.in);
		double balance = 100.0f;
		double bet = 0.0f;
		double payout = 0.0f;
		final String BET_MSG     = "Enter the bet amount: ";
		final String[] SYMBOLS = {"🍒", "🍉", "🍎", "🍓", "🍋"};
		String[] row = new String[3]; // will contain the emojji slot symbols
		String playAgain = "Y";
		
		// Display welcome
		displayWelcome();
		
		// Play as long as balance is above 0, or when the
		// user has specified they don't want to play another round
		while (balance > 0.0f) {
			System.out.println("Current balance: $" + balance);
			// Extract bet amount, validate that Bet > Balance and Bet > 0
			bet = extractBet(scanner, BET_MSG, balance);
			
			// Subtract bet from balance
			balance -= bet;
			
			// -- Spin Row, Print Row --
			spinRow(row, SYMBOLS);
			displayRow(row);
			
			// Give payout
			payout = calcPayout(row, bet);
			
			if (payout > 0) {
				System.out.println("You won $" + payout);
				balance += payout;
			} else {
				System.out.println("You lose :(");
			}
			
			// Ask to play again
			System.out.println("Would you like to keep playing?(Y/N): ");
			scanner.nextLine(); // flush
			playAgain = scanner.nextLine().toUpperCase();
			if (!playAgain.equals("Y")) {
				break;
			}
			
		}
		// Display exit message
		System.out.println("Thanks for playing Java Slots!");
		System.out.println("Your final balance is: $" + balance);
		
		scanner.close();
	}
	
	// Procedure to spin the row! (Assumes symbols array is larger than row)
	private static void spinRow(String[] row, String[] symbols) {
		for (int iRow = 0; iRow < row.length; iRow++) {
			int randIndex = random.nextInt(0, symbols.length);
			String randSymbol = symbols[randIndex];
			row[iRow] = randSymbol;
		}
	}
	
	// Function that calculates and returns the payout amount, if
	// given the current row symbols and bet amount
	private static double calcPayout(String[] row, double bet) {
		
		// Just going to do a basic approach for this one:
		// (can be dynamically improved with frequency calculations)
		if (row[0].equals(row[1]) && row[1].equals(row[2])) {
			return switch(row[0]) { // return switch!
				case "🍒" -> bet * 3;
				case "🍉" -> bet * 4;
				case "🍎" -> bet * 5;
				case "🍓" -> bet * 10;
				case "🍋" -> bet * 20;
				default -> 0;
			};
		}
		// For two matching!
		else if (row[0].equals(row[1])) {
			return switch(row[0]) {
				case "🍒" -> bet * 2;
				case "🍉" -> bet * 3;
				case "🍎" -> bet * 4;
				case "🍓" -> bet * 5;
				case "🍋" -> bet * 10;
				default -> 0;
			};
		}
		else if (row[1].equals(row[2])) {
			return switch(row[1]) {
				case "🍒" -> bet * 2;
				case "🍉" -> bet * 3;
				case "🍎" -> bet * 4;
				case "🍓" -> bet * 5;
				case "🍋" -> bet * 10;
				default -> 0;
			};
		}
		
		return 0;
	}
	
//	// Function to find frequencies of strings inside a string array!
//	// credit to this: https://www.geeksforgeeks.org/dsa/counting-frequencies-of-array-elements/
//	//  for helping with concepts on how to actually keep track of "visited" indexes
//	private static int[] calcFreq(String[] arr) {
//		int[] freq = new int[arr.length];
//		boolean[] visited = new boolean[arr.length];
//		
//		for (int iArr = 0; iArr < arr.length; iArr++) {
//			if (visited[iArr] == true) continue; // skip already processed elements
//			
//			// Store this unique strings frequency!
//			int count = 1;
//			
//			// Increment the frequency
//			for (int jArr = iArr + 1; jArr < arr.length; jArr++) {
//				 
//			}
//			
//		}
//		
//		return freq;
//	}
	
	// Procedure func to display welcome
	private static void displayWelcome() {
		System.out.println("***************************");
		System.out.println("\tWelcome to Java Slots!");
		System.out.println("\tSymbols: 🍒 🍉 🍎 🍓 🍋");
		System.out.println("***************************");
	}
	
	// Slot row display func
	private static void displayRow(String[] row) {
		System.out.println("\n***************************");
		System.out.println("SLOTS: " + String.join(" | ", row));
		System.out.println("***************************\n");
//		for (String str : row) {
//			System.out.print(str + " ");
//		}
	}
	
	// Custom function I made to extract a floating point double
	// from a user. Must be given a Scanner, a msg/errMsg, and a
	// varying amount of numbers to check if the input is greater than them
	private static double extractBet(Scanner scanner, String msg, double balance) {
		double userInput = 0.0f;
		boolean isPrompting = true;
		while (isPrompting) {
			try {
				System.out.print(msg);
				userInput = scanner.nextDouble();
				validateBet(userInput, balance); // validate userInput before stopping loop!
				isPrompting = false;
			} // Display a generic print should the input not be convertable to a double number! :0
			catch (InputMismatchException e) {
				System.out.println("That's not a valid number, silly! Try again. ");
				scanner.nextLine(); // flush buffer
			} // Display custom error message if the validation fails
			catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				scanner.nextLine(); // flush buffer
			}
		}
		return userInput;
	}

	// Procedure to validate that a bet is not greater than a balance, or is negative.
	// Should the bet amount be invalid, an IllegalArgumentException is thrown !! ;0
	private static void validateBet(double bet, double balance) {
		if (bet > balance) {
			throw new IllegalArgumentException("Cannot bet an amount greater than current balance. ");
		} else if (bet < 0) {
			throw new IllegalArgumentException("Bet amount cannot be negative. ");
		}
	}
	
	// Deprecated code, didn't work out in the final program
//	private static void validateDoubleGreaterThan(double target, double... nums) {
//		for (double n : nums) {
//			if (target < n) {
//				throw new IllegalArgumentException();
//			}
//		}
//	}
}
