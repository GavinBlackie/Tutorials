
public class DynamicArray {

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
	
	public void add(Object elem) {
		
		if (size >= capacity) {
			grow();
		}
		array[size++] = elem; // increase size afterwards
	}
	
	public void insert(int index, Object elem) {
		if (size >= capacity) {
			grow();
		}
		// Shift all elements on the right side of the
		// given index to the right
		// [A, B, C, null] index=1 => [A, A, B, C]
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = elem; // [X, A, B, C, D]
		size++;
	}
	
	public void delete(Object data) {
		
		for (int i = 0; i < size; i++) {
			// if we find the index to delete,
			if (array[i] == data) {
				// Shift everything right of the deletion spot
				// to the left
				for (int j = 0; j < (size - i - 1); j++) {
					// copy element from the right side
					// to the left side [i+j, <= i+j+1]
					array[i + j] = array[i + j + 1];
				}
				array[size - 1] = null; // remove duplicate
				size--;
				
				// Shrink if needed
				if (size <= (int)(capacity / 3) ) {
					shrink();
				}
				break;
			}
		}
	}
	public void delete(int index) {
		
		for (int i = index; i < (size-1); i++) {
			array[i] = array[i+1];
		}
		array[size - 1] = null;
		size--;
	}
	
	public int search(Object elem) {
		
		for (int i = 0; i < size; i++) {
			if (array[i] == elem) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public String toString() {
		String string = "";
		
		for(int iElem = 0; iElem < size; iElem++)
			string += array[iElem] + ", ";
		if (string != "")
			string = "[" + 
						string.substring(0, string.length() - 2)
					  + "]";
		else
			string = "[]";
		
		return string;
	}
	public String toStringWithCapacity() {
		String string = "";
		
		for(int iElem = 0; iElem < capacity; iElem++) {
			string += array[iElem] + ", ";
		}
		if (string != "")
			string = "[" + 
						string.substring(0, string.length() - 2)
					  + "]";
		else
			string = "[]";
		
		return string;
	}
	
	private void grow() {
		int newCapacity = (int)(capacity * 2);
		Object[] tempArray = new Object[newCapacity];
		
		// Copy existing elements into temp array
		for (int iElem = 0; iElem < size; iElem++)
			tempArray[iElem] = array[iElem];
		
		// Save changes
		capacity = newCapacity;
		array = tempArray;
	}
	
	private void shrink() {
		int newCapacity = (int)(capacity / 2);
		Object[] tempArray = new Object[newCapacity];
		
		// Copy existing elements into temp array
		for (int iElem = 0; iElem < size; iElem++)
			tempArray[iElem] = array[iElem];
		
		// Save changes
		capacity = newCapacity;
		array = tempArray;
	}
	
}
