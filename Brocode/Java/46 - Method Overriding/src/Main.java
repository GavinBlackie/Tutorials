
public class Main {
	public static void main(String[] args) {
		
		// Method Overriding => When a derived class defines its own
		//						implementation of an operation already
		//						defined by its base class.
		//
		//			Key component for allowing code reusability,
		//			and key concept in polymorphism!
		
		Animal animal = new Animal();
		animal.move();
		
		Dog dog = new Dog();
		dog.move();
		
		Cat cat = new Cat();
		cat.move();
		
		Fish fish = new Fish();
		fish.move();
		
		Shark shark = new Shark();
		shark.move();
		
		Poodle poodle = new Poodle();
		poodle.move();
		
	}
}
