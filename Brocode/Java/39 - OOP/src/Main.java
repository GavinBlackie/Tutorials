import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
		
		// Object => An entity that holds data (attributes),
		//			 and can perform actions (methods)
		//           They represent "real-world" things
		//           
		//			 They are reference data types!
		//			 (Stored in the HEAP, accessed by pointer in STACK)
		
		// Objects we already used!:
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		Car car = new Car();
		Car car2 = new Car();
		car2.make = "Ferrari";
		car2.model = "Modena";
		car2.colour = Colour.PURPLE;
		car2.year = 1999;
		car2.price = 25673.54;
		car2.kilo = 10004.5;
		
		System.out.println("Printing individual attributes: ");
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println("Printing the overriden toString: ");
		System.out.println(car.toString() );
		System.out.println("Printing car2: ");
		System.out.println(car2);
		System.out.println();
		
		printCar(car);
		printCar(car2);
		
		car.start();
		System.out.println("Running?: " + car.isRunning);
		car.drive();
		car.brake();
		car.drive();
		car.brake();
		
		car.stop();
		System.out.println("Running?: " + car.isRunning);
		
		System.out.println();
		
		scanner.close();
	}
	
	// Custom procedure I made on my own to print a car's attributes!
	private static void printCar(Car car) {
		System.out.println("--------------------------------");
		System.out.println("Model: ".concat(car.model));
		System.out.println("Make: " + car.make);
		System.out.println("Year: " + car.year);
		System.out.printf("Price: %c%.2f\n", car.currency, car.price);
		System.out.println("Kilometers: " + car.kilo);
		
		// Get the colour, but capitalize the first letter!
		String colourStr = car.getColourStr();
		colourStr = colourStr.substring(0, 1).toUpperCase() + colourStr.substring(1);
		System.out.println("Colour: " + car.getColourStr() );
		System.out.println("--------------------------------");
	}
}
