
public class Library {

	String name;
	int year;
	Book[] books;
	
	// Notice that books must be instantiated in some
	// way - otherwise it could be a nullable field
	// (in which case it would be association)
	Library(String name, int year, Book[] books) {
		this.name = name;
		this.year = year;
		this.books = books;
	}
	Library(String name, int year) {
		this.name = name;
		this.year = year;
		this.books = new Book[10]; // waahh this is a fixed size array :(
	}
	
	void displayBooks() {
		System.out.println("\n**************************\n");
		System.out.println("The " + this.year + " " + this.name + ":\n");
		for (Book book : books) {
			System.out.println(book.toString());
		}
		System.out.println("\n**************************\n");
	}
}
