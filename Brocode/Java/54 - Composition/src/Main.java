
public class Main {
	public static void main(String[] args) {
		
		// Composition => Represents a "part-of" relationship between objects
		//				  "Object A composes of Object B & C"
		//				  "When A is destroyed, so are B & C"
		//
		//				  eg. An engine is "part-of" a Car
		//					  A limb is "part-of" a Person
		//					  A node is "part-of" a Graph, LinkedList, Tree, etc.
		//					  A button is "part-of" a calculator
		//				      
		// 					Allows for complex objects to be constructed from smaller objects!
		
		Car car = new Car("Nissan", "Skyline", 1999, 50000.00, "V6");
		
		displayCar(car);
		car.start();
		
		System.out.println();
		
		Car car2 = new Car("Ford", "F150", 2020, 65000.99, "V8");
		displayCar(car2);
		car2.start();
		
		// KEY difference here - the Engine object goes out of scope
		// after the car object is destroyed!!
		
	}
	
	static void displayCar(Car car) {
		System.out.println("MAKE: " + car.make);
		System.out.println("MODEL: " + car.model);
		System.out.println("YEAR: " + car.year);
		System.out.println("PRICE: $" + car.price);
		System.out.println("ENGINE TYPE: " + car.engine.type);
		System.out.println();
	}
}
