import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Java Hangman Game!!! :))))	
		
		// Second part - 
		
		// First part - create a functioning game!
		// (I did it in my own unique way with a game object!!)
		HangmanGame game = new HangmanGame("spongebob");
		game.greetUser();
		while (game.getIsRunning() == true && game.getWrongGuesses() < 6) {
			game.displayCurrentArt();
			game.displayWordState();
			game.extractGuess();
			game.checkGuess();
			game.checkWin();
		}
		
		scanner.close();
	} 
}
