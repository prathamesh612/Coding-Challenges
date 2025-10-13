# Matrix Rotate

### Question:
Given a **matrix** (an array of arrays), rotate it **90 degrees clockwise** and return the rotated matrix.

### Visual Example:
```
Original Matrix:          After 90° Clockwise Rotation:
1  2                      3  1
3  4                      4  2
```

### Rotation Pattern:
```
Original:                 Rotated:
1  2  3                   7  4  1
4  5  6        →          8  5  2
7  8  9                   9  6  3
```

### Test Cases:
| **Sr. No.** | **Function Call**                                      | **Expected Output**                 |
| ----------- | ------------------------------------------------------ | ----------------------------------- |
| 1           | `rotate(new int[][]{{1}})`                             | `[[1]]`                             |
| 2           | `rotate(new int[][]{{1, 2}, {3, 4}})`                  | `[[3, 1], [4, 2]]`                  |
| 3           | `rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})` | `[[7, 4, 1], [8, 5, 2], [9, 6, 3]]` |
| 4           | `rotate(new int[][]{{0, 1, 0}, {1, 0, 1}, {0, 0, 0}})` | `[[0, 1, 0], [0, 0, 1], [0, 1, 0]]` |

> [!NOTE]
> Test cases use Java syntax for 2D arrays. Adjust for other languages.

---