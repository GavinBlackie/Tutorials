import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.LinkedList;
public class Main {
	public static void main(String[] args) {
		
		// Priority Queue => A queue that serves highest priority elements first
		// 
		//					 Is a FIFO data structure, but order is maintained
		//					 by priority values
		
		// Example: Student GPAs in a queue
		
		// Remember: Queues in java are not instantiable!
		// Queue<Double> queue = new Queue<>();
		Queue<Double> queue = new LinkedList<>();
		
//		queue.offer(3.0);
//		queue.offer(2.5);
//		queue.offer(3.9);
//		queue.offer(1.6);
//		queue.offer(2.9);
//		queue.offer(3.3);
//		queue.offer(3.1);
//		queue.offer(3.0);
		Double[] gpas = {3.0, 2.5, 3.9, 1.6, 2.9, 3.3, 3.1, 3.0};
		offerTestCases(queue, gpas);
		
		// While the queue is not empty, dequeue it (poll it)
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println("\n********************\n");

		// Create a new priority queue, specify how priority is given
		// 
		// (Actual implementations of this could vary. You could also techincally
		//  outsource it and make the user specify "priority values", but that is not
		//  the intended/expected way. Algorithms working on the queue, especially sorting
		//  ones are how this is intended to work)
		Queue<Double> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		offerTestCases(priorityQueue, gpas);
		
		// One-line while loop :0 bananananana batman
		while (!priorityQueue.isEmpty()) System.out.println(priorityQueue.poll());
	}
	
	// Messing around with generics here for fun :)))))
	static <T> void offerTestCases(Queue<T> queue, T[] items) {
		for (int iItem = 0; iItem < items.length; iItem++) 
			queue.offer(items[iItem]);
	}
}
