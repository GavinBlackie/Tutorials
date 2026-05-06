
public class Main {
	public static void main(String[] args) {
		
		// ternary operator = A simple version of an if/else
		//
		// var = (condition) ? ifTrue : ifFalse;
		
		// NOTE: cannot do prints in ternary operators
		//       in java!!
		// eg. this doesn't work:
		// (score >= 50) ? System.out.println("") : System.out.println("");
		
		int score = 69;
		
//		if (score >= 50) {
//			System.out.println("You pass!!");
//		}
//		else {
//			System.out.println("You fail :( ");
//		}
		
		String passFailMsg = (score >= 50) ? "PASS" : "FAIL";
		
		System.out.printf("You %s\n", passFailMsg);
		
		
		// Practice Problem: Is a number even or odd?
		int num = 3;
		String result = (num % 2 == 0) ? "even" : "odd";
		System.out.printf("The number %d is %s.\n", num, result);
	
		// Practice Problem: Display hours in 12-digit form with AM and PM
		int hours = 13;
		if (hours > 24) { hours %= 12; };
		
		String timeOfDayMsg = (hours < 12) ? hours + " AM" : ((hours == 12) ? hours : hours-12) + " PM";
		// ^ remember the difference between concatenation and addition!
		//   there is type inference and conversion in java!
		
		System.out.println(timeOfDayMsg);
		
	}
}
