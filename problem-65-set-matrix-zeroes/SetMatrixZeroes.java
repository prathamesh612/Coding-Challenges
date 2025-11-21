import java.util.Arrays;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix1);
        System.out.println(Arrays.deepToString(matrix1));

        int[][] matrix2 = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        setZeroes(matrix2);
        System.out.println(Arrays.deepToString(matrix2));

        int[][] matrix3 = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
        setZeroes(matrix3);
        System.out.println(Arrays.deepToString(matrix3));

        int[][] matrix4 = { { 0, 0 }, { 0, 0 } };
        setZeroes(matrix4);
        System.out.println(Arrays.deepToString(matrix4));

        int[][] matrix5 = { { 1, 2 }, { 3, 4 } };
        setZeroes(matrix5);
        System.out.println(Arrays.deepToString(matrix5));

        int[][] matrix6 = { { 1, 0, 3 } };
        setZeroes(matrix6);
        System.out.println(Arrays.deepToString(matrix6));

        int[][] matrix7 = { { 1 }, { 0 }, { 3 } };
        setZeroes(matrix7);
        System.out.println(Arrays.deepToString(matrix7));
    }

    private static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row/column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Fill cells based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Zero first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

/*
 * First checked if first row or first column contains any zero.
 * Then used first row and first column as markers to remember which rows/columns must be zeroed.
 * Next pass sets the internal matrix cells to zero wherever markers indicate.
 * At the end, if first row or first column originally had zero, they are fully zeroed.
 * This avoids using extra space and solves the problem in O(m*n) time.
 */