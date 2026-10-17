
public class Main {
	public static void main(String[] args) {
		
		// insertion sort = after comparing elements to the left,
		//					shift elements to the right to make room
		//					to insert a value
		//
		//		"Shift already 'sorted' values to right if they are
		//	     greater than the temporary value"
		//
		//
		//	Runtime Complexity: O(n^2)
		//
		//	BUT: Less steps than bubble sort
		//	Best case is O(n), it actually scales
		
		//  0  1  2  3  4  5  6  7  8 		temp
		// [6, 1, 7, 4, 2, 9, 8, 5, 3]		  1
		//  X							 "Is 6 > 1? Then shift right"
		
		//  0  1  2  3  4  5  6  7  8 		temp
		// [1, 6, 7, 4, 2, 9, 8, 5, 3]		  7
		//     X							"Is 6 > 7? if so, is 1 > 7?"
		
		//  0  1  2  3  4  5  6  7  8 		temp
		// [1, 6, 7, 4, 2, 9, 8, 5, 3]		  4
		//     	  X					    "Is 7 > 4? Yes. Is 6 > 4? Yes"
	
		// [1, 6, 7, _, 2, 9, 8, 5, 3]   temp = 4
		// [1, 6, _, 7, 2, 9, 8, 5, 3]   temp = 4
		// [1, _, 6, 7, 2, 9, 8, 5, 3] 	 temp = 4
		// [1, 4, 6, 7, 2, 9, 8, 5, 3]
		//           X
		
		// *Keep Going*
		
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]    temp = 5
		// 	Sorted!!!!		             I  
		
		// 7 > 2? 6 > 2? 4 > 2? false
		// 7 > 9? False
		// 9 > 8? 7 > 8? False
		// 9 > 5? 8 > 5? 7 > 5? 6 > 5? 4 > 5? False
		// 9 > 3? 8 > 3? 7 > 3? 6 > 3? 5 > 3? 4 > 3? 2 > 3? False
		
		long start = 0, end = 0, diff = 0;
		
		start = System.nanoTime();
		int[] array = {9, 7, 3, 2, 1, 8, 5, 6, 4};
		
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		insertionSort(array);
		//insertionSortBroCode(array);
		
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		end = System.nanoTime();
		diff = end - start;
		System.out.println("Nanosecs: " + diff);
		
		start = System.nanoTime();
		int[] array2 = {6, 1, 7, 4, 2, 9, 8, 5, 3};
		for (int i : array2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//insertionSort(array);
		insertionSortBroCode(array2);
		
		for (int i : array2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		end = System.nanoTime();
		diff = end - start;
		System.out.println("Nanosecs: " + diff);
	}
	
	private static void insertionSort(int[] array) {
		
		// My "blind" implementation without any help
		// other than just learning the algorithm:
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j >= 1; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}
	
	private static void insertionSortBroCode(int[] array) {
		
		// Brocode's version of Insertion Sort
		for (int i = 0; i < array.length; i++) {
			int temp = array[i]; // save on "i"
			int j = i - 1; // look backwards once
			
			// Loop while you can still look left with j,
			// and the j value is still larger than temp
			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp; // always swap temp to j + 1
			// (this won't logically do anything if j had no decrement)
		}
	}
}
