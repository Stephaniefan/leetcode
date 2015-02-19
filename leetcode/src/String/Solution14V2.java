package String;
/*
 * compare each character from the beginning of each string in the array
 * once find the shortest string in the array and meanwhile if equals to char c return that value
 * else if the character does not equal to the one in the string return the identical part(substring(0,p))
 */
public class Solution14V2 {

	public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int p;
        for (p = 0; p < strs[0].length(); p++) {
            char c = strs[0].charAt(p);
            // check all strings in array strs
            for (int i = 0; i < strs.length; i++) {
                if (p == strs[i].length()) {
                    return strs[i];
                } else if (c != strs[i].charAt(p)) {
                    return strs[i].substring(0, p);
                }
            }
            // if all strings have the same prefix
            // continue checking it
        }
        // first string in array strs is the shortest common prefix
        return strs[0];
    }

}
