import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		// ---- ROCK PAPER SCISSORS GAME ----
		
		// Declare variables
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] choices = {"rock", "paper", "scissors"}; 
		String userChoice = "";
		String cpuChoice = choices[random.nextInt(0, 3)];
		boolean isPrompting = true;
		
		// Validate variables, user input
		while (isPrompting) {
			System.out.print("Enter your move (Rock, Paper, Scissors): ");
			userChoice = scanner.nextLine();
			userChoice = userChoice.trim(); // trim all spaces
			userChoice = userChoice.toLowerCase(); // convert to lower case
			
			// If the user's input is valid, tell them and break out of loop
			if (containsStr(userChoice, choices)) {
				System.out.println("You have chosen: " + userChoice);
				isPrompting = false;
			} else {
				System.out.println("That is an invalid choice. Try again. ");
			}
		}
		System.out.println();
		
		// Act - Display the winner!!
		System.out.println("User chooses: " + userChoice);
		System.out.println("Computer chooses: " + cpuChoice);
		
		// If the user and computer chose the same move, its a draw!
		if (userChoice.equals(cpuChoice)) {
			System.out.println("Its a draw!");
		} 		
		// This system could be greatly improved with other data structures
		// used instead of basic arrays! Eg. a HashMap could decide who wins
		// much more clearly and faster in computation
		// Case 2 - User wins
		else if (     (userChoice.equals(choices[0]) && cpuChoice.equals(choices[2])) // rock beats scissors
		     ||  (userChoice.equals(choices[2]) && cpuChoice.equals(choices[1])) // scissors beats paper
		     ||  (userChoice.equals(choices[1]) && cpuChoice.equals(choices[0])) // paper beats rock
				) {
			System.out.println("You winn!! :0 :) Congrats!");
		} // Case 3 - Computer wins
		else {
			System.out.println("You lost. The computer wins!");
		}
		
		scanner.close();
	}
	
	// Function that gives a true or false value
	// depending on if a given String is inside a
	// given String array
	private static boolean containsStr(String target, String[] src) {
		boolean isFound = false;
		for (String str : src) {
			if (str.equals(target) == true) {
				isFound = true;
				break;
			}
		}
		return isFound;
	}
}
