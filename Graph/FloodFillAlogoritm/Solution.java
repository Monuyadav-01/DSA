/**
 * Solution
 */
public class Solution {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Code here

        int initialColor = image[sr][sc];

        int ans[][] = image;

        int delRow[] = { -1, 0, 1, 0 };
        int delCol[] = { 0, -1, 0, 1 };

        dfs(sr, sc, newColor, initialColor, image, delRow, delCol);

        return ans;
    }

    private static void dfs(int row, int col, int newColor, int initialColor, int[][] image, int[] delRow,
            int[] delCol) {
        image[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for (int i = 0; i < 4; i++) {
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];

            if (nRow >= 0 && nCol >= 0 && nRow < n && nCol < m && image[nRow][nCol] == initialColor
                    && image[nRow][nCol] != newColor) {
                dfs(nRow, nCol, newColor, initialColor, image, delRow, delCol);
            }
        }
    }

    public static void main(String[] args) {
        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };

        // sr = 1, sc = 1, newColor = 2

        int[][] ans = floodFill(image, 1, 1, 2);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
}
