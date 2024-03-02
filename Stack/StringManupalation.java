import java.util.Stack;
import java.util.Vector;

public class StringManupalation {

    static int removeConsecutiveSame(Vector<String> v) {
        // Your code goes here

        Stack<String> st = new Stack<>();

        for (String str : v) {
            if (!(st.isEmpty()) && st.peek().equals(str)) {
                st.pop();
            } else {
                st.push(str);
            }
        }
        return st.size();
    }

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("ab");
        v.add("aa");
        v.add("aa");
        v.add("bcd");
        v.add("abc");

        System.out.println(removeConsecutiveSame(v));
    }
}
