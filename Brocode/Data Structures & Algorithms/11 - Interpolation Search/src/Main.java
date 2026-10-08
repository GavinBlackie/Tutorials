import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// interpolation search = improvement for binary search, used for "uniformly"
		//						  distributed "guesses" where a value might be based on
		//						  calculated probe results
		//						  if a probe is incorrect, search area is narrowed,
		//					      and a new probe is created
		//
		//		average case: 	Θ( log(log(n) ))
		//		worst case: 	O(n) [values increase exponentially]
		//
		//	*Requires a sorted array for best case scenario*
		//	The more close the data is to one another, the more efficient
		//	the search algorithm will be
		
		// "a best case scenario"
		int[] bestArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		// Will cause more probes, the data is exponential and therefore
		// will be more like O(n)
		// "a worst case scenario"
		int[] worseArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value to find index of: ");
		int value = scanner.nextInt();
		
		int index = interpolationSearch(worseArray, value);
		
		if (index != -1) {
			System.out.println("Element found at index: " + index);
		}
		else {
			System.out.println("Value does not exist in array. ");
		}
		scanner.close();
	}
	
	private static int interpolationSearch(int[] array, int value) {
		
		int low = 0;
		int high = array.length - 1;
		
		while (value >= array[low] && value <= array[high] && low <= high) {
			
			// "A complex formula"
			int probe = low + (high - low) * (value - array[low]) / 
						(array[high] - array[low]);
			// ^ ex: 0 + (9-0)x(8-1)/(9-1) = (9 x 7) / 8 = 63/8 = 7.875
			//		
			//			=> floor() => 7  (the index of 8)
			
			System.out.println("probe: " + probe);
			
			// If correct, return the probe index
			if (array[probe] == value) {
				return probe;
			} 
			else if (array[probe] < value) {
				low = probe + 1;
			}
			else {
				high = probe - 1;
			}
		}
		
		return -1;
	}
}