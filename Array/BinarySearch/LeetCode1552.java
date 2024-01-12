import java.util.Arrays;

/**
 * LeetCode1552
 */
public class LeetCode1552 {

    public static int maxDistance(int[] position, int m) {
        int start = 0;
        int n = position.length;
        Arrays.sort(position);
        int end = position[n - 1] - position[0];
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ballcnt = 1;
            int ballPos = position[0];

            for (int i = 1; i < n; i++) {
                if (ballPos + mid <= position[i]) {
                    ballcnt++;
                    ballPos = position[i];
                }
            }
            if (ballcnt < m) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] position = { 1, 2, 3, 4, 7 };
        int m = 3;

        System.out.println(maxDistance(position, m));
    }
}
