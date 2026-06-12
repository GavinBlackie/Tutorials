import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		// array => a collection of same type values,
		// 	        stored contiguously in memory, and
		//		    accessed by index :0 :)
		
		String fruits[] = {"orange", "pear", "apple", "peach",
						"banana", "coconut"
		};
		for (String fruit : fruits) { // a java "foreach" loop
			System.out.println(fruit);
		}
		
		System.out.println("\n----------\n");
		
		String carBrands[] = { "Mercedes", "Ford", "Tesla",
				"Mazda", "Chevy", "BMW", "Toyota", "Ferrari"
		};
		for (int iCar = 0; iCar < carBrands.length; iCar++) {
			System.out.println(carBrands[iCar]);
		}
		System.out.println("");
		
		// Arrays are Reference data types!!!!
		System.out.println(carBrands); // prints a memory address
	
		System.out.println(fruits[4]);
		try {
			System.out.println(fruits[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Whoops, that index is out of range!");
		}
	
		System.out.println("There are " + carBrands.length + " car brands. ");

		
		System.out.println("\n----------\n");
		for (int iCar = carBrands.length-1; iCar > 0; iCar--) {
			System.out.println(carBrands[iCar]);
		}
		System.out.println("\n----------\n");

		
		// Messing around with modulus to display twice!
		// Will be useful when dealing with array based hash tables!!! :0
		// 0, 1 % 8 => 1, 2 % 8 => 2, 3, 4, 5, 6, 7,
		// 8 % 8 = 0, 1, 2, 3, 4, 5, 6, 7
		for (int iCar = 0; iCar < carBrands.length * 2; iCar++) {
			System.out.println(carBrands[iCar % carBrands.length]);
		}
		System.out.println("\n----------\n");
		
		
		System.out.println("\n----------\n");
		
		System.out.println("Sorting the fruits! :0 ");
		Arrays.sort(fruits); // builtin sort method!!!
		
		for (int iFruit = 0; iFruit < fruits.length; iFruit++) {
			System.out.println(fruits[iFruit]);
		}
		System.out.println("\n----------\n");
		

		System.out.println("\n----------\n");
		
		System.out.println("Using the fill func: ");
		Arrays.fill(fruits, "pineapple"); // builtin fill method!!!
		
		for (int iFruit = 0; iFruit < fruits.length; iFruit++) {
			System.out.println(fruits[iFruit]);
		}
		System.out.println("\n----------\n");
		
		
	}
}
