import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Generics => A concept where you can write a class, interface or method
		//   		   that is compatible with different data types.
		//			   "The ability to generalize parameters and fields so that many
		//  		    different data types can be used for the same functionality" - Me
		//
		//				<T> type parameter (placeholder dynamically replaced with the real type)
		//				<String> type argument (specifies the type)
		//
		// <String>  <Boolean>  <Integer>
		//
		// Side note: this is an example of Parametric Polymorphism!!!
		
		
		// Eg. ArrayLists specify which "version" of them to use with <>, but
		//     logically inside the ArrayList code everything is the same
		//     There is no difference really between ArrayList<Integer> and ArrayList<String>
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("pear");
		fruits.add("banana");
		fruits.add("peach");
		System.out.println(fruits);
			
		ArrayList<Boolean> yesNo = new ArrayList<>();
		yesNo.add(true);
		yesNo.add(true);
		yesNo.add(false);
		System.out.println(yesNo);
		
		System.out.println("\n***********************\n");

		Box<Character> box = new Box<>();
		box.setItem('€');
		System.out.println(box.getItem());
		
		Box<String[]> box2 = new Box<>();
		String[] stuff = {"chair", "table", "patrick", "squidward"};
		box2.setItem(stuff);
		
		System.out.print('[');
		for (String str : box2.getItem()) {
			System.out.print(str + ", ");
		}
		System.out.println("\b\b]");
		
		
		System.out.println("\n***********************\n");

		Product<String, Double, Character> product = new Product<>("Frying Pan", 29.99, '$');
		
		System.out.println(product.toString());
		
		Product<String, Float, String> product2 = new Product<>("Shampoo", 4.99f, "CAD");
		System.out.println(product2);
		
		Product<String, Integer, Character> product3 = new Product<>("Ticket", 5, '€');
		System.out.println(product3);
		
		System.out.println("\n***********************\n");
		
		int x = 256;
		displayType(x);
		char c = '%';
		displayType(c);
		short s = 32767; // shorts are 2 bytes each!
		displayType(s);
		
		System.out.println(Short.BYTES);
		System.out.println(Short.SIZE);
		
		scanner.close();
	}
	
	// A generic function/method without class generic fields!!!
	static <T> void displayType(T item) {
		System.out.println(item.getClass().getSimpleName() + ": " + item.toString());
	}
}
