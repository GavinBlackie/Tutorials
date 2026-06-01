
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
	
	// Method to add money to this account!
	public void deposit(double amount) throws AccountException {
		
		if (amount < 0) throw new AccountException("Cannot deposit a negative amount.");
		
		balance += amount;
	}
	
	// Method to take money out of an account
	public void withdraw(double amount) throws AccountException {
		// 3 Step Function: Obtain, Validate, Act 
		// (my way of remembering this style of function)
		
		// Get new balance
		double newBalance = this.balance - amount;
		
		// Validate that we can properly withdraw (new balance is
		// positive and we are not withdrawing a negative amount)
		if (amount < 0) throw new AccountException("Cannot withdraw a negative amount.");
		if (newBalance < 0) throw new AccountException("Balance is too low to withdraw that amount!");
		
		// Withdraw the money!
		balance -= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getOwner() {
		return this.owner;
	}
}
