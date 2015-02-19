package Array;

public class Solution27 {

	public static int removeElement(int[] A, int elem) {
		if (A.length == 0) {
			return 0;
		}
		int rear = A.length - 1;
		int head = 0;
		while (rear >= head) {
			if (A[head] == elem) {
				A[head]=A[rear];
				rear--;//head 不动是防止A[rear]=element
			} else {
				head++;
			}
		}
		
		return rear + 1;
	}

	public static void main(String[] args) {
		int[] A = { 4,4 };

		System.out.println(removeElement(A, 4));
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "  ");
		}

	}
}
