
public class Product<T, U, V> {
	
	T item; // An item might be a string, or a more complex obj
	U price; // could be an int, a double, a float
	V currency; // eg. in CAD, Euros, USD
	
	Product(T item, U price, V currency) {
		this.item = item;
		this.price = price;
		this.currency = currency;
	}
	
	public T getItem() {
		return this.item;
	}
	public U getPrice() {
		return this.price;
	}
	public V getCurrency() {
		return this.currency;
	}
	
	@Override
	public String toString() {

		return this.item.toString() + ' ' + 
				
				// Place characters in front, anything else goes after the price
				( (this.currency.getClass().equals(Character.class)) ?
						this.currency.toString() + this.price.toString()
						: this.price.toString() + this.currency.toString() );
	}
}
