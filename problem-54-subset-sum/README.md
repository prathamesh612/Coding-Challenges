# Subset Sum Problem

### Question:
Given an array of **non-negative integers** and a **target sum**, determine if there exists a **subset** of the array whose elements sum up to the target.

### Rules:
- Each element can be used **at most once**
- You need to find if **any combination** of elements equals the target
- Return `true` if such a subset exists, `false` otherwise
- Empty subset has sum `0`

### Examples:
```
Input: nums = [3, 34, 4, 12, 5, 2], target = 9
Subset: [4, 5] → 4 + 5 = 9 ✅
Output: true

Input: nums = [3, 34, 4, 12, 5, 2], target = 30
Subset: [3, 12, 5, 2] → 3 + 12 + 5 + 2 = 22 ❌
Subset: [34, 4, 5, 2] → 34 + 4 + 5 + 2 = 45 ❌
No valid subset found
Output: false

Input: nums = [1, 2, 3], target = 6
Subset: [1, 2, 3] → 1 + 2 + 3 = 6 ✅
Output: true
```

### Test Cases:
| **Sr. No.** | **Function Call**                              | **Expected Output** |
| ----------- | ---------------------------------------------- | ------------------- |
| 1           | `subsetSum(new int[]{3, 34, 4, 12, 5, 2}, 9)`  | `true`              |
| 2           | `subsetSum(new int[]{3, 34, 4, 12, 5, 2}, 30)` | `false`             |
| 3           | `subsetSum(new int[]{1, 2, 3, 4, 5}, 10)`      | `true`              |
| 4           | `subsetSum(new int[]{2, 3, 7, 8}, 11)`         | `true`              |
| 5           | `subsetSum(new int[]{1, 5, 11, 5}, 11)`        | `true`              |
| 6           | `subsetSum(new int[]{2, 4, 6, 8}, 5)`          | `false`             |
| 7           | `subsetSum(new int[]{1}, 0)`                   | `true`              |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Adjust for other languages.