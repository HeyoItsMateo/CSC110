/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab4
// SPECIFICATION: Prints a menu of options for the user to select. The options are,
// print a sequence of integers between the user-input start and end values, printing
// of a right-triangle drawn by "*" of user-input height, and quitting the program.
// FOR: CSE 110- Lab #4
// TIME SPENT: 34min
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// Initialize variable to store the input choice option
		int choice = 0;
		// Initialize Scanner object
		Scanner input = new Scanner(System.in);
		// Run menu until "Quit" option is selected
		do {
			// Print the following menu
			System.out.println("Please choose your choice from following menu:");
			System.out.println("1) Print through all integer numbers between two given integers.");
			System.out.println("2) Display a pattern – right triangle of stars.");
			System.out.println("3) Quit.");
			// Record user-input
			choice = input.nextInt();
			// Perform operations according to selected menu option
			switch(choice) {
				case 1: // Print through all integer numbers between two given integers
					int start, end;
					
					// Prompt user-input and record entered values
					System.out.print("Enter the starting integer: ");
					start = input.nextInt();
					
					System.out.print("Enter the ending integer: ");
					end = input.nextInt();
					
					// Loop through integers between start and end, and print the integers
					for (int i = start; i <= end; i++) {
						System.out.printf("%d ", i);
					}
					System.out.println();
					break;
					
				case 2: // Display a pattern – right triangle of stars
					// Initialize variable for triangle height
					int height = 0;
					// Prompt user-input and record entered values
					System.out.print("Enter the triangle height: ");
					height = input.nextInt();
					// Run nested loop to print right-triangle of stars
					for(int i = 1; i <= height; i++) {
						// Inner Loop operations
						for(int j = 1; j <= i; j++) {
							// Print ‘*’
							System.out.print('*');
							}
						// Print ‘\n’
						System.out.print('\n');
						}
					break;
					
				case 3: // do yet other things
					break;
				default: // Do this if choice is not 1, 2, or 3
					break;
			}
		} 
		while (choice != 3);
		
		// Close Scanner object
		input.close();
	}

}
