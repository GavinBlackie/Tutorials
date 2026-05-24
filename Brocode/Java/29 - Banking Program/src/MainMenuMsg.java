
public class MainMenuMsg implements Message{
	// Procedure to display the menu page
	public void displayInputPrompt() {
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
				Enter your choice (1-4):  """);
	}
	
	// Procedures to display generic error messages!
	public void notANumber() {
		System.out.println("That's not a number, silly!\n");
	}
	public void invalidNumber() {
		System.out.println("Please choose a correct number!\n");

	}
}
