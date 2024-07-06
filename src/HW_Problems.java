import java.util.Arrays;
import java.util.Scanner;

public class HW_Problems {
	private static void problem_4_4b(int n) {
		int numFactors = n / 10;
		int i = 1;
		while (i < numFactors) {
			System.out.printf("%d ", i * 10);
			i++;
		}
	}
	private static void problem_4_19(int n) {
		double x = 0;
		double s = 1.0 / (1 + n * n);
		while(0.1 < s) {
			s = 1.0 / (1 + n * n);
			x = x + s;
			n++;
		}
	}
	// Problem 6.29
	// Fill elements alternately with 0s and 1s in a checkerboard pattern
	private static void arrayCheckerboard(int ROWS, int COLUMNS) {
		// Initialize array according to problem specification
		int[][] values = new int[ROWS][COLUMNS];
		// Loop through all elements of the array
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				// Alternate checkerboard pattern using modulo
				if (i % 2 == 0 && j % 2 == 0) {
					values[i][j] = 1;
				}
				else if(i % 2 != 0 && j % 2 != 0) {
					values[i][j] = 1;
				}
			}	
		}
		// Print array for debugging
		for(int i = 0; i < ROWS; i++) {
			System.out.println(Arrays.toString(values[i]));
		}
	}
	// Problem 6.29
	// Fill only the elements at the top and bottom row with zeroes
	private static void arrayTopBottomZeroes(int ROWS, int COLUMNS) {
		// Initialize array according to problem specification
		int[][] values = new int[ROWS][COLUMNS];
		// Loop through all elements of the array
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if(i == 0 || i == ROWS - 1) {
					values[i][j] = 0;
				}
				else {
					values[i][j] = 1;
				}
			}	
		}
		for(int i = 0; i < ROWS; i++) {
			System.out.println(Arrays.toString(values[i]));
		}
	}
	// Problem-solution testing/checking
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer value for Rows: ");
		n = input.nextInt();
		System.out.print("\nEnter integer value for Columns: ");
		arrayTopBottomZeroes(n, input.nextInt());
	}
}
