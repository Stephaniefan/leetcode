package linkedlist;
public class Solution83 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head.next;
		ListNode cur = head;
		while (pre != null && pre.next != null) {
			if (pre.val == cur.val) {
				cur.next = pre.next;
				pre = pre.next;
			} else {
				pre = pre.next;
				cur = cur.next;
			}

		}
		if (cur.val == pre.val) {
			cur.next = null;
		}
		return head;
	}

	public static void main(String[] args) {

		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(1);
		//ListNode l6 = new ListNode(2);
		//ListNode l1 = new ListNode(2);
		//ListNode l2 = new ListNode(2);
		//ListNode l3 = new ListNode(3);
		//ListNode l7 = new ListNode(3);
		l4.next = l5;
		//l5.next = l6;
		//l6.next = l1;
		//l1.next = l2;
		//l2.next = l3;
		//l3.next = l7;
		ListNode result = deleteDuplicates(l4);
		for (int i = 0; i < 2; i++) {
			System.out.print(result.val);
			result = result.next;
		}

	}
}
