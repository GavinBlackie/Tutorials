
public class Main {
	public static void main(String[] args) {
		
		// Interface => "A blueprint for blueprints".
		//				 Specifies a set of abstract methods that
		//				 implementing classes MUST define.
		// 				 Acts like a "pure abstract class".
		//
		//				 Supports multiple inheritance behaviour,
		//			     unlike abstract classes which can only
		//				 inherit one at a time.
		
		Predator predator = new Hawk();
		predator.hunt();
		
		Prey prey = new Rabbit();
		prey.flee();
		
		prey = new Salmon();
		
		Fish fish = (Fish) prey; // explicitly casting to a Fish object!
		fish.flee();
		fish.hunt();
		fish.swim(); // Can now access the swim method!
					 // Interfaces only expose what they specify, thats why you need
					 // to cast first to a fish before calling the swim method
					 // (these casting concepts are stuff I learned in-school from professors)
		
	}
}
