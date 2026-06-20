
public class Car extends LandVehicle{
	
	@Override
	void go() {
		System.out.println("**The car starts driving on the road** ");
	}
	
	@Override
	void stop() {
		System.out.println("*The car applies the brakes*");
	}
	
	@Override
	void torqueTires() {
		System.out.println("""
				*An everyday car owner torques their tires 🚗*
				""");
	}
	
}
