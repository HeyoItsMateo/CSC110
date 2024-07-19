import java.util.Arrays;
import java.util.Scanner;

public class Classwork {
	// Introduction to Arrays
	// 		Basic array algorithms
	// Find and return the minimum value of 
	public static double arrayMin(double[] values) {
		double minimum = values[0];
		for (int i = 1; i < values.length; i++) {
			if(values[i] < minimum) {
				minimum = values[i];
			}
		}
		return minimum;
	}
	public static double arrayMax(double[] values) {
		double maximum = values[0];
		for (int i = 1; i < values.length; i++) {
			if(values[i] > maximum) {
				maximum = values[i];
			}
		}
		return maximum;
	}
	// Calculate and return the average of the array
	public static double arrayAvg(double[] values) {
		double total = 0, average = 0;
		for (double value : values) {
			total += value;
		}
		if(values.length > 0) {
			return average = total / values.length;
		}
		return average;//TODO: Fix to handle exception cases, i.e. values.length == 0
	}
	// Output array with element separators
	public static void outputArray(double[] values) {
		for (int i = 0; i < values.length; i++) {
			if (0 < i) {
				System.out.print(" | ");
			}
			System.out.print(values[i]);
			// Can also debug array by printing using the method Array.toString(values) 
		}
		System.out.print("\n");// End-line
	}
	// Linear Search: seek value in an array, start from beginning and move through until value is found
	public static void linearSearch(double[] values, double searchValue) {
		// Initialization
		int pos = 0; // iterator
		boolean found = false;
		// Use while-loop to process values until the value is found
		while(pos < values.length && !found) {
			if (values[pos] == searchValue) {
				found = true;
				// Can also use return statement, return pos;
			} else {
				pos++;
			}
		}
		// After search is completed, do something
		if (found) {
			System.out.println(searchValue + " found!");
		} else {
			System.out.println(searchValue + " not in array of values!");
		}
	}
	// Removing an element at a specific position, requires tracking of current size,
	// and can't leave 'hole' in array. Solution depends on if you have to maintain 'order'.
	// Solution A: order does not matter
	public static double[] removeElementAtPositionA(double[] values, int position) {
		int currentSize = values.length;
		values[position] = values[currentSize - 1];
		currentSize--;
		
		double[] arrUpdated = new double[currentSize - 1];
		arrUpdated = values;
		return arrUpdated;
	}
	// Solution B: order matters
	public static double[] removeElementAtPositionB(double[] values, int position) {
		int currentSize = values.length;
		for (int i = position; i < currentSize - 1;i++) {
			values[i] = values[i + 1];
		}
		currentSize--;

		return Arrays.copyOf(values, currentSize);
	}
	// Inserting an Element
	public static double[] insertElementA(double[] values, int currentSize, int pos, double newValue) {
		if (currentSize < values.length) {
			currentSize++;
			for (int i = currentSize - 1; i > pos; i--) {
				values[i] = values[i-1]; // move elements down to open space for new element
			}
			values[pos] = newValue;// fill open gap
		}
		return Arrays.copyOf(values, currentSize);
	}
	// Swapping elements in an array
	public static double[] swapElements(double[] values, int pos_i, int pos_j) {
		double temp = values[pos_i];
		values[pos_i] = values[pos_j];
		values[pos_j] = temp;
		return values;
	}
	// Copying arrays
	public static double[] copyArray(double[] values) {
		return Arrays.copyOf(values, values.length);
	}
	// Growing an array:
	// copy elements of original array to new, larger array, then update reference of original array
	public static double[] growArray(double[] values, int newSize) {
		double[] newArray = Arrays.copyOf(values, newSize);
		values = newArray;
		// can simplify to:
		// values = Arrays.copyOf(values, newSize);
		return values;
	}
	// Reading input into array
	public static double[] readInputToArrayA(int sizeOfInputs) {
		double[] arrDouble = new double[sizeOfInputs];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < arrDouble.length; i++) {
			arrDouble[i] = input.nextDouble();
		}
		input.close();
		return arrDouble;
	}
	// make maximum sized array, fill to hearts desire, leave rest uninitialized/initialized to zero
	public static double[] readInputToArrayB(int maxSize) {
		double[] arrDouble = new double[maxSize];
		int currentSize = 0;
		Scanner input = new Scanner(System.in);
		while(input.hasNextDouble() && currentSize < arrDouble.length) {
			arrDouble[currentSize] = input.nextDouble();
			currentSize++;
		}
		input.close();
		return arrDouble;
	}
	
	public static void swap(int a, int b)

	{

	   int t = a;

	   a = b;

	   b = t;

	}
	
	public static void main(String[] args) {
		// Initialize testing array
		double[] arrDouble = {1,2,3,4,5,6,7,8,9,0};
		// Testing the output array method
		outputArray(arrDouble);
		// Testing linear search
		linearSearch(arrDouble, 10);// Fail-case
		linearSearch(arrDouble, 7);// Success-case
		System.out.println(Arrays.toString(removeElementAtPositionB(arrDouble,5)));
		
		int x = 10;

		int y = 11;

		swap(x, y);
		System.out.printf("x = %d, y = %d", x, y);

	}
}
