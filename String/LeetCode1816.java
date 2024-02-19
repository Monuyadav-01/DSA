/**
 * LeetCode1816
 */
public class LeetCode1816 {

    public static String truncateSentence(String s, int k) {

        /*
         * String str[] = s.split(" ");
         * if (str.length <= k) {
         * return s;
         * }
         * StringBuilder sb = new StringBuilder();
         * for (int i = 0; i < k; i++) {
         * 
         * if (i == k - 1) {
         * sb.append(str[i]);
         * } else {
         * sb.append(str[i] + " ");
         * }
         * 
         * }
         * return sb.toString();
         * 
         */

        int cnt = 0;
        String ans = "";
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                cnt++;
            }
            if (cnt == k) {
                ans = s.substring(0, i);
                break;
            }
            if (cnt < k) {
                ans = s;
            }

        }

        return ans;

    }

    // https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/solutions/3815889/java-easiest-solution
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 6;
        System.out.println(truncateSentence(s, k));
    }

}