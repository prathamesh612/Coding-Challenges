import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
        System.out.println(solveNQueens(1));
        System.out.println(solveNQueens(2));
        System.out.println(solveNQueens(3));
    }

    // Solves the N-Queens puzzle and returns all valid board arrangements
    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // fill board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(0, board, result, n);
        return result;
    }

    private static void solve(int row, char[][] board, List<List<String>> result, int n) {

        // all queens placed successfully
        if (row == n) {
            result.add(construct(board));
            return;
        }

        // try placing queen in each column of the current row
        for (int col = 0; col < n; col++) {

            if (isValid(board, row, col, n)) {

                board[row][col] = 'Q'; // place queen
                solve(row + 1, board, result, n);
                board[row][col] = '.'; // backtrack
            }
        }
    }

    private static boolean isValid(char[][] board, int row, int col, int n) {

        // check same column
        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q')
                return false;

        // check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        // check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    private static List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            list.add(new String(row));
        }
        return list;
    }
}

/*
 * We place queens row by row. For each row we try every column and only place a
 * queen if it does not clash with any other queen in the same column or diagonals.
 * Whenever a placement is safe we move to the next row. If we reach the end, the
 * current board is one valid solution. Backtracking helps us explore all setups.
 */
