import java.util.LinkedList;
import java.util.Queue;

public class ClosedIsland {

   public static int closedIslands(int[][] matrix, int N, int M)
   {
     // Code here

      int row_len = matrix.length;
        int col_len = matrix[0].length;

        int[] row = {-1, 1, 0, 0};
        int[] col = {0, 0, -1, 1};
        boolean[][] visited = new boolean[row_len][col_len];

        int cnt = 0;
        for (int i = 0; i < row_len; i++) {
            for (int j = 0; j < col_len; j++) {
                // Start BFS if we find an unvisited land cell
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    if (isClosedIsland(matrix, visited, i, j, row, col, row_len, col_len)) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
   }
    
   public static  boolean isClosedIsland(int[][] grid, boolean[][] visited, int i, int j, int[] row, int[] col, int row_len, int col_len) {
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i, j));
        visited[i][j] = true;

        boolean isClosed = true;

        while (!q.isEmpty()) {
            int nRow = q.peek().r;
            int nCol = q.peek().c;
            q.poll();

            // Check if the current cell is on the boundary
            if (nRow == 0 || nRow == row_len - 1 || nCol == 0 || nCol == col_len - 1) {
                isClosed = false;
            }

            for (int k = 0; k < 4; k++) {
                int new_row = nRow + row[k];
                int new_col = nCol + col[k];

                if (new_row >= 0 && new_col >= 0 && new_row < row_len && new_col < col_len && !visited[new_row][new_col] && grid[new_row][new_col] == 1) {
                    q.offer(new pair(new_row, new_col));
                    visited[new_row][new_col] = true;
                }
            }
        }

        return isClosed;
    }
   static class pair{
        int r;
        int c;
        
        pair(int r, int c) {
          this.r = r;
          this.c = c;
        }
    }
  public static void main(String[] args) {
    int mat[][] = 
         {{0, 0, 0, 0, 0, 0, 0, 1}, 
           {0, 1, 1, 1, 1, 0, 0, 1}, 
           {0, 1, 0, 1, 0, 0, 0, 1}, 
           {0, 1, 1, 1, 1, 0, 1, 0}, 
            { 1, 0, 0, 0, 0, 1, 0, 1 } };
   int N = mat.length;
   int M = mat[0].length;
       System.out.println(closedIslands(mat, N, M));
  }
}
