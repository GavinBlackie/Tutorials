import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * A scanner is an object that accepts user input
		 * 
		 * - It is located in the utilities package, hence
		 * 	 it needs an import!
		 * 
		 * - It works on file streams, must specify "stdin",
		 * 	 or System.in
		 * 
		 * - nextline directly returns strings
		 * 
		 * - MUST close the scanner!!!
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		//^ next() doesn't read spaces, nextLine() does
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt(10);
		
		System.out.print("What is your gpa?: ");
		float gpa = scanner.nextFloat();
		
		System.out.print("What is your favourite character?: ");
		char favChar = scanner.next().charAt(0);
		
		System.out.print("Are you a student? (true/false): ");
		boolean isStudent = scanner.nextBoolean();
		
		System.out.println("\nYour name is ".concat(name));
		System.out.println("You are ".concat(Integer.toString(age)));
		
		if (gpa > 3.0) {
			System.out.println("Your grades are good!!");
		} else if (gpa > 2.0) {
			System.out.println("Keep at it!");
		} else {
			System.out.println("You need to study more. ");
		}
		
		System.out.println("Your favourite character is: " + favChar);
		
		if (isStudent) {
			System.out.println("You are a student!");
		}
		
		// To flush the input buffer, do this:
		scanner.nextLine();
		// ^ helps with a string after a numeric input
		// 	 (eg. \n is still in the buffer)
		
		scanner.close();
	}
}
