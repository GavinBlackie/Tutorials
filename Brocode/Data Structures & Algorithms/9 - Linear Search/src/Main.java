import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		
		// linear search = method of iteration, one element at a time
		//
		//		runtime complexity: O(n)
		//
		//		Disadvantages:
		//		Slow for large data sets
		//		Limited applicability, only suitable
		//		for sequential structures
		//		Doesn't take advantage of sorted data
		
		//		Advantages:
		//		Fast for small to medium dataset searching
		//		Does not need to be sorted
		//		Useful for data structures that don't
		//		have random access (eg. a LinkedList)
		
		int[] array = {7, 3, 4, 5, 6, 2, 1};
		for (int n : array)
			System.out.print(n + ", ");
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value to search for: ");
		int value = 0;
		try {
			value = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("That is not a valid number");
			scanner.close();
			return;
		}
		int index = linearSearch(array, value);
		
		if (index > -1)
			System.out.println("The index of " + value + " is: " + index);
		else
			System.out.println("No index could be found for " + value + ". ");
		
		scanner.close();
	}
	private static int linearSearch(int[] array, int value) {
		
		for (int iArr = 0; iArr < array.length; iArr++) {
			if (array[iArr] == value)
				return iArr;
		}
		return -1;
	}
}
