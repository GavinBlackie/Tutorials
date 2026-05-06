import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		
		// Weight Conversion Program!!!!
		
		// Declare vars
		Scanner scanner = new Scanner(System.in);
		double weight = 0.0, newWeight = 0.0;
		int choice = 0;
		String newWeightUnits = "";
		
		// Welcome msg
		System.out.println("Weight Conversion Program!\n");
		
		do {
			System.out.println("1 - Convert lbs to kgs ");
			System.out.println("2 - Convert kgs to lbs ");
			System.out.print("\nChoose an option: ");
			try {
				choice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("That's not a number - try again!\n");
				scanner.next(); // flush input buffer
			}
		} while (choice != 1 && choice != 2);
		
		// prompt user for choice
		System.out.print("Enter the numeric weight (lbs or kgs): ");
		
		// Try to get a numeric weight, preemptively close the program otherwise!!!
		try {
			weight = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Thats not a proper weight number, silly! ");
			scanner.close();
			return;
		}
		
		switch (choice) {
			case 1: // option 1 - convert lbs to kgs
				newWeight = weight / 2.205;
				newWeightUnits = "kgs";
				break;
			case 2: // option 2 - convert kgs to lbs
				newWeight = weight * 2.205;
				newWeightUnits = "lbs";
				break;
			default:
				System.out.println("Unexpected choice!!! :( ");
				scanner.close();
				return;
		}
		
		// Display answer to the user!!! :)
		System.out.printf("The new weight is about: %.2f %s", newWeight, newWeightUnits);
		
		// Close scanner!!!
		scanner.close();
	}
}
