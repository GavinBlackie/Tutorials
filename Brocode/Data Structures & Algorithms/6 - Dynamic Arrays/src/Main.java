import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		// Dynamic Array = An resizable array, automatically allocates memory when needed
		//				   When element capacity is reached, the array is resized 
		//				   by allocating a new array and copying elems over
		//
		//		Searching and Iterating take O(n) time
		//		Random access takes O(1) time
		//		Insertion/deletion takes O(n) time due to potential reallocs
		//
		//		Typically stored contiguously, but can be abstracted
		//
		//	0  1  2  3  4  5  6
		// [A, B, C, D, E, n, n]    size: 5, capacity: 7
		//	*Add F*
		// [A, B, C, D, E, F, n]	size: 6, capacity: 7
		// 	*Add G*
		// [A, B, C, D, E, F, G]	size: 7, capacity: 7
		// *Add H*
		//	(Dynamic Array grows..., typically by 1.5 to 2 times)
		// [A, B, C, D, E, F, G, n, n, n, n, n, n, n]	size: 8, capacity: 14
		//
		//  0  1  2  3
		// [A, B, C, D]
		// *remove at index 0*
		// [n, B, C, D]
		// *memory shift, takes "n" time*
		// [B, C, D, n]
		
		// Java : ArrayList
		// C++ : Vector   (DNE in C)
		// JS : Array
		// Python : List
		
		// The builtin Dynamic array in Java
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		// Custom Dynamic Array class
		//DynamicArray dynamicArray = new DynamicArray(5);
		DynamicArray dynamicArray = new DynamicArray();
		System.out.println("Capacity: " + dynamicArray.capacity);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		
		dynamicArray.insert(0, "X");
		
		dynamicArray.delete("A");
		dynamicArray.delete(2);
		
		System.out.println(dynamicArray);
		System.out.println(dynamicArray.toStringWithCapacity());
		System.out.println("Size: " + dynamicArray.size);
		System.out.println("Capacity: " + dynamicArray.capacity);
		System.out.println("IsEmpty?: " + dynamicArray.isEmpty());
		
		System.out.println("Index of C: " + dynamicArray.search("C"));
		
		DynamicArray dynamicArray2 = new DynamicArray(2);
		System.out.println("\nDynamicArray2: " + dynamicArray2);
		System.out.println("Size: " + dynamicArray2.size);
		System.out.println("Capacity: " + dynamicArray2.capacity);
		
		System.out.println("\n*Adding elements...*");
		dynamicArray2.add("Z");
		dynamicArray2.add("Y");
		dynamicArray2.add("X");
		dynamicArray2.add("W");
		dynamicArray2.add("V");
		System.out.println("\nDynamicArray2: " + dynamicArray2);
		System.out.println("Size: " + dynamicArray2.size);
		System.out.println("Capacity: " + dynamicArray2.capacity);
		
		System.out.println("\n*Deleting elements...*");
		dynamicArray2.delete("Z");
		dynamicArray2.delete("Y");
		dynamicArray2.delete("X");
		System.out.println("\nDynamicArray2: " + dynamicArray2);
		System.out.println("Size: " + dynamicArray2.size);
		System.out.println("Capacity: " + dynamicArray2.capacity);		
	}
}
