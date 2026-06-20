
public class Main {
	public static void main(String[] args) {
		
		// Polymorphism => "POLY" = "MANY"
		//				   "MORPH" = "SHAPE"
		//
		//				   "Many shapes", "Many forms"
		//
		//				Objects can identify as other objects.
		//				Objects can be treated as objects of a
		//				common superclass.
		//	
		//			(this is what I was messing around with
		//			from before).
		//
		// Side note: 3 types of polymorphism
		//	1. "Ad Hoc" 	=> regular overloading
		//  2. Subtype 		=> pure, virtual/Overriding
		//  3. Parametric 	=> using template variables/classes
	
		Car car = new Car();
		SemiTruck semiTruck = new SemiTruck();
		Boat boat = new Boat();
		Plane plane = new Plane();
		Bike bike = new Bike();
		
		// All of the objects have access to their bottom-most methods
		// in their literal form.
		car.go();
		semiTruck.go();
		boat.go();
		plane.go();
		bike.go();
		System.out.println("\n--------------------------------------------------\n");
		
		// But sometimes we refer to them by their abstract types -
		// that way we only need to know we are dealing with a vehicle
		// instead of either a Car, SemiTruck, Boat, Plane, or Bike
		// (this simplifies processing/dealing with many somewhat related types at once)
		
		// In this example, we are using an array of vehicles!
		Vehicle[] vehicles = {
				car,
				semiTruck,
				boat,
				plane,
				bike
		};
		for (Vehicle vehicle : vehicles) {
			vehicle.stop();
		}
		System.out.println("\n--------------------------------------------------\n");

		// HOWEVER you cannot access
		Vehicle vehicle = plane;
		// vehicle.board(); // does not work
		plane.board(); // Does work (Explicit plane type can see this method)
		
		System.out.println("\n--------------------------------------------------\n");

		System.out.printf("A semitruck has %d tires total. \n", semiTruck.getTires() );
		
		ArialVehicle arialVehicle = new Helicopter();
		arialVehicle.board();
		arialVehicle.go();
		arialVehicle.stop();
		arialVehicle.go();
		// arialVehicle.blackHawkDown(); // Method is undefined! b/c its not explicitly a helicopter!
		// arialVehicle = new Plane();
		try {
			Helicopter heli = (Helicopter) arialVehicle;
			heli.blackHawkDown();
		} catch (ClassCastException e) {
			System.out.println("Could not display specific helicopter details. :(");
		}
		
	}
}
