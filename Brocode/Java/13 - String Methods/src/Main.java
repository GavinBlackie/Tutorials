
public class Main {
	public static void main(String[] args) {
		
		String name = "Patrick Star";
		
		// length => gets the length of a string as an integer
		int nameLen = name.length();
		
		System.out.printf("The length of \"%s\" is: %d \n", name, nameLen);
	
		// charAt => gives char at a given index number
		// System.out.println(name.charAt(nameLen)); // Causes indexOutOfBounds
		System.out.println(name.charAt(nameLen - 1) + "\n");
		
		for (int iChar = 0; iChar < nameLen; iChar++) {
			char letter = name.charAt(iChar);
			System.out.printf("%d : %c \n", iChar, letter);
		}	
		System.out.println("\n");
		
		
		// lastIndexOf => gives the last index of a char
		//				  useful if that char occurs multiple times
		
		int lastIndex = name.lastIndexOf("a");
		System.out.println("The last index of an \"a\" is: " + lastIndex);
	
		
		// indexOf => gets the first index of a specific char,
		//  		  opposite of lastIndexOf !!!
		int firstIndex = name.indexOf("a");
		System.out.println("The first occurance of \"a\" is: " + firstIndex);
		
		
		// Changing da name :)
		name = "Eugine Krabs";
		System.out.println("\nThe name is now: " + name + "\n");
		
		// toUpperCase => converts all chars to upper case
		System.out.printf("UPPERCASE: %s\n", name.toUpperCase());
		// toLowerCase => converts all chars to lower case
		System.out.println("lowercase: " + name.toLowerCase() );
		
		
		name = "    Squidward Tentacles      ";
		System.out.println("\nThe name is now: " + name + "\n");

		// trim => trims all spaces!!
		name = name.trim();
		System.out.println("\nThe name is now: " + name + "\n");

		// replace => replaces all characters with another
		System.out.println("Replacing all \"a\"s with \"o\"s: " + name.replace("a", "e") );
		
		// replaceFirst => replaces the first character
		System.out.println("Replacing the first character with another " + name.replaceFirst("S", "L") );
	
		// Remember: strings are immutable in java!!!
		String funnyString = name.substring(0, 12) + 's' + name.substring(13, name.length() );
		System.out.println("Custom funny name: " + funnyString + "\n");
	
	
		// isEmpty => returns a true or false value if empty!
		System.out.println("Is " + name + " empty?: " + name.isEmpty());
		System.out.println("Is a blank string empty?: " + "".isEmpty());
		System.out.println("Is a string with only spaces empty?: " + "          ".isEmpty());
		
		// isBlank => will return true if there is only whitespace!
		System.out.println("\nIs a string with only spaces blank?: " + "          ".isBlank() + "\n");

		
		// contains => returns true or false if a string contains a substring
		if (name.contains(" ")) {
			System.out.println("Your name DOES contain a space");
		}
		else {
			System.out.println("Your name does NOT contain a space!");
		}
		name = "Spongebob";
		announceContainSpace(name);
		
		
		// equals => returns true if strings are exactly the same
		if (name.equals("spongebob")) {
			System.out.println("You live in a pineapple");
		}
		else {
			System.out.println("You do not live in a pineapple under the sea :(((( . ");
		}
		// equalsIgnoreCase => same as equals, but capitals don't matter
		if (name.equalsIgnoreCase("spongebob")) {
			System.out.println("You live in a pineapple");
		}
		else {
			System.out.println("You do not live in a pineapple under the sea :(((( . ");
		}
	}
	
	public static void announceContainSpace(String str) {
		if (str.contains(" ")) {
			System.out.println("Your name DOES contain a space");
		}
		else {
			System.out.println("Your name does NOT contain a space!");
		}
	}
}
