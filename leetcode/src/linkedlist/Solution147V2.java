package linkedlist;

public class Solution147V2 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode insertionSortList(ListNode head) {
        if (head == null) {
        return null;
    }
    ListNode dummy = new ListNode(0);
    ListNode cur = head;
    while (cur != null) {
        // insert cur into correct pos
        ListNode pos = dummy;
        while (pos.next != null && pos.next.val < cur.val) {
            pos = pos.next;
        }
        ListNode temp = cur.next;
        cur.next = pos.next;
        pos.next = cur;
        cur = temp;
    }
    return dummy.next;
    }

}
