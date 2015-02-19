package linkedlist;

public class Solution86 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode partition(ListNode head, int x) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode less = new ListNode(-1);
		ListNode more = new ListNode(-1);
		ListNode moreHead = more;
		ListNode lessHead = less;

		while (head != null) {
			if (head.val >= x) {
				more.next = head;

				more = more.next;

			} else {
				less.next = head;

				less = less.next;

			}
			head = head.next;
		}
		more.next = null;
		/*
		more may not be the last node in the original linkedlist
		therefore if do not set the more.next to null there might be a cycle
		since it still links to another node in the linkedlist
		*/

		if (lessHead.next != null && moreHead.next != null) {
			less.next = moreHead.next;
		}
		if (lessHead.next == null && moreHead.next != null) {
			return moreHead.next;
		} else {
			return lessHead.next;
		}

	}

	public static void main(String[] args) {
		ListNode l6 = new ListNode(1);
		ListNode l1 = new ListNode(2);
		l1.next = l6;
		ListNode ln = partition(l1, 2);

		for (int i = 0; i < 3; i++) {
			System.out.print(ln.val + "  ");
			ln = ln.next;
		}

	}
}
