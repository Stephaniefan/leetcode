package Array;
/*
 * 简化简化简化！！！少用 if-else
 * 无需 count 变量 直接用双指针：如果是重复的第2+个就一直往前直到找到不相等的那一个然后赋值给 unique 的第一个
 * 如果不是重复的就自己赋值给自己
 */
public class Solution80 {

	public static int removeDuplicates(int[] A) {
		if (A.length <= 2) {
			return A.length;
		}
		int cur = 1;
		int pre = 2;

		while (pre < A.length) {
			if (A[pre] == A[cur] && A[pre] == A[cur - 1]) {
				pre++;
			} else {
				A[cur + 1] = A[pre];
				cur++;
				pre++;
			}
		}
		return cur;
	}

	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 1, 1, 2, 3, 4, 5 };
		System.out.println(removeDuplicates(A));
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}
	}
}