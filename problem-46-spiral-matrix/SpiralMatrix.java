import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
        System.out.println(spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }));
        System.out.println(spiralOrder(new int[][] { { 1, 2 }, { 3, 4 } }));
        System.out.println(spiralOrder(new int[][] { { 1 } }));
        System.out.println(spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }));
        System.out.println(spiralOrder(new int[][] { { 1 }, { 2 }, { 3 } }));
        System.out.println(spiralOrder(new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } }));
    }

    // Returns all matrix elements in spiral (clockwise) order
    private static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        // Define boundaries for top, bottom, left, and right
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // Continue looping until boundaries overlap
        while (top <= bottom && left <= right) {
            // Traverse top row (left to right)
            for (int j = left; j <= right; j++)
                result.add(matrix[top][j]);
            top++;

            // Traverse right column (top to bottom)
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;

            // Traverse bottom row (right to left)
            if (top <= bottom) {
                for (int j = right; j >= left; j--)
                    result.add(matrix[bottom][j]);
                bottom--;
            }

            // Traverse left column (bottom to top)
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result; // return elements in spiral order
    }
}

/*
 * This method prints all elements of a 2D matrix in spiral (clockwise) order.
 * It uses four boundaries — top, bottom, left, and right — to control traversal.
 * The loop continues until all layers of the matrix are processed.
 *
 * Process:
 * 1. Traverse top row → right column → bottom row → left column.
 * 2. Move boundaries inward after completing each direction.
 * 3. Repeat until all elements are visited.
 *
 * Used: Boundary pointers to simulate spiral traversal efficiently in O(m * n) time.
 */
