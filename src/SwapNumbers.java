
public class SwapNumbers {

	public static void main(String[] args) {
		int a= 5, b=10;

		//with temporary variable
		/*int temp = a;
		a = b;
		b = temp;*/
		
		//without temporary variable
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Swapped numbers are a=" +a + " b=" +b);
	}
}
