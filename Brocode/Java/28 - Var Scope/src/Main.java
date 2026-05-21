
public class Main {
	
	// "Global Variable"
	static int x = 8;
	
	public static void main(String[] args) {
		
		// Variable Scope => Where a variable can be accessed
		
		// Scope => the relative block {}
		
		// Variable => a reference to a dedicated block of memory,
		//			   a named container that stores some data
		
		// Local Scope, Global Scope !!!!
		
		int x = 1; // Local var
		
		System.out.println(x); // prints 1
		
		epicCoolSpongebobMethod(x); // prints 4
		
		System.out.println(x); // prints 1
		
		jazzyPatrickMethod(); // prints 8, the global x var
		
		//krustyKrabMethod();
	}
	
	static void epicCoolSpongebobMethod(int x) {
		x+=3;
		System.out.println(x);
	}
	
	static void jazzyPatrickMethod() {
		System.out.println(x);
	}
	
	// Causes a java lang error (not compilable since y doesn't exist
	// in ANY scope !!!! :0 )
//	static void krustyKrabMethod() {
//		System.out.println(y);
//	}
}
