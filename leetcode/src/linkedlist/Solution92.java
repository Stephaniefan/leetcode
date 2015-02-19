package linkedlist;

public class Solution92 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode reverseNode = null;
		ListNode mNode = head;
		ListNode nNode = head;
		if (m == 1 && n == 1) {
			return head;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		mNode = dummy;
		for (int i = 0; i < m - 1; i++) {
			mNode = mNode.next;
		}
		reverseNode = mNode.next;
		for (int i = 0; i < n - 1; i++) {
			nNode = nNode.next;
		}
		ListNode pre = nNode.next;
		ListNode preV = nNode.next;
		while (reverseNode != preV) {
			ListNode cur = reverseNode.next;
			reverseNode.next = pre;
			pre = reverseNode;
			reverseNode = cur;
		}
		mNode.next = pre;
		if (m == 1) { //判断是否从第一位开始 reverse 决定开头的 node
			return mNode.next;
		} else {
			return head;
		}

	}

	public static void main(String[] args) {

		ListNode l2 = new ListNode(0);
		ListNode l1 = new ListNode(3);
		l1.next = l2;

		ListNode head = reverseBetween(l1, 1, 2);
		for (int i = 0; i < 2; i++) {
			System.out.print(head.val + "  ");
			head = head.next;
		}
	}

}
