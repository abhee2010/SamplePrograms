import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = in.nextLong();
		/*long fact = calculateFactorial(num);*/
		long fact = calculateFactorialByRecursion(num);
		System.out.println("Factorial of " +"num"+ " is " +fact);
	}

	public static long calculateFactorial(long num) {
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact* i;
		}
		return fact;
	}

	public static long calculateFactorialByRecursion(long num) {
		long fact = 1;
		if(num==1 || num==0) {
			fact = 1;
		}
		else {
			fact = calculateFactorialByRecursion(num-1) * num;
		}
		return fact;
	}

}
