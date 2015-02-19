package linkedlist;
public class Solution21 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null && l2 != null) {
			return l2;
		}
		if (l1 != null && l2 == null) {
			return l1;
		}
		ListNode l3 = new ListNode(0);
		ListNode head = l3;
		/*
		 * 指针是可以指向 null 的！所以是 l1！=null 而非 l1.next!=null
		 * 如果使用 l1.next!=null 则未判断最后一个 node 值的大小
		 * 由于本身list 就是排序的故读取完一个 list后直接将指针指向未读取完的那个即可
		 */
		while (l1!= null && l2 != null) {
			if (l1.val <= l2.val) {
				l3.next = l1;
				l1 = l1.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		if (l1 != null) {
			l3.next = l1;

		}
		if (l2 != null) {
			l3.next = l2;

		}
		return head.next;
	}

}
