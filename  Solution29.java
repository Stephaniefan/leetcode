public class Solution29 {
	/*
	 * -2147483648, -1 2147483647 -2147483648, 1 -2147483648
	 */

	public static int divide(int dividend, int divisor) {
		// Note: The Solution object is instantiated only once and is reused by
		// each test case.
		if (divisor == 0 || dividend == 0) {
			return 0;
		}

		int count = 0;
		int result = 0;
		boolean isN = false;
		if (divisor == 1) {
			return dividend;
		}
		if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
			isN = true;
		}
		if (divisor == Integer.MIN_VALUE && dividend == Integer.MIN_VALUE)
			return 1;
		if (dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;

		}
		long divD = Math.abs((long) dividend);
		long divS = Math.abs((long) divisor);

		while (divD >= divS) {
			count++;
			long halfD = divS;
			while (halfD + halfD <= divD) {
				halfD <<= 1;
				count <<= 1;
			}
			divD -= halfD;
			System.out.println(divD+"is");
			System.out.println(count);
			
			//result += count;
		}

		if (isN) {
			count = -count;
		}
		//System.out.println(result);
		if (count <Integer.MIN_VALUE || count > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else {
			return count;
		}
	}

	public static void main(String[] args) {

		System.out.println(divide(200, 3));
	}
}
