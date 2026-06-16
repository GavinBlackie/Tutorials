
public class Main {
	public static void main(String[] args) {
		
		// Overloaded Constructors 
		//  		=> Allow for multiple ways to create
		//			   the same object, with different parameters.
		//			   Similar to overloaded methods and functions.
		
		User user1 = new User("Squidward");
		user1.email = "Squiddy123";
		System.out.println(user1.toString());
		
		User user2 = new User("Patrick", "MayoPStar@instrument.ca");
		System.out.println();
		System.out.println(user2.toString());
		
		User user3 = new User("Sandy", "cheeksand@sciencelabs.org", 27);
		System.out.println();
		System.out.println(user3);
		
		User user4 = new User("Mr. Krabs", "ilikemoney@krusty.com", 69, 690000.99);
		System.out.println();
		System.out.println(user4);
		
		User guest = new User();
		System.out.println();
		System.out.println(guest);
	}
}
