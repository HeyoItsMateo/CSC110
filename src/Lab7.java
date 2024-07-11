/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab7
// SPECIFICATION: Creates and populates a 2-dimensional integer array by
// prompting the user for input. Displays the elements of the array.
// Finds the sum of each row of the array and displays it.
// FOR: CSE 110- Lab #7
// TIME SPENT: 12:48pm min
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// Initialize variables and Scanner object
		int numRows = 0;
		int numColumns = 0;
		Scanner input = new Scanner(System.in);
		
		// Print "Enter the number of rows in the array: "
		System.out.print("Enter the number of rows in the array: ");
		// Read and store the value
		numRows = input.nextInt();
		// Print "Enter the number of columns in the array: "
		System.out.print("Enter the number of columns in the array: ");
		// Read and store the value
		numColumns = input.nextInt();
		
		// Declare a 2D integer array
		int[][] intArray = new int[numRows][numColumns];
		// Populate the array
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				// Print "Please enter a value: "
				System.out.print("Please enter a value: ");
				// Store the value entered by the user at the (ith, jth) position
				// of the 2D array created in Step 4.
				intArray[i][j] = input.nextInt();
				
			}
		}
		
		// Display the array elements
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				// Print element(i, j) with a tab between each element
				System.out.print(intArray[i][j] + "\t");
			}
			// Print a newline between rows
			System.out.println();
		}
		
		// Find and display the sum of each row
		for (int i = 0; i < numRows; i++) {
			int sum = 0;
			for (int j = 0; j < numColumns; j++) {
				sum = sum + intArray[i][j];
			}
			// Print "Sum of the elements of row " + i + " is: " + sum +"\n"
			System.out.print("Sum of the elements of row " + i + " is: " + sum +"\n");
		}
		
		// Close scanner object
		input.close();
	}
}
