package String;

public class Solution28V2 {

	public static int strStr(String haystack, String needle) {
		if (needle == "" || needle.trim().length() == 0) {
			return 0;
		}
		if (haystack.contains(needle)) {
			for (int i = 0; i < haystack.length(); i++) {
				boolean flag = false;
				if (haystack.charAt(i) == needle.charAt(0)) {
					int k = i;
					int j = 0;
					while (j < needle.length()) {
						if (haystack.charAt(k) == needle.charAt(j)) {
							k++;
							j++;
							flag = true;
						} else {
							flag = false;
							break;
						}
					}
					if (flag = true) {
						return i;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String str1 = "mississippi";
		String str2 = "issip";
		System.out.println(strStr(str1, str2));
	}

}
