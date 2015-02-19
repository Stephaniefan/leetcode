package BinarySearch;
public class Solution74 {

	public static boolean searchMatrix(int[][] matrix, int target) {
		int sr = 0;
		int sc = 0;
		int ec = matrix[0].length - 1;
		int er = matrix.length - 1;
		int midr = 0;
		// search for the row
		while (sr < er - 1) {
			midr = sr + (er-sr) / 2;
			if (matrix[midr][sc] == target) {
				return true;
			} else if (matrix[midr][sc] < target) {
				sr = midr;
			} else if (matrix[midr][sc] > target) {
				er = midr;
			}
			//System.out.println(sr);
		}
		if (matrix[sr][sc] == target) {
			return true;
		} else if (matrix[er][sc] == target) {
			return true;
		} else if (target < matrix[er][sc] && target > matrix[sr][sc]) {
			midr = sr;
		} else if (target > matrix[er][sc]) {
			midr = er;
		}

		// search for the column
		while (sc < ec - 1) {
			int midc = sc + (ec - sc) / 2;
			if (matrix[midr][midc] == target) {
				return true;
			} else if (matrix[midr][midc] < target) {
				sc = midc;
			} else if (matrix[midr][midc] > target) {
				ec = midc;
			}
		}

		if (matrix[midr][sc] == target) {
			return true;
		} else if (matrix[midr][ec] == target) {
			return true;
		}
		return false;
	}
	public static void main(String [] args){
		int[][] zero =new  int[][] {{-9,-7,-7,-6,-6,-6,-5},{-4,-4,-2,0,0,0,0},{1,1,3,4,5,7,9},{10,10,12,14,16,17,19},{20,20,20,21,23,24,26}};
		System.out.println(searchMatrix(zero,6));
	}
}
