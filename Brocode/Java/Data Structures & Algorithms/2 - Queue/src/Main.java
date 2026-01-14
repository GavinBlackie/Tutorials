import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Queues!!!");
		
		/*
		 *  Queue = FIFO data structure. (First in is the First Out)
		 *  		A collection designed for holding elements prior
		 *  		to processing them.
		 *  		
		 *  		Is a linear data structure.
		 *  
		 *  		Ex: A cashier lineup with Chad, Karen, Spongebob, etc.
		 *	
		 *			add 	= enqueue, offer(better, no exceptions)
		 *			remove 	= dequeue, poll(better, no exceptions)
		 */
		
		// Queue is an interface in Java!!!
		// We must use a linked list
		Queue<String> queue = new LinkedList<String>();
		
		// Enqueue
		queue.offer("Karen");
		System.out.println(queue);
		
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Spongebob");
		queue.offer("Karl");
		
		System.out.println(queue);

		
		queue.poll(); // Remove Karen
		queue.poll(); // Remove Chad
		System.out.println(queue);
		
		queue.offer("Bob");
		
		// Can also use peek!! (STL specifies these!!!)
		System.out.println("The first element is: " + queue.peek());
	
	
		// Is my queue empty??
		System.out.print("IsEmpty?: ");
		System.out.println(queue.isEmpty());
		
		// Do we have a Bob??
		System.out.print("Harold, are you there?: ");
		System.out.println(queue.contains("Bob"));
		
		
		// Where are queues useful?
		
		// 1. Keyboard Buffers
		// 2. Priority Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first searches
		
		// Remember: Breadth-First means to look at each directory layer at a time
	}
}