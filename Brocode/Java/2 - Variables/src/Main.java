
public class Main {
	public static void main(String[] args) {
		// Similar to C/C++ !!!
		
		// Classes will be similar to C# though
		
		
		/* Primitive = data value stored in the stack memory
		 * 
		 * Reference = memory address in the stack that points
		 * 			   to a block of data in the heap
		 * 
		 * Primitive types:
		 * 	int
		 * 	double
		 * 	char
		 * 	boolean
		 * 
		 * Reference:
		 * 	String
		 * 	array
		 * 	object
		 * 
		 */
		
		int age = 32;
		int year = 2026;
		int quantity = 5;
		
		float gpa = 3.1f;
		double price = 19.99d;
		double temp = 12.5d;
		
		char grade = 'A';
		char symbol = '!';
		char currency = '$';
		
		String name = "Spongebob";
		String car = "Mustang";
		String email = "gary@bikinibottom.com";
		
		boolean isHappy = true;
		boolean isStudent = true;
		boolean isOnline = false;

		System.out.println("Horray!");
		System.out.print("\n");
		System.out.println("Hello, " + name);
		
		if (isStudent && gpa > 3.0f) {
			System.out.println("You're doing great!!!");
			if (grade == 'A') {
				System.out.println("Congrats on recent assignment");
			}
		} else {
			System.out.println("You need to study!!!");
		}
		
	}
}
