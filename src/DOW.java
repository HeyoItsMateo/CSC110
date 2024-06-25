import java.util.Scanner;
/**
This program prints the day of the week given inputs from the user for the month, day, and year.
*/
public class DOW {
	/**
	 * This method validates user-input and returns the input integer or terminates the program.
	 * @param timePeriod - String denoting "month", "day", or "year" to determine the valid input range
	 * @param validInputDataType - boolean to verify input data-type
	 * @param inputValue - input int to validate
	 * @return
	 * inputValue if the input is valid, otherwise terminate the program
	 */
	private static int validateInput(String timePeriod, boolean validInputDataType, int inputValue) {
		if (!validInputDataType) {// Print error message and exit program if input is invalid
			System.out.printf("Error: %s not entered as an integer!", timePeriod);
			System.exit(0);
		}
		// Initialize check range
		int rangeMin = 1, rangeMax = 0;
		// Assign check range
		switch(timePeriod) {
			case "month":
				rangeMax = 12;
				break;
			case "day":
				rangeMax = 31;
				break;
			case "year":
				rangeMin = 0;
				rangeMax = 5000;
				break;
		}
		// Check input against range
		if(inputValue < rangeMin || rangeMax < inputValue) {// Print error message and exit program if input is out of range
			System.out.printf("Error: %s is not in valid range %d-%d!\n", timePeriod, rangeMin, rangeMax);
			System.exit(0);
		}
		return inputValue;
	}

	public static void main(String[] args) {
		// Print program and programmer name for file validation
		System.out.println("Day of the Week Calculator - Matthew Flores Semyonov\n");
		
		// Initialize variables
		int month = 0, day = 0, year = 0;
		int magic_number = 0;
		int xYear = 0;
		int dowNum = 0;
		// Initialize scanner object to register user-input
		Scanner input = new Scanner(System.in);
		
		// Prompt user-input for the month
		System.out.print("Enter month as an integer in range 1-12: ");
		// Input Validation: record input month or exit program
		month = validateInput("month", input.hasNextInt(), input.nextInt());
		
		// Prompt user-input for the day
		System.out.print("Enter day as an integer in range 1-31: ");
		// Input Validation: record input day or exit program
		day = validateInput("day", input.hasNextInt(), input.nextInt());
		
		// Prompt user-input for the year
		System.out.print("Enter year as an integer in range 0-5000: ");
		// Input Validation: record input year or exit program
		year = validateInput("year", input.hasNextInt(), input.nextInt());
		
		// Done receiving input, so close the scanner object
		input.close();
		
		// Begin day of the week calculations
		switch (month) {
		   case  1: magic_number = 0; break;
		   case  2: magic_number = 3; break;
		   case  3: magic_number = 2; break;
		   case  4: magic_number = 5; break;
		   case  5: magic_number = 0; break;
		   case  6: magic_number = 3; break;
		   case  7: magic_number = 5; break;
		   case  8: magic_number = 1; break;
		   case  9: magic_number = 4; break;
		   case 10: magic_number = 6; break;
		   case 11: magic_number = 2; break;
		   case 12: magic_number = 4; break;
		}

		if (month < 3)
			xYear = year - 1;
		else
			xYear = year;

		dowNum = (xYear + xYear / 4 - xYear / 100 + xYear / 400 + magic_number + day) % 7;

		// Based on dowNum, figure out what the day of the week name is (e.g. "Sunday")
		String dayName;
		switch(dowNum) {
			case 0:  dayName = "Sunday";    break;
			case 1:  dayName = "Monday";    break;
			case 2:  dayName = "Tuesday";   break;
			case 3:  dayName = "Wednesday"; break;
			case 4:  dayName = "Thursday";  break;
			case 5:  dayName = "Friday";    break;
			case 6:  dayName = "Saturday";  break;
			default: dayName = "";		    break;
		}
		// Print a message to the use (e.g. "6/23/1912 is a Sunday")
		System.out.printf("%d/%d/%d is on a %s", month, day, year, dayName);
	}
}
