package linkedlist;
public class Solution160 {

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int countA = 0;
		int countB = 0;
		int countDiff = 0;
		ListNode a = headA;
		ListNode b = headB;
		while (a != null) {
			countA++;
			a = a.next;
		}
		while (b != null) {
			countB++;
			b = b.next;
		}
		countDiff = Math.abs(countA - countB);
		if (countA > countB) {
			for (int i = 0; i < countDiff; i++) {
				headA = headA.next;
			}

		} else {
			for (int i = 0; i < countDiff; i++) {
				headB = headB.next;
			}
		}
		while (headA != null && headB != null) {
			if (headA == headB) {
				return headA;
			} else {
				headA = headA.next;
				headB = headB.next;
			}

		}
		return null;
	}
}
