
public class Main {
	public static void main(String[] args) {
		
		// Inheritance => A way for classes to extend one another.
		//				  Allows one class to inherit the attributes
		//				  and methods of another "parent" class.
		//
		//				  Child <- Parent
		//				  Child <- Parent <- Grandparent
		//
		// But more often we say: Child -> Parent to signify the
		//						"generalization" taking place/where
		//					     the variables are coming from
		
		// DRY => Don't Repeat Yourself
		// (this is why polymorphism exists, to fullfill DRY)
		
		Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
		cat.speak();
		System.out.println(cat.lives);
		
		Labrador labrador = new Labrador();
		labrador.eat();
		labrador.bark();
		System.out.println(labrador.isAlive);
		System.out.println(cat.isAlive);
		
		Plant plant = new Plant();
		plant.photosynthesize();
		
		Organism plant2 = new Plant();
		plant2.isAlive = false;
		System.out.println(plant2.isAlive);
	}
}
