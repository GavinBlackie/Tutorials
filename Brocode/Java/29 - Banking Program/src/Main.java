import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Bank Program!
		// Will allow the user to make deposits and withdrawls
		// to accounts in the Bank through various choice menus!
		// Will have input validation!
		//
		// Will program the whole thing by myself before watching
		// the video tutorial as practice! :)
		Scanner scanner = new Scanner(System.in);
		
		displayMenu();
		int userChoice = scanner.nextInt();
		
		scanner.close();
	}
	
	// Procedure to display the menu page
	static void displayMenu() {
		System.out.print("""
				************************
				MR. KRAB's BANK PROGRAM
				By: Gavin
				************************
				1. Show Balance
				2. Deposit
				3. Withdrawl
				4. Exit
				************************
				Enter your choice (1-4):""");
	}
}
