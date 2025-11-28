# N-Queens Problem

### Question:
The **n-queens** puzzle is the problem of placing `n` queens on an `n x n` chessboard such that **no two queens attack each other**.

Given an integer `n`, return **all distinct solutions** to the n-queens puzzle. You may return the answer in **any order**.

Each solution contains a distinct board configuration where `'Q'` indicates a queen and `'.'` indicates an empty space.

### Rules:
- Place `n` queens on an `n x n` board
- **No two queens** can be in the same row
- **No two queens** can be in the same column
- **No two queens** can be on the same diagonal
- Return all valid board configurations

### Examples:
```
Input: n = 4
Output: 
[
  [".Q..",
   "...Q",
   "Q...",
   "..Q."],

  ["..Q.",
   "Q...",
   "...Q",
   ".Q.."]
]

Explanation: There exist two distinct solutions to the 4-queens puzzle.

Input: n = 1
Output: [["Q"]]
```

### Test Cases:
| **Sr. No.** | **Function Call** | **Expected Output**                                             |
| ----------- | ----------------- | --------------------------------------------------------------- |
| 1           | `solveNQueens(4)` | `[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]` |
| 2           | `solveNQueens(1)` | `[["Q"]]`                                                       |
| 3           | `solveNQueens(2)` | `[]` (no solution)                                              |
| 4           | `solveNQueens(3)` | `[]` (no solution)                                              |