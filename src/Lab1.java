/*------------------------------------------------------------------------- 
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab1
// SPECIFICATION: Calculate the average score of three test grades input by the user
// FOR: CSE 110- Lab #1 
// TIME SPENT: 20 minutes
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// Define variables
		final int NUM_TESTS = 3;
		int testGrade1, testGrade2, testGrade3;
		
		// Initialize scanner object to register user-inputs
		Scanner input = new Scanner(System.in);
		
		// Prompt and store user-inputs in respective variables
		System.out.print("Enter the first test grade: ");
		testGrade1 = input.nextInt();
		
		System.out.print("Enter the second test grade: ");
		testGrade2 = input.nextInt();
		
		System.out.print("Enter the third test grade: ");
		testGrade3 = input.nextInt();

		// Calculate the average score and print the results
		final double AVG_SCORE = (testGrade1 + testGrade2 + testGrade3) / (double)NUM_TESTS;
		
		System.out.printf("Your average test score is: %.2f\n", AVG_SCORE);
		
		// Close scanner object
		input.close();
	}

}
