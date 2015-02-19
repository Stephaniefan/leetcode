package linkedlist;
/*
 * edge case 的检查！
 * 首先 list 中只有一个元素删掉该元素
 * 其次删除可以不使用指向当前元素后复制下一个的值 而是将指针指向要删除元素的前一个然后直接用next=next.next
 */
public class Solution19 {
	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode n1 = head;
		if (n1 == null || n1.next == null) {
			return null;
		}
		for (int i = 0; i < n; i++) {
			n1 = n1.next;
			if (n1 == null) {
				n1 = head;
			}
		}
		ListNode n2 = head;
		while (n1.next != null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		if (n2.next != null) {
			n2.next = n2.next.next;
			return head;
		} else {
			return head.next;
		}

	}

	public static void main(String[] args) {

		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(2);
		l4.next = l5;
		System.out.print(removeNthFromEnd(l4, 1).next.val);
	}

}
