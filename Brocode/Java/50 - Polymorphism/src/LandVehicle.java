
public abstract class LandVehicle extends Vehicle{
	protected int numTires;
	
	void tireCheck() {
		System.out.println("""
			You check the tires - all seem to be good. 
				""");
	}
	
	abstract void torqueTires();
	
	int getTires() {
		return this.numTires;
	}
}
