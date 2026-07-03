import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		// Wrapper Classes => Allow primitive values (int, float, double, char, boolean)
		// 		      to be used as objects. "Wrap them in an object"
		//  		      Generally, don't wrap primitives unless you need an object.
		//		      Allows use of Collections Framework and static Utility Methods.
		//
		//  "Wrap basic things in a christmas present!!"
		//
		// *Use the capital variants of the primitive types (eg. Integer, Float, Boolean)

		// Deprecated stuff ("Autoboxxing" is modern one)		
		//int a = 123;
		Integer x = new Integer(123);
		Float y = new Float(3.14);
		Double e = new Double(2.72);
		// System.out.println(x); // Prints 123
		Character c = new Character('%');
		Boolean b = new Boolean(false);

		// ^ these are used for collections stuff
		//  eg. ArrayLists use it like:
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(x);
		for (int iCount = 0; iCount < 10; iCount++) {
			myList.add(iCount);
		}
		for (int iVec = 0; iVec < myList.size(); iVec++) {
			System.out.println(myList.get(iVec)); // java uses .get instead of C++ .at
		}
		
		System.out.println();

		// Modern way (Autoboxxing):
		Integer i = 5;
		Double d = 8.45;
		Boolean myBool = true;
		System.out.printf("%d, %f, %b\n", i, d, myBool);

		// Unboxing (back to a primitive):
		int wow = i;
		wow = 6;
		double unBoxD = d; // literally just assign it to the Wrapper class
		boolean isCool = myBool;
		System.out.printf("%d, %f, %b\n", wow, unBoxD, isCool);

		System.out.println(i);
		
		
		System.out.println("\n********************\n");
		
		// These Wrapper classes are used as utilities for
		// string conversion!!!!
		String l = Integer.toString(123);
		String m = Double.toString(unBoxD);
		String n = Boolean.toString(false);
		String o = Character.toString(c + 1); // can do Char math with chars
		char p = 61;
		
		System.out.printf("%s, %s, %s, %s, %c\n", l, m, n, o, p);
		
		String q = l + m + p + n + o;
		System.out.println(q);
		
		System.out.println("\n********************\n");

		convertingStrsToPrimitives();
		
		System.out.println("\n********************\n");
		miscellaneousStuff();
	}
	
	// Separate test function so I don't have naming conflicts with vars
	static void convertingStrsToPrimitives() {
		
		// Parse strings into primitive types!!!
		int a = Integer.parseInt("123");
		double b = Double.parseDouble("65.43");
		char c = "Banana".charAt(0); // chars don't have a parse method (b/c strings are made of them)
		boolean d = Boolean.parseBoolean("tRUe"); // capitals don't matter here
		
		System.out.printf("%d, %f, %c, %b\n", a, b, c, d);
		
		// NumberFormatExceptions are thrown if the string is invalid!!!
		try {
			int e = Integer.parseInt("2.78a");
		}
		catch (NumberFormatException e) {
			System.out.println("Could not convert str to int :(  \n" + e.getLocalizedMessage());
		}
	}
	
	static void miscellaneousStuff() {
		
		char letter = 'P';
		
		System.out.println(Character.isLetter(letter));
		System.out.println(Character.isDigit(letter));
		System.out.println(Character.isUpperCase(letter));
	}
}
