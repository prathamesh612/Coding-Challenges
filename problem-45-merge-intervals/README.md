# Merge Intervals

### Question:
Given a **collection of intervals**, merge all **overlapping intervals** and return a list of non-overlapping intervals.

### Rules:
- An interval is represented as `[start, end]`
- Two intervals **overlap** if they have any common time
- Examples of overlapping: `[1,3]` and `[2,6]` → merge to `[1,6]`
- Examples of non-overlapping: `[1,2]` and `[3,4]` → remain separate
- Return intervals **sorted** by start time

### Examples:
```
Input: [[1,3],[2,6],[8,10],[15,18]]
→ [1,3] and [2,6] overlap → merge to [1,6]
→ [8,10] standalone
→ [15,18] standalone
Output: [[1,6],[8,10],[15,18]]

Input: [[1,4],[4,5]]
→ [1,4] and [4,5] touch at 4 → merge to [1,5]
Output: [[1,5]]

Input: [[1,4],[0,4]]
→ [0,4] and [1,4] overlap → merge to [0,4]
Output: [[0,4]]
```

### Test Cases:
| **Sr. No.** | **Function Call**                                | **Expected Output**      |
| ----------- | ------------------------------------------------ | ------------------------ |
| 1           | `merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})` | `[[1,6],[8,10],[15,18]]` |
| 2           | `merge(new int[][]{{1,4},{4,5}})`                | `[[1,5]]`                |
| 3           | `merge(new int[][]{{1,4},{0,4}})`                | `[[0,4]]`                |
| 4           | `merge(new int[][]{{1,4},{2,3}})`                | `[[1,4]]`                |
| 5           | `merge(new int[][]{{1,3},{2,4},{5,7},{6,8}})`    | `[[1,4],[5,8]]`          |
| 6           | `merge(new int[][]{{1,10},{2,6},{8,9}})`         | `[[1,10]]`               |
| 7           | `merge(new int[][]{{1,2},{3,4},{5,6}})`          | `[[1,2],[3,4],[5,6]]`    |

> [!NOTE]
> Test cases use Java syntax for 2D arrays. Adjust for other languages.