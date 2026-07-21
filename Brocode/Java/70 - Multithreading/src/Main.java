
public class Main {
	public static void main(String[] args) {
		
		// Multithreading => Enables a program to run many threads cocurrently
		//					 (A Thread = A set of instructions running independently)
		//					 Useful strategy for background tasks or time-consuming operations
		
		// Concurrently => At the same time
		
		// PatrickRunnable runnable = new PatrickRunnable(5);
		Thread thread1 = new Thread(new PatrickRunnable(7) );
		Thread thread2 = new Thread(new PatrickRunnable(7) );
		thread1.start();
		thread2.start();
		
		// The threads don't print in a neat 0-1 manner!! :0
		// This is because they are using seperate computing resources
		// so they don't need to be sequential in execution. 
		//
		// Thread1 isn't necessarily first, and Thread2 is not
		// necessarily last in the execution process in this way!!!
	
		System.out.println("GAME START");
		
		
		// Ping Pong example:
		Thread thread3 = new Thread(new PongRunnable("Ping"));
		Thread thread4 = new Thread(new PongRunnable("Pong"));
		thread3.start();
		thread4.start();
		
		// .join "Joins" this thread to the current one,
		//        waiting for it to execute before moving on
		//		  in this one (the main method will wait)
		try {
			thread3.join();
			thread4.join();
		}
		catch (InterruptedException e) {
			System.out.println("Main thread was interrupted. ");
		}
		
		// This will execute immediately unless you do something about it!
		System.out.println("Game Over. :(((");
	
	}
}
