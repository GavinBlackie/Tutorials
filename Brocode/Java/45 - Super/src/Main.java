
public class Main {
	public static void main(String[] args) {
		
		// super = Refers to the parent class (subclass <- superclass)
		//		   Used in constructors and method overriding
		//		   Allows calls to the parent constructor, 
		//		   reduces repetition (DRY = Don't Repeat Yourself)
		
		Person person = new Person("sponGEbob", "SquarePANts", 30);
		person.showName();
		person.displayInfo();
		
		Person person2 = new Person("tOM", "riDDLE", 58);
		
		Student student = new Student("HaRRY", "POTTeR", 16, 3.2);
		student.displayInfo();
		student.showGPA();
		
		
		Person person3 = student; // "downcast"
		//Student student2 = (Student) person; // upcasting like this still works in theory
		//student2.showGPA();
		
		Employee employee = new Employee("severus", "snape", 49, 150000);
		employee.displayInfo();
		employee.showSalary();
	}
}
