import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// ArrayList => A resizable array that stores objects (autoboxing primitives)
		//              The Java equivalent of the std::vector in C++
		//              Arrays are fixed in size, but ArrayLists and Vectors can change dynamically
		
		ArrayList<Integer> nums = new ArrayList<Integer>(); // <> is related to "generics"
		
		nums.add(3);
		nums.add(1);
		nums.add(6);
		nums.add(8);
		nums.add(-7);

		System.out.println(nums); // Array Lists can easily be printed!
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Coconut");
		fruits.add("Pear");
		fruits.add("Peach");

		System.out.println(fruits);

		fruits.remove(0); // will delete element at index 0 (Apple)
		System.out.println(fruits);
		fruits.remove(0); // will delete element at index 0 (Mango)
		System.out.println(fruits);
		
		fruits.set(0, "Pineapple"); // updates an existing index!!
		System.out.println(fruits);
		
		System.out.println(fruits.get(1)); // will give "Coconut"

		Collections.sort(fruits);
		System.out.println(fruits); // sorts alphabetically!!
		
		// You can also iterate through them (for data processing)
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("\n**********************\n");
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<String>();
		
		System.out.print("Enter the # of food to store: ");
		int numFood;
		try {
			numFood = scanner.nextInt();
			scanner.nextLine(); // flush
		}
		catch (InputMismatchException e) {
			System.out.println("That's not a number!!");
			scanner.close();
			return;
		}
		
		// Obtain each food entry and store it in the list!
		for (int iFood = 0; iFood < numFood; iFood++) {
			System.out.print("Enter food #" + iFood + ": ");
			String food = scanner.nextLine();
			foods.add(food);
		}
		
		// Print the foods out to the user!!
		System.out.println(foods);
		
		scanner.close();
	}
}
