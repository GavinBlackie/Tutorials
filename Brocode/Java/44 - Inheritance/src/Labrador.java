
public class Labrador extends Dog {
	
	// Polymorphism: The ability to share and change operations
	//				 amongst many related types through inheritance.
	
	// this is subtype polymorphism
	@Override
	void eat() {
		System.out.println("A labrador dog is eatting! NOM NOM");
	}
}
