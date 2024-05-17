import java.util.Stack;

/**
 * April4
 */
public class April4 {

    public static int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);

            } else if (ch == ')') {

                max = Math.max(max, st.size());
                st.pop();

            }

        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(1)+((2))+(((3)))";
        System.out.println(maxDepth(s));
    }
}