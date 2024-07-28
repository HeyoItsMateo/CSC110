/*-------------------------------------------------------------------------
// AUTHOR: Matthew Flores Semyonov
// FILENAME: Builder
// SPECIFICATION: Class definition of a Builder for use with Lab10.java
// FOR: CSE 110- Lab #10
// TIME SPENT: 16 min
//-----------------------------------------------------------------------*/
public class Builder {
	// Declare some variables of different types:
	// a String called name
	String name;
	
	public Builder(String name){
		// assigns the parameter to the appropriate instance variable
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String makeRow(int n, String s) {
		// Given an int n and string s, return a string that
		// represents n copies of s in one row.
		// Example: n = 5, s = “*”, return a string “*****”
		String row = "";
		
		for (int i = 0; i < n; i++) {
			row += s;
		}
		
		return row;
	}
	
	public void makePyramid(int n, String s) {
		// Makes use of makeRow method and System.out.println
		// to print the pyramid.
		for (int i = 1; i <= n; i+=2) {
			// Halve the max row length and subtract the current row length to offset the row correctly
			for (int j = 0; j <= (n-i)/2;j++) {
				System.out.print(" ");
			}
			// Print the row string
			System.out.println(makeRow(i,s));
		}
		
	}
}
