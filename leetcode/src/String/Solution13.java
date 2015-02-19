package String;

import java.util.HashMap;
import java.util.Hashtable;

public class Solution13 {

	public static int romanToInt(String s) {
		HashMap<Character, Integer> romanNum = new HashMap<Character, Integer>();
		romanNum.put('I', 1);
		romanNum.put('V', 5);
		romanNum.put('X', 10);
		romanNum.put('L', 50);
		romanNum.put('C', 100);
		romanNum.put('D', 500);
		romanNum.put('M', 1000);

		char[] arr = s.toCharArray();
		int num = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (romanNum.get(arr[i]) >= romanNum.get(arr[i + 1])) {
				num += romanNum.get(arr[i]);
			} else {
				num += -romanNum.get(arr[i]);
			}

		}
		
			num += romanNum.get(arr[arr.length - 1]);
		

		return num;
	}

	public static void main(String[] args) {
		String str = 	"DCXXI";
		System.out.println(romanToInt(str));
	}
}
