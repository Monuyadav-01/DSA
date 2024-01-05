package SlidingWindow;

/**
 * Q1
 */
public class Q1 {

    public static long maxSumWithK(long a[], long n, long k) {

        long ans = -1000000000; // Define the equivalent of -1e9 in Java
        long sum = 0, prevSum = 0;
        int i = 0, j = 0;
        while (j < n) {
            sum += a[j];
            if (j - i + 1 == k) {
                ans = Math.max(ans, sum);
            } else if (j - i + 1 > k) {
                ans = Math.max(ans, sum);
                prevSum += a[i];
                i++;
                if (prevSum < 0) {
                    sum -= prevSum;
                    ans = Math.max(ans, sum);
                    prevSum = 0;
                }
            }
            j++;
        }
        return ans;

    }

    public static void main(String[] args) {
        long a[] = { 1, -2, 2, -3 };
        int k = 2;
        int n = a.length;

        System.out.println(maxSumWithK(a, n, k));
    }
}