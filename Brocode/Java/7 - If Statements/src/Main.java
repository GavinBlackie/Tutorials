
public class Main {
	public static void main(String[] args) {
		
		// If statement => performs a block of code if
		//				   its condition is true
		//
		// 		- Operate on boolean variables
		//		- Can use various operators && || !
		//	    - Same syntax as C/C++
		// 		- Also have "one-liner" varients, but not
		//		  quite like those in Python/C# with the
		//	      no curly braces
		//      - Always be aware of the order that your 
		//		  if statements evaluate (sometimes areas can
		//		  be unreachable/not make sense)
		
		int age = 45;
		if (age >= 18) {
			System.out.println("You are an adult! ");
			System.out.println("You can drink in Quebec. ");
			if (age >= 19) {
				System.out.println("You can drink anywhere else. ");
				if (age >= 21) System.out.println("You can drink in a corrupt doodoo place");
			}
		}
		else if (age > 0) {
			System.out.println("You are a child");
		}
		else if (age == 0) {
			System.out.println("You are a newborn baby");
		}
		else {
			System.out.println("You haven't been born yet");
		}
	}
}
