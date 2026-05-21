
public class Main {
	public static void main(String[] args) {
		
		// Overloaded Methods => methods that share the same name,
		//						 but with different parameters
		//						signature = name + parameters
		//
		// EACH method must have different sigatures for it to
		// be compilable code!!!
		// ^ will cause a java.lang.Error !!!!
		
		System.out.println("Calling Add: " + add(1, 2));
		System.out.println("Calling Add with 3 params: " + add(1, 2, 3));
		System.out.println("Calling Add with 4 params: " + add(1, 2, 3, 4));
	
		// Example - Making a Pizza
		String pizza = bakePizza("flat bread");
		
		System.out.println(pizza);
	
		pizza = bakePizza("flat bread", "mozzarella");
		System.out.println(pizza);
		
		pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
		System.out.println(pizza);
		
		pizza = bakePizza("thick bread", "mozzarella", "pineapple");
		System.out.println(pizza);
	
		boolean isCorrupt = and(true, false);
		System.out.println("Corruption level: " + ( (isCorrupt) ? "Present" : "Non Existent" ) );
		
		isCorrupt = and(true, true, true);
		System.out.println("Corruption level: " + ( (isCorrupt) ? "Present" : "Non Existent" ) );
		
	}
	// NOTE: there is another concept to reduce this type of
	//		 parameter repetition!!!!
	static double add(double a, double b) {
		return a + b;
	}
	static double add(double a, double b, double c) {
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}
	
	static String bakePizza(String bread) {
		return bread + " pizza";
	}
	static String bakePizza(String bread, String cheese) {
		return cheese + " " + bread + " pizza";
	}
	static String bakePizza(String bread, String cheese, String topping) {
		return topping + " " + cheese + " " + bread + " pizza";
	} 
	
	static boolean and(boolean a, boolean b) {
		return a && b;
	}
	static boolean and(boolean a, boolean b, boolean c) {
		return a && b && c; // side note: && is left-to-right associative (evaluates left to right)
	}
}
