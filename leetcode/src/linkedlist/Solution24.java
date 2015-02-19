package linkedlist;
public class Solution24 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode first = new ListNode(0);
		first.next = head;
		ListNode pre = first;
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			ListNode late = cur.next;
			pre.next = cur.next;
			cur.next = late.next;
			late.next = cur;
			if (cur.next != null) {
				pre = cur;
				cur = cur.next;
			} else {
				return first.next;
			}

		}

		return first.next;
	}

	public static void main(String[] args) {
		ListNode l9 = new ListNode(9);
		ListNode l8 = new ListNode(8);
		ListNode l7 = new ListNode(7);
		ListNode l6 = new ListNode(6);
		ListNode l5 = new ListNode(5);
		ListNode l4 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l1 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		l9.next = null;
		ListNode ln = l1;
		ListNode l = swapPairs(ln);
		
		for(int i=0;i<9;i++){
			System.out.println(l.val);
			l=l.next;
		}

	}
}
