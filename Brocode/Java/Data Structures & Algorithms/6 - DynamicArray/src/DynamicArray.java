
public class DynamicArray {
	
	/*
	 * "A dynamic array shall have a size representing used slots, 
	 * a capacity representing the total malloc'd space, and
	 * a static array representing the actual static array container."
	 */
	
	int size = 0;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() {
		this.array = new Object[capacity];
	}
	
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void add(Object data) {
		
		// If the size is greater than capacity, grow it
		if (size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;
	}
	
	public void insert(int index, Object data) {
		if (size >= capacity) {
			grow();
		}
		
		// Shift every element to the right for the insertion!
		for (int iArr = size; iArr > index; iArr--) {
			array[iArr] = array[iArr + 1];
		}
		array[index] = data; // Insert the new data!
	}
	
	public int search(Object data) {
		return -1;
	}
	
	private void grow() {
		
	}
	
	private void shrink() {
		
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String string = "";
		
		for (int iArr = 0; iArr < size-1; iArr++) {
			string += array[iArr] + ", ";
		}
		
		// Get rid of the ", "
		if (string != "") {
			string = "[" + string.substring(0, string.length()-2) + "]";
		} else {
			string = "[]";
		}
		
		return string;
	}
}
