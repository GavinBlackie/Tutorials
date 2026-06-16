
public class Main {
	public static void main(String[] args) {
		
		// Before we used single variables for each object, but
		// always remember that objects act like primitive types as
		// well in most cases - they can also be stored in arrays
		// and other data structures!!! :) :-0
		
		Car[] cars = {
				new Car("Ford", "Mustang"),
				new Car("Nissan", "Skyline", Colour.BLACK, 55000.94),
				new Car("Chevy", "2020 Silverado", Colour.BLUE),
				new Car("Chevy", "Corvette", Colour.PURPLE, 45000)
		};
		
		System.out.println("There are " + cars.length + " cars total. \n");
		
		for (Car car : cars) {
			car.drive();
		}
		System.out.println();
		
		for (Car car : cars) {
			System.out.println(car);
			System.out.println();
		}
		
		System.out.println("*******************\n");
		
		// its now easy to change all of them!!
		for (Car car : cars) {
			car.colour = Colour.BLACK;
			System.out.println(car);
			System.out.println();
		}
	}
}
