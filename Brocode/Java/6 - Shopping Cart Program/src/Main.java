import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// ----- Shopping Cart Program!!! -----
		
		Scanner scanner = new Scanner(System.in);
		
		String item = "";
		double price = 0.0;
		int quantity = 0;
		char currency = '$';
		double total = 0.0;
		
		boolean isPrompting = true;
		
		System.out.print("What item would you like to buy?: ");
		item = scanner.nextLine();
		
		while (isPrompting) {
			try {
				System.out.print("What is the price for each item?: ");
				price = scanner.nextDouble();
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("That's not a valid price, try again. ");
			}
		}
		isPrompting = true; // prepare for next input!!
		
		while (isPrompting) {
			try {
				System.out.print("How many items are you buying?: ");
				quantity = scanner.nextInt();
				if (quantity < 1) { // simple error check (could def be improved)
					System.out.println("You can't have zero or negative quantity, silly! ");
				} else {
					isPrompting = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("That's not a valid number, please try again. ");
			}
		}
		
		System.out.print("Please enter the currency: ");
		currency = scanner.next().charAt(0);
		
		total = price * quantity;
		
		//System.out.printf("%s %.2f %d %c %.2f", item, price, quantity, currency, total);
		
		// Printing the output to the user!!!
		System.out.println();
		System.out.printf("You are buying: %s\n", item);
		System.out.printf("Each of these costs: %c%.2f\n", currency, price);
		System.out.printf("With a quantity of %d\n", quantity);
		System.out.printf("The currency is in: %c\n", currency);
		System.out.printf("Your total cost: %c%.2f\n", currency, total);
		total *= 1.3; // taxes!! :(
		System.out.printf("Your total cost plus tax: %c%.2f!\n", currency, total);
		scanner.close();
	}
}
