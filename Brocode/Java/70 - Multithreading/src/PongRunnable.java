
public class PongRunnable implements Runnable{
	private final String text;
	
	PongRunnable(String text) {
		this.text = text;
	}
	
	@Override
	public void run() {
		
		for (int iSec = 1; iSec <= 5; iSec++) {
			try {
				Thread.sleep(1000); // sleep for 1 second
				System.out.println(text);
			}
			// An interrupted exception is thrown when a thread
			// has to wait or sleep (b/c other threads are using CPU resources)
			catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
	}
}
