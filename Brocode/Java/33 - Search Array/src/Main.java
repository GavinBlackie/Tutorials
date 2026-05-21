import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Searching an array typically takes O(n) time!!!
		// (will be O(log(n)) if doing a binary search)
		
		// Assuming that there are no duplicate numbers here!
		int[] nums = {1, 9, 2, 8, 5, 4, 11, 7, 10};
		int target = 10;
		boolean isFound = false;
		
		// A linear search, O(n)
		for (int iArr = 0; iArr < nums.length; iArr++) {
			if (target == nums[iArr]) {
				System.out.println("Element found at index: " + iArr);
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("Could not find the target :( ");
		}
		
		// Practice: Search an array of strings!!
		
		// Going to use some city names from one of my fav games :)
		String[] cities = {"Leuven", "Lesbere", "Galwe", "Vinica",
						   "Lille", "Forniron", "Elsinore", 
						   "Maccan", "Forde", "Arendal",
						   "Amarna", "Arish", "Krain"};
		String cityTarget = "Maccan";
		isFound = false;
		
		for (int iCity = 0; iCity < cities.length; iCity++) {
			System.out.println( cityTarget);
			System.out.println( cities[iCity] );
			if (cityTarget.equals(cities[iCity]) ) { // can also use .equals for a boolean return one
				System.out.println("City match found at index: " + iCity);
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println("Could not find that city :( ");
		}
		// note: NEVER use == when comparing strings, always
		//       use the .equals() function
		// while we can use .toLowerCase to ignore the case, 
		// the .equalsIgnoreCase function can be used instead
		// (do NOT USE compareTo or compareToIgnoreCase)
		
		// And remember that .compareTo returns the int number of char matches in the string!!!
		
		cityTarget = "aMaRnA";
		linearSearchStyled(cities, cityTarget, "City match at: ", "Could not find a city :( ");
		
		cityTarget = "elSINORE";
		linearSearchStyled(cities, cityTarget, "City match at: ", "Could not find a city :( ");
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the city to search for: ");
		cityTarget = scanner.nextLine();
		linearSearchStyled(cities, cityTarget, "City match at: ", "Could not find a city :( ");
	
		scanner.close();
	}
	
	// Generic procedure to linear search for a string in a string array!!!! :-)
	static void linearSearchStyled(String[] arr, String target, String successStr, String failStr) {
		boolean isFound = false;
		for (int iStr = 0; iStr < arr.length; iStr++) {
			if (target.equalsIgnoreCase(arr[iStr])) {
				System.out.println(successStr + " " + iStr);
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.out.println(failStr);
		}
	}
}
