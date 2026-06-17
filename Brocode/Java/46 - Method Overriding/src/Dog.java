
public class Dog extends Animal{
	
	int numBarks = 0;
	
	// @Override is a special annotation that tells you
	// if you misspelled the method and its not overriding anything
	// Its not actually required for method overriding to occur
	@Override
	void move() {
		System.out.println("This dog is moving! WooF WOOF BORK bork");
		numBarks += 4;
	}
}
