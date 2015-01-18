public class Solution69{
	public int sqrt(int x) {
		long begin = 1;
		long mid;
		long end = x;
		long value = 0;
		if (x <= 1) {
			return x;
		}
		while (end - begin > 1) {
			mid = begin + (end - begin) / 2;
			value = mid * mid;
			if (value == x) {
				return (int) mid;
			} else if (value > x) {
				end = mid;
			} else if (value < x) {
				begin = mid;
			}
		}
		value = end * end;
		if (value > x) {
			return (int) (end - 1);
		} else {
			return (int) end;
		}
	}
}
