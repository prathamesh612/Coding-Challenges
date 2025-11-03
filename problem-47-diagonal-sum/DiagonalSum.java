public class DiagonalSum {

    public static void main(String[] args) {

        System.out.println(diagonalSum(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        }));

        System.out.println(diagonalSum(new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        }));

        System.out.println(diagonalSum(new int[][] {
                { 1, 2 },
                { 3, 4 }
        }));

        System.out.println(diagonalSum(new int[][] {
                { 5 }
        }));

        System.out.println(diagonalSum(new int[][] {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        }));

        System.out.println(diagonalSum(new int[][] {
                { 7, 3, 1, 2, 5 },
                { 6, 4, 8, 5, 2 },
                { 1, 9, 7, 3, 4 },
                { 8, 2, 5, 6, 1 },
                { 3, 7, 4, 2, 9 }
        }));
    }

    // Returns the sum of both diagonals of a square matrix
    private static int diagonalSum(int[][] matrix) {
        int result = 0;
        int n = matrix.length;

        // Optimized O(n) approach
        for (int i = 0; i < n; i++) {
            // Primary diagonal
            result += matrix[i][i];

            // Secondary diagonal
            if (i != n - 1 - i)
                result += matrix[i][n - 1 - i];
        }

        // We can also solve this using O(n^2) by checking each element
        /*
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j == n - 1))
                    result += matrix[i][j];
            }
        }
        */

        return result;
    }
}

/*
 * This method finds the sum of both diagonals in a square matrix.
 * It first uses an O(n) approach by traversing diagonals directly.
 * We can also do it in O(n²) by checking every cell, but that’s slower.
 * The center element is counted only once when the matrix size is odd.
 */
