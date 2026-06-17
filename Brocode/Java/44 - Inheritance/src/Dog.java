
// "extends" a class, "implements" an interface
public class Dog extends Animal{
	
	@Override
	void eat() {
		System.out.println("A dog is eating!! NOM NOM");
	}
	
	void bark() {
		System.out.println("WOOF WOOF");
	}
}
