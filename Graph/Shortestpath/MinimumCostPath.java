import java.util.PriorityQueue;

public class MinimumCostPath {

  static class Pair {
    int r;
    int c;
    int wt;

    Pair(int r, int c, int wt) {
      this.r = r;
      this.c = c;
      this.wt = wt;
    }
  }

  public static int minimumCostPath(int[][] grid) {
    int[] row = { -1, 1, 0, 0 };
    int[] col = { 0, 0, -1, 1 };
    int n = grid.length;
    int m = grid[0].length;
    boolean[][] vis = new boolean[n][m];

    PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.wt - y.wt);
    pq.add(new Pair(0, 0, grid[0][0]));
    vis[0][0] = true;

    while (!pq.isEmpty()) {
      Pair current = pq.poll();
      int i = current.r;
      int j = current.c;
      int wt = current.wt;

      if (i == n - 1 && j == m - 1) {
        return wt;
      }

      for (int k = 0; k < 4; k++) {
        int n_row = i + row[k];
        int n_col = j + col[k];

        if (n_row >= 0 && n_row < n && n_col >= 0 && n_col < m && !vis[n_row][n_col]) {
          pq.add(new Pair(n_row, n_col, wt + grid[n_row][n_col]));
          vis[n_row][n_col] = true;
        }
      }
    }
    return -1; // If there is no path to the bottom-right corner
  }

  public static void main(String[] args) {
    int[][] grid = {{9,4,9,9},{6,7,6,4},
        { 8, 3, 3, 7 }, { 7, 4, 9, 10 } };
    System.out.println(minimumCostPath(grid)); // Expected output should be the minimum cost path
  }
}
