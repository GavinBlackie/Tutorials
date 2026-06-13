import java.util.Queue;
import java.util.LinkedList;
public class Main {
	public static void main(String[] args) {
		// "Objective: Create an array of custom questions, 
		//			  and a 2D array of all the different options
		//			  to the questions! "
		//			  The quiz will be in a MCQ format! :0
		//
		// Self-challenge: Use OOP and more complex Data Structures
		//                 instead of just arrays!
		
		Queue<QuizQuestion> questions = new LinkedList<QuizQuestion>();
		loadQuestions(questions);
		
		System.out.println();
		// Initialize variables
		
		// Prompt all the questions
		
		// Display score (and maybe answers?)
		
	}
	
	// Procedure to load the questions!
	private static void loadQuestions(Queue<QuizQuestion> questions) {
		QuizQuestion test = new QuizQuestion("Which of the following is not a Minecraft mob?: ");
		test.getOptions().put(new Option(1, "pig"), false);
		test.getOptions().put(new Option(2, "cow"), false);
		test.getOptions().put(new Option(3, "zebra"), true);
		test.getOptions().put(new Option(4, "bee"), false);
		
		questions.offer(test);
	}
}
