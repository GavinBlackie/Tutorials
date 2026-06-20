
public class Bike extends LandVehicle{

	@Override
	void go() {
		System.out.println("*The cyclist pedals up to speed 🚴*");
	}
	
	@Override
	void stop() {
		System.out.println("*The cyclist comes to a complete stop at a stop sign for once... 🖐️🛑*");
	}
	
	@Override
	void torqueTires() {
		System.out.println("A cyclist adjusts his tires! 🛠️");
	}
}
