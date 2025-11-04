# Search In Sorted Matrix

### Question:
Given a **2D matrix** where each **row** and each **column** is sorted in **ascending order**, find the position of a given key.

If the key is **found**, return its position as `[row, column]`.  
If the key is **not found**, return `[-1, -1]`.

### Matrix Properties:
- Each **row** is sorted left to right
- Each **column** is sorted top to bottom

### Test Cases:
| **Sr. No.** | **Function Call**                   | **Expected Output** |
| ----------- | ----------------------------------- | ------------------- |
| 1           | `searchInSortedMatrix(matrix, 29)`  | `[2, 1]`            |
| 2           | `searchInSortedMatrix(matrix, 10)`  | `[0, 0]`            |
| 3           | `searchInSortedMatrix(matrix, 37)`  | `[2, 2]`            |
| 4           | `searchInSortedMatrix(matrix, 50)`  | `[3, 3]`            |
| 5           | `searchInSortedMatrix(matrix, 15)`  | `[1, 0]`            |
| 6           | `searchInSortedMatrix(matrix, 100)` | `[-1, -1]`          |
| 7           | `searchInSortedMatrix(matrix, 32)`  | `[3, 0]`            |

> [!NOTE]
> Test cases use Java syntax for 2D arrays. Return type is `int[]` with two elements `[row, column]`.