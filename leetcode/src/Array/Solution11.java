package Array;

/*
 * 简单贪心算法：最开始的解集为全部数组，所以双指针从头尾开始向中间收缩
 * 证明如下：如果 height[head]较小的时候为了找寻更大的值应将 head向右移动
 * 因为即使移动了较大的height[rear]  min()依然未变(rear - head)反而变短
 * 总结：每次移动短板 
 */
public class Solution11 {

	public static int maxArea(int[] height) {

		if (height.length <= 1) {
			return 0;
		}
		int head = 0;
		int rear = height.length - 1;
		int area = Math.min(height[head], height[rear]) * (rear - head);
		while (rear - head > 1) {
			area = Math.max(area, Math.min(height[head], height[rear])
					* (rear - head));

			if (height[rear] > height[head]) {
				head++;
			} else {
				rear--;

			}
		}
		return area;
	}

	public static void main(String[] args) {
		int[] height = { 1, 1 };
		System.out.println(maxArea(height));
	}

}
