package String;
/*
 * Integer 的处理：MaxValue 为2147483647 MinValue 为-2147483648 在相加的过程中需要进行预判
 * 预判条件需要进行注意 当 result 已经超过极限值时无法判断 故只能将还未乘10的 result 和 Maxalue
 */
public class Solution8 {
	public static int atoi(String str) {
		if (str == null || str.trim().length() == 0) {
			return 0;
		}
		int result = 0;
		int index = 0;
		boolean isNeg = false;
		String newStr = str.trim();
		if (newStr.charAt(0) == '-') {
			isNeg = true;
		}
		if (newStr.charAt(0) == '-' || newStr.charAt(0) == '+') {
			index++;
		}
		for (int i = index; i < newStr.length(); i++) {
			if (!Character.isDigit(newStr.charAt(i))) {
				break;
			}
			if ((int) (result) > Integer.MAX_VALUE / 10
					|| result == Integer.MAX_VALUE / 10
					&& (newStr.charAt(i) - '0') > Integer.MAX_VALUE % 10) {
				return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			result = (int) (result * 10 + (newStr.charAt(i) - '0'));
		}

		result = isNeg ? -result : result;
		return result;
	}

	public static void main(String[] args) {
		String str = "-2147483649";

		System.out.println(atoi(str));
	}
}
