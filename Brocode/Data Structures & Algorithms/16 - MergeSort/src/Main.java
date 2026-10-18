
public class Main {
	public static void main(String[] args) {
		
		// merge sort = is a divide and conquer sorting algorithm
		//
		//	Recursively divide array in 2, sort and re-combine (merge)
		//
		//	It recursively divides portions of a list into
		//  sub lists, and sorts base cases and slowly reassembles
		//
		//	Process of merging and sorting!
		//
		//			(3, 7, 8, 5, 4, 2, 6, 1)
		//		(3, 7, 8, 5)				*same process on other side*
		//  (3, 7)		(5, 8) swapped!
		//
		//  (3)  (7)	(8, 5)
		//
		// (1, 2, 3, 4, 5, 6, 7, 8)
		//
		// Time complexity: O(n log n) = quasilinear time
		//
		// Space Complexity: O(n) = linear space
		//					  |-> worse than bubble, selection, 
		//						  insertion sort
		
		int[] array = {8, 6, 3, 1, 7, 9, 5, 4, 2};
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		mergeSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
	
	private static void mergeSort(int[] array) {
		
		int length = array.length;
		
		if (length <= 1) return; // base case
		// "no longer a need to divide further if length is 1"
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle]; //accounts for odd divisions of array
		
		int i = 0; // for left array
		int j = 0; // for right array
		
		// Copy elements into left and right arrays
		for (; i < length; i++) {
			if (i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		
		// Sort left, right, then merge them together
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
		
	}
	// Helper method for mergeSort
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;
		
		// check conditions for merging
		// While there are still elements in the left and right arrays,
		// keep adding them in-order to the original array
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		
		// Address the "one left"
		while (l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}
}
