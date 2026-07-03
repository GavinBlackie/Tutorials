
public class Car {
	
	String make;
	String model;
	int year;
	double price;
	Engine engine;
	
	Car(String make, String model, int year, double price, String engineType) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.engine = new Engine(engineType);
	}
	
	void start() {
		System.out.println("-------------------------");
		this.engine.start();
		System.out.println("The "+this.make+" "+this.model+" is starting to move down the road!!");
		System.out.println("-------------------------");
	}
}
