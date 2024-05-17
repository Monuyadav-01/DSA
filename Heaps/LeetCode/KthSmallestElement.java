import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int KthSmallest(int arr[], int k) {
        // first method for this
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }
        if (pq.size() < k)
            return -1;
        while (k != 1) {
            pq.remove();
            k--;
        }
        return pq.peek();
    }

    // second method for this
    public static int kth(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < pq.peek()) {
                pq.poll();
                pq.add(arr[i]);

            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = { 10, 3, 7, 4, 8, 9, 2, 6 };
        int k = 4;
        System.out.println(KthSmallest(arr, k));
        System.out.println(kth(arr, k));
    }
}
