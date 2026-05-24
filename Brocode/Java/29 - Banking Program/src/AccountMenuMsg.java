
// Class that acts as a collective "callback" function
// (callback funcs don't exist in Java b/c theres no pointers)
public class AccountMenuMsg implements Message{
	// Procedure to display the menu page
	public void displayInputPrompt() {
		System.out.print("""
				
				************************
				1. Show Balance
				2. Deposit
				3. Withdrawl
				4. Return to Main Menu
				************************
				Enter your choice (1-4): """);
		System.out.print(" "); // Spaces don't work after the initial message for some reason 
	}
	
	// Procedures to display generic error messages!
	public void notANumber() {
		System.out.println("That's not a number, silly!");
	}
	public void invalidNumber() {
		System.out.println("Please choose a correct number!");

	}
}
