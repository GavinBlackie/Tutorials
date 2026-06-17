
public class SportsCar extends Car{
	
	SportsCar(String make, String model, Colour colour, 
			double price, int year) {
		super(make, model, colour, price, year);
	}
	
	void rev() {
		System.out.println("Revving " + this.model + "'s engine!!! ");
	}
	
	@Override
	public String toString() {
		return "Sporty looking " + super.toString();
	}
}
