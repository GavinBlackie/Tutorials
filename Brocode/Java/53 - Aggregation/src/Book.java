
public class Book {
	
	String title;
	int pages;
	
	Book(String title, int pages) {
		this.title = title;
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return this.title + ", with " + this.pages + " pages";
	}
	
}
