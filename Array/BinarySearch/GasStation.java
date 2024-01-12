import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GasStation {

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.

        Stack<Integer> st = new Stack<>();
        Queue<Integer> qt = new LinkedList<>();

        int i = 0;
        while (i < k) {
            st.push(q.poll());
            i++;
        }
        while (!st.isEmpty()) {
            qt.add(st.pop());
        }
        while (!q.isEmpty()) {

            qt.add(q.poll());

        }

        return qt;

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Queue<Integer> ans = modifyQueue(q, 3);

        while (!ans.isEmpty()) {
            System.out.println(ans.peek());
            ans.poll();
        }
    }
}
