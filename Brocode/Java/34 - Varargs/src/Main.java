
public class Main {
	public static void main(String[] args) {
		
		// Varargs => Allow a method to accept a variety # of args
		//			  Makes methods flexible, no need to redundantly
		//			  overload the methods.
		//			  Java will pack to arguments into an array and 
		//			  perform a "vectorized" operation!!
		//			  use ... (ellipsis)
		
		System.out.println(add(1, 2, 4, 6));
		System.out.println(add(-5, 5, -1, 10));
		System.out.println(add(-5.5, 65.4, -54.3, 15.65));
		System.out.println(Math.round(add(-5.5, 65.4, -54.3, 15.65)) );
		System.out.println(average());
		System.out.printf("%.2f \n\n", add(-5.5, 65.4, -54.3, 15.65));
		
		double[] data = {5.56, 9.99, 12.54, 6.23, 7.43};
		for (double n : data) System.out.print(n + " ");
		System.out.println();
		System.out.println("SUM: " + add(data));
		System.out.println("AVG: " + average(data));
		System.out.println("Standard Deviation: " + stdDev(data));
		
	}
	
	// Eg. redundant method overloading:
//	static int add(int a, int b) { return a + b; }
//	static int add(int a, int b, int c) { return a + b + c; }
//	static int add(int a, int b, int c, int d) { return a + b + c + d; }
//	static int add(int a, int b, int c, int d, int e) { return a + b + c + d + e; }

	// the numbers parameter acts like an int[] !!!
	// compiler will handle the creation of the necessary overloaded methods
	static int add(int... numbers) {
		int sum = 0;
		// "Enhanced For-loop"
		for (int num : numbers) { // or alternatively regular indexed for loop
			sum += num;
		}
		return sum;
	}
	
	// remember that function overloading is purely dependant
	// on parameter types and the name of the function!
	// This overloading works because it takes a double[] !!!
	static double add(double... numbers) {
		double sum = 0.0;
		for (double num : numbers) sum += num; // one liner for loop!!! :0
		return sum;
	}
	
	// Vararg function for averages!
	static double average(double... numbers) {
		if (numbers.length == 0) return 0; // Avoid dividing by 0 (this avoids returning NaN)!!!
		return add(numbers) / numbers.length;
	}
	
	// Standard Deviation function I made!
	// s = root(Σ(xi - x)^2 / n)
	static double stdDev(double... numbers) {
		double n = numbers.length;
		double summation = 0.0; // Σ(xi - x)^2
		double avg = average(numbers); // x
		
		for (double num : numbers) {
			summation += Math.pow( (num - avg), 2);
		}
		return Math.sqrt(summation / n);
	}
	
}
