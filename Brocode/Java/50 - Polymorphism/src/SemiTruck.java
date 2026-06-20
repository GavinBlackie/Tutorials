
public class SemiTruck extends LandVehicle{
	SemiTruck() {
		this.numTires = 18;
	}
	
	@Override
	void go() {
		System.out.println("""
				*The semi truck accelerates slowly*""");
	}
	
	@Override
	void stop() {
		System.out.println("""
*The semi truck applies the brakes - slowly coming to a stop*""");
	}
	
	@Override
	void torqueTires() {
		System.out.println("""
			*A truck driver checks his tires before torquing them*""");
	}
}
