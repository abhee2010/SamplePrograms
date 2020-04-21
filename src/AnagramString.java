import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = in.nextLine();
		System.out.println("Enter second string");
		String str2 = in.nextLine();
		if(str1.length() != str2.length()) {
			System.out.println("Not anagrams");
		}
		else {
			int flag = 0;
			if(!(str1.equalsIgnoreCase(str2))){
				String[] strNew1 = str1.split("");
				String[] strNew2 = str2.split("");
				HashMap<String, Integer> map1 = WordsFrequency.countWords(strNew1);
				HashMap<String, Integer> map2 = WordsFrequency.countWords(strNew2);
				for (String key : map1.keySet()) {
					Integer count = map1.get(key);
					if(count == map2.get(key)) {
						continue;

					}else {
						flag = 1;
						break;
					}
				}
			}
			if (flag == 0)
				System.out.println("Anagrams");
			else
				System.out.println("Not anagrams");
		}
			

	}

}
