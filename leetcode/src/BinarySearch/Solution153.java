package BinarySearch;
public class Solution153 {

	public static int findMin(int[] num) {
		int start = 0;
		int end = num.length - 1;
		int mid = 0;

		while (end - start > 1) {
			mid = start + (end - start) / 2;
			if (num[mid] < num[mid + 1] && num[mid] < num[mid - 1]) {
				return num[mid];
			} else if (num[start] > num[mid]) {
				end = mid;
			} else if (num[start] < num[mid] && num[end] > num[mid]) {
				end =mid;
			}else if(num[start] < num[mid] && num[end]< num[mid]){
				start = mid;
			}
		}
		if (num[start] < num[end]) {
			return num[start];
		} else {
			return num[end];
		}
	}
	public static void main(String[] args) {
		int test[] = { 7,8,9,10,11,20,1,2,3,4};
		System.out.println(findMin(test));
	}
}
