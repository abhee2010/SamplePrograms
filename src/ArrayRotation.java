import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = in.nextInt();*/
		//int[] arr = new int[n];
		int[] arr = {1,2,3,4,5};
		/*System.out.println("Enter elements of array");
		for(int i = 0; i<= n-1; i++)
		{
			arr[i] = in.nextInt();
		}*/
		/*System.out.println("Enter size for rotation");
		System.out.println("Enter number of rotations");
		int numberofRotations = in.nextInt();*/
		int numberofRotations = 12;
		numberofRotations = numberofRotations % arr.length;
		if(numberofRotations != 0) { // no need to rotate if remainder is zero
			int tempArr[] = new int[numberofRotations];
			for(int i = arr.length-1, j=1; j <= numberofRotations; i--,j++) { // taking last elements equal to numberOf Rotations in a temporary array
				tempArr[tempArr.length-j] = arr[i];
			}
			int[] tempArr2 = new int[arr.length - numberofRotations];
			for (int j2 = 0; j2 < arr.length-(numberofRotations); j2++) { // taking remaining elements in another temporary array
				tempArr2[j2] = arr[j2];
			}
			for (int i = 0; i < tempArr.length; i++) { // copying elements of first temporary array in arr 
				arr[i] = tempArr[i];
			}
			for (int i = tempArr.length, j=0; i < arr.length; i++,j++) { // copying elements of second temporary array in arr
				arr[i] = tempArr2[j];
			}
		}
		System.out.println("New array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
