package BinarySearch;
/*You may imagine that num[-1] = num[n] = -∞.
 * this is a hint for arrays whose lengths are no more than two.
 * therefore for those arrays with one element return 0, for those with two elements return the index of larger one
 */
public class Solution162 {

	public static int findPeakElement(int[] num) {
		int start = 0;
		int end = num.length - 1;
		int mid = 0;
		if (start == end) {
			return start;
		}
		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (num[mid + 1] < num[mid] && num[mid - 1] < num[mid]) {
				return mid;
			} else if (num[mid - 1] > num[mid] && num[mid + 1] < num[mid]) {
				end = mid;
			} else if (num[mid + 1] > num[mid] && num[mid - 1] < num[mid]
					|| num[mid + 1] > num[mid] && num[mid - 1] > num[mid]) {
				start = mid;
			}
		}
		if (num[end] > num[start]) {
			return end;
		} else {
			return start;
		}
	}

	public static void main(String[] args) {
		int test[] = { 3, 1, 0, 7, 6, 2 };
		System.out.println(findPeakElement(test));
	}
}
