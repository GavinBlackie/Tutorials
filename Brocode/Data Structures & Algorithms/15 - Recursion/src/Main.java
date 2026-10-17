
public class Main {	
	// recursion = when a thing is defined in terms of itself
	//
	//			  Apply the result of a procedure, to a procedure.
	//			  A recursive method or function calls itself.
	//			  Can be a substitute for iteration and vice versa.
	//				
	//			 Divide a problem into sub-problems of same type
	//			
	//			 Commonly used in advanced sorting algorithms
	//			 & navigating trees/graphs
	//
	//			"think of it as revealing the next one of those
	//			 Russian figure statue things"		
	//
	//		 Advantages
	//		*----------*
	//		easier to read and write
	//		easier to debug
	//		can be "solved" to find better non-recursive solution
	//
	//		 Disadvantages
	//		*-------------*
	//		usually slower
	//		uses more memory
	//		must identify base case and recursive case to solve
		
	public static void main(String[] args) {
		
		walk(5);
		
		walkRecursive(5);
		
		// Recall: each function call adds another frame to the
		//		   call stack, a stack overflow can occur if too
		//		   many exist at the same time
		
		System.out.println("\n*******************\n");
		
		try {
			walkRecursive(50000);
		} 
		catch (StackOverflowError e) {
			System.out.println(e);
		}
		
		
		// 4 x 3 x 2 x 1 = 12 x 2 = 24
		System.out.println(factorialRec(4));
		System.out.println(factorial(4));
		
		System.out.println(power(2, 8));
		System.out.println(power(2, 10));
		//System.out.println(power(2, -1));
	}
	
	private static void walk(int steps) {
		
		for (int iStep = 0; iStep < steps; iStep++) {
			System.out.println("You have taken a step!");
		}
	}
	private static void walkRecursive(int steps) {
		
		if (steps < 1)
			return;
		
		System.out.println("You take a step!");
		walkRecursive(steps - 1); // "n - 1"
		
	}
	
	// finds n!
	private static int factorialRec(int n) {
		if (n < 1)
			return 1;
		return n * factorialRec(n - 1) ;
	}
	private static int factorial(int n) {
		for (int i = n - 1; i > 0; i--) {
			n *= i;
		}
		return n;
	}
	
	// find x^y
	private static int power(int base, int exponent) {
		if (exponent < 1) // base case
			return 1;
		return base * power(base, exponent - 1);
	}
}
