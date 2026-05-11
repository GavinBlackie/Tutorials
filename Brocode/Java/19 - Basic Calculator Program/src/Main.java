import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		
		// Basic Calc Program -> given some numbers and an operation,
		//						 this program will display the answer
		//						 back to the user!!! :) 
		
		Scanner scanner = new Scanner(System.in);
		
		// I still like having default values (is good practice :) )!!!
		double num1 = 0.0, num2 = 0.0;
		char operator = '+';
		double result = 0.0;
		boolean isPrompting = true;
		
		// 1. Get the first num
		while (isPrompting) {
			try {
				System.out.print("Enter the first number: ");
				num1 = scanner.nextDouble();
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("Thats not a valid number silly! ");
				scanner.next(); // flush the input buffer!!!
			}
		}
		isPrompting = true;
		
		// 2. Get the second number
		while (isPrompting) {
			try {
				System.out.print("Enter the second number: ");
				num2 = scanner.nextDouble();
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("Thats not a valid number silly! ");
				scanner.next(); // flush the input buffer!!!
			}
		}
		isPrompting = true;
		
		// 3. Get the operator from the user !
		while (isPrompting) {
			try {
				System.out.print("Enter the operator: ");
				operator = scanner.next().charAt(0); // remember: stringName[0] does not work in java!!!
				
				// Try to also calculate the result!
				result = validateAndDoOperation(operator, num1, num2);
						
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("Thats not a valid operator silly! ");
				scanner.next(); // flush the input buffer!!!
			}
		}
		isPrompting = true;
	
		
		// 4. Display the answer to the user!
		System.out.printf("The answer is about: %.2f", result);
		
		scanner.close();
	}
	
	private static double validateAndDoOperation(char op, double num1, double num2) {
		switch (op) {
			case '+' : return num1 + num2;
			case '-' : return num1 - num2;
			case '*' : return num1 * num2;
			case '/' : return num1 / num2;
			case '%' : return num1 % num2;
			case '^' : return Math.pow(num1, num2);
			default :
				// Self note: throw keyword instead of raise (thats the one for python)
				throw new InputMismatchException("That's an unexpected operator type!");
		}
	}
}
