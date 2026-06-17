
public class Laptop extends Device{
	String os;
	Laptop(String name, double price, int year, String os) {
		super(name, price, year);
		this.os = os;
	}
	
	@Override
	void entertain() {
		System.out.println("""
				This is a laptop, time to game on Steam!
				""");
	}
}
