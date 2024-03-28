import java.util.LinkedList;
import java.util.Queue;

public class NumberislandGFG {

    static class pair {
        int f;
        int s;

        pair(int f, int s) {
            this.f = f;
            this.s = s;
        }
    }

    public static void bfs(int row, int col, String[][] grid, int vis[][]) {
        vis[row][col] = 1;
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(row, col));
        int n = grid.length;
        int m = grid[0].length;

        while (!q.isEmpty()) {
            int r = q.peek().f;
            int c = q.peek().s;
            q.remove();

            for (int delRow = -1; delRow <= 1; delRow++) {
                for (int delCol = -1; delCol <= 1; delCol++) {
                    int nRow = r + delRow;
                    int nCol = c + delCol;

                    if (nRow < n && nRow >= 0 && nCol >= 0 && nCol < m && grid[nRow][nCol] == "1"
                            && vis[nRow][nCol] == 0) {
                        vis[nRow][nCol] = 1;
                        q.add(new pair(nRow, nCol));
                    }
                }
            }
        }
    }

    public static int numIslands(String[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;

        int vis[][] = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (vis[i][j] == 0 && grid[i][j] == "1") {
                    cnt++;
                    bfs(i, j, grid, vis);
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String grid[][] = {
                { "1", "1", "1", "1", "0" },
                { "1", "1", "0", "1", "0" },
                { "1", "1", "0", "0", "0" },
                { "0", "0", "0", "0", "0" }
        };

        System.out.println(
                numIslands(grid));
    }

}
