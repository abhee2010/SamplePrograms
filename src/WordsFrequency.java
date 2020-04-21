import java.util.HashMap;

public class WordsFrequency {

	public static void main(String[] args) {
		String str = "Hello How are you How do you do Are you good";
		String strNew = str.toUpperCase(); // converted to uppercase so that are and Are should be considered as same. Similiarly for other words.
		String[] strArr = strNew.split(" ");
		HashMap<String, Integer> map = countWords(strArr);
		System.out.println(map);
	}

	public static HashMap<String, Integer> countWords(String[] strArr) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < strArr.length; i++) {
			if(map.containsKey(strArr[i])) {
				map.put(strArr[i],map.get(strArr[i]) + 1);				
			}
			else
			{
				map.put(strArr[i], 1);
			}
		}
		return map;
	}
}
