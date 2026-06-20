
public class Plane extends ArialVehicle {

	@Override
	void go() {
		System.out.println("*The plane takes off the runway ✈️*");
	}
	
	@Override
	void stop() {
		System.out.println("*✈️ Plane lands safely on the runway*");
	}
	
	@Override
	void board() {
		System.out.println("*People are boarding the plane 🧑‍✈️🛩️*");
	}
	
	void talkWithAirTraffic() {
		System.out.println("""
			The pilot talks with air traffic, they both seem
			irritated at one another. Best not to ask...
				""");
	}
	
}
