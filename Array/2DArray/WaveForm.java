
/**
 * WaveForm
 */
public class WaveForm {

    public static void main(String[] args) {
        int matrix[][] = {
                { 3, 6, 4, 2 },
                { 7, 8, 11, 5 },
                { 9, 3, 12, 1 },
                { 12, 8, 5, 9 }
        };

        int col = matrix[0].length;
        int row = matrix.length;

        for (int column_index = 0; column_index < col; column_index++) {
            if (column_index % 2 == 0) {
                for (int row_idx = 0; row_idx < row; row_idx++) {
                    System.out.print(matrix[row_idx][column_index] + " ");
                }
            } else {
                for (int wave = row - 1; wave >= 0; wave--) {
                    System.out.print(matrix[wave][column_index] + " ");
                }
            }
        }
    }
}