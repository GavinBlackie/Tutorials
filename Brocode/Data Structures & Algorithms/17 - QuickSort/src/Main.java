
public class Main {
	public static void main(String[] args) {
		
		// Quick Sort = a recursive sorting algorithm
		//				Sorts IN-PLACE
		//
		//	Time Complexity = Best Case O( n log(n))
		//					  Average Case O( n log(n))
		//					  Worst Case O(n^2) if already sorted!!!
		// 
		//	"pick a pivot", typically at the end
		//
		// i    j				  pivot
		// 	[8, 4, 3, 5, 9, 1, 2, 6, 7]
		//									// is A[j] < pivot?,
		//									// then i++ and swap
		//									// i and j elements
		//			temp = 4
		//   i  j				  pivot
		//	[4, 8, 3, 5, 9, 1, 2, 6, 7]
		//   i     j			  pivot
		//	[4, 8, 3, 5, 9, 1, 2, 6, 7]  is A[J] < pivot?, then i++
		//      i  j			  pivot
		//	[4, 3, 8, 5, 9, 1, 2, 6, 7]  is A[J] < pivot? YES
		// 		temp = 3
		//         i  j		  	   pivot
		//	[4, 3, 5, 8, 9, 1, 2, 6, 7]  is A[J] < pivot? NO
		// 		temp = 5
		//         i  	 j	  	   pivot
		//	[4, 3, 5, 8, 9, 1, 2, 6, 7]  is A[J] < pivot? YES
		// 		temp = 5
		//            i  	j  	   pivot
		//	[4, 3, 5, 1, 9, 8, 2, 6, 7]  is A[J] < pivot? YES
		// 		temp = 1
		//            	 i	   j  	pivot
		//	[4, 3, 5, 1, 9, 8, 2, 6, 7] is A[J] < pivot? YES
		// 		temp = 2
		//            	    i	  j	pivot
		//	[4, 3, 5, 1, 2, 6, 9, 8, 7]  is A[J] < pivot? YES
		// 		temp = 6
		//            	 	   i     j==pivot
		//	[4, 3, 5, 1, 2, 6, 7, 8, 9]     new pivot = i+1
		// 		temp = 6					swap i val with pivot val
		//            	      pivot	      	j==pivot
		//	[4, 3, 5, 1, 2, 6, 7, 8, 9]       new pivot = i+1
		//
		// "Elements to left should be less than, elements to right
		//	should be greater than"
		//
		//  Create two partitions
		//  [4, 3, 5, 1, 2, 6]		[8, 9]
		//	Then call quickSort on partitions
		//      i  j       pivot
		//	[4, 5, 3, 1, 2, 6]
		//         i  j   pivot
		//	[4, 5, 1, 3, 2, 6]
		//            i  j  pivot
		//	[4, 5, 1, 2, 3, 6]
		//               i   j==pivot
		//	[4, 5, 1, 2, 6, 3]
		//				pivot
		//	[4, 5, 1, 2, 3, 6]   i and pivot values swap
		// 	[4, 5, 1, 2, 3]   [6]
		//      i  j     pivot
		//	[4, 1, 5, 2, 3]
		//         i  j  pivot
		//	[4, 1, 2, 5, 3]
		//            i   j==pivot
		//	[4, 1, 2, 5, 3]
		//  [4, 1, 2, 3, 5]
		//   j
		//  [4, 1, 2, 3]     [5]
		//	 i  j     pivot
		//  [1, 4, 2, 3]
		//	    i  j  pivot
		//  [1, 2, 4, 3]
		//	       i  j==pivot
		//  [1, 2, 3, 4]
		
		// Back recursively...
		// [1, 2, 3, 4] + [5]
		// Back recursively...
		// [1, 2, 3, 4, 5] + [6]
		// Back recursively...
		// [1, 2, 3, 4, 5, 6] + [7, 8, 9]
		
		// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		//
		// Note that some pivots were included in reconstruction,
		// but they could have been separated
		// (like [1, 2, 3] + [4] + [5])
		
		int[] array = {8, 4, 3, 5, 9, 1, 2, 6, 7};
		
		for (int n : array)
			System.out.print(n + ", ");
		System.out.println();
		
		quickSort(array, 0, array.length - 1);
		
		for (int n : array)
			System.out.print(n + ", ");
		System.out.println();
	}
	
	// We use start and end for memory efficiency??
	private static void quickSort(int[] array, int start, int end) {
		
		// Base case (stop when we can't subdivide further)
		if (end <= start) return;
		
		// find out where pivot is going to be after going through it
		int pivot = partition(array, start, end);
		
		// Sort the left side
		quickSort(array, start, pivot - 1);
		// Sort the right side
		quickSort(array, pivot + 1, end);
		
	}
	
	private static int partition(int[] array, int start, int end) {
		
		// We'll just use the end index as pivot always
		int pivot = array[end];
		
		// Implement the repetitive algorithm from before
		int i = start - 1;
		int j = 0;
		for (j = start; j <= end-1; j++) {
			if (array[j] < pivot) {
				i++;
				// Swap
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		// Now we have reached the end,
		i++;
		// Swap i with pivot (remember: pivot = array[end])
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		return i;
	}
}
