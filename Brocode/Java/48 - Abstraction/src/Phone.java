
public class Phone extends Device{
	int numCameras;
	
	Phone(String name, double price, int year, int numCameras) {
		super(name, price, year);
		this.numCameras = numCameras;
	}
	
	// Concrete implementation of the entertain method
	// (fullfills the contract defined by the Device class)
	@Override
	void entertain() {
		System.out.println("""
			Googoogaga Gyatt gyatt Brainrot Skibidi toilet
			mobile games 
			""");
		System.out.println(this.name + " is a phone. ");
	}
}
