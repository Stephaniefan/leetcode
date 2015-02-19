package String;

public class Solution28 {

	public static int strStr(String haystack, String needle) {
		int m = haystack.length();
		int n = needle.length();
		int i, j; 
		for (i = 0; i <= m - n; i++) { //如果从第 m-n 个开始依然没有相等就无需继续检查了
			for (j = 0; j < n; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}

			if (j == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String str1 = "";
		String str2 = "";
		System.out.println(strStr(str1, str2));
	}

}
