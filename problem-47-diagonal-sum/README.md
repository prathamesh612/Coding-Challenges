# Diagonal Sum

### Question:
Given a **square matrix**, calculate the **sum of both diagonals**.

### Rules:
- **Primary diagonal:** Top-left to bottom-right
- **Secondary diagonal:** Top-right to bottom-left
- If the matrix has **odd dimensions**, the **center element** is counted only once
- Return the **total sum** of both diagonals

### Examples:
```
Input: [[1,2,3],[4,5,6],[7,8,9]]
Primary: 1 + 5 + 9 = 15
Secondary: 3 + 5 + 7 = 15
Center overlap: 5 (subtract once)
Output: 25

Input: [[1,2],[3,4]]
Primary: 1 + 4 = 5
Secondary: 2 + 3 = 5
Output: 10
```

### Test Cases:
| **Sr. No.** | **Function Call**                                                                       | **Expected Output** |
| ----------- | --------------------------------------------------------------------------------------- | ------------------- |
| 1           | `diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}})`                                     | `25`                |
| 2           | `diagonalSum(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}})`              | `68`                |
| 3           | `diagonalSum(new int[][]{{1,2},{3,4}})`                                                 | `10`                |
| 4           | `diagonalSum(new int[][]{{5}})`                                                         | `5`                 |
| 5           | `diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}})`                     | `8`                 |
| 6           | `diagonalSum(new int[][]{{7,3,1,2,5},{6,4,8,5,2},{1,9,7,3,4},{8,2,5,6,1},{3,7,4,2,9}})` | `48`                |

> [!NOTE]
> Test cases use Java syntax for 2D arrays. Adjust for other languages.