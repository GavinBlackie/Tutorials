import java.util.ArrayList;
public class HangmanGame {
	
	private String word;
	private ArrayList<Character> wordState;
	private int wrongGuesses;
	private char guess;
	private boolean isRunning;
	
	public HangmanGame(String word) {
		this.word = word;
		this.wordState = new ArrayList<>();
		for (int iChar = 0; iChar < word.length(); iChar++) {
			wordState.add('_');
		}
		this.wrongGuesses = 0;
		this.guess = ' ';
		this.isRunning = true;
	}
	
	public void greetUser() {
		System.out.println("*************************\n");
		System.out.println("Welcome to Java Hangman!\n");
		System.out.println(HangmanGame.getHangManArt(6));
		System.out.println("*************************");
	}
	
	public void extractGuess() {
		System.out.print("Guess a letter: ");
		this.guess = Main.scanner.next().toLowerCase().charAt(0);
		
		System.out.println("\nYou guessed the letter: " + guess);
	}
	
	public void checkGuess() {
		
		// indexOf returns the first index occurance of that letter!
		// it gives -1 if no match is found!!
		if (this.word.indexOf(this.guess) >= 0) {
			System.out.println("Correct guess!");
			
			// Adjust all matches in the word, Θ(n)
			for (int iChar = 0; iChar < word.length(); iChar++) {
				if (word.charAt(iChar) == guess) {
					wordState.set(iChar, guess);
				}
			}
			
		}
		else {
			System.out.println("Incorrect Guess.");
			this.wrongGuesses++;
		}
	}
	
	public void checkWin() {
		if (this.wrongGuesses >= 6) {
			this.displayCurrentArt();
			System.out.println("GAME OVER!!! :(");
			System.out.println("The whole word was: " + this.word);
			this.isRunning = false;
		}
		// The player wins if there are no more underscores!
		else if (!this.wordState.contains('_')) {
			this.displayCurrentArt();
			System.out.println("YOU WIN!!! :)");
			System.out.println("The word was: " + this.word);
			this.isRunning = false;
		}
	}
	
	public void displayCurrentArt() {
		System.out.println(this.getHangManArt());
	}
	
	// Non static variant that uses this.wrongGuesses
	String getHangManArt() {
		return HangmanGame.getHangManArt(this.wrongGuesses);
	}
	
	// Static method that gives the hangman art, allows for
	// displaying hangman art regardless of game state!!
	static String getHangManArt(int wrongGuesses) {
		// Can return a switch statement!
		return switch(wrongGuesses) {
			default -> "";
			case 0 -> 	"""
					
					
					
						""";
			case 1 -> 	"""
					   	 o
					   	 
					
					  	""";
			case 2 -> 	"""
					   	 o
					   	 |
					
					  	""";
			case 3 -> 	"""
					   	 o
					   	/|
					
					  	""";
			case 4 -> 	"""
					 	 o
					  	/|\\
					  	
						""";
			case 5 -> 	"""
					 	 o
					 	/|\\
					 	/
						""";
			case 6 -> 	"""
					 	 o
					  	/|\\
					  	/ \\
						""";
		};
	}
	
//	public ArrayList<Character> getWordState() {
//		return this.wordState;
//	}
	
	public int getWrongGuesses() {
		return this.wrongGuesses;
	}
	public boolean getIsRunning() {
		return this.isRunning;
	}
	
	public void displayWordState() {
		System.out.print("Word: ");
		for (Character c : this.wordState) {
			System.out.print(c + " ");
		}
		System.out.println("\n");
	}
}
