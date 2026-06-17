
public class Student extends Person{
	String program;
	String[] courses;
	double gpa;
	
	Student(String firstName, String lastName, int age, double gpa) {
		super(firstName, lastName, age); // Calls the parent constructor!!
		this.gpa = gpa;
	}
	
	void showGPA() {
		System.out.println("GPA: " + gpa);
	}
}
