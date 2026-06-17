
public abstract class Device {
	String name;
	char currency = '$';
	double price;
	int year;
	
	Device(String name, double price, int year) {
		this(name, price); // calls the other constructor!!!
		this.year = year;
	}
	Device(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// an abstract method (derived classes MUST implement this)
	abstract void entertain();
	
	// a concrete method
	void displayInfo() {
		System.out.println("Name: " + this.name);
		System.out.printf("Price: %c%s\n", this.currency, this.price);
		System.out.println("Year: " + year);
	}
	
}
