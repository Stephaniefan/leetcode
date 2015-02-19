package BinarySearch;
public class Solution50 {
/*采用二分法 递归 分解到x*x
 * 最后一层时 n==2 return x*x
 * function 主要是靠平方实现，n%2==0时直接分解否则先乘x 再向下
 */
	public static double pow(double x, int n) {
		if(n>Integer.MAX_VALUE||n<Integer.MIN_VALUE){
			n=Integer.MAX_VALUE;
		}
		if ( n == 1 ) {
			return x;
		}
		if (n == 0) {
			return 1.00;
		}
		if (n == -1) {
			return 1 / x;
		}
		if (n == 2) {
			return x * x;
		}
		if (n < 0) {
			if(n == Integer.MIN_VALUE){
				return (1 / x)/pow(x,Integer.MAX_VALUE);
				/*Integer.MIN_VALUE==-2147483648 直接取反会溢出 故直接转为 Integer.MAX_VALUE
				 * 又Integer.MAX_VALUE==2147483647故需要再乘（1/x）
				*/
			}else{
				return 1 / pow(x, -n);
			}
			
		}
		if (n % 2 == 0) {
			return pow((pow(x, n / 2)), 2);
		} else {
			return x * pow(x, n - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(pow(-1.00000, -2147483648));
		System.out.println(Math.pow(-1.00000, -2147483648));
	}
}
