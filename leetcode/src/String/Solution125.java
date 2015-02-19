package String;

public class Solution125 {

	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		int begin = 0;
		String str = s.trim();
		int rear = str.length() - 1;
		while (begin < rear) {
			while (rear >= 0 && !Character.isLetter(str.charAt(rear))
					&& !Character.isDigit(str.charAt(rear))) {
				rear--;
			}
			if (rear == -1) {//全为标点或空格
				return true;
			}
			while (begin < str.length()
					&& !Character.isLetter(str.charAt(begin))
					&& !Character.isDigit(str.charAt(begin))) {
				begin++;
			}
			if (begin == str.length()) {
				return true;
			}
			if (Character.toLowerCase(str.charAt(begin)) != Character
					.toLowerCase(str.charAt(rear))) {
				return false;
			} else {
				begin++;
				rear--;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str = ". .a";
		System.out.println(isPalindrome(str));
	}
}
