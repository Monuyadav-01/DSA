import java.util.PriorityQueue;

/**
 * ProblemNo2558
 */
public class ProblemNo2558 {
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for (int i : gifts) {
            pq.add(i);
        }
        long ans = 0;

        while (k-- > 0) {
            int x = pq.poll();
            pq.offer((int) Math.sqrt(x));
        }
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        int gifts[] = { 25, 64, 9, 4, 100 };
        System.out.println(pickGifts(gifts, 4));
    }
}