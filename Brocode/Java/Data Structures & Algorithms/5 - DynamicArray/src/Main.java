import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		
		// Pre-builtin dynamic array, the ArrayList
		ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
		
		// Using our DynamicArray
		DynamicArray dynamicArray1 = new DynamicArray();
		
		dynamicArray1.add(7);
		dynamicArray1.add(63);
		dynamicArray1.add(91);
		System.out.println(dynamicArray1.toString());
		System.out.println(dynamicArray1.capacity);
		System.out.println("Empty?: " + dynamicArray1.isEmpty());
		
		
		System.out.println("\n**************\n");
			
		DynamicArray dynamicArray2 = new DynamicArray(5);
		
		System.out.println(dynamicArray2.toString());
		System.out.println(dynamicArray2.capacity);
		System.out.println("Empty?: " + dynamicArray2.isEmpty());
	}
}
