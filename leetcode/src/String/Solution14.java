package String;

public class Solution14 {

	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		int minSize = strs[0].length();
		String preFix = "";
		String str = strs[0];
		boolean isContain = false;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minSize) {
				minSize = strs[i].length();
				str = strs[i];
			}
		}
		for (int i = minSize; i >= 0; i--) {
			if (!isContain) {
				preFix = str.substring(0, i);
			}
			for (int j = 0; j < strs.length; j++) {
				if (!strs[j].startsWith(preFix)) {
					isContain = false;
					preFix = "";
					break;
				} else {
					isContain = true;
				}
			}
		}
		return preFix;
	}

	public static void main(String[] args) {
		String[] strs = { "aaa", "ab" };
		System.out.println(longestCommonPrefix(strs));
	}

}
