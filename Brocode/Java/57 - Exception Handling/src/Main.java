import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	private static Scanner scanner;
	public static void main(String[] args) {
		
		// Exception = An event that interrupts the normal flow of a program
		//	     (Divide by 0, file not found, input mismatch, cast errors)
		//           Typically surround dangerous code with a try{} block
		// 	     try{}, catch{}, finally{}
		//
		//  	     Catches work in buckets. 
		//	     DO NOT have more generic exception catches
		//	     at the top of the try-catch chain.
		//	     "Catch specific scenarios first"
		//
		// Syntax Errors, Logical Errors, and RUNTIME ERRORS!!
		//
		// (Have seen so far: InputMismatchException, ArithmeticException,
		//					  IllegalArgumentException)
		// System.out.println(1 / 0);
		scanner = new Scanner(System.in);
		int x = 0, y = 0;
		boolean isPrompting = true;
		
		// I was taught that this was good practice :))
		final String X_PROMPT = "Enter the first number: ";
		final String Y_PROMPT = "Enter the second number: ";
		
		x = extractIntInput(X_PROMPT);
		y = extractIntInput(Y_PROMPT);
		
		try {
			double result = x / y;
			System.out.println("x ÷ y = " + result);
		} catch (ArithmeticException e) {
			System.out.println("An error occured when dividng x by y :( ");
		}
		scanner.close();
		
		System.out.println("\n*******************************\n");
		
		// this doesn't have any loops!
		// But it does show that you can catch multiple times!
		try {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			System.out.println("You entered: " + number);
			System.out.println(50 / number);
		} catch (InputMismatchException e) {
			System.out.println("That was not a number!!! :(");
		} catch (ArithmeticException e) {
			System.out.println("You can't divide by 0, silly!");
		} catch (Exception e) {
			System.out.println("Something went wrong!");
		} finally { // Always executes!!
			scanner.close();
			System.out.println("This always executes!!");
		}
	}
	
	// Function to get an integer input from the user!
	private static int extractIntInput(String promptMsg) {
		boolean isPrompting = true;
		int temp = 0;
		while (isPrompting) {
			System.out.print(promptMsg);
			try {
				temp = scanner.nextInt();
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("That's not a number! Try again. ");
				scanner.nextLine(); // flush
			}
		}
		return temp;
	}
}
