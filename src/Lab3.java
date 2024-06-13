/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab3
// SPECIFICATION: Calculates the final grade given inputs for final exam, midterm, and homework grades.
// Prints a statement informing the user of their pass/fail status. 
// Additionally, validates inputs and returns an error message if the inputs are invalid.
// FOR: CSE 110- Lab #3
// TIME SPENT: 21
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab3 {
	/**
	 * This method validates user-input and returns the input integer or terminates the program.
	 * @param gradeType - String denoting "final exam", "midterm", or "homework" to determine the valid input range
	 * @param validInputDataType - boolean to verify input data-type
	 * @param inputValue - input int to validate
	 * @return
	 * inputValue if the input is valid, otherwise terminate the program and print error message
	 */
	private static int validateInput(String gradeType, boolean validInputDataType, int inputValue) {
		if (!validInputDataType) {// Print error message and exit program if input is invalid
			System.out.printf("Error: %s grade not entered as an integer!", gradeType);
			System.exit(0);
		}
		// Initialize check range
		int rangeMin = 0, rangeMax = 100;
		// Assign check range for final exam
		if(gradeType.equals("final exam")) {
			rangeMax = 200;
		}
		// Check input against range
		if(inputValue < rangeMin || rangeMax < inputValue) {// Print error message and exit program if input is out of range
			System.out.printf("Invalid Input: %s grade is not in valid range %d-%d!\n", gradeType, rangeMin, rangeMax);
			System.exit(0);
		}
		return inputValue;
	}
	
	public static void main(String[] args) {
		double finalExamGrade = 0.0;
		double midtermGrade = 0.0;
		double homeworkGrade = 0.0;
		double finalGrade = 0.0;
		char letterGrade = ' ';
		Scanner scan = new Scanner(System.in);
		// Prompt, validate, and record user-inputs
		System.out.println("Enter homework grade: ");
		homeworkGrade = validateInput("homework", scan.hasNextInt(),scan.nextInt());
		
		System.out.println("Enter midterm grade: ");
		midtermGrade = validateInput("midterm", scan.hasNextInt(),scan.nextInt());
		
		System.out.println("Enter final exam grade: ");
		finalExamGrade = validateInput("final exam", scan.hasNextInt(),scan.nextInt());
		
		scan.close();
		
		// Calculate finalGrade
		finalGrade = ((finalExamGrade/200)*50) + ((midtermGrade/100)*25) + ((homeworkGrade/100)*25);
		// Assign letter grade based on value of FINAL_GRADE
		if (50 <= finalGrade) {
			letterGrade = 'P';
		} else {
			letterGrade = 'F';
		}
		// Print message stating whether the student passed or failed
		if (letterGrade == 'P') {
			System.out.println("Congrats! You passed!");
		} else {
			System.out.println("You failed. Womp womp.");
		}
	}

}
