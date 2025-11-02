# Spiral Matrix

### Question:
Given a **2D matrix**, return all elements in **spiral order** (clockwise from outside to inside).

### Rules:
- Start from **top-left** corner
- Move **right** → **down** → **left** → **up** in spiral pattern
- Continue inward until all elements are visited
- Return elements as a **single list** in order

### Visualization:
```
Matrix:
1  2  3  4
5  6  7  8
9  10 11 12

Spiral order:
→ → → ↓
        ↓
← ← ← ←
↓
→ → ↑

Result: [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
```

### Examples:
```
Input: [[1,2,3],[4,5,6],[7,8,9]]
1 2 3
4 5 6
7 8 9

Spiral: 1→2→3→6→9→8→7→4→5
Output: [1,2,3,6,9,8,7,4,5]

Input: [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
1  2  3  4
5  6  7  8
9  10 11 12

Spiral: 1→2→3→4→8→12→11→10→9→5→6→7
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```

### Test Cases:
| **Sr. No.** | **Function Call**                                            | **Expected Output**            |
| ----------- | ------------------------------------------------------------ | ------------------------------ |
| 1           | `spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})`          | `[1,2,3,6,9,8,7,4,5]`          |
| 2           | `spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}})` | `[1,2,3,4,8,12,11,10,9,5,6,7]` |
| 3           | `spiralOrder(new int[][]{{1,2},{3,4}})`                      | `[1,2,4,3]`                    |
| 4           | `spiralOrder(new int[][]{{1}})`                              | `[1]`                          |
| 5           | `spiralOrder(new int[][]{{1,2,3},{4,5,6}})`                  | `[1,2,3,6,5,4]`                |
| 6           | `spiralOrder(new int[][]{{1},{2},{3}})`                      | `[1,2,3]`                      |
| 7           | `spiralOrder(new int[][]{{1,2,3,4,5},{6,7,8,9,10}})`         | `[1,2,3,4,5,10,9,8,7,6]`       |

> [!NOTE]
> Test cases use Java syntax for 2D arrays. Adjust for other languages.