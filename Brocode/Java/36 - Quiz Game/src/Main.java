import java.util.Queue;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	private static Scanner scanner;
	private static int score;
	
	public static void main(String[] args) {
		// "Objective: Create an array of custom questions, 
		//			  and a 2D array of all the different options
		//			  to the questions! "
		//			  The quiz will be in a MCQ format! :0
		//
		// Self-challenge: Use OOP and more complex Data Structures
		//                 instead of just arrays!
		
		
		// ---- Initialize variables ----
		Queue<QuizQuestion> questions = new LinkedList<QuizQuestion>();
		loadQuestions(questions); // Load all questions into the Question Queue
		score = 0;
		scanner = new Scanner(System.in);
		
		// ----- Prompt all the questions -----
		
		QuizQuestion currentQuestion = questions.peek();
		processQuestion(currentQuestion); // Process it (display it, get user input, adjust score)
		
		// ----- Display score -----
		
		
		scanner.close();
	}
	
	// Procedure to load the questions!
	private static void loadQuestions(Queue<QuizQuestion> questions) {
		QuizQuestion test = new QuizQuestion("Which of the following is not a Minecraft mob?: ", 
			"""
			1. Pig
			2. Cow
			3. Zebra
			4. Bee
			"""
		);
		test.getOptions().put(1, false);
		test.getOptions().put(2, false);
		test.getOptions().put(3, true);
		test.getOptions().put(4, false);
		questions.offer(test);	
	}
	
	// A procedure to display a single question
	private static void displayQuestion(QuizQuestion question) {
		System.out.println(question.getPrompt());
		System.out.println(question.getQuestionsMsg());
		System.out.print("Enter answer number here: ");
	}
	
	// Procedure to obtain user input based on a question, validate it, and 
	// adjust the score as required
	private static void processQuestion(QuizQuestion question) {
		boolean isPrompting = true;
		int userChoice = 0;
		while (isPrompting) {
			displayQuestion(question); // Display the full question each time
			try {
				userChoice = scanner.nextInt();
				validateChoice(userChoice, question);
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("That's not a number, silly! ");
			} catch (IllegalArgumentException e) {
				System.out.println(e.toString());
			} finally {
				scanner.nextLine(); // flush input buffer
			}
		}
		
		System.out.println( question.getOptions().get(userChoice) );
		// ? :
	}
	
	// Procedure to validate that a given integer is one of
	// a given QuizQuestion's options keys. 
	private static void validateChoice(int num, QuizQuestion question) {
		if (question.getOptions().containsKey(num) == false) {
			throw new IllegalArgumentException("This number is not a valid option. ");
		}
	}
}
