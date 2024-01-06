public class PainterPartition {

    static long max(int arr[]) {
        long max = Long.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    static long sum(int arr[]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static long minTime(int[] arr, int n, int k) {
        // code here
        long end = sum(arr);
        long start = max(arr);

        long ans = -1;

        while (start <= end) {
            long mid = start + (end - start) / 2;

            long painter = 1;
            long wall = 0;

            for (int i = 0; i < n; i++) {
                wall = wall + arr[i];
                if (wall > mid) {
                    painter++;
                    wall = arr[i];
                }
            }
            if (painter <= k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int arr[] = { 5, 10, 30, 20, 15 };

        System.out.println(minTime(arr, n, k));
    }
}