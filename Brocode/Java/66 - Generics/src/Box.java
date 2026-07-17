
// A box with a generic type labelled "T"
// T = "Type" or "Thing"
public class Box<T> {

	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
	
}
