import java.util.Random;
import java.util.Scanner;
import java.util.Map; // Interface
import java.util.HashMap; // Concrete builtin implementation of Dictionary
import java.util.InputMismatchException;
public class Main {
	
	// Will use a map to decide if the user wants to keep playing or not!!
	// https://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html
	static final Map<String, Boolean> yesNoMap = new HashMap<String, Boolean>();
	
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
		
		// Initialize the yes-no map for yes/no decision making prompts
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
			
			// Get the range from the user - if they want one!
			int[] arr = extractNumberRange(scanner);
			int min = arr[0], max = arr[1]; // this needs to be fixed (hard coded indexes are bad)
			
			int guess = 0, answer = random.nextInt(min, max + 1); // + 1 so that its max inclusive!
			
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
			
			try {
				// Use .get method for java (similar to [] in Python dictionaries)
				// https://www.geeksforgeeks.org/java/map-get-method-in-java-with-examples/
				if (yesNoMap.get(userInput) == false) {
					isPlayingGame = false;
				}
			} catch (NullPointerException e) { // side note: java.lang objects are already imported by default!!! :)) yayayaya YAY
				System.out.println("That's not a yes or no, assuming a no. ");
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
			System.out.printf("\nYou got the answer right! %d equals %d. \n", n, ans);
			return true;
		} else {
			System.out.printf("\n%d is incorrect!\n", n);
			return false;
		}
	}
	
	// Procedure for getting the number range - but only if the user wants to specify it or not
	// Takes in the user input scanner, but does not close it!!
	// TODO: potentially change this to use a tuple instead of an array?
	private static int[] extractNumberRange(Scanner scanner) {
		int[] arr = {0, 10};
		boolean isExtractingRange = true;
		
		while (isExtractingRange) {
			try {
				System.out.println("Would you like to specify the range (0 to 10 is default)?(Y/N): ");
				if (yesNoMap.get( scanner.next() ) == true) {
					int min = 0, max = 10;
					
					System.out.println("Enter the min number: ");
					min = scanner.nextInt();
					System.out.println("Enter the max number: ");
					max = scanner.nextInt();
					
					if (min >= max) {
						throw new IllegalArgumentException();
					}
					
					int[] dynamicArr = {min, max};
					return dynamicArr;
				}
				else { // Else the user just wants to use the 0 and 10 defaults
					isExtractingRange = false;
				}
			} catch (NullPointerException e) { // Case the user does not correctly enter a yes or no
				System.out.println("That's not a yes or no, assuming a no. ");
				isExtractingRange = false;
			} catch (IllegalArgumentException e) { // Case that max and min are incompatible
				System.out.println("The min cannot be equal to or greater than the max. ");
			}
		}
		
		return arr;
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
