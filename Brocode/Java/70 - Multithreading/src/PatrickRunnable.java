
// Implement the Runnable interface to create a runnable object
// that can be passed into thread objects to be executed!!
public class PatrickRunnable implements Runnable{
	private final int COUNTER_END;
	
	public PatrickRunnable(int seconds) {
		this.COUNTER_END = seconds;
	}
	
	@Override
	public void run() {
		System.out.println("Patrick says hi!!");
		
		for (int iSec = 1; iSec <= COUNTER_END; iSec++) {
			try {
				Thread.sleep(1000); // sleep for 1 second
				System.out.println(Thread.currentThread().getName() + " time: " + iSec);
			}
			// An interrupted exception is thrown when a thread
			// has to wait or sleep (b/c other threads are using CPU resources)
			catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
	}
}
