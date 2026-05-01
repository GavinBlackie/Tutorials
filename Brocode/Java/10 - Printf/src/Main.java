import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// printf = a method used to format output,
		//			similar to its counterpart in C
		
		// Its an alternative to println and print!
		
		// %[flags][width][.precision][specifier-character]
		
		
		// %s %c %d %f %b
		// + , ( space
		
		// ---- Precision ----
		
		double price1 = 56.5565, price2 = -7.9954, price3 = 600000.5023;
		
		// Doing precision (note that it rounds, but the variable is unchanged)!
		System.out.printf("%.4f\n", price1);
		System.out.printf("%+.2f\n", price2); // + means include sign
		System.out.printf("%,.1f\n", price3); // , comma means include commas for thousands, millions, etc.
		
		System.out.printf("%(.2f\n", price2); // ( means negatives are enclosed in brackets
		
		System.out.printf("% .2f\n", price1); // space means show negative sign if applicable, a space otherwise!
		System.out.printf("% .2f\n", price2);
		System.out.printf("% ,.2f\n", price3); // You can also double up!
		
		System.out.println();
		
		// ---- Widths ----
		int[] ids = {0, 332, 2543, 45435, 7, 9};
		
		// 0 = zero padding
		// number = right justified padding
		// negative num = left justified padding
		
		System.out.printf("%-4d\n", ids[0]);
		System.out.printf("%-4d\n", ids[1]);
		System.out.printf("%-4d\n", ids[2]);
		System.out.printf("%-4d\n", ids[3]);
		
		System.out.println("\n");
		
		// ---- Formated Prints -----
		
		// Using scanner because I feel like it (for practice)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.next();
		
		char firstLetter = name.charAt(0);
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		System.out.print("Enter your height: ");
		double height = scanner.nextDouble();
		
		System.out.print("Are you employed?: ");
		boolean isEmployed = scanner.nextBoolean();
		
		
		System.out.printf("\nHello, %s.\n", name);
		System.out.printf("Your first name starts with a '%c'.\n", firstLetter);
		System.out.printf("You are %d years old.\n", age);
		System.out.printf("You height is: %.2f inches\n", height);
		System.out.printf("Employed: %b\n", isEmployed);
		
		// Many variables prints!
		System.out.printf("%s is %d years old!!!", name, age);
		
		
		scanner.close();
	}
}
