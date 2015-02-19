package String;

public class Solution38 {

	public static String countAndSay(int n) {
		if(n == 1){
			return Integer.toString(n);
		}
		String str = "1";
		int count = 1;
		
		for (int i = 1; i < n; i++) {
			StringBuilder result = new StringBuilder();
			char compared = str.charAt(0);

			for (int j = 1; j < str.length(); j++) {
				if (str.charAt(j) == compared) {
					count++;
				} else {
					result.append(count);
					result.append(compared);
					count = 1;
					compared = str.charAt(j);
				}

			}
			result.append(count);
			result.append(str.charAt(str.length() - 1));
			count = 1;
			str = result.toString();

		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(countAndSay(6));
	}

}
