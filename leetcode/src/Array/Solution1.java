package Array;

import java.util.Hashtable;

public class Solution1 {

	public static int[] twoSum(int[] numbers, int target) {
		if (numbers.length == 1) {
			return numbers;
		}
		int[] result = new int[2];
		Hashtable<Integer, Integer> index = new Hashtable<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			index.put(numbers[i], i);
		}
		for (int i = 0; i < index.size(); i++) {
			int num = target - numbers[i];
			if (index.containsKey(num)&&i!=index.get(num)) {// 注意本身和本身相加等于 target 的情况！！！
				//System.out.println(num);
				result[0] = i+1;
				result[1] = index.get(num)+1;
				return result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int[] result = twoSum(numbers, 9);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
