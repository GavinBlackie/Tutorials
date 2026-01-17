import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int lowBound = 0, upBound = 1;
		
		System.out.print("Lower bound: ");
		lowBound = scanner.nextInt();
		
		System.out.print("Upper bound: ");
		upBound = scanner.nextInt();
		
		if (lowBound > upBound) {
			scanner.close();
			return;
		}
		
		System.out.print("Enter how many random #s to generate: ");
		int totalNums = scanner.nextInt();
		
		for (int iNum = 0; iNum < totalNums; iNum++) {
			
			int randNum = random.nextInt(lowBound, upBound);
			System.out.println(randNum);
		}
		
		System.out.println("\n************\n");
		
		// Basic 1-6 (firsts # is inclusive, second # is exclusive)
		
		System.out.println(random.nextInt(1, 7));
		System.out.println(random.nextInt(1, 7));
		System.out.println(random.nextInt(1, 7));
		
		// Random doubles!!!
		System.out.println(random.nextDouble(0, 1));
		System.out.println(random.nextDouble(0, 1));
		System.out.println(random.nextDouble(0, 1));
		
		boolean isHeads = random.nextBoolean();
		
		if (isHeads) {
			System.out.println("Heads!!!");
		} else {
			System.out.println("Tails!!!");
		}
		
		scanner.close();
	}
}
