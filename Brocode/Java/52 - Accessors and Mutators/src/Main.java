
public class Main {
	public static void main(String[] args) {
	
		// Accessors (GETTERS) = Methods to read an attribute
		// Mutators (SETTERS)  = Methods to change an attribute
		//
		// These "protect" object data and add rules for how
		// data is accessed and modified. Eg. they can throw
		// exceptions if the value to mutate to is invalid, 
		// like trying to deposit a negative number to an account.
		//
		// Side note: they DO NOT ADD SECURITY, they are a TOOL
		//			  for enforcing the Object Oriented Paradigm,
		//			  to avoid historical issues with hundreds to 
		//			  thousands of global variables causing
		//			  developers nightmares in Imperative languages
	
		Car car = new Car("Skyline", "Nissan", 45000.99, Colour.PURPLE);
		car.currency = '€'; // Changing a package level variable (discouraged)
		printCar(car);
		System.out.println("\n********************\n");
		// Changing a variable with a mutator!!
		car.setColour("green");
		printCar(car);
		System.out.println("\n********************\n");
		car.setColour("banana"); // causes an error print (because of try-catch block)!!
		System.out.println("\n********************\n");
		car.setModel("Altima");
		car.setColour("yellow");
		car.setPrice(15000.45);
		printCar(car);
		System.out.println("\n********************\n");
		car.setPrice(-600.45);

	}
	
	static void printCar(Car car) {
		// MUST use the corresponding accessor methods!
		System.out.println("Make: " + car.getMake());
		System.out.println("Model: ".concat(car.getModel()) );
		System.out.printf("Price: %c%.2f\n", car.currency, car.getPrice());
		System.out.println("Colour: " + Colour.getColourStr(car.getColour()));
	}
}
