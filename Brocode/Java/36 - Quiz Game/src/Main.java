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
		int numQuestions = questions.size();
		score = 0;
		scanner = new Scanner(System.in);
		
		// ----- Prompt all the questions -----
		
		while (questions.isEmpty() == false) {
			QuizQuestion currentQuestion = questions.poll();
			processQuestion(currentQuestion); // Process it (display it, get user input, adjust score)
		}
		
		// ----- Display score -----
		
		System.out.println("**********************************************");
		System.out.println("\tScore: " + score + " out of " + numQuestions);
		System.out.println("**********************************************");
		
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
		test.getOptions().put(1, false); // this part could be improved to reduce redundancy, perhaps take question option strings as an array in the constructor?
		test.getOptions().put(2, false);
		test.getOptions().put(3, true);
		test.getOptions().put(4, false);
		questions.offer(test);	
		
		// Sort-of using some of the tutorial's questions here 
		// (but my whole program logic is completely different :0 )
		// Also, this uses dynamic options sizes because I'm not bound
		// to strictly using a 2D array like BroCode did in his tutorial! :-)
		QuizQuestion question2 = new QuizQuestion("What is the main function of a router?:", 
			"""
			1. Storing files
			2. Encrypting data
			3. Directing internet traffic
			4. Managing passwords
			5. All of the above
			"""
		);
		question2.getOptions().put(1, false);
		question2.getOptions().put(2, false);
		question2.getOptions().put(3, true);
		question2.getOptions().put(4, false);
		question2.getOptions().put(5, false);
		questions.add(question2);
		
		QuizQuestion question3 = new QuizQuestion("Which part of the computer is considered the brain?:", 
				"""
				1. The 
				2. RAM
				3. SSD/HDD
				4. CPU
				5. GPU
				6. None of the above
				"""
			);
		question3.getOptions().put(1, false);
		question3.getOptions().put(2, false);
		question3.getOptions().put(3, false);
		question3.getOptions().put(4, true);
		question3.getOptions().put(5, false);
		questions.add(question3);
		
		QuizQuestion question4 = new QuizQuestion("What year was facebook launched?: ", 
				"""
				1. 2000
				2. 2004
				3. 1999
				"""
			);
		question4.getOptions().put(1, false);
		question4.getOptions().put(2, true);
		question4.getOptions().put(3, false);
		questions.add(question4);
		
		QuizQuestion question5 = new QuizQuestion("Who is known as the father of computing?: ", 
				"""
				1. Joe Biden
				2. Steve Jobs
				3. Bill Gates
				4. John Skibidi
				5. Alan Turing
				6. Charles Babbing
				"""
			);
		question5.getOptions().put(1, false);
		question5.getOptions().put(2, false);
		question5.getOptions().put(3, false);
		question5.getOptions().put(4, false);
		question5.getOptions().put(5, false);
		question5.getOptions().put(6, true);
		questions.add(question5);
		
		QuizQuestion question6 = new QuizQuestion("What was the first commercially available programming language?: ", 
				"""
				1. COBOL
				2. C
				3. Assembly
				4. Fortran
				"""
			);
		question6.getOptions().put(1, false);
		question6.getOptions().put(2, false);
		question6.getOptions().put(3, false);
		question6.getOptions().put(4, true);
		questions.add(question6);
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
				System.out.println("That's not a number, silly! \n");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage() + "\n");
			} finally {
				scanner.nextLine(); // flush input buffer
			}
		}
		
		// Adjust the score based on the value in the options map!
		// System.out.println( question.getOptions().get(userChoice) );
		score += (question.getOptions().get(userChoice) == true) ? 1 : 0; 
	}
	
	// Procedure to validate that a given integer is one of
	// a given QuizQuestion's options keys. 
	private static void validateChoice(int num, QuizQuestion question) {
		if (question.getOptions().containsKey(num) == false) {
			throw new IllegalArgumentException("This number is not a valid option. ");
		}
	}
}
