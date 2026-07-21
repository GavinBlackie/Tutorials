import java.awt.Toolkit;
import java.time.LocalTime;
/** Represents a currently running alarm clock, runs
 * a counter in seconds until it reaches a specified time
 */
public class AlarmClock implements Runnable{
	
	private final LocalTime alarmTime;
	
	public AlarmClock(LocalTime alarmTime) {
		this.alarmTime = alarmTime;
	}
	
	@Override
	public void run() {
		
		// While right now is before the given alarm time, sleep a second
		while(LocalTime.now().isBefore(this.alarmTime)) {
			try {
				Thread.sleep(1000);
				
				// Display a "countdown" every second in a clean format
				LocalTime now = LocalTime.now();
				System.out.printf("\r%02d:%02d:%02d", 
						now.getHour(), 
						now.getMinute(), 
						now.getSecond());
			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted");
			}
		}
		System.out.println("\n---ALARM TIME *BEEP* *BEEP* ----\n");
		// Do a simple beep using the Toolkit
		Toolkit.getDefaultToolkit().beep();
	}
}
