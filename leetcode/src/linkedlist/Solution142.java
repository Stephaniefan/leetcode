package linkedlist;

public class Solution142 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode detectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		if (head.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		} else {
			return null;
		}
		while (fast != null && fast.next != null) {
			if (fast == slow) {
				ListNode result = head;
				while (result != slow) {
					result = result.next;
					slow = slow.next;
				}
				return result;
			}

			slow = slow.next;
			fast = fast.next.next;
		}
		return null;
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
		//l9.next = l5;
		ListNode ln=l1;
		System.out.println("start node of loop is " + detectCycle(l1).val);
	}

}
