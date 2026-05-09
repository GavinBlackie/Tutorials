import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Temperature Conversion Program
		// Just like previous ones I did in C++, Python!
		// Will convert temperature between Celsius and Fahrenheit
	
		// Follow my 3 step function making process that I learned !!!
		// Declare, Validate, Act
		
		// 1. Declare and obtain relevant variables
		Scanner scanner = new Scanner(System.in);
		double temp = 0.0;
		double newTemp = 0.0;
		int choice = 0;
		
		// 2. Validate variables (and obtain them if dynamic validation req)
		
		// Get a valid choice
		do {
			try {
				System.out.println("1 - Farhrenheit to Celcius");
				System.out.println("2 - Celcius to Farhrenheit");
				System.out.print("Enter a choice: ");
				choice = scanner.nextInt();
				System.out.println();
			} catch (InputMismatchException e) {
				System.out.println("That's not a valid number, silly! Try again. ");
				scanner.next(); // flush buffer
			}
		} while (choice != 1 && choice != 2);
		
		final char startUnit = (choice == 1) ? 'F' : 'C';
		final char endUnit = (choice == 1) ? 'C' : 'F';
		
		// Get a valid temperature number!!!
		System.out.printf("Enter the temperature (°%c): ", startUnit );

		boolean isPromptingTemp = true;
		// Continue prompting until a valid double is given by the user
		while (isPromptingTemp) {
			try {
				temp = scanner.nextDouble();
				isPromptingTemp = false;
			} catch (InputMismatchException e) {
				System.out.println("That's not a valid float number! Try again.");
			}
		}
		
		// 3. Act - apply the correct conversion formula
		
		switch (choice) {
			case 1: // fahrenheit to Celsius
				newTemp = (temp - 32) / 1.8;
				break;
			case 2: // Celsius to Fahrenheit
				newTemp = temp * 1.8 + 32;
				break;
		}
		
		// Display new temperature to the user!!!
		System.out.printf("The new temperature is about: %.2f°%c", newTemp, endUnit);
		// Side note: did you know 0176 is how you get 
		//			  the ° symbol on windows :0
		
		
		scanner.close();
	}
}
