import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		int [] arr1 = {5, 1, 2, 6, 3, 4};
		int [] arr2 = {1, 2, 7, 4, 9, 11};
		int size1 = arr1.length;
		int size2 = arr2.length;
		List res = new ArrayList();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					res.add(arr1[i]);
				}
			}

		}
		System.out.println("Common elements are " +res);
	}

}
