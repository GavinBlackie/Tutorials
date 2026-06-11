import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
public class Main {
	private static Scanner scanner;
	
	public static void main(String[] args) {
		// JAVA Dice Roller Program!! :)
		
		// --- Obtain: declare vars and get user input ---
		scanner = new Scanner(System.in);
		Random random = new Random();
		
		// Constant variables are better to have than literals
		// inside function calls (professors recommend this)!
		final String ROLLS_MSG = "Enter the number of rolls: ";
		final String ROLLS_ERR = "That's an invalid roll number, try again!";
		final String SIDES_MSG = "Enter number of sides on the dice: ";
		final String SIDES_ERR = "That's not a valid number of dice sides!";
		
		// Get number of rolls by prompting the user!
		int numRolls = promptIntInput(ROLLS_MSG, ROLLS_ERR);
		// Get the number of sides on the dice!
		int sides = promptIntInput(SIDES_MSG, SIDES_ERR);
		int total = 0;
		
		// --- Validate: validate that the vars are correct! ---
		if (numRolls <= 0) {
			System.out.println("Cannot roll 0 or negative times. ");
			return;
		}
		if (sides < 1) {
			System.out.println("Can't have a dice will less than 1 side :( ");
			return;
		}
		
		// --- Act: Perform the dice rolls! ---
		for (int iRoll = 0; iRoll < numRolls; iRoll++) {
			int roll = random.nextInt(1, sides+1); // REMEMBER: upper bound is exclusive
			
			total += roll;
			
			// Display ASCII art of the Dice!!! :)
			printDie(roll);
		}
		
//		for (int i = 0; i < 100; i++) {
//			System.out.println(random.nextInt(1, 7));
//		}
		
		System.out.println("\nThe roll total is: " + total + "! ");
		
		scanner.close();
	}
	
	// Function that prompts for integer input from the user!!
	private static int promptIntInput(String msg, String errMsg) {
		int userInput = 0;
		boolean isPrompting = true;
		while (isPrompting) {
			try {
				System.out.print(msg);
				userInput = scanner.nextInt();
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println(errMsg);
			}
		}
		return userInput;
	}
	
	// Procedure to display the ascii art of the dice!!!
	private static void printDie(int roll) {
		
		// Multi-line Strings in Java!!
		final String[] dieArt = {"""
				 -------
				|       |
				|   ●   |
				|       |
				 -------
				""", """
				 -------
				|    ●  |
				|       |
				|  ●    |
				 -------
				""", """
				 -------
				|    ●  |
				|   ●   |
				|  ●    |
				 -------
				""", """
				 -------
				| ●   ● |
				|       |
				| ●   ● |
				 -------
				""", """
				 -------
				| ●   ● |
				|   ●   |
				| ●   ● |
				 -------
				""", """
				 -------
				| ●   ● |
				| ●   ● |
				| ●   ● |
				 -------
				"""	
				};

		try {
			System.out.print(dieArt[roll - 1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// idk somehow this works :(
			System.out.print("""
				 -------
				|       |
				|""" 
				+ "   " + roll + 
				"""
			    |
				|       |
				 -------
				""");
		}
		
	}
}
