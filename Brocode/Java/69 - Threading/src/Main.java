import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// Threading => Allows a program to run tasks simultaneously
		//				"A thread is a part of a process"
		//				Helps improve performance with time-consuming operations
		//				(FILE I/O, network communications, background tasks)
		//
		//			Only possible because of modern multi-core processors
		//			that support multi-threading on your computer!!
		//			(Old computers could only run one program at a time)
		
		// --- How to create a Thread ---
		// Option 1. Extend the Thread class 		  (simpler)
		// Option 2. Implement the RUnnable interface (better)
		// (we are going to do Option #2)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You have 10 seconds to enter your name. ");
		
		// "When you use Thread, that refers to the current one you are
		//  working with - in this case it is the main thread"
		// This code does not work - it waits 5 seconds and then
		// it allows the user to enter their name
		/*for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
			
			if (i == 5) {
				System.out.println("Time's up!");
			}
		} */
		
		
		// Solution: make the timer run on a different thread!
		SpongebobRunnable runnable = new SpongebobRunnable();
		// Create a new thread object with the runnable code
		Thread thread = new Thread(runnable);
		thread.setDaemon(true); // set as a daemon! (a subject service)
		thread.start();
		// Beware: "A program doesn't exit until all threads are done"
		//
		//			***Unless the threads are Daemon threads!!!
		
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
				
		scanner.close();
	}
}
