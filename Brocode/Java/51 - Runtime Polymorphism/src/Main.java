import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Runtime Polymorphism => When the method that gets executed
		//						   is decided at runtime based on the
		//						   actual type of the object.
		//
		//		Also known as "Dynamic Polymorphism". 
		//
		//     Occurs when the actual object does definitively
		//     exist at runtime (eg. COULD be a cat or dog).
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		String userInput = "";
		boolean isPrompting = true;
		while (isPrompting) {
			System.out.print("Would you like a cat or a dog?: ");
			userInput = scanner.nextLine().toLowerCase();
			if ( 	userInput.equals("dog")
				|| 	userInput.equals("cat") ) {
				isPrompting = false;
			}
			else {
				System.out.println("That was not a cat or a dog! :( ");
			}
		}
		
		switch(userInput) {
			case "cat": 
				animal = new Cat(); 
				break;
			default:
				System.out.println("Defaulting to dog...");
			case "dog":
				animal = new Dog();
		}
		
		animal.speak(); // Call the method!
			// This is the part that dynamically changes
			// at runtime based on the user's choices!
			// The compiler has no way of knowing
			// that the Animal will be a dog or a cat here,
			// so it leaves it up to the runtime to call the
			// right method.
		
		scanner.close();
	}
}
