
public class Main {
	public static void main(String[] args) {
		
		// https://www.geeksforgeeks.org/java/how-to-run-java-program/
		// type Main.java ==== cat Main.java
		// javac Main.java => produces Main.class
		// java Main.java
		
		// Unrelated print (I found out how to compile and execute
		// java with commands using javac and Java in cmd)
		System.out.println("""
				Compile test - I am testing to see if I can run a 
					  Java program without an IDE!!! :0
				""");
		
		// this will print all give args
		// eg. java Main.java "Banana" "Apple" will print "Banana" and "Apple" here
		for (String arg : args) System.out.printf("%s\n", arg);
		
		System.out.println("*******************************");
		
		// static => Keyword that makes a variable or method belong to
		//			 the class type itself, rather than a specific instance
		//			 of that class (not tied to a specific object).
		//			 It is commonly used for utility methods or shared resources.
		
		//			 (eg. a Math class that does general calculations, but there
		//			  is no such thing as a "Math" object, so it never needs instantiation)
		
		// "We will create some friend classes because you are lonely"
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick", 35);
		Friend friend3 = new Friend("Squidward", 40);
		Friend friend4 = new Friend("Plankton", 38);
		Friend friend5 = new Friend("Gary");
		
		// You can technically access a static var from an object,
		// but accessing based on class name/type name is recommended
		System.out.println(friend1.numOfFriends);
		System.out.println(friend2.numOfFriends);
		System.out.println(friend3.numOfFriends);
		System.out.println(Friend.numOfFriends);
		
		Friend.showFriends(); // calling a static func
		
		Math.round(3.14); // Example math static function!
		Math.ceil(45);
		Math.floor(43.74);
	}
}
