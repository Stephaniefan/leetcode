package BinarySearch;
public class Solution34 {
	public static int[] searchRange(int[] A, int target) {
		int start = 0;
		int end = A.length - 1;
		int mid;
		int[] result = new int[2];
		if (A == null || A.length == 0) {
			result[0] = -1;
			result[1] = -1;
			return result;
		}

		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (A[mid] == target) {
				result[0] = mid;
				end = mid;
			} else if (A[mid] < target) {
				start = mid;
			} else if (A[mid] > target) {
				end = mid;
			}
		}
		if (A[start] == target) {
			result[0] = start;
		} else if (A[end] == target) {
			result[0] = end;
		} else {
			result[0] = result[1] = -1;
			return result;
		}
		start = 0;
		end = A.length - 1;
		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (A[mid] == target) {
				result[1] = mid;
				start = mid;
			} else if (A[mid] < target) {
				start = mid;
			} else if (A[mid] > target) {
				end = mid;
			}
		}

		if (A[end] == target) {
			// System.out.println(start+"is start");
			result[1] = end;
			return result;
		} else if (A[start] == target) {
			result[1] = start;
			return result;
		} else {
			result[0] = result[1] = -1;
			return result;
		}

	}

	public static void main(String[] args) {
		int test[] = { 2, 2, 4 };
		int result[] = searchRange(test, 4);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}