// import all of java's utils!!!
import java.util.*;

public class Main {
	public static void main(String[] args) {
		// Priority Queue = A FIFO data structure that serves elements
		//					with the highest priorities first
		//					before elements with lower priority
		//
		// Can pass a comparator for priority evaluation
		
		// Remember: Queue is an interface in Java!!!
		Queue<Double> gpas = new PriorityQueue<>(Collections.reverseOrder());
		//java.util.Queue<String> aa;
		
		gpas.offer(3.5);
		gpas.offer(2.6);
		gpas.offer(3.9);
		gpas.offer(3.1);
		
		// Notice: this polls/prints in numerically ascending order!!
		// 			Can also be in different orders depending on comparator
		while (!gpas.isEmpty()) {
			System.out.println(gpas.poll());
		}
		
		System.out.println("\n***************\n");
		
		Queue<String> quizGrades = new PriorityQueue<>(Collections.reverseOrder());
		quizGrades.offer("A");
		quizGrades.offer("B");
		quizGrades.offer("C");
		quizGrades.offer("D");
		
		System.out.println(quizGrades);
		
		while (!quizGrades.isEmpty()) {
			System.out.println(quizGrades.poll());
		}
	}
}
