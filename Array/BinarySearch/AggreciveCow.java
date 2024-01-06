import java.util.Arrays;

public class AggreciveCow {

    public static int solve(int n, int k, int[] stalls) {

        Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n - 1] - stalls[0];
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int cows = 1;
            int pos = stalls[0];
            for (int i = 1; i < n; i++) {
                if (pos + mid <= stalls[i]) {
                    cows++;
                    pos = stalls[i];
                }
            }
            if (cows < k) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int stalls[] = { 10, 1, 2, 7, 5 };
        int n = stalls.length;
        int k = 3;

        System.out.println(solve(n, k, stalls));
    }
}
