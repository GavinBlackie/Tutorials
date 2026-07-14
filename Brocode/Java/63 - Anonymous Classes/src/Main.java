
public class Main {
	public static void main(String[] args) {
		
		// Anonymous Class = A class that doesn't have a name. Cannot be reused.
		//				     Add custom behaviour without having to create a new class.
		//					 Often used for one time uses (TimerTask, Runnable, callbacks)
		//
		//			Sort-of reminds me of "Arrow functions" in JavaScript and C++,
		//		    except its for whole classes!!
		
		Dog dog1 = new Dog();
		dog1.speak();
		
		// "Scooby doo speaks English and is a Dog"
		// Traditional way: Polymorphism with a new Class
		TalkingDog talkingDog = new TalkingDog();
		talkingDog.speak();
		
		// Alternative way: use an Anonymous class
		Dog dog2 = new Dog() {
			@Override
			void speak() {
				System.out.println("Scooby Dooby Doo says *Ruh Roh Raggy theres a ri...*");
			}
		};
		// ^ notice how you can add additional fields, methods,
		//   but the class name is still Dog!!!
		
		dog2.speak();
		
		// "Custom behaviour without creating a new class, but
		//  it cannot be reused (have to redo it if you want it again)"
	}
}
