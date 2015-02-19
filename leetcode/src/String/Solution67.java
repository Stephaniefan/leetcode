package String;
/*
 * 模仿二进制的加法直接对 string 进行操作
 * 从最后一位开始加，使用 carry 进行进位操作
 * 该位的值用 String a 和 String b 以及 carry 相加取余数即可
 */
public class Solution67 {

	public static String addBinary(String a, String b) {
		String result = "";
		int mLength = Math.min(a.length(), b.length());
		int aL=a.length();
		int bL = b.length();
		int carry = 0;
		int tempA = 0;
		int tempB = 0;
		for (int i = 0; i< mLength; i++) {
			tempA = (a.charAt(aL-1-i) - '0');
			tempB = (b.charAt(bL-1-i) - '0');
			int temp = tempA + tempB + carry;
			carry = temp / 2;
			result = temp % 2+result;

		}
		if (aL > mLength) {
			for (int i = mLength; i < aL; i++) {
				tempA = (a.charAt(aL-1-i) - '0');//利用ASCII 将char 转化为int
				int temp = tempA + 0 + carry;
				carry = temp / 2;
				result = temp % 2+result;
			}
		} else if (bL > mLength) {
			for (int i = mLength; i < bL; i++) {
				tempB = (b.charAt(bL-1-i) - '0');
				int temp = tempB + 0 + carry;
				carry = temp / 2;
				result = temp % 2+result;
			}
		}
		return (carry == 0) ? result : "1" + result;
	}

	public static void main(String[] args) {
		String a ="1";
		String b ="111";
		System.out.println(addBinary(a, b));
	}

}
