package String;

public class Solution58 {

	public static int lengthOfLastWord(String s) {
		if (s.trim().length() == 0) {
			return 0;
		}
		if (!s.contains(" ")) {
			return s.length();
		}
		String[] parts = s.split(" ");
		String lastWord = parts[parts.length - 1];
		return lastWord.length();
	}

	public static void main(String[] args) {
		String str = "a b c d eeeeg";
		System.out.println(lengthOfLastWord(str));
	}
}
