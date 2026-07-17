import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Timer;
import java.util.TimerTask;
public class Main {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// *** Java Countdown Timer Program ***
		// (just a practice program with concepts from previous lessons & practice)
		
		int response = extractInt("Enter the # of seconds to coundown from: ");
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			int count = response;
			
			@Override
			public void run() {
				System.out.println(count);
				count--;
				if (count < 0) {
					System.out.println("""
							Happy New Year Squidward!!!!
							
							\"I hate all of you\" - Squidward
							""");
					timer.cancel();
				}
			}
		};
		
		// or use .scheduleAtFixedRate, which is the same
		timer.schedule(task, 1000, 1000); // (task, delay, period)
		
		// Side note: the whole Java program only ends when all timers
		//			  have reached their explicit .cancel() calls if they exist 
	
	
		scanner.close();
	}
	
	static int extractInt(String msg) {
		boolean isPrompting = true;
		int userResponse = 0;
		while (isPrompting) {
			try {
				System.out.print("Enter the # of seconds to count down: ");
				userResponse = scanner.nextInt();
				isPrompting = false;
			}
			catch (InputMismatchException e) {
				System.out.println("That's not a number, silly! Try again. ");
			}
		}
		return userResponse;
	}
}
