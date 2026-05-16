import java.util.Random;
import java.util.Scanner;
import java.util.Map; // Interface
import java.util.HashMap; // Concrete builtin implementation of Dictionary
import java.util.InputMismatchException;
import java.lang.IllegalArgumentException; // Will use this for custom input validation!
public class Main {
	
	public static void main(String[] args) {
		// Number Guessing Game
		// => User will type numbers, and the game
		//    will tell them if that is the correct
		//    number or not. Will use randomization
		//	  and various prompts, including telling
		//    the user the number range!
		
		// As a challenge, I will be doing this program BEFORE I view
		// the tutorial video at all, then I will watch and contrast them to
		// further my learning!! :))) 
		
		boolean isPlayingGame = true;
		
		// Will use a map to decide if the user wants to keep playing or not!!
		// https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
		final Map<String, Boolean> yesNoMap = new HashMap<String, Boolean>();
		yesNoMap.put("yes", true);
		yesNoMap.put("y", true);
		yesNoMap.put("no", false);
		yesNoMap.put("n", false);
		
		/* Need a random object !!
		* But you don't need to close it like the scanner,
		* just let it go out of scope :) */
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		while (isPlayingGame) {
			int min = 0, max = 10;
			int guess = 0, answer = random.nextInt(min, max + 1); // + 1 so that its max inclusive!
			
//			for (int i = 0; i < 100; i++) {
//				System.out.println(random.nextInt(min, max + 1));
//			}
			
			// Get the guess from the user
			guess = extractGuess(guess, min, max, scanner);
			
			// Check if user has won or not!
			boolean hasWon = checkWin(guess, answer);
			
			String endMsg = (hasWon) ? 
					"You have won! Would you like to play again?(Y/N): " : 
					"You lost. Would you like to play again?(Y/N): ";
			System.out.print(endMsg);
			
			String userInput = scanner.next();
			userInput = userInput.toLowerCase();
			userInput = userInput.strip();
			
			// Use .get method for java (similar to [] in Python dictionaries)
			// https://www.geeksforgeeks.org/java/map-get-method-in-java-with-examples/
			if (yesNoMap.get(userInput) == false) {
				isPlayingGame = false;
			}
		}
		scanner.close();
	}
	
	// Procedure to validate that a number lies inside a range!!
	private static void validateNumRange(int n, int min, int max) {
		if (min > n || n > max) {
			throw new IllegalArgumentException();
		}
	}
	
	// Procedure to display if user has won or not!
	private static boolean checkWin(int n, int ans) {
		if (n == ans) {
			System.out.printf("\nYou got the answer right! %d equals %d!\n", n, ans);
			return true;
		} else {
			System.out.printf("\n%d is incorrect!\n", n);
			return false;
		}
	}
	
	// Function/Procedure that returns the user's guess and ensures validation of that guess
	private static int extractGuess(int guess, int min, int max, Scanner scanner) {
		boolean prompting = true;
		// Extract guess from user, validate when necessary
		while (prompting) {
			System.out.printf("Guess a number between %d and %d: ", min, max);
			try {
				guess = scanner.nextInt();
				validateNumRange(guess, min, max);
				prompting = false;
			} catch (InputMismatchException e) {
				System.out.println("That's not a number silly, try again! ");
			} catch (IllegalArgumentException e) {
				System.out.println("That number is not in the specified range! Try again. ");
			} finally {
				scanner.nextLine(); // flush buffer regardless
			}
		}
		return guess;
	}

}
