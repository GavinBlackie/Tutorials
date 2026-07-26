import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// This is a test/for-fun program to see if I can
		// use generics to dynamically get user input and
		// return it to the caller
		
		// Also going to test some regex!
		// Found a useful page on w3schools:
		// https://www.w3schools.com/java/java_regex.asp
		
		String someInt = "123";
		Pattern intPattern = Pattern.compile("^[0-9]+$");
		Matcher matcher = intPattern.matcher(someInt);
		System.out.println(someInt + " is an int?: " + matcher.find());
		matcher = intPattern.matcher("23f4");
		System.out.println("23f4 is an int?: " + matcher.find());
		
		System.out.println();
		
		String someDouble = "6.324";
		Pattern doublePattern = Pattern.compile("^[0-9]+\\.[0-9]+$");
		matcher = doublePattern.matcher(someDouble);
		System.out.println(someDouble + " is a double?: " + matcher.find());
		someDouble = "43243.24324afdsfsf";
		matcher = doublePattern.matcher(someDouble);
		System.out.println(someDouble + " is a double?: " + matcher.find());
		
		System.out.println();
		
		String someChar = "3";
		System.out.println(someChar.length());
		
		System.out.println(Pattern.matches("^[0-9]+$", someChar));
		
		if (someChar.length() == 1) {
			if (Pattern.matches("^[0-9]+$", someChar) == true) {
				System.out.println("An int char");
			} else {
				System.out.println("Its just a single char");
			}
		}
		else {
			System.out.println("That is not a single character. ");
		}
		
		System.out.println();
		
		String someBoolean = "false";
		System.out.println(Boolean.parseBoolean(someBoolean));
		
		HashMap<String, Boolean> boolMap = new HashMap<>();
		boolMap.put("false", false);
		boolMap.put("true", true);
		System.out.println(boolMap.get("falsdfdsfsea"));
		
//		extractUserInput(String.class,"", "");
//		extractUserInput(Integer.class,"", "");
		
		scanner.close();
	}
	
//	// The non-algoritmic version. 
//	// An explicit "type parameter" is set so we know which
//	// scanner method to call!
//	// (Self note: SWITCHES ONLY WORK ON PRIMITIVES)
//	private static<T> T extractUserInput(T type, String promptMsg, String errMsg) {
//		boolean isPrompting = true;
//		T response;
//		
//		while (isPrompting) {
//			try {
//				System.out.print(promptMsg);
//					
//				if (type == Integer.class) {
//					response = (T) scanner.nextInt();
//				} 
//				else if (type == Double.class) {
//					
//				}
//				else if (type == Float.class) {
//					
//				}
//				else if (type == Boolean.class) {
//					response = 
//				}
//				else if (type == Character.class) {
//					response = (T) scanner.nextLine().charAt(0);
//				}
//				else {
//					response = (T) scanner.nextLine();
//				}
//				
//				isPrompting = false;
//			}
//			catch (InputMismatchException e) {
//				System.out.println(errMsg);
//			}
//			catch (ClassCastException e) {
//				System.out.print("Error when casting");
//			}
//		}
//		return response;
//	}
}
