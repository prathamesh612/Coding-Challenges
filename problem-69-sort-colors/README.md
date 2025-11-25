# Sort Colors

### Question:
Given an array `nums` with `n` objects colored **red**, **white**, or **blue**, sort them **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We use the integers `0`, `1`, and `2` to represent the colors red, white, and blue, respectively.

### Rules:
- Sort the array **in-place** (without using extra space)
- Colors represented as: `0` (red), `1` (white), `2` (blue)
- Final array should be sorted: all `0`s, then all `1`s, then all `2`s
- **Do not** use the library's sort function

### Examples:
```
Input: nums = [2, 0, 2, 1, 1, 0]
After sorting: [0, 0, 1, 1, 2, 2]
Output: [0, 0, 1, 1, 2, 2]

Input: nums = [2, 0, 1]
After sorting: [0, 1, 2]
Output: [0, 1, 2]
```

### Test Cases:
| **Sr. No.** | **Input Array**               | **Expected Output**           |
| ----------- | ----------------------------- | ----------------------------- |
| 1           | `[2, 0, 2, 1, 1, 0]`          | `[0, 0, 1, 1, 2, 2]`          |
| 2           | `[2, 0, 1]`                   | `[0, 1, 2]`                   |
| 3           | `[0]`                         | `[0]`                         |
| 4           | `[1]`                         | `[1]`                         |
| 5           | `[2, 2, 2, 1, 1, 0]`          | `[0, 1, 1, 2, 2, 2]`          |
| 6           | `[1, 2, 0]`                   | `[0, 1, 2]`                   |
| 7           | `[0, 0, 0, 1, 1, 1, 2, 2, 2]` | `[0, 0, 0, 1, 1, 1, 2, 2, 2]` |

> [!NOTE]
> Array is modified in-place. Use Dutch National Flag algorithm for optimal O(n) solution.