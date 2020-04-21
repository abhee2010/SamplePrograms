import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of terms for Fibonacci Series");
		int n = in.nextInt();
		int sum = fibonacciSum(n);
		System.out.println(" Sum is "+sum);
	}

	public static int fibonacciSum(int n) {
		int first = 1, second = 1, third, sum;
		System.out.print(first + " " + second);
		sum  = first+second;
		for (int i = 0; i < n-2; i++) {
			third = first + second;
			System.out.print(" " +third);
			sum = sum + third;
			first = second;
			second = third;


		}
		return sum;
	}
// using recursion
	/*public static int getFibonacci(int n) { 
		if (n == 1) { return 1; } 
		if (n == 2) { return 1; } 
		return getFibonacci(n - 1) + getFibonacci(n - 2); 
	}*/
}
