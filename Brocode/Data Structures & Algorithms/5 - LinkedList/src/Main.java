import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		/*
		 * LinkedList(Singly) = A linear collection that pairs data with an 
		 * 						address that points to the next item.
		 * 
		 * 			Stores things in nodes (data + addresses).
		 * 			Nodes are non-consecutive (not contiguous) in mem.
		 * 
		 * 
		 * Really good at efficient insertion/deletion unlike arrays,
		 * but are poor in random accessing and have high memory use.
		 * 
		 * ^ Linear insertion time of O(1), but O(n) average search time
		 * 
		 * Doubly linked lists can be accessed from head-to-tail and from
		 * tail-to-head, but take up even more memory.
		 * 
		 * Can treat as a Stack, Queue, or Dequeue as well in Java!
		 */
		
		LinkedList<String> grades = new LinkedList<String>();
		
		// Push and Pop can raise exceptions!
		// (mimic a Stack, LIFO)
		grades.push("A");
		grades.push("B");
		grades.push("C");
		grades.push("D");
		grades.push("F");
		grades.pop();
		
		System.out.print("Stack: ");
		System.out.println(grades);
		grades.clear();
		
		// Can use offer and poll for no exceptions
		// (mimic a Queue, FIFO)
		grades.offer("A");
		grades.offer("B");
		grades.offer("C");
		grades.offer("D");
		grades.offer("F");
		grades.poll();
		
		System.out.print("Queue: ");
		System.out.println(grades);

		
		// Using add & remove, unique to LinkedList
		grades.add(4, "E");
		System.out.println(grades);
		System.out.println("Index of F: ".concat(Integer.toString(grades.indexOf("F")) )  );
	
		// Peeking at items
		System.out.println("\nThe first item: " + grades.peekFirst());
		System.out.println("The Last item: " + grades.peekLast());
	
		// add/removeFirst or Last are Dequeue implemented features
		
		
		/*
		 * Advantages:
		 * 1. Dynamic Data Structure (allocates as-you-go)
		 * 2. Insertion & Deletion is Efficient, O(1)
		 * 3. No/Low memory waste
		 * 
		 * Disadvantages:
		 * 1. Greater memory usage (no pointers in arrays)
		 * 2. No random access
		 * 3. Accessing/searching elements is time consuming, O(n)
		 * 
		 * Uses:
		 * 1. Implementing Stacks/Queues yourself
		 * 2. GPS navigation
		 * 3. Music playlist (certain song order)
		 */
	}
}
