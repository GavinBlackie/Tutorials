
public class Main {
	public static void main(String[] args) {
		
		// Function => a block of reusable code (on its own)
		// Method => a block of reusable code (inside a class)
		
		//BOTH functions and methods are called by a "caller" with 
		// arguments that are represented by parameters
		
		// NOTE: I typically like to differentiate between procedures and
		//		functions after my programming languages course, so:
		//	Procedures => functions that don't return anything (are void)
	
		happyBirthday(30, "Spongebob"); // Calling with different args
		happyBirthday(45, "Squidward");
		happyBirthday(35, "Patrick");
		
		// DRY => Don't Repeat Yourself   (Acronym)
		
		double ans = square(5);
		System.out.println(ans);
		
		ans = square(3.14) // Haha I put the semicolon on the next line because I can >:)
		; System.out.println(ans);
		
		ans = cube(9);
		System.out.println(ans);
		
		String firstName = "Spongebob", lastName = "Squarepants";
		String fullName = getFullName(firstName, lastName);
		System.out.println(fullName);
		
		System.out.println(boozeAgeCheck(19));
		System.out.println(boozeAgeCheck(6));
		System.out.println(boozeAgeCheck(154));
		System.out.println(isJacked(true, 34));
		System.out.println(isJacked(false, 34));
		System.out.println(isJacked(true, 10));
	}
	
	// Procedure to print happy birthday!
	// Has two parameters: age & name
	private static void happyBirthday(int age, String name) {
		System.out.println("Happy Birthday to you!");
		System.out.println("Happy Birthday dear " + name + "!");
		System.out.println("You are " + age + " years old!");
		System.out.println("Happy Birthday to you!\n");
	}
	
	// Function returning a square!
	// remember that the static is required!! 
	// (because Main class obj doesn't exist and its "fields" aren't used)
	static double square(double number) {
		return number * number; // or use Math.pow
	}
	
	static double cube(double num) {
		return Math.pow(num, 3);
	}
	
	static String getFullName(String first, String last) {
		return first + " " + last;
	}
	
	static boolean boozeAgeCheck(int age) {
		return (age >= 19) ? true : false;
	}
	
	static boolean isJacked(boolean isFit, int age) {
		return ( (age >= 16 && age <= 70) && isFit) ? true : false;
	}
}
