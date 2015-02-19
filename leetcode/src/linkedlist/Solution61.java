package linkedlist;
/*
 * 考虑n可能大于等于linkedlist 的长度 所以要先算一下长度再取余
 * 如果n==linkedlist 的长度直接 return head~
 */
public class Solution61 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode rotateRight(ListNode head, int n) {

		if (head == null || head.next == null) {
			return head;
		}
		int listLength = 0;
		ListNode len = head;
		while (len != null) {
			len = len.next;
			listLength++;
		}
		if (n >= listLength) {
			n = n % listLength;
		}
		if (n == 0) {
			return head;
		}
		ListNode nth = head;
		ListNode pre = head;

		for (int i = 0; i < n; i++) {
			pre = pre.next;
		}

		while (pre.next != null) {
			pre = pre.next;
			nth = nth.next;
		}
		ListNode rotate = nth.next;
		nth.next = null;
		pre.next = head;
		return rotate;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		// ListNode l3 = new ListNode(3);
		// ListNode l4 = new ListNode(4);
		// ListNode l5 = new ListNode(5);
		l1.next = l2;
		// l2.next = l3;
		// l3.next = l4;
		// l4.next = l5;
		ListNode l = rotateRight(l1, 2);
		for (int i = 0; i < 5; i++) {
			System.out.println(l.val);
			l = l.next;
		}

	}
}
