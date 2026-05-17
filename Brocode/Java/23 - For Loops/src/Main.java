import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) throws InterruptedException{
										// ^ thrown when the thread running this method/
										// the parent program is interrupted or stopped!!!
		
		// for-loop => execute some code a certain amount of times,
		//      	   
		//			   is an "iterative" version of a while loop
		//
		// 	BOTH loop types can represent each other theoritically
		//
		//   => and both loop types can have infinite varients!!!
		
		for (int iCount=1; iCount <= 16; iCount++) {
			System.out.println(iCount);
		}
		System.out.println();
		
		for (int iCount=16; iCount >= 0; iCount--) {
			System.out.println(iCount);
		}
		System.out.println();
		//for(;;); // Technically a valid statement (but infinite)
		
		// Beware of semicolons causing it to do nothing
		for (int i = 0; i < 10; i++);
		
		int[] arr = {3, 5, 3, 1, 2, 4, 7, 6};
	
		for (int iArr = 0; iArr < arr.length; iArr++) {
			System.out.print(arr[iArr] + " ");
		}
		System.out.println();
		
		for (int iCount = 27; iCount > 0; iCount-=3) {
			System.out.println(iCount);
		}
		System.out.println("\n-------------\n");
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isPrompting = true;
		int max = 0;
		
		while (isPrompting) {
			try {
				System.out.print("Enter how many times to loop: ");
				max = scanner.nextInt();
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println("That's not a number, silly!");
				scanner.next(); // flush
			}
		}
		
		for (int iCount=0; iCount < max; iCount++) {
			System.out.println(iCount);
		}
		
		System.out.println("\n-------------\n");
		
		System.out.print("How many seconds to count down to new years?: ");
		// Happy new year demo (with async/threading stuff)
		int start = scanner.nextInt();
		
		// Count DOWN to new years, make sure there is a delay!!
		for (int i = start; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("HAPPY NEW YEARS SPONGEBOB ME BOY!!!!");
		
		scanner.close();
	}
}
