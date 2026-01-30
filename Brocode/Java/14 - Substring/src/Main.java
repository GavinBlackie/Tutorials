import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		// .substring() = A method used to extract a portion
		//				  of an existing string by copying
		
		// Remember: Strings are immutable in java, meaning
		// 			 that they cannot be changed after
		//			 creation, so substrings are essentially
		//			 copies of parts of a string
		
		// .substring(start, end)
		//
		// where start is inclusive, and end is exclusive
		
		Scanner scanner = new Scanner(System.in);
		
		String email;
		String username;
		String domain;
		System.out.print("Enter your email: ");
		email = scanner.nextLine();
		
		// Remember: indexOf returns -1 if char not found!!
		//
		// Solution: use contains function!!!
		
		if (email.contains("@")) {
			username = email.substring(0, email.indexOf("@"));
			domain = email.substring(email.indexOf("@") + 1);
			
			//String email = "Spongebob123@bikinibottom.com";
			//String username = email.substring(0, 12);
			//String domain = email.substring(13);
			
			System.out.println("Email: " + email);
			System.out.println("Username: " + username);
			System.out.println("Domain: " + domain);
		} else {
			System.out.println("Missing @ sign!!!");
		}
		
		scanner.close();
	}
}
