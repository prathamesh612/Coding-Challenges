# Set Matrix Zeroes

### Question:
Given an **m x n** integer matrix, if an element is **0**, set its **entire row and column** to **0**. You must do it **in-place**.

### Rules:
- Modify the matrix **in-place** (don't create a new matrix)
- If any cell is `0`, set its **entire row** to `0`
- If any cell is `0`, set its **entire column** to `0`
- All zeros should be set **simultaneously** (based on original matrix)

### Examples:
```
Input:
[1, 1, 1]
[1, 0, 1]
[1, 1, 1]

Cell (1,1) is 0 → Set row 1 and column 1 to 0

Output:
[1, 0, 1]
[0, 0, 0]
[1, 0, 1]
```

```
Input:
[0, 1, 2, 0]
[3, 4, 5, 2]
[1, 3, 1, 5]

Cell (0,0) and (0,3) are 0 → Set row 0, column 0, and column 3 to 0

Output:
[0, 0, 0, 0]
[0, 4, 5, 0]
[0, 3, 1, 0]
```

### Test Cases:
| **Sr. No.** | **Input Matrix**                  | **Expected Output**               |
| ----------- | --------------------------------- | --------------------------------- |
| 1           | `[[1,1,1],[1,0,1],[1,1,1]]`       | `[[1,0,1],[0,0,0],[1,0,1]]`       |
| 2           | `[[0,1,2,0],[3,4,5,2],[1,3,1,5]]` | `[[0,0,0,0],[0,4,5,0],[0,3,1,0]]` |
| 3           | `[[1,2,3],[4,0,6],[7,8,9]]`       | `[[1,0,3],[0,0,0],[7,0,9]]`       |
| 4           | `[[0,0],[0,0]]`                   | `[[0,0],[0,0]]`                   |
| 5           | `[[1,2],[3,4]]`                   | `[[1,2],[3,4]]`                   |
| 6           | `[[1,0,3]]`                       | `[[0,0,0]]`                       |
| 7           | `[[1],[0],[3]]`                   | `[[0],[0],[0]]`                   |

> [!NOTE]
> Test cases use Java syntax for 2D arrays. Matrix is modified in-place.