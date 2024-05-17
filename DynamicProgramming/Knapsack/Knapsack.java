package Knapsack;

public class Knapsack {

    public static int knapHelper(int W, int wt[], int val[], int n, int dp[][]) {

        if (n == 0 || W == 0)
            return 0;

        if (dp[n][W] != -1)
            return dp[n][W];

        if (wt[n - 1] > W) {
            return dp[n][W] = knapHelper(W, wt, val, n - 1, dp);
        } else {
            return dp[n][W] = Math.max(val[n - 1] + knapHelper(W - wt[n - 1], wt, val, n - 1, dp),
                    knapHelper(W, wt, val, n - 1, dp));
        }

    }

    public static int knap(int W, int wt[], int val[], int n) {
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }
        return knapHelper(W, wt, wt, n, dp);
    }

    public static void main(String[] args) {

        int wt[] = { 1, 5, 6, 7 };
        int val[] = { 1, 3, 4, 9 };
        int W = 7;
        int ans = knap(W, wt, val, wt.length - 1);
        System.out.println(ans);

    }
}
