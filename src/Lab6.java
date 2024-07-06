/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab6
// SPECIFICATION: Creates an array of integers, fills in the elements of that array by prompting the user 
for input, sorts the elements of array and displays the sorted elements to the user.
// FOR: CSE 110- Lab #6
// TIME SPENT: 19 min
//-----------------------------------------------------------------------*/
import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		// Initialize Scanner object
		Scanner input = new Scanner(System.in);
		// Print this message "How many elements in the array?"
		System.out.print("How many elements in the array? ");
		// Store input
		int arraySize = input.nextInt();
		// Declare a new array of size equal to the size requested
		int[] integerArray = new int [arraySize];
		for(int i = 0; i < integerArray.length; i++) {
			// Display the message: "Please enter the next value:"
			System.out.print("Please enter the next value: ");
			 // Request the next element (integer) from the user using the Scanner
			 int nextElement = input.nextInt();
			 // Store this element at the ith position of the array
			integerArray[i] = nextElement;
		}
		
		// Sort the array, minimum to maximum
		for (int i = 0; i < integerArray.length; i++) {
			for (int j = i + 1; j < integerArray.length; j++) {
				if (integerArray[i] > integerArray[j]) {
					int exchange = integerArray[i];
					integerArray[i] = integerArray[j];
					integerArray[j] = exchange;
				}
			}
		}
		
		// Print "The array's elements after sorting :"
		System.out.println("The array's elements after sorting: ");
		// Use a for loop to print the elements
		for (int k = 0; k < integerArray.length; k++) {
		 System.out.print(integerArray[k] + ", ");
		}
		// Print a newline character
		System.out.print("\n");
		
		// Remove the minimum
		for (int i = 0; i < integerArray.length-1; i++) {
			 integerArray[i] = integerArray[i+1];
		}
		// put zero in the last element array. Make sure you understand this!
		integerArray[integerArray.length-1] = 0;
		
		// Print "The array’s elements after left shift: "
		System.out.println("The array’s elements after left shift: ");
		// Use a for loop
		for (int k = 0; k < integerArray.length; k++) {
			// Print the element
			System.out.print(integerArray[k] + ", ");
		}
		// Print a newline character
		System.out.print("\n");
		
		// ask the user for element to search from the elements entered in the array.
		System.out.println("Enter The Element to Search in the Array");
		int search_element = input.nextInt();
		boolean element_found_flag = false;
		
		//Use a for loop and check if the element entered by user is in the array.
		// If the element is found, shift all the elements one step to the left
		// to remove the searched element in the array.
		// Put the zero in the last element of array.
		for (int i = 0; i < integerArray.length; i++) {
			if (integerArray[i] == search_element) {
				element_found_flag = true;
			}
			if (element_found_flag && i < integerArray.length - 1) {
				integerArray[i] = integerArray[i + 1];
			}
		}
		if (element_found_flag) {
			integerArray[integerArray.length - 1] = 0;
			System.out.println("Search element Found");
		}
		
		// Use a for loop to print the elements, comma separated.
		// Print a newline character after.
		for (int k = 0; k < integerArray.length; k++) {
			// Print the element
			System.out.print(integerArray[k] + ", ");
		}
		System.out.print("\n");
	}

}
