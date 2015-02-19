package BinarySearch;
public class Solution81 {

	public static boolean search(int[] A, int target) {
		int start = 0;
		int end = A.length - 1;
		int mid;
		if (A == null || A.length == 0) {
			return false;
		}

		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (A[mid] < A[start]) {
				if (A[mid] == target) {
					return true;
				} else if (target > A[mid] && target <= A[end]) {
					start = mid;
				} else {
					end = mid;
				}

			} else if (A[mid] > A[start]) {
				if (A[mid] == target) {
					return true;
				} else if (target < A[mid] && target >= A[start]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				start++;
			}
		}
		if (A[start] == target) {
			return true;
		} else if (A[end] == target) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int test[] = { 4,0,0,1,2,3,4};
		System.out.println(search(test, 4));
	}
}
