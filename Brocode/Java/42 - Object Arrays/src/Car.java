
public class Car {
	static int totalCars;
	
	String make;
	String model;
	Colour colour;
	double price;
	
	Car(String make, String model) {
		this.make = make;
		this.model = model;
		this.colour = Colour.RED;
		this.price = 10000d;
	}
	Car(String make, String model, Colour colour) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.price = 10000d;
	}
	Car (String make, String model, Colour colour, double price) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.price = price;
	}
	
	void drive() {
		System.out.println("You drive the " + 
					Colour.getColourStr(this.colour) + " " + 
					this.make + " " + 
					this.model + ". ");
	}
	
	@Override
	public String toString() {
		String carInfo = "";
		carInfo += "Make: ".concat(this.make);
		carInfo += "\nModel: " + this.model;
		carInfo += "\nColour: " + Colour.getColourStr(this.colour);
		carInfo += "\nPrice: $" + Double.toString(this.price);
		return carInfo;
	}
}
