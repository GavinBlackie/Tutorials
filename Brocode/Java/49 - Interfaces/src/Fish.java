
public abstract class Fish implements Prey, Predator {
	
	@Override
	public void flee() {
		System.out.println("*The fish flees, swimming rapidly away!!*");
	}
	
	@Override
	public void hunt() {
		System.out.println("*The fish swims aggresively, attempting to hunt underwater*");
	}
	
	abstract void swim(); // Abstract classes can still have unimplemented methods!! :0
	
}
