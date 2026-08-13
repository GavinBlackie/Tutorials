import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
public class Main {
	public static void main(String[] args) {
		
		/* LinkedList = A non-contguous data structure where
		 * (singly)		 data is stored in nodes that also point
		 * 				 to the next logical node in the list.
		 * 
		 * Pros:
		 * 	- Fast insertion (only really have to change pointers)
		 *  - Fast deletion (don't have to worry about
		 *  				 reallocating contiguous memory blocks)
		 *  - Efficient memory usage
		 *    (no reallocations occur)
		 * Cons: 
		 * 	- Poor random access memory
		 *    (must start searching from head, O(n) time)
		 *  - Greater memory usage than Dynamic Arrays
		 * 
		 * "head-to-tail"
		 * 
		 * 						Singly Linked List
		 * 		Node				Node				Node
		 * [data | address] -> [data | address] -> [data | address]
		 */
		/* LinkedList = A non-contiguous data structure where
		 * (doubly)	    data is stored in nodes, and each node
		 *				points to what is both ahead of it as well
		 *				as behind it.
		 * Pros:
		 *  - Can traverse both forwards and backwards
		 * Cons:
		 *  - Costs more memory compared to a singly LL
		 *  
		 * 						Doubly Linked List
		 * 			  Node							 Node
		 * [address | data | address] <-> [address | data | address]
		 */
		
		// note: Java's LinkedList is doubly implemented!!
		//
		//	  It also can be treated like a Stack or a Queue
		//
		//	  Stack methods return special values, while
		//	  Queue methods will raise exceptions
		LinkedList<String> grades = new LinkedList<>();
		
		// add => adds a new node to the end of the list
		grades.add("A+");
		grades.addLast("B-"); // same thing
		System.out.println(grades);
		
		// Messing around with other stuff to try out the .addAll method!!
		String[] otherGrades = {"B", "F", "D-", "D+", "C-", "A-"};
		try {
			ArrayList<String> myList = new ArrayList<String>(Arrays.asList(otherGrades));
			//ArrayList<String> myArrList= (ArrayList<String>) myList;
			grades.addAll(myList);
		} catch (ClassCastException e) {
			System.out.println(e);
		} finally {
			System.out.println(grades);
		}
		
		// addFirst => adds an element to be the new head
		grades.addFirst("DNF");
		
		// An iterator object operating on a LinkedList
		Iterator<String> iterator = grades.iterator();
		while (iterator.hasNext() == true)
			System.out.println(iterator.next());
		
		// push => pushes value to the end, will raise exceptions (LIFO)
		//		   (exact same as calling .addFirst )
		grades.push("A-");
		grades.push("F");
		System.out.println(grades);
		
		// pop => removes/returns the last element (LIFO)
		grades.pop();
		System.out.println(grades);
		
		// remove => removes an element at an index, raises
		//			 IndexOutOfBoundsExceptions though
		grades.remove(5);
		
		// Example of when the .pop method raises an exception
		try {
			LinkedList<Integer> test = new LinkedList<>();
			test.pop();
		} catch (NoSuchElementException e) {
			System.out.println("Tried to pop when no elements were in a list");
		}
		
		grades.add(3, "F-");
		System.out.println(grades);
		
		LinkedList<Character> letters = new LinkedList<>();
		letters.push('B');
		letters.addFirst('A');
		letters.add(0, 'A');
		letters.offer('D');
		System.out.println();
		
		
		// "poll" => retrieve and remove first element
		// "pop"  => retrieve and remove last element
		// "offer" => add to start of a "lineup"
		
		// The 12 Deque Methods LLs can use:
//							First Element (Head)	Last Element (Tail)
//					Throws exception	Special value	Throws exception	Special value
//		Insert		addFirst(e)			offerFirst(e)		addLast(e)	   	offerLast(e)
//		Remove		removeFirst()		pollFirst()			removeLast()	pollLast()
//		Examine		getFirst()			peekFirst()			getLast()		peekLast()
	
	// Uses of LinkedLists:
	// 1. Implementing Stacks/Queues
	// 2. GPS navigation (represents all the key stops or intersections)
	// 3. Music playlist (swift adding/deleting of songs, a playlist usually
	//					  traverses by a "curr" pointer)
	
	}
}
