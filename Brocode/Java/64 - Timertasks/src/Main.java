import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
public class Main {
	public static void main(String[] args) {
		
		// Timer => Class scheduling tasks at specific times, or periodically/regularly
		//			Uses: sending notifications, scheduled updates, repetitive actions
		
		// TimerTask => Represents the task to be executed by the Timer
		//		        - Extend TimerTask class to define the task
		//				- @Override the run() method in the subclass
		
		// Use anonymous classes to have fewer files!!
		
		Timer timer = new Timer();
		Timer timer2 = new Timer();
		
		TimerTask patrickTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("President Patrick J. Star says \"Hello\". ");
			}
		};
		TimerTask squidwardTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Squidward Tentacles is a genius philosopher");
			}
		};
		TimerTask mrKrabsTask = new TimerTask() {
			int count = 3;
			@Override
			public void run() {
				System.out.println("""
						ArgArgArgArg I like Money.
						Get in the kitchen, and 
						make me some monehhhaehhh!!!
						""");
				count --;
				
				if (count <= 0) {
					System.out.println("SHUCH UP MR KRABS! SHUCH THE F*** UP - Spongebob");
					this.cancel();
				}
			}
		};
		
		// Use .schedule to execute a TimerTask's run method once,
		// a single timer can have multiple tasks
		timer.schedule(patrickTask, 6000);
		timer.schedule(squidwardTask, 3000); // 3000ms = 3secs
		
		System.out.println("Did you know that TimerTasks are asynchronous? :0 ");
		
		// BUT you can't have multiple schedules of the same task on the same timer
		try {
			timer.schedule(patrickTask, 1000);
		}
		catch (IllegalStateException e) {
			System.out.println("You can't have multiple schedules on the same timer :(");
		}
		
		// Nether can you have multiple timers running the same task
		//timer2.schedule(patrickTask, 1000, 1000);
		
		// the 3rd parameter specifies the period length, for periodic
		// or repetitive executions (probably have to think about how this can endlessly loop)
		timer2.schedule(mrKrabsTask, 5000, 1000);
		
		
	}
}
