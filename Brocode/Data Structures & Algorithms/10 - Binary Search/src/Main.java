import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Binary Search = search method that finds position of
		//				   a target value inside a sorted array
		//
		//		Half of the array is eliminated in each "step"
		//
		//		is target > or < index value?
		//
		//		Target: D   index: F      D < F
		//		[A, B, C, D, E, F, G, H, I, J, K]
		//
		//		Target: D   index: C
		//		[A, B, C, D, E, F]        D > C
		//
		//		Target: D   index: E	  D < E
		//		[D, E, F]
		//
		//		Target: D 	index: D
		//		[D]
		//
		// *Inefficient with small data sets, but
		//	really efficient with large data sets (1 million)
		//
		//    O(log(n))
		
		int[] array = new int[1000000];
		// Populate array:
		for (int i = 0; i < array.length; i++)
			array[i] = i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the target num to search for: ");
		int target = 0;
		try {
			target = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Not a valid number");
			scanner.close();
			return;
		}
		
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		// Using builtin static method
		int index = Arrays.binarySearch(array, target);
		if (index == -1)
			System.out.println(target + " not found");
		else
			System.out.println("Element found at: " + index);
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Elapsed Time: " + elapsedTime);
		
		
		startTime = System.nanoTime();
		
		index = binarySearch(array, target);
		if (index == -1)
			System.out.println(target + " not found");
		else
			System.out.println("Element found at: " + index);
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		System.out.println("Elapsed Time: " + elapsedTime);
		
		scanner.close();
	}
	
	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length;
		
		int totalSteps = 0;
		
		// When the lower index and higher index are the
		// same, we have found the target
		while (low <= high) {
			// must add low after-the-fact so offsets in the
			// "greater than" range can be accounted for
			int middle = low + ( (high - low) / 2);
			
			int value = array[middle];
			
			
			System.out.println("middle val: " + value);
			totalSteps++;
//			for (int iView = low; iView < high; iView++) {
//				System.out.print(array[iView] + ", ");
//			}
//			System.out.println();
			
			
			// Case that target is greater than
			if (value < target)
				low = middle + 1;
			// Case that target is less than the middle
			else if (value > target)
				high = middle - 1;
			// Case that they are equal
			else {
				System.out.println("Total Steps: " + totalSteps);
				return middle; // middle index is index of target
			}
		}
		System.out.println("Total Steps: " + totalSteps);
		return -1; // case that target could not be found
	}
}
