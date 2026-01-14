import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Arithmetic operators in Java!
		
		int x = 10;
		int y = 7;
		int z;
		
		z = x + y;
		
		System.out.println("Z: " + Integer.toString(z));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n********\n");
		
		double a = 0, b = 0, result = 0;
		String operator = "";
		
		System.out.print("Enter the first #: ");
		a = scanner.nextDouble();
		System.out.print("Enter the second #: ");
		b = scanner.nextDouble();
		
		System.out.print("Enter the operator: ");
		operator = scanner.next();
		
		switch (operator) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			case "%":
				result = a % b; // Find the remainder!
				break;
			default:
				System.out.println("Invalid operator. ");
				break;
		}
		
		System.out.println("The result is: " + result);
		
		scanner.close();
		
		
		// Augmented Assignment Operators
		
		int m = 1;
		
		System.out.println("m = " + m);
		m += 7;
		System.out.println("m = " + m);
	
		// NOTE: no "//" for int division, it is
		//		 just implicit or implied
		System.out.println("m = " + m);
		m /= 3;
		System.out.println("m = " + m);
		
		long p = 354;
		System.out.println("p = " + p);
		p *= 28;
		System.out.println("p = " + p);
	}
}
