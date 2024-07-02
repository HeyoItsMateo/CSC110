
public class Classwork {
	// Introduction to Arrays
	// 		Basic array algorithms
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
	public static void main(String[] args) {
		
	}
}
