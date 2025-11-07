# Valid Sudoku  

### Question:  
Given a 9x9 Sudoku board, determine whether it is valid. A Sudoku board is considered valid if all filled cells follow the standard Sudoku rules. You only need to validate the filled cells; the empty cells can be ignored.  

### Rules:  
1. Each **row** must contain the digits 1 to 9 without any repetition.  
2. Each **column** must contain the digits 1 to 9 without any repetition.  
3. Each of the nine **3×3 sub-boxes** of the grid must also contain the digits 1 to 9 without repetition.  
4. Empty cells are represented by `'.'` and can be ignored during validation.  
5. Return `true` if the board is valid according to these rules, otherwise return `false`.  

### Example:  

**Valid Sudoku Board:**  
```

[
["5","3",".",".","7",".",".",".","."],
["6",".",".","1","9","5",".",".","."],
[".","9","8",".",".",".",".","6","."],
["8",".",".",".","6",".",".",".","3"],
["4",".",".","8",".","3",".",".","1"],
["7",".",".",".","2",".",".",".","6"],
[".","6",".",".",".",".","2","8","."],
[".",".",".","4","1","9",".",".","5"],
[".",".",".",".","8",".",".","7","9"]
]

```
**Output:** `true`

---

### Test Cases:  
| **Sr. No.** | **Function Call**                | **Expected Output** |
| ----------- | -------------------------------- | ------------------- |
| 1           | `isValidSudoku(validBoard)`      | `true`              |
| 2           | `isValidSudoku(invalidRowBoard)` | `false`             |
| 3           | `isValidSudoku(invalidColBoard)` | `false`             |
| 4           | `isValidSudoku(invalidBoxBoard)` | `false`             |