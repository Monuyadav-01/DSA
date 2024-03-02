import java.util.Stack;

public class SortStack {

    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if (s.isEmpty())
            return s;

        int ele = s.pop();

        sort(s);
        insert(s, ele);
        return s;
    }

    public static void insert(Stack<Integer> s, int ele) {

        if (s.isEmpty() || s.peek() < ele) {
            s.push(ele);
            return;
        }
        int temp = s.pop();
        insert(s, ele);
        s.push(temp);

    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(12);
        st.push(15);
        st.push(14);
        st = sort(st);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
