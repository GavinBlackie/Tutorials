
public class Car {
	
	// Private reduces accessible scope to only this class
	private String model;
	private final String make;
	char currency = '$'; // example package field
	private double price;
	private Colour colour;
	
	Car(String model, String make, double price, Colour colour) {
		this.model = model;
		this.make = make;
		this.price = price;
		this.colour = colour;
	}
	
	// Accessors!!
	public String getModel() {
		return this.model;
	}
	public String getMake() {
		return this.make;
	}
	public double getPrice() {
		return this.price;
	}
	public Colour getColour() {
		return this.colour;
	}
	
	// Mutators!!
	public void setColour(String colourStr) {
		try {
			this.colour = Colour.strToColour(colourStr);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Could not change colour on car :( ");
		}
	}
	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Can't set price to a negative number. ");
		} else {
			this.price = price;
		}
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}
