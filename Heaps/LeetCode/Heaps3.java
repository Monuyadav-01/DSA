import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Heaps3 {

    public static int nchoc(int A, int[] B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : B) {
            pq.add(i);
        }
        int ans = 0;
        while (A-- > 0) {
            int x = pq.poll();
            if (x != 0) {
                ans += x;
                pq.add(x / 2);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int A = 34;
        int[] B = { 69, 61 };

        System.out.println(nchoc(A, B));
    }
}
