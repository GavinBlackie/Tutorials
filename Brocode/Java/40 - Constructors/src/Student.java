
public class Student {
	
	String name = "Spongebob"; // default parameter
	String program;
	int age;
	double gpa;
	boolean isEnrolled;
	
	Student() { // "default" constructor, empty constructor
		
	}
	
	// Constructor with parameters corresponding to each attribute!!! :0
	Student(String name, String program, int age, double bananaRama) {
		// must use this. syntax if parameter name is same as attribute name
		this.name = name; // imagine "this." is actually student1.name = "Spongebob"
		this.program = program;
		this.age = age;
		gpa = bananaRama;
		isEnrolled = true; // don't necessarily need a parameter for each field
	}
	
	void study() {
		System.out.println(this.name + " is studying right now!");
	}
	
}
