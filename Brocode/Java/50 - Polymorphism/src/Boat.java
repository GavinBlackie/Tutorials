
public class Boat extends Vehicle{

	@Override
	void go() {
		System.out.println("*The boat starts its motor, driving on the water*");
	}
	
	@Override
	void stop() {
		System.out.println("*The boat slows down in its own wake*");
	}
	
}
