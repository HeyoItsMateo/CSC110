/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Person
// SPECIFICATION: Class definition of a Person for use with Lab9.java
// FOR: CSE 110- Lab #9
// TIME SPENT: 7 min
//-----------------------------------------------------------------------*/
public class Person {
	String firstName;
	String lastName;
	int birthYear;
	public Person(String fname, String lname, int year)
	{
		// Assigns parameters to the instance variables
		firstName = fname;
		lastName = lname;
		birthYear = year;
	}
	public String getFirstName() {
		// returns the first name
		return firstName;
	}
	public String getLastName() {
		// returns the last name
		return lastName;
	}
	public int getAge(int currentYear) {
		// returns the age
		return currentYear - birthYear;
	}
}
