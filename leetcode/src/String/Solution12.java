package String;

public class Solution12 {

	public static String intToRoman(int num) {
		String[] ten = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII",
				"IX" };
		String[] tenS = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX",
				"LXXX", "XC" };
		String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC",
				"DCCC", "CM" };
		String[] thousands = { "", "M", "MM", "MMM" };
		StringBuilder result = new StringBuilder();
		result.append(thousands[num / 1000]);
		num = num % 1000;
		result.append(hundreds[num / 100]);
		num = num % 100;
		result.append(tenS[num / 10]);
		result.append(ten[num % 10]);
		return result.toString();
	}

	public static void main(String[] args) {
		
			System.out.println(intToRoman(101));
		
	}

}
