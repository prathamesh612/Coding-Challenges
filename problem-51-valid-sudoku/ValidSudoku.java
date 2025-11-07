import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] validBoard = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        char[][] invalidRowBoard = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '5' }, // repeated 5 in same row
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        char[][] invalidColBoard = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '5', '6', '.', '.', '.', '.', '2', '8', '.' }, // repeated 5 in column
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        char[][] invalidBoxBoard = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '5', '.', '1', '9', '.', '.', '.', '.' }, // repeated 5 in top-left box
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValidSudoku(validBoard));
        System.out.println(isValidSudoku(invalidRowBoard));
        System.out.println(isValidSudoku(invalidColBoard));
        System.out.println(isValidSudoku(invalidBoxBoard));
    }

    // Checks if the given Sudoku board is valid according to Sudoku rules
    private static boolean isValidSudoku(char[][] board) {

        // Validate each row and column
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.') {
                    if (!rowSet.add(board[i][j])) {
                        return false; // duplicate in row
                    }
                }

                // Check column
                if (board[j][i] != '.') {
                    if (!colSet.add(board[j][i])) {
                        return false; // duplicate in column
                    }
                }
            }
        }

        // Validate each 3x3 sub-box
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                HashSet<Character> boxSet = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char ch = board[boxRow + i][boxCol + j];
                        if (ch != '.') {
                            if (!boxSet.add(ch)) {
                                return false; // duplicate in 3x3 box
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}

/*
 * This method checks if a Sudoku board is valid.
 * It verifies all rows, columns, and 3x3 boxes for duplicate digits.
 * Uses HashSet to track seen numbers efficiently in each scope.
 * Time complexity: O(9²) → effectively O(1), since the board is fixed size.
 */
