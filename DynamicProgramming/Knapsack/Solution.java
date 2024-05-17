package Knapsack;

public class Solution {
    public static String reversePrefix(String word, char ch) {
        boolean exists = isExists(word, ch);
        StringBuilder sb = new StringBuilder();
        if (!exists) {
            return word;
        } else {
            int i = 0;
            int n = word.length();

            while (word.charAt(i) != ch) {
                sb.append(word.charAt(i));
                i++;
            }
            sb.reverse();
            while (i < n) {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isExists(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
}
