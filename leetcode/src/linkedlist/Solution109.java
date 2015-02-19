package linkedlist;
/*
 * 递归递归！！！
 * 指针是每一层都有自己的指向，所以返回上一层的时候只带 return 的结果即构建好的新node
 * 不停断开是为了区分左子树和右子树
 * 递归达到底层后一层层返回结果所以是先构建根的左子树 return 到底之后再进入建立右子树的循环
 */
public class Solution109 {
	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

	}

	public static TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return new TreeNode(head.val);
			
		}
		ListNode fast = head;
		ListNode slow = head;
		ListNode pre = null;
		while (fast != null && fast.next != null) {
			pre = slow;
			fast = fast.next.next;
			slow = slow.next;
		}

		TreeNode root = new TreeNode(slow.val);
		if (pre.next != null) {
			pre.next = null;
			root.left = sortedListToBST(head);
		}
		if (slow.next != null) {
			root.right = sortedListToBST(slow.next);
		}

		return root;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		// System.out.println(l4.next.val);
		System.out.println(sortedListToBST(l1).val);

	}
}
