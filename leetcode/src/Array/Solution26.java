package Array;

public class Solution26 {

	public static int removeDuplicates(int[] A) {
		if (A.length == 1 || A.length == 0) {
			return A.length;
		}
		int cur = 0;
		int pre = 1;
		while (pre < A.length) {
			if (A[cur] == A[pre]) {
				pre++;
			} else {
				cur++;
				A[cur] = A[pre];
				pre++;
			}
		}
		return cur + 1;
	}

	public static void main(String[] args) {
		int [] A={1,2,2,2,2,3,3,4,5};
		System.out.println(removeDuplicates(A));
	}
}
