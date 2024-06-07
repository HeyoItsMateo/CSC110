import java.util.Scanner;
/**
 This program calculates the total amount saved over a monthly period with a monthly interest rate
 given inputs from the user for the principle value, the annual interest rate, and the number of months to save.
*/
public class Savings {

	public static void main(String[] args) {
		// Initialize input variables to zero
		double principleValue = 0.0;
		double annualInterestRate = 0.0;
		int numMonths = 0;
		
		// Initialize Scanner object to register user-inputs
		Scanner input = new Scanner(System.in); 
		
		// Print the name of the programmer per assignment requirements
		System.out.println("Simple Interest - Matthew Flores Semyonov\n");
		
		// Prompt user for inputs and update the variables using input values
		System.out.print("Enter the initial savings amount: ");
		principleValue = input.nextDouble();
		
		System.out.print("Enter the annual interest rate: ");
		annualInterestRate = input.nextDouble();
		
		System.out.print("Enter the number of months to save: ");
		numMonths = input.nextInt();
				
		// Calculate the balanced saved
		final double MONTHLY_INTEREST_RATE = annualInterestRate / 100 / 12; // Convert to decimal by division by 100, then to monthly rate by division by 12
		final double FINAL_BALANCE = principleValue * Math.pow(1 + MONTHLY_INTEREST_RATE, numMonths); // Calculate final balance using the formula for compound interest
		
		// Print the savings!
		System.out.printf("$%.2f, saved for %d months at %.2f%% will be valued at %.2f\n", principleValue, numMonths, annualInterestRate, FINAL_BALANCE);
		
		// Close the scanner object
		input.close();
	}

}
