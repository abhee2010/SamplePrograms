import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		// To check a single number
		/*System.out.println("Enter a number");
		long num = in.nextLong();
		long sum = checkArmstrongNumber(num);
		if(num == sum) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Non-Armstrong number");
		}*/
		
		// To check a range of numbers
		System.out.println("Enter a range of numbers");
		System.out.println("Enter first number");
		long num1 = in.nextLong();
		System.out.println("Enter second number");
		long num2 = in.nextLong();
		for (long i = num1; i>=num1 && i<=num2; i++) {
			long sum = checkArmstrongNumber(i);
			if(i == sum) {
				System.out.println(i);
			}
		}
		
	}

	
	public static long checkArmstrongNumber(long num) {
		long sum = 0, r = 0;
		while(num != 0) {
			r = num % 10;
			num = num/10;
			sum = sum + LargePower.calculatePower(r, 3);  
		}
		return sum;
	}

}
