import java.util.Scanner;

public class LargePower {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = in.nextLong();
		System.out.println("Enter power");
		long power = in.nextLong(); 
		long result = calculatePower(n, power);
		System.out.println("Result is " + result);
	}

	public static long calculatePower(long n, long power) {
		long result = 1;
		if(power % 2 == 0) {
			for (int i = 1; i <= power/2; i++) {
				result = result * n;
			}
			result = result * result;
		}
		else {
			for (int i = 1; i <= power/2; i++) {
				result = result * n;
			}
			result = result * result * n;
		}
		return result;
	}

}
