package linkedlist;
/*
 * 注意 Int 溢出！用 long！！！
 */
public class Solution2 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		ListNode digitOne = null;
		long n1 = l1.val, n2 = l2.val;
		l1=l1.next;
		l2=l2.next;
		//int m1 = 0, m2 = 0;
		if (l1 != null) {
			while (l1 != null) {	
				//n1 += (int) l1.val * Math.pow(10, m1);
				n1=n1*10+(int)l1.val;
				l1 = l1.next;
				//m1++;
			}
		}
		if (l2 != null) {
			while (l2 != null) {
				n2 = n2*10+(int)l2.val;
				l2 = l2.next;
				//m2++;
			}
		}

		long result = n1 + n2;

		String sum = Long.toString(result);

		digitOne = new ListNode(sum.charAt(sum.length() - 1) - '0');
		ListNode one = digitOne;

		for (int i = sum.length() - 2; i >= 0; i--) {
			digitOne.next = new ListNode(sum.charAt(i) - '0');
			digitOne = digitOne.next;
		}

		return one;
	}

	public static void main(String[] args) {
		ListNode l8 = new ListNode(9);
		ListNode l7 = new ListNode(9);
		ListNode l6 = new ListNode(9);
		ListNode l5 = new ListNode(9);
		ListNode l4 = new ListNode(9);
		ListNode l3 = new ListNode(9);
		ListNode l9 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		ListNode l1 = new ListNode(9);
		ListNode l0 = new ListNode(1);
		ListNode l = new ListNode(9);
		l0.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		ListNode result = addTwoNumbers(l0, l);
		for (int i = 0; i < 11; i++) {
			System.out.print(result.val + " ");
			result = result.next;
		}

	}

}
