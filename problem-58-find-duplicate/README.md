# Find Duplicate Number

### Question:
Given an array of integers containing **n + 1** integers where each integer is in the range **[1, n]** inclusive, there is **exactly one repeated number**. Find and return this **duplicate number**.

### Rules:
- The array contains `n + 1` integers
- Each integer is between `1` and `n` (inclusive)
- Only **one number** appears more than once
- The duplicate number may appear **more than twice**
- You must solve it **without modifying** the array

### Examples:
```
Input: nums = [1, 3, 4, 2, 2]
n = 4 (range 1-4)
Duplicate: 2 (appears twice)
Output: 2

Input: nums = [3, 1, 3, 4, 2]
Duplicate: 3 (appears twice)
Output: 3

Input: nums = [1, 1]
Duplicate: 1
Output: 1
```

### Test Cases:
| **Sr. No.** | **Function Call**                                           | **Expected Output** |
| ----------- | ----------------------------------------------------------- | ------------------- |
| 1           | `findDuplicate(new int[]{1, 3, 4, 2, 2})`                   | `2`                 |
| 2           | `findDuplicate(new int[]{3, 1, 3, 4, 2})`                   | `3`                 |
| 3           | `findDuplicate(new int[]{1, 1})`                            | `1`                 |
| 4           | `findDuplicate(new int[]{1, 1, 2})`                         | `1`                 |
| 5           | `findDuplicate(new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1, 4})` | `9`                 |
| 6           | `findDuplicate(new int[]{4, 3, 1, 4, 2})`                   | `4`                 |
| 7           | `findDuplicate(new int[]{1, 4, 4, 2, 3})`                   | `4`                 |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Adjust for other languages.