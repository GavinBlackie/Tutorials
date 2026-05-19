import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
	public static void main(String[] args) {
		
		// Nested Loop => a loop inside another loop
		// 
		// 				Used a lot in matrices, and in
		//				Data Structures & Algorithms
		//				(Typically two for-loops are O(n^2) !!!)
		
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " ");
		}
		System.out.print("\n----------\n");
		
		
		// Messing around with a matrix for practice!!!
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{0}
		};
		
		for (int iCol = 0; iCol < matrix.length; iCol++) {
			for (int jRow = 0; jRow < matrix[iCol].length; jRow++) {
				System.out.print(matrix[iCol][jRow] + " ");
			}
			System.out.println();
		}
		System.out.print("\n----------\n");
		
		// Practice problem: Create a program to display a matrix
		//					 of symbols that the user has given,
		//					 for whatever size they want!
		
		// Self challenge: Make it CREATE a variable/data struct
		//				   containing the symbols before displaying it!!
		
		int rows = 3, cols = 3;
		String symbol = "$";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the symbol/word to create a matrix of: ");
		symbol = scanner.nextLine();
		
		rows = promptIntInputPos("How many rows are there?: ", "Please enter a valid row number. ", scanner);
		
		cols = promptIntInputPos("How many columns are there?: ", "Please enter a valid column number. ", scanner);
		
		System.out.printf("\nGenerating a matrix with %d rows and %d columns: \n\n", rows, cols);
		
		
		String[][] symbolMatrix = generateSymbolicMatrix(symbol, rows, cols);
		
		displayStrMatrix(symbolMatrix);
		
//		symbolMatrix[1][1] = "W";
//		
//		System.out.println();
//		displayStrMatrix(symbolMatrix);
		
		scanner.close();
	}
	
	// Function I made to generate a string matrix with all cells of the same symbol!!
	private static String[][] generateSymbolicMatrix(String symbol, int rows, int cols) {
		String[][] matrix = new String[rows][cols];
		
		// T(   n^2 + n + 1   ) => O(n^2) or just theta(n^2) because every case is generally the same
		for (int iRow = 0; iRow < matrix.length; iRow++) {
			for (int jCol = 0; jCol < matrix[iRow].length; jCol++) {
				matrix[iRow][jCol] = symbol;
			}
		}
		return matrix;
	}
	
	// Procedure to display a string matrix
	private static void displayStrMatrix(String[][] matrix) {
		for (int iRow = 0; iRow < matrix.length; iRow++) {
			for (int jCol = 0; jCol < matrix[iRow].length; jCol++) {
				System.out.print(matrix[iRow][jCol] + " ");
			}
			System.out.println();
		}
	}
	
	// Function I made for int inputs!!!
	// side note: optional parameters do not exist in java, but method overloading does
	private static int promptIntInputPos(String msg, String invalidMsg, Scanner scanner) {
		boolean isPrompting = true;
		int temp = 0;
		while (isPrompting) {
			try {
				System.out.print(msg);
				temp = scanner.nextInt();
				validatePosInt(temp); // Validate that it is positive!!
				isPrompting = false;
			} catch (InputMismatchException e) {
				System.out.println(invalidMsg);
				scanner.next(); // flush buffer
			}
		}
		return temp;
	}
	
	// This is for the promptIntInput function, throws an error if the number is negative.
	// The intent is that the same message will be displayed for both "aaaaBac" and "-1" inputs!
	// (But this whole structure can be improved)
	private static void validatePosInt(int n) {
		if (n < 0) {
			throw new InputMismatchException("Expected a positive input");
		}
	}
}
