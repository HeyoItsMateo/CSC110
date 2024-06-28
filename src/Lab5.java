/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab5
// SPECIFICATION: Simple array storage for user input.
// Displays the input values backwards from input order,
// and displays the sum of the array's elements.
// FOR: CSE 110- Lab #5
// TIME SPENT: 28 min
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// Initialize variables and scanner object
		int arrayLength = 0;
		double arraySum = 0;
		double currElement = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user-input for the number of elements in the array'
		System.out.print("Enter number of elements in the array: ");
		arrayLength = input.nextInt();
		
		// Declare a new array with the user-specified length
		double[] arr = new double[arrayLength];
		
		// Populate the array
		for(int i = 0; i < arrayLength; i++)
		{
			// Prompt user to enter value to be stored in the array
			System.out.print("Please enter the next value: ");
			// Store the value in the array
			arr[i] = input.nextDouble();
		}
		// Construct a for loop that runs backwards through the array,
		// starting at the last element and ending at the first.
		for (int i = 1; i <= arrayLength; i++)
		{
		// Inside this for loop, print the ith element of the array
		// and a tab, with NO newline characters.
			if (i != 8) {
				System.out.printf("%f\t", arr[arrayLength - i]);
			}
			else {// newline if it's the 8th element
				System.out.printf("%f\n", arr[arrayLength - i]);
			}
			// Calculate the sum of the array
			arraySum += arr[arrayLength - i]; 
		}
		// Display the sum of the array
		System.out.printf("\n The sum of the array's elements is: %f", arraySum);
	}

}
