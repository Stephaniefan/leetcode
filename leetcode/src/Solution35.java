public class Solution35 {

	public static int searchInsert(int[] A, int target) {
		int start = 0;
		int end = A.length - 1;
		int mid;
		int index;
		if (A == null || A.length == 0) {
			return -1;
		}
		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (A[mid] == target) {
				index = mid;
				return index;
			} else if (A[mid] > target) {
				end = mid;
			} else if (A[mid] < target) {
				start = mid;
			}
		}
		if (target <= A[start]) {
			index = start;
			return index;
		} else if (target <= A[end]) {
			index = end;
			return index;
		} else
			index = end + 1;
		return index;

	}

	public static void main(String[] args) {
		int test[] = { 1,3,5,6};
		int index = searchInsert(test, 5);
		int index1 = searchInsert(test, 2);
		int inde2 = searchInsert(test, 7);
		int inde3 = searchInsert(test, 0);
		System.out.println(index);
		System.out.println(index1);
		System.out.println(inde2);
		System.out.println(inde3);
	}

}
