package onpassdp;

import java.util.Arrays;

public class ClimbingStairs {

    // memoization
    public static int memo(int n, int dp[]) {
        if (n == 0 || n == 1)
            return 1;

        if (dp[n] != -1)
            return dp[n];

        int one = climbing(n - 1);
        int two = climbing(n - 2);

        return dp[n] = one + two;
    }
    
    // 

    public static int climbing(int n) {
        // int dp[] = new int[n + 1];
        // Arrays.fill(dp, -1);
        // return memo(n, dp);

        // tabutation

        int dp[] = new int[n + 1];
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbing(n));
    }
}
