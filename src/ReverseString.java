import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] chr = str.toCharArray();
		for(int i=chr.length-1; i>=0; i--) {
			System.out.print(chr[i]);
		}

	}

}