
public class Main {
	public static void main(String[] args) {
		
		// Aggregation => Represents "HAS-A" relationship between objects.
		//		
		//				  One object contains another object as a field/attribute.
		//				  However the contained object(s) can exist independently.
		//				  (as opposed to composition)
		//
		
		// eg: a Library contains some Books.
		//     a Bank contains some Accounts.
		//     a Basket contains some Apples.
		
		// Notice that they are created in a different class/block!!!
		Book book1 = new Book("The Fellowship of the Ring", 423);
		Book book2 = new Book("The Two Towers", 352);
		Book book3 = new Book("The Return of the King", 416);
		Book book4 = new Book("Banana Book", 250);
		Book book5 = new Book("Spongebob's Memoirs", 10);
		
		Book[] books = {book1, book2, book3, book4, book5};
		
//		for (Book book : books) {
//			System.out.println(book);
//		}
		
		Library library = new Library("Spongebob Library", 1999, books);
		library.displayBooks();
		// note: if the library is deleted or goes out of scope,
		//       the Book objects are not deleted with it!!!!
	}
}
