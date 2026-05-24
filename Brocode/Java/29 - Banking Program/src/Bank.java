import java.util.ArrayList;
public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public Bank() {
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();
		this.accounts.add(account1);
		this.accounts.add(account2);
		this.accounts.add(account3);
	}
}
