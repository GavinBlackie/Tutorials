
public class Main {
	public static void main(String[] args) {
		
		// Nested If => if statement inside another one!
		//				Just refers to structure of conditions.
		
		// Note that its recommended to have only 1 if statement
		// whenever possible, but sometimes advanced nested
		// structures are required (according to my professors)
		
		
		// Unrelated note: java.lang.Error compilation error occurs
		// when you don't initialize a boolean but reference it!
		boolean isStudent = false;
		boolean isSenior = true;
		boolean isCorruptPolitician = true;
		double price = 19.99;
		
		
		// This code can be made better, but its just for demo purposes!
		if (isStudent) {
			if (isSenior) { // They are a senior student
				System.out.println("You get a senior discount of 20%. ");
				System.out.println("You get a student discount of 25%. ");
				price *= 0.55;
			}
			else { // They are just a student
				System.out.println("You get a student discount of 25%. ");
				price *= 0.75;
			}
		}
		
		// Always remember order of else ifs matter!!!
		else if (isCorruptPolitician) {
			System.out.println("You are a corrupt politician, you pay nothing. ");
			price *= 0; 
			
			if (isSenior) {
				System.out.println("You are senile. ");
			}
			
		}
		// Note: you can simplify nested ifs into else ifs!
		else if (isSenior) {
			System.out.println("You get a senior discount of 20%. ");
			price *= 0.8;
		}
		else { // No discount
			System.out.println("You don't get any discount. ");
			price *= 1;
		}
		
		System.out.printf("The price of a ticket is: $%.2f", price);
	}
}
