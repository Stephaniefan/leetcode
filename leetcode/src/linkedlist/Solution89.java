package linkedlist;

public class Solution89 {
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
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode pre = head;
		ListNode cur = head.next;
		ListNode preL = dummyHead;
		while (cur != null) {

			if (pre.val == cur.val) {
				while (cur != null && pre.val == cur.val) {//先判断 Null！！！
					cur = cur.next;
					// System.out.println(cur.val);
				}
				if (cur == null) {
					preL.next = cur;
					return dummyHead.next;
				}

				preL.next = cur;
				pre = cur;
				cur = cur.next;

			} else {
				preL = preL.next;
				pre = pre.next;
				cur = cur.next;
			}

		}
		if (dummyHead.next == null) {
			return null;
		}
		return dummyHead.next;
	}

	public static void main(String[] args) {

		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(1);
		ListNode l6 = new ListNode(1);
		l4.next = l5;
		l5.next = l6;

		ListNode result = deleteDuplicates(l4);

		for (int i = 0; i < 1; i++) {
			System.out.print(result.val);
			result = result.next;
		}

	}
}
