
public class Main {
	public static void main(String[] args) {
		
		// Constructor => A special method for initializing objects.
		//				  They run when the object is created on the heap,
		//				  and are typically used to setup an object's attributes.
		//				  Arguments are passed into a constructor, and these
		//				  parameters are then used to create initial attributes.
		
		Student student = new Student();
		System.out.println(student.name);
		
		// not defined yet!!! (defaulted to 0 in Java, but BAD in C++ - could be a garbage value)
		System.out.println(student.age);
		
		Student student2 = new Student("Spongebob", "Frycooking", 30, 2.8);
		student2.isEnrolled = false;
		printStudent(student2);
		
		Student student3 = new Student("Patrick", "Bachelor of Physics", 35, 1.7);
		printStudent(student3);
		
		Student student4 = new Student("Squidward", "Mechanical Engineering", 40, 3.3);
		printStudent(student4);
		
		Student student5 = new Student("Sandy", "Physics Masters", 27, 3.8);
		printStudent(student5);
		
		System.out.println();
		student2.study();
		student5.study();
	}
	
	private static void printStudent(Student student) {
		System.out.println();
		System.out.println("Name: " + student.name);
		System.out.println("Age: " + student.age);
		System.out.println("Program: " + student.program);
		System.out.println("GPA: " + student.gpa);
		System.out.println("Is Enrolled?: " + student.isEnrolled);
	}
}
