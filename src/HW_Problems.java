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
	private static void problem_4_19_sol(int n) {
		
	}
	public static void main(String[] args) {
		int n = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer value for n: ");
		n = input.nextInt();
		
		problem_4_4b(n);
		problem_4_19(n);
		problem_4_19_sol(n);
	}
}
