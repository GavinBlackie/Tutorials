import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Compound interset calculator program!!!
		
		// A = P(1 + r/n) ^(n * t)
		
		Scanner scanner = new Scanner(System.in);
		
		double principal; // P
		double rate; // r
		int timesCompounded; // n
		int years; // t
		double amount; // A
		
		
		System.out.println("Enter the principal amount, P: ");
		principal = scanner.nextDouble();
		
		System.out.println("Enter the intrest rate, r (in %): ");
		rate = scanner.nextDouble() / 100;
		
		System.out.println("Enter times compounded, n: ");
		timesCompounded = scanner.nextInt();
		
		System.out.println("Enter the years, t: ");
		years = scanner.nextInt();
		
		amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
		
		System.out.printf("The amount, A, after %d years is $%.2f", years, amount);
		
		scanner.close();
	}
}
