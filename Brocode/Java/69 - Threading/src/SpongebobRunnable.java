
// The Runnable interface is used for threads!! (Option #2)
public class SpongebobRunnable implements Runnable{
	
	// The Spongebob second counter that will run in the background
	@Override
	public void run() {
		for (int iSec = 1; iSec <= 10; iSec++) {
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				System.out.println("\nThread was interrupted");
			}
			
			if (iSec == 10) {
				System.out.println("\nSpongebob completed his count. Time's up!");
				// Force the whole program to stop prematurely!!
				// (can do this even if its a daemon thread)
				System.exit(0); // "exit code 0"
			}
		} 
	}
}
