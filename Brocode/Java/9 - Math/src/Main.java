import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		
		// Math.PI, Math.E
		//
		// pow, abs, sqrt, round, ceil, floor, max, min
		
		System.out.println("π: ".concat(Double.toString(Math.PI)));
		System.out.println("e: " + Math.E);
		
		double result;
		
		result = Math.pow(2, 3);
		
		System.out.println("Result: ".concat(Double.toString(result)));
	
		result = Math.abs(-5);
		System.out.println("Result: " + result);
		
		result = Math.sqrt(9);
		System.out.println("Result: " + result);
		
		result = Math.round(Math.PI);
		System.out.println("Result: " + result);
		
		result = Math.ceil(Math.PI);
		System.out.println("Result: " + result);
		
		result = Math.floor(Math.PI);
		System.out.println("Result: " + result);
		
		result = Math.max(9, 5);
		System.out.println("Result: " + result);
		
		result = Math.min(543543, 548478);
		System.out.println("Result: " + result);
		
		
		// Pythagorean Theorem: c^2 = a^2 + b^2 for any right tri
		System.out.println("\n************\n");
		
		Scanner scanner = new Scanner(System.in);
		
		double a = 0.0, b = 0.0, c =0.0;
		
		boolean isPrompting = true;
		
		System.out.print("Enter the a: ");
		while (isPrompting) {
			try {
				a = scanner.nextDouble();
				isPrompting = false;
			} catch (InputMismatchException ex) {
				System.out.print("Invalid input, re-enter a: ");
				scanner.nextLine(); // Flush buffer
			}
		}
		
		
		isPrompting = true;
		
		System.out.print("Enter the b: ");
		while (isPrompting) {
			try {
				b = scanner.nextDouble();
				isPrompting = false;
			} catch (InputMismatchException ex) {
				System.out.print("Invalid input, re-enter b: ");
				scanner.nextLine(); // Flush buffer
			}
		}
		
		c = Math.sqrt( (Math.pow(a, 2) + Math.pow(b, 2)) );
		
		System.out.println("The hypotenuse is: " + c + " cm");
		
		scanner.close();
	}
}
