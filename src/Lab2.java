/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab2
// SPECIFICATION: Name concatenator takes first name and last name as inputs, concatenates them,
// prints the full name in upper-case, prints the length of the full name, and finally tests the
// "==" operator and "equals" method for String comparison, printing a statement to show which
// of the two compares Strings correctly.
// FOR: CSE 110- Lab #2
// TIME SPENT: 15
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String fullName;
		int nameLength = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first name: ");
		firstName = scan.nextLine();
		System.out.println("Please enter last name: ");
		lastName = scan.nextLine();
		
		scan.close();
		
		fullName = firstName + " " + lastName;
		fullName = fullName.toUpperCase();
		
		nameLength = fullName.length();
		
		System.out.println("Full name (in capitals): " + fullName);
		System.out.println("Length of full name: " + nameLength);
		
		// Define two String variables, title1 and title2 using
		// String constructor to initialize them
		String title1 = new String("cse110");
		String title2 = "cse110";
		// Compare the two strings and print which one of the two ways works
		// follow code below:
		if (title1 == title2) {
		// Print "String comparison using "==" sign works"
			System.out.println("String comparison using \"==\" sign works");
		} else {
		// Print "String comparison using "==" sign does NOT work"
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
		if (title1.equals(title2)) {
		// Print "String comparison using "equals" method works"
			System.out.println("String comparison using \"equals\" method works");
		} else {
		// Print "String comparison using "equals" method does NOT work"
			System.out.println("String comparison using \"equals\" method does NOT work");
		}
	}

}
