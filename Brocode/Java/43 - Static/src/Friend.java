
public class Friend {

	static int numOfFriends;
	
	String name;
	int age;
	
	Friend(String name) {
		this.name = name;
		this.age = 0;
		numOfFriends++;
	}
	Friend(String name, int age) {
		this.name = name;
		this.age = age;
		numOfFriends++;
	}
	
	static void showFriends() {
		// side note: this. cannot be used here!
		System.out.println("You have " + numOfFriends + " friends total! ");
	}
	
}
