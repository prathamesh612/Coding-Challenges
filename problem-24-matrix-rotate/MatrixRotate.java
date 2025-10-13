import java.util.Arrays;

public class MatrixRotate {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotate(new int[][] { { 1 } })));
        System.out.println(Arrays.deepToString(rotate(new int[][] { { 1, 2 }, { 3, 4 } })));
        System.out.println(Arrays.deepToString(rotate(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })));
        System.out.println(Arrays.deepToString(rotate(new int[][] { { 0, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } })));
    }

    // Rotates matrix 90 degrees clockwise
    private static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];

        // Apply rotation formula: rotated[j][n-1-i] = matrix[i][j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }

        return rotated;
    }
}

/*
 * This program rotates a square matrix 90 degrees clockwise.
 * It creates a new matrix and fills it using the rotation transformation formula.
 * For each element at position [i][j] in the original matrix,
 * it is placed at position [j][n-1-i] in the rotated matrix.
 * Formula: `result[j][n-1-i] = matrix[i][j]`
 * Where:
 *      - `i` = row index in original
 *      - `j` = column index in original
 *      - `n` = size of matrix
 * This effectively rotates rows into columns from right to left.
 * Returns the newly rotated matrix while keeping the original unchanged.
 */