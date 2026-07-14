import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Java Hangman Game!!! :))))	
		
		// Second part - Read in random words!
		Random random = new Random();
		
		ArrayList<String> words = readWords();
		// Always use .get for ArrayLists (they don't use [] notation)
		String randWord = words.get(random.nextInt(0, words.size()-1));
		
		// First part - create a functioning game!
		// (I did it in my own unique way with a game object!!)
		HangmanGame game = new HangmanGame(randWord);
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
	
	static ArrayList<String> readWords() {
		String filePath = "words.txt";
		ArrayList<String> words = new ArrayList<>();
	
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) ) {
			// Read line-by-line
			String line;
			while ( (line = reader.readLine()) != null) {
				words.add(line);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("The file could not be found");
		}
		catch (IOException e) {
			System.out.println("An exception occured when interacting with the file");
		}
		
		return words;
	}
}
