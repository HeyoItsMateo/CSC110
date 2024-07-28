/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab10
// SPECIFICATION: Reads user-input for a person's name and creates an
// object of the Builder class using the input information. Display's name and builds a pyramid
// using methods from the Builder class.
// FOR: CSE 110- Lab #10
// TIME SPENT: 16 min
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		// Declare variables where you will store inputs from user:
		// A positive integer for testing makeRow() and
		// A positive odd integer for testing makePyramid()
		String name = "";
		int rowLength = 0;
		int maxPyramidRowLength = 0;
		// Declare a Scanner object
		Scanner input = new Scanner(System.in);
		// Prompt the user for input String name
		System.out.print("Name of the builder: ");
		// Store the input in the declared variables
		if(input.hasNextLine()) {
			name = input.nextLine();
		}
		// Create a new builder object named myBuilder.
		// Use the variable name provided by the user
		Builder builder = new Builder(name);
		
		// Call the getName() method to get the name of the builder and print it
		System.out.print("Name of the builder: " + builder.getName());
		// Ask for integer n from user using Scanner class
		System.out.print("\nEnter a positive integer: ");
		if (input.hasNextInt()) {
			rowLength = input.nextInt();
		}
		// Using your builder's makeRow method print a string below,
		// Example: =====*****===== with n = 5;
		for(int i = 0; i < rowLength;i++) {
			System.out.print("=");
		}
		System.out.print(builder.makeRow(rowLength, "*"));
		
		for(int i = 0; i < rowLength;i++) {
			System.out.print("=");
		}
		// Ask for odd integer t from user using Scanner class
		System.out.println("\nEnter a positive odd integer, \nrepresenting number of stars in the base of a pyramid: ");
		if (input.hasNextInt()) {
			maxPyramidRowLength = input.nextInt();
		}
		builder.makePyramid(maxPyramidRowLength, "*");
	}

}
