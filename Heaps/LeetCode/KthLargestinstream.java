import java.util.PriorityQueue;

public class KthLargestinstream {

    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        // make a min heap
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        int[] ans = new int[n];
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() < k) {
                ans[idx++] = -1;

            } else {

                if (pq.size() > k) {
                    pq.remove();

                }
                ans[idx++] = pq.peek();

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int ans[] = kthLargest(4, arr, arr.length);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
