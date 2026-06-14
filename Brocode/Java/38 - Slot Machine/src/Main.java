import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		
		// ----- Java Slot Machine -----
		
		// Declare vars
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		double balance = 100.0f;
		double bet = 0.0f;
		double payout = 0.0f;
		final String BET_MSG     = "Enter the bet amount: ";
		String[] row; // will contain the emojji slot symbols
		
		// Display welcome
		System.out.println("***********************");
		System.out.println("Welcome to Java Slots!");
		System.out.println("Symbols: 🍒 🍉 🍎 🍓 🍋");
		System.out.println("***********************");
		
		// Play as long as balance is above 0, or when the
		// user has specified they don't want to play another round
		while (balance > 0.0f) {
			// Extract bet amount, validate that Bet > Balance and Bet > 0
			bet = extractBet(scanner, BET_MSG, balance);
			
			// Subtract bet from balance
			balance -= bet;
			
			// -- Spin Row, Print Row --
		
			// Give payout
		
			// Ask to play again
			System.out.println("");
		}
		// Display exit message
		System.out.println("");
		
		scanner.close();
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
