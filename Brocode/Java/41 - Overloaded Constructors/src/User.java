
public class User {

	String username;
	String email;
	int age;
	boolean isLoggedOn;
	double balance;
	
	// no args constructor:
	User() {
		this.username = "Guest";
		this.email = "Not Provided";
		this.age = 0;
		this.isLoggedOn = false;
		this.balance = 0.0;
	}
	
	// Eg. a Constructor with a single parameter:
	User (String username) {
		this.username = username;
		this.email = "Not Provided";
		this.age = 0;
		this.isLoggedOn = false;
		this.balance = 0.0;
	}
	
	// Another constructor with two parameters
	User (String username, String email) {
		this.username = username;
		this.email = email;
		this.age = 0;
		this.isLoggedOn = false;
		this.balance = 0.0;
	}
	User (String username, String email, int age) {
		this.username = username;
		this.email = email;
		this.age = age;
		this.isLoggedOn = false;
		this.balance = 0.0;
	}
	User (String username, String email, int age, double balance) {
		this.username = username;
		this.email = email;
		this.age = age;
		this.isLoggedOn = false;
		this.balance = balance;
	}
	
	// My custom overriden toString method (Polymorphism -> Subtype/"True Virtual")
	// side note: you cannot override a method, and then have a lower
	//			  visibility type! This has to be public!!! :000
	@Override
	public String toString() {
		String infoStr = "";
		infoStr += "Username: ".concat(username);
		infoStr += "\nEmail: " + email;
		infoStr += "\nAge: " + age;
		infoStr += "\nLoggedOn?: " + ( (isLoggedOn) ? "Yes" : "No");
		// using the Type.toString here just so I remember thats what
		// implicitly happens
		infoStr += "\nBalance: $" + Double.toString(balance);
		return infoStr;
	}
	
}
