package linkedlist;

/*
 * 
 */
public class Solution147 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode preL = head;
		ListNode cur = head.next;
		while (cur != null) {
			ListNode sorted = dummy.next;
			ListNode pre = dummy;
			while (sorted != cur && sorted.val <= cur.val) {
				pre = pre.next;
				sorted = sorted.next;
			}
			if (sorted == cur) {
				preL = cur;

			} else {
				preL.next = cur.next;
				cur.next = sorted;
				pre.next = cur;
			}
			cur = preL.next;
		}

		return dummy.next;
	}

	public static void main(String[] args) {

		ListNode l5 = new ListNode(1);
		ListNode l4 = new ListNode(7);
		ListNode l3 = new ListNode(0);
		ListNode l2 = new ListNode(6);
		ListNode l1 = new ListNode(2);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		ListNode ln = insertionSortList(l1);

		for (int i = 0; i < 5; i++) {
			System.out.println(ln.val);
			ln = ln.next;
		}

	}

}
