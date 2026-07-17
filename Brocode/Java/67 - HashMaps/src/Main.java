import java.util.HashMap;
public class Main {
	public static void main(String[] args) {
		
		// HashMap = A data structure that stores key-value pairs
		//			 Keys are unique, but Values can be duplicates
		//			 Does not maintain any linear order, but is memory efficient
		//			
		//			 Relies on Hash functions to transform keys into the
		//			 memory addresses of the value they contain. Some keys can
		//			 potentially conflict, so different strategies are employed to
		//			 negate conflicts.
		//			 Such methods are known as: Linear Probing, Quadratic Probing,
		//									    and Double Hashing
		//			
		//		- Double hashing involves using a second hash function to determine a memory address
		//
		//		https://www.geeksforgeeks.org/dsa/open-addressing-collision-handling-technique-in-hashing/
		//
		//		Side note: hash theory is not needed to know how to
		//					use a HashMap!!
		//
		//	Syntax: HashMap<Key, Value>
		
		// A classic example I like using is a simple yes-no string
		// to boolean value converter map! :)
		HashMap<String, Boolean> yesNo = new HashMap<>();
		yesNo.put("yes", true);
		yesNo.put("y", true);
		yesNo.put("no", false);
		yesNo.put("n", false);
		
		print(yesNo.keySet());
		
		System.out.print("[");
		for (String key : yesNo.keySet()) {
			System.out.print(yesNo.get(key) + ", ");
		}
		System.out.print("\b\b]\n");
		// ^ this is redundant, can just use yesNo.values() and print it
		
		printDivider();
		
		// Example: a map of product names-to-prices
		HashMap<String, Double> map = new HashMap<>();
		map.put("apple", 0.50);
		map.put("toilet paper", 6.50);
		map.put("banana", 0.25);
		map.put("orange", 0.65);
		map.put("pizza", 14.99);
		
		// Can technically print out the whole map,
		// will appear similar to a JSON format
		System.out.println(map);
		
		// If you put a duplicate key, it updates the value
		// to the new value instead of throwing an error
		map.put("orange", 10000000000.00);
		System.out.println(map);
		map.put("orange", 0.80);
		
		map.remove("toilet paper");
		System.out.println(map.keySet());
		
		// Get a value:
		System.out.printf("\nApple Price: $%.2f\n", map.get("apple"));
		
		// Could use this to validate before accessing, or
		// perhaps throwing a custom error
		if (map.containsKey("pineapple")) {
			System.out.println(map.get("pineapple"));
		} else {
			System.out.println("Key not found");
		}
		
		
		System.out.printf("Banana Exists?: %b\n", map.containsKey("banana"));
		System.out.printf("Toilet Paper Exists?: %b\n", map.containsKey("toilet paper"));
	
		System.out.printf("Item worth 50c?: %b\n", map.containsValue(0.50)); 
	
		
		System.out.println("Map Size: " + map.size());
	
		// Processing an entire HashMap:
		// (adding taxes to each price!)
		for (String key : map.keySet()) {
			double d = map.get(key);
			System.out.printf("%s with tax is: $%.2f\n", key, d * 1.13);
		}
		
	}
	
	// A cursed print function made with a generic parameter
	static<T> void print(T t) {
		System.out.println(t.toString());
	}
	
	static void printDivider() {
		System.out.println("\n*******************\n");
	}
}
