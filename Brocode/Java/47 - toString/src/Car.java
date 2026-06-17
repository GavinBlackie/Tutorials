
public class Car {
	String make;
	String model;
	Colour colour;
	char currency = '$';
	double price;
	int year;
	boolean isRunning = false;
	
	Car(String make, String model, double price, int year) {
		this.make = make;
		this.model = model;
		this.colour = Colour.RED;
		this.price = price;
		this.year = year;
	}
	Car(String make, String model, Colour colour, double price, int year) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return 	this.make + " " 
				+ this.year + " " 
				+ Colour.getColourStr(this.colour) + " " 
				+ this.model;
	}
}
