package linkedlist;

/*The key of this solution is a public pointer which traverse thru the list.
 * Each time the pointer procceed a new TreeNode is added into the final answer. 
 * It’s like doing a DFS in-order traverse thru the tree, and fill in values one by one. 
 */

public class Solution109V2 {
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

	ListNode cur = null;

	public TreeNode sortedListToBST(ListNode head) {
		cur = head;
		int k = 0;
		ListNode temp = head;
		while (temp != null) {
			temp = temp.next;
			k++;
		}
		return helper(0, k - 1);
	}

	private TreeNode helper(int left, int right) {
		if (left > right)
			return null;
		int mid = left + (right - left) / 2;
		TreeNode head = new TreeNode(-1);
		head.left = helper(left, mid - 1);
		head.val = cur.val;
		cur = cur.next;
		head.right = helper(mid + 1, right);
		return head;
	}

}
