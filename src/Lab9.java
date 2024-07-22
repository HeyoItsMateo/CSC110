/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Lab9
// SPECIFICATION: Reads user-input for a person's information and creates an
// object of the Person class using the input information. Display's information
// using methods from the Person class.
// FOR: CSE 110- Lab #9
// TIME SPENT: 8 min
//-----------------------------------------------------------------------*/
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		// Declare variables where you will store inputs
		// from user: firstname, lastname, birthyear
		String firstname = "";
		String lastname = "";
		int birthyear = 0;
		// Declare a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for inputs: firstname, lastname, birthyear
		// and store the inputs in the declared variables
		System.out.print("Enter string for first name: ");
		if(input.hasNextLine()) {
			firstname = input.nextLine();
		}
		System.out.print("Enter string for last name: ");
		if(input.hasNextLine()) {
			lastname = input.nextLine();
		}
		System.out.print("Enter int for birth year: ");
		if(input.hasNextInt()) {
			birthyear = input.nextInt();
		}
		// Declare a Person object and use new to create a new Person object'
		Person person = new Person(firstname, lastname, birthyear);
		
		// Call the getFirstName(), getLastName() and getAge() methods in order to
		// get and then print the name and age of the Person object.
		System.out.println(person.getFirstName() + " " + person.getLastName() +
				" is " + person.getAge(2024) + " years old in 2024 and will be " +
				person.getAge(2034) + " years old in ten years.");
	}

}
