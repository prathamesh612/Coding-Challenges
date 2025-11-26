# Move Zeroes to End

### Question:
Given an integer array `nums`, move all `0`'s to the **end** of it while maintaining the **relative order** of the non-zero elements.

### Rules:
- Move all zeros to the **end** of the array
- Maintain the **relative order** of non-zero elements
- Must be done **in-place** without making a copy of the array
- Minimize the number of operations

### Examples:
```
Input: nums = [0, 1, 0, 3, 12]
Process:
  - Move first 0 to end: [1, 0, 3, 12, 0]
  - Move second 0 to end: [1, 3, 12, 0, 0]
Output: [1, 3, 12, 0, 0]

Input: nums = [0]
No non-zero elements
Output: [0]

Input: nums = [1, 2, 3]
No zeros to move
Output: [1, 2, 3]
```

### Test Cases:
| **Sr. No.** | **Input Array**                  | **Expected Output**              |
| ----------- | -------------------------------- | -------------------------------- |
| 1           | `[0, 1, 0, 3, 12]`               | `[1, 3, 12, 0, 0]`               |
| 2           | `[0]`                            | `[0]`                            |
| 3           | `[1, 2, 3]`                      | `[1, 2, 3]`                      |
| 4           | `[0, 0, 1]`                      | `[1, 0, 0]`                      |
| 5           | `[2, 1]`                         | `[2, 1]`                         |
| 6           | `[4, 2, 4, 0, 0, 3, 0, 5, 1, 0]` | `[4, 2, 4, 3, 5, 1, 0, 0, 0, 0]` |
| 7           | `[0, 0, 0, 1, 2, 3]`             | `[1, 2, 3, 0, 0, 0]`             |

> [!NOTE]
> Array is modified in-place.