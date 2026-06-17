
public class Main {
	public static void main(String[] args) {
		
		// .toString() => Method inherited from the Object class.
		//				  All objects derive from/have "Object" as their
		//			      topmost baseclass in java
		//
		//				  By default, it returns a hash code as a unique ID.
		//				  Can be overriden to provide meaningful details! :0
	
		Object object = new Object();
		System.out.println(object);
		
		System.out.println();
		
		Car car = new Car("Chevy", "Silverado", 45000.00, 2020);
		System.out.println(car.toString() );
		
		SportsCar skyline = new SportsCar("Nissan", "Skyline", Colour.BLACK, 50000.00, 1999);
		System.out.println(skyline);
		
		// ^^^ this might be how mount and blade modifiers work!!
		//	Eg. "Masterwork Sword", "Strong Bow" sort of things!
		//  (probably a combination of inheritance and composition, eg.
		//	 a weapon HAS-A modifier)
		
		Sword armingSword = new Sword("Arming Sword", 25, 18);
		System.out.println(armingSword);
		armingSword.modifier = "Balanced";
		System.out.println(armingSword);
		
		MeleeWeapon poleHammer = new MeleeWeapon("Polehammer", 30, 20);
		poleHammer.modifier = "Masterwork";
		System.out.println(poleHammer);
	}
}
