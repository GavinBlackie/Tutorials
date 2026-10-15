
public class Main {
	public static void main(String[] args) {
		
		// Selection sort = an in-place sorting algo that keeps track
		//				    of the min value of each iteration.
		//					It then just swaps variables as it goes along.
		
		//  0  1  2  3  4  5  6			min   temp
		// [9, 3, 5, 1, 4, 8, 7]		 1		9
		// [1, 3, 5, 9, 4, 8, 7]
		//  X
		// [1, 3, 5, 9, 4, 8, 7]		 3		3
		//     X
		// [1, 3, 5, 9, 4, 8, 7]		 4		5
		//     	  X
		// [1, 3, 4, 9, 5, 8, 7]		 5		9
		//     	     X
		// [1, 3, 4, 5, 9, 8, 7]		 7		9
		//     	        X
		// [1, 3, 4, 5, 7, 8, 9]		 _		_
		//     	           X	      
		// [1, 3, 4, 5, 7, 8, 9]		 _		_
		//     	              X	
		//		*Finished*
		//
		//	"Like sorting cards in your deck"
		//
		//	Runtime Complexity: O(n^2)
		//			small data set = okay
		//			large data set = bad
		
		int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		
		for (int iArr : array) {
			System.out.print(iArr + ", ");
		}
		System.out.println();
		
		selectionSort(array);
		
		for (int iArr : array) {
			System.out.print(iArr + ", ");
		}
		System.out.println();
		
		int array2[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		for (int iArr : array2) {
			System.out.print(iArr + ", ");
		}
		System.out.println();
		
		selectionSortDesc(array2);
		
		for (int iArr : array2) {
			System.out.print(iArr + ", ");
		}
		System.out.println();
	}
	
	private static void selectionSort(int[] array) {
		
		// Iterate once for each index
		// Each iteration represents one successful sort in the array
		for (int iSort = 0; iSort < array.length - 1; iSort++) {
			
			int min = iSort;
			// Try to find an alternative "j" minimum
			// Make sure its not the same index
			// (otherwise it will duplicate)
			for (int j = iSort + 1; j < array.length; j++) {
				
				if (array[min] > array[j])
					min = j;
			}
			
			// Perform a swap
			int temp = array[iSort];
			array[iSort] = array[min];
			array[min] = temp;
			
		}
		
	}
	private static void selectionSortDesc(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[max] < array[j])
					max = j;
			}
			int temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
	}
}
