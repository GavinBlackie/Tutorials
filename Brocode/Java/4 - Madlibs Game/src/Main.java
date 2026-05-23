import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// Mad Libs Game !!!
		// Just to practice accepting some user input :-)
		
		Scanner scanner = new Scanner(System.in);
		
		// Trying to make this different from the tutorial so I can
		// practice it on my own!!!
		String noun1 = "";
		String adjective1 = "";
		String adjective2 = "";
		String noun2 = "";
		String verb1 = "";
		String adjective3 = "";
		String verb2 = "";
		String noun3 = "";
		String verb3 = "";
		String noun4 = "";
		
		System.out.print("Enter your name!: ");
		noun1 = scanner.nextLine();
		
		System.out.print("Enter an intersting adjective for a location: ");
		adjective1 = scanner.nextLine();
		
		System.out.print("Enter an adjective to describe a mood: ");
		adjective2 = scanner.nextLine();
		
		System.out.print("Enter the name of an animal: ");
		noun2 = scanner.nextLine();
		
		System.out.print("Enter a discusting verb: ");
		verb1 = scanner.nextLine();
		
		System.out.print("Enter a scary adjective: ");
		adjective3 = scanner.nextLine();
		
		System.out.print("Enter an exclaimation verb: ");
		verb2 = scanner.nextLine();
		
		System.out.print("Enter a motion verb: ");
		verb3 = scanner.nextLine();
		
		System.out.print("Enter a noun for a small creature: ");
		noun3 = scanner.nextLine();
		
		System.out.print("Enter a noun for a body part: ");
		noun4 = scanner.nextLine();
		
		System.out.println("Today, " + noun1 + " went to a " + adjective1 + " zoo. ");
		System.out.println("The zoo felt " + adjective2 + ". " );
		System.out.println("In an exhibit, " + noun1 + " saw a " + noun2 + ". ");
		System.out.println("The " + noun2 + " was " + adjective3 + " and " + verb1);
		System.out.println(noun1 + " was " + verb2 + "! ");
		System.out.println("A " + noun3 + " then " + verb3 + " into the cage!");
		System.out.println("The " + noun2 + " then tore the " + noun3 + " from " + noun4 + " to " + noun4 + "!!!!");
		
		scanner.close();
	}
}
