import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = in.nextInt(); int flag = 0;
		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 0)
			System.out.println("Prime number");
		else
			System.out.println("Non-prime number");

	}

}
