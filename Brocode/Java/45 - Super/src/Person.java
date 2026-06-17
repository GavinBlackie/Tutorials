
public class Person {

	String firstName;
	String lastName;
	int age;
	char currency;
	double balance;
	
	Person(String firstName, String lastName, int age) {
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.currency = '$';
		this.balance = 0.0;
	}
	
	void showName() {
		System.out.println(this.firstName + " " + this.lastName);
	}
	
	void displayInfo() {
		System.out.println("\n******************\n");
		System.out.print("Full Name: ");
		this.showName();
		System.out.println("Age: " + this.age);
		System.out.printf("Balance: %c%.2f\n", currency, balance);
	}
	
}
