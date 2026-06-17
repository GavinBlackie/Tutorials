
public class Main {
	public static void main(String[] args) {
		// Abstraction => Process of hiding implementation details
		//				  (don't show irrelevant variables, operations),
		//				  and showing only the essential features. 
		//				  (eg. only showing what methods can be used on a
		//				  Stack, Queue, or LinkedList Data Structures)
		// (my own definition :) :0 )
		
		// abstract keyword => used to define abstract classes and methods
		
		// Abstract class => class that cannot be instantiated, used like a
		//					 "blueprint for blueprints". Can have some parts
		//					  defined while other operations are left undefined
		//					  but still declared.
		//					( Can contain "abstract" methods - which need to be implemented)
		//					( Can contain "concrete" methods - already implemented and are inherited)
		
		// Abstract classes and interfaces are like "contracts", and the
		// derived class that signs it MUST complete their end of the contract -
		// which is to define those undefined methods
	
		// "Don't teach a person to drive by telling them how every
		// single part of the engine works - just tell them about
		// the gas pedal, brake pedal, steering wheel. "
		
		
		// Device device = new Device(); // Does not work
		Device phone = new Phone("Samsung Galaxy 5", 299.99, 2014, 1); // DOES work!!!
		Phone iPhone = new Phone("IPhone 25", 20000.99, 2030, 10);
		Laptop laptop = new Laptop("Dell Inspiron", 999.99, 2028, "Linux Mint");
		
		iPhone.entertain();
		laptop.entertain();
		
		Circle circle = new Circle(25.6);
		System.out.printf("%.2f\n", circle.area());
		circle.radius = 5.0;
		System.out.printf("%.2f\n", circle.area());
		
		Shape shape = new Triangle(3, 2);
		// Triangle triangle = (Triangle) tri;
		System.out.printf("%.2f\n", shape.area());
		shape.display();
		
		shape = new Rectangle(3, 2);
		System.out.printf("%.2f\n", shape.area());
		shape.display();
	}
}
