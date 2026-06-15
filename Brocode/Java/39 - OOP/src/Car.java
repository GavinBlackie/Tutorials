
public class Car {
	
	// These variables have the "internal" visibility modifier by
	// default (only same package can access)
	String make = "Ford"; // Can default things here!!!
	String model = "Mustang";
	int year;
	double price; 
	char currency = '$';
	double kilo;
	Colour colour;
	boolean isRunning = false;
	
	// Constructors can also default things
	public Car() {
		year = 2026;
		price = 62000.95;
		kilo = 250000;
		colour = Colour.RED;
	}
	
	@Override
	public String toString() {
		return make + " " + model;
	}
	
	// A method I made to get the colour string!
	public String getColourStr() {
		switch (colour) {
			case Colour.RED: 		return "red";
			case Colour.ORANGE: 	return "orange";
			case Colour.YELLOW: 	return "yellow";
			case Colour.GREEN: 		return "green";
			case Colour.BLUE: 		return "blue";
			case Colour.PURPLE: 	return "purple";
			default: 				return "N/A";
		}
	}
	
	void start() {
		isRunning = true;
		System.out.println("You started the engine!");
	}
	
	void stop() {
		isRunning = false;
		System.out.println("You stop the engine. ");
	}
	
	void drive() {
		System.out.println("You are now driving the " + model);
	}
	
	void brake() {
		System.out.println("A " + model + " is now braking!");
	}
}
