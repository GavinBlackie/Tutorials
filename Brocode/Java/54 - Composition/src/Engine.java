
public class Engine {

	String type;
	
	Engine(String type) {
		this.type = type;
	}
	
	
	void start() {
		System.out.println("VROOOM - The " + this.type + " engine is starting!");
	}
}
