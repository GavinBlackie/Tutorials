
public class Employee extends Person{
	
	int salary;
	
	Employee(String firstName, String lastName, int age, int salary) {
		
		// "Implicit super constructor Person() is undefined. Must explicitly invoke another constructor"
		// ^ this happens because you specifically said Person objects can only be created using one specific
		// constructor. If there was a default constructor, Person(), it would be implicitly called as super().
		// but since there is no default, this compiler warning happens. Use an explicit super( ___, ____, ___) call
		// to fix it!!!! :0
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
		super(firstName, lastName, age);
		this.salary = salary;
	}
	
	void showSalary() {
		System.out.println(this.firstName + "`s salary is: "+ this.currency + this.salary);
	}
}
