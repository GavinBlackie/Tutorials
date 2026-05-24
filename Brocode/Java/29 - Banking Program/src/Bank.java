import java.util.ArrayList;
public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public Bank() {
		Account account1 = new Account("Patrick");
		Account account2 = new Account("Spongebob", 45.77);
		Account account3 = new Account("Mr. Krabs", 49000000.99);
		this.accounts.add(account1);
		this.accounts.add(account2);
		this.accounts.add(account3);
	}
	
	public ArrayList<Account> getAccounts() {
		return this.accounts;
	}
}
