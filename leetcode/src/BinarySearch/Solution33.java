package BinarySearch;
/*
 * 根据 rotation 的位置分两种情况讨论：
 * 第一种为 pivot 在 mid 之后 即： 8 1 2 4 5 6 7 
 * 此时考虑 target 的位置：如果 target 介于 mid 和 end 之间 就 start=mid 直接找
 * 否则 end = mid 再判断
 * 第二种为 pivot 在 mid 之前 即： 4 5 6 7 8 1 2
 * 此时需要考虑 target 的位置：如果 target 介于 start 和 mid 之间就 end =mid 直接在前半部分找
 * 否则 start = mid 在后半段继续判断
 * 有个问题需要注意：target 和 start end 值比较时应该用>= 考虑到首尾的值可能是 target
 */
public class Solution33 {

	public static int search(int[] A, int target) {
		int start = 0;
		int end = A.length - 1;
		int mid = start + (end - start) / 2;

		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (A[mid] == target) {
				return mid;
			}
			if (A[start] < A[mid]) {
				if (target < A[mid] && target >= A[start]) {
					/*
					 * 此处 target必须>=A[start]否则第一个无法找到
					 */
					end = mid;
				} else {
					start = mid;
				}
			} else {
				if (target > A[mid] && target <= A[end]) {
					/*
					 * 此处 target必须<=A[end]否则最后一个无法找到
					 */
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		if (A[start] == target) {
			return start;
		} else if (A[end] == target) {
			return end;
		}
		return -1;
	}

	public static void main(String[] args) {
		int test[] = { 4,5,6,7,8,1,2,3};
		System.out.println(search(test, 4));
	}
}
