
public class Salmon extends Fish{
	// "Implement an interface, extend a class"
	
	@Override
	public void flee() {
		System.out.println("*The salmon swims away, down the river*");
	}
	
	@Override
	void swim() {
		System.out.println("The salmon is swimming around! ");
	}
}
