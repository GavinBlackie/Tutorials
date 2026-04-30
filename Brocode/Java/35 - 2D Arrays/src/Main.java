
public class Main {
	public static void main(String[] args) {
		
		// 2D array = An array where each element is an array
		// 			  (Java uses Jagged Arrays for multi-dim)
		// 		      2D arrays are useful for matrices
		
		String[] fruits = {"apple", "orange", "banana", "peach", "tomato"};
		String[] vegtables = {"carrot", "potato", "onion", "parsnip", "lettuce"};
		String[] meats = {"chicken", "pork", "beef", "fish"};
		
		String[] spongebobPeople = {"Spongebob", "Patrick", "Squidward", "Mr. Krabs"};
		String[] genres = {"High Fantasy", "Sci-Fi", "Horror"};
		
		displayContents(fruits);
		displayContents(vegtables);
		displayContents(meats);
		displayContents(spongebobPeople);
		displayContents(genres);
		
		System.out.println("\n---------\n");
		
		// Groceries - a 2D array (array of arrays!)
		String[][] groceries = {fruits, vegtables, meats};
		
		// Side note: this has n*m time complexity, or about n^2 asymptotic time
		// (n rows by m cols, they are not necessarily the same size all the time)
		for (String[] foods : groceries) {
			for (String food : foods) {
				System.out.print(food + " ");
			}
			System.out.println();
		}
		
		// "Row-by-Col"!!!!
		System.out.println( "\n\n" + groceries[0][1] );
	
		groceries[2][2] = "steak";
		System.out.println( "\n\n" + groceries[2][2] );
		
		
		numPadPractice();
	}
	
	// Displays contents of a string array
	private static void displayContents(String[] strArr) {
		for (int iStrArr = 0; iStrArr < strArr.length; iStrArr++) {
			System.out.print(strArr[iStrArr] + " ");
		}
		System.out.println();
	}
	
	private static void numPadPractice() {
		System.out.println();
		
		char[][] telephone = {	{'1', '2', '3'}, 
								{'4', '5', '6'},
								{'7', '8', '9'},
								{'*', '0', '#'}
							 };
		
		for (char[] row : telephone) {
			for (char option : row) {
				System.out.print(option + " ");
			}
			System.out.println();
		}
		
	}
}
