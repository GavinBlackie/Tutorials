
public class Account {
	private double balance;
	private String owner;
	
	public Account(String owner) {
		this.owner = owner;
		this.balance = 0;
	}
	public Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getOwner() {
		return this.owner;
	}
}
