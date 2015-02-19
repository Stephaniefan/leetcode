package String;
/*
 * 除了考虑长度不同以外还要考虑1.0和1这种情况！
 */

public class Solution165 {

	public static int compareVersion(String version1, String version2) {
		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		int min = Math.min(ver1.length, ver2.length);
		for (int i = 0; i < min; i++) {
			if (Integer.parseInt(ver1[i]) < Integer.parseInt(ver2[i])) {
				return -1;
			} else if (Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[i])) {
				return 1;
			}
		}
		if (ver1.length > min && (Integer.parseInt(ver1[min]) != 0)) {
			return 1;
		} else if (ver2.length > min && (Integer.parseInt(ver2[min]) != 0)) {
			return -1;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		String str1 = "0.100";
		String str2 = "0.0";
		System.out.println(compareVersion(str1, str2));
	}
}
