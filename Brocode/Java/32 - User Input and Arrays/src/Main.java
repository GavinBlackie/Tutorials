import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Will be similar to getting input like before,
		// but the objective is to fill up an entire array
		// of the same data type with user input!!!
		
		// An array with initial values:
		// String[] foods = {"pizza", "taco", "hamburger"};
		
		String[] foods = new String[3];
		foods[0] = "pizza";
		// Will print the null values as well!!!
		for (String food : foods) System.out.println(food);
		System.out.println(foods.length);
		
		System.out.println("\n--------\n");
		
		Scanner scanner = new Scanner(System.in);
		// I'm going to use languages as my own example
		// (like either human or computer languages)
		String[] languages;
		
		System.out.print("How many languages will you input?: ");
		int numLans = scanner.nextInt();
		
		languages = new String[numLans];
		
		for (int iLan = 0; iLan < languages.length; iLan++) {
			System.out.print("Enter a language: ");
			languages[iLan] = scanner.nextLine();
		}
		
		System.out.println("\nThe languages recieved: ");
		for (String lan : languages) {
			System.out.println(lan);
		}
		
		// side/self note: this is very similar/important
		// 				   process for languages like C and C++!
		
		scanner.close();
	}
}
