
public class Main {
	public static void main(String[] args) {
		
		// Bubble Sort = A sorting algorithm that repeatedly
		//				 compares and swaps two elements if not in
		//			     order until no sorts occur in a given pass
		//
		//	Another def = "pairs of adjacent elements are compared,
		//				   and the elements are swapped if they are
		//				   not in order"	
		//
		//	Runs in O(n^2) time
		//
		//	Small Data set => okay-ish
		//	Large Data set => BAD
		//
		//
		//	My own example practice:
		//	[3, 7, 2, 9, 4, 1, 6]
		//	 ^						(compare 3 and 7, 3 < 7)
		//  [3, 7, 2, 9, 4, 1, 6]
		//		^   				(compare 7 and 2, 7 > 2 so swap)
		// 	[3, 2, 7, 9, 4, 1, 6]
		//	 	   ^
		//	[3, 2, 7, 9, 4, 1, 6]
		//	 	   	  ^
		//	[3, 2, 7, 4, 9, 1, 6]
		//	 	   	  	 ^
		//	[3, 2, 7, 4, 1, 9, 6]
		//	 	   	  	 	^
		//  [3, 2, 7, 4, 1, 6, 9]
		//	 	   	  	 	   ^ (pass ended)
		// 	[2, 3, 7, 4, 1, 6, 9]
		// 	[2, 3, 7, 4, 1, 6, 9]
		// 	[2, 3, 4, 7, 1, 6, 9]
		// 	[2, 3, 4, 1, 7, 6, 9]
		//	[2, 3, 4, 1, 6, 7, 9] Note: 7 and 9 are now in place!!
		//  [2, 3, 4, 1, 6, 7, 9]
		//	[2, 3, 4, 1, 6, 7, 9]
		//	[2, 3, 1, 4, 6, 7, 9]
		//	[2, 3, 1, 4, 6, 7, 9]   // pass will end
		//	[2, 3, 1, 4, 6, 7, 9]
		//	[2, 3, 1, 4, 6, 7, 9]
		//	[2, 1, 3, 4, 6, 7, 9]   // pass will end
		//	[2, 1, 3, 4, 6, 7, 9]
		//	[1, 2, 3, 4, 6, 7, 9]
		//   ^
		//		This final one is now sorted 
		//	    (will pass through without a swap)
		
		int[] array = {3, 7, 2, 9, 4, 1, 6};
		
		for (int iNum = 0; iNum < array.length; iNum++) {
			System.out.print(array[iNum] + ", ");
		}
		System.out.println();
		
		bubbleSort(array);
		
		for (int iNum = 0; iNum < array.length; iNum++) {
			System.out.print(array[iNum] + ", ");
		}
		System.out.println();
	}
	
	public static void bubbleSort(int[] array) {
		
		for (int iArr = 0; iArr < array.length - 1; iArr++) {
			for (int jArr = 0; jArr < array.length - iArr - 1; jArr++) {
				
				// If the left side is greater than the right, swap!
				if (array[jArr] > array[jArr + 1]) {
					int temp = array[jArr];
					array[jArr] = array[jArr + 1];
					array[jArr + 1] = temp;
				}
			}
		}
	}
}
