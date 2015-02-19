package linkedlist;
public class Solution141 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode quick = head;
		ListNode slow = head;
		/*
		 * 考虑只有两个节点并且没有 cycle的情况!
		 */
		if (quick.next.next != null) {
			quick = quick.next.next;
			slow = slow.next;
		}else{
			return false;
		}

		while (quick != null && quick.next != null) {
			if (quick == slow) {
				return true;
			}
			quick = quick.next.next;
			slow = slow.next;

		}
		return false;
	}

	public static void main(String[] args) {
	
		ListNode l2 = new ListNode(2);
		ListNode l1 = new ListNode(1);
		l1.next = l2;
		
		// l9.next = l5;
		System.out.println(hasCycle(l1));
	}

}
