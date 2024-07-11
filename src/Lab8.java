/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab8
// SPECIFICATION: Reads some Strings from a file and puts them in the array
// with basic exception handling.
// FOR: CSE 110- Lab #8
// TIME SPENT: 12 min
//-----------------------------------------------------------------------*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// Initialize variables to store line-by-line inputs and full text file
		String line = "";
		String[][] myArray = new String[4][3];
		
		// Put all the commands of this step in the try block
		try {
			// New File object to load text file
			File inputFile = new File("text_for_Lab8.txt");
			// New Scanner object to read from the input file
			Scanner in = new Scanner(inputFile);
			// Use a for loop to read all lines of file
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					// Read one line of file into a string variable
					line = in.next();
					myArray[i][j] = line;
				}
			}
			in.close();
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.printf("%-20s", myArray[i][j]);
				}
				System.out.println();
			}
		}
		catch (IOException ioe) {
			System.out.println("Something went wrong.");
		}
		

	}

}
