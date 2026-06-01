
public class AccountException extends Exception {
	public String msg = ""; // I'm just lazy to put a getter here
	public AccountException(String msg) {
		this.msg = msg;
	}
	public AccountException() {}
}
