import java.util.Arrays;

public class SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 38, 50 }
        };

        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 29)));
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 10)));
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 37)));
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 50)));
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 15)));
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 100)));
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 32)));
    }

    // Finds the position of a key in a sorted 2D matrix
    private static int[] searchInSortedMatrix(int[][] matrix, int key) {
        int[] result = { -1, -1 };
        int row = 0;
        int col = matrix[0].length - 1;

        // Optimized O(m + n) approach
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                result[0] = row;
                result[1] = col;
                break;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        // We can also solve this using O(n^2)
        /*
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        */
        return result;
    }
}

/*
 * This method searches for a given key in a matrix
 * where rows and columns are sorted in ascending order.
 * It starts from the top-right corner and moves left or down
 * based on comparison — achieving an O(m + n) time complexity.
 * We can also solve it using O(n²) by checking every element,
 * but that’s less efficient.
 *
 * Example walkthrough for optimized O(m + n) approach:
 * 10 20 30 40
 * 15 25 35 45
 * 27 29 37 48
 * 32 33 38 50
 *
 * Searching for 29:
 * → Start at top-right: 40
 * → 29 < 40, move left: 30
 * → 29 < 30, move left: 20
 * → 29 > 20, move down: 25
 * → 29 > 25, move down: 29 --> Found at (2, 1)
 */
