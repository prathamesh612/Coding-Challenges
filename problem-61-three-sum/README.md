# 3Sum

### Question:
Given an integer array `nums`, return all **unique triplets** `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

### Rules:
- Find all **unique triplets** that sum to **zero**
- The solution set must **not contain duplicate triplets**
- Triplets can be returned in **any order**
- Each element can only be used **once per triplet**

### Examples:
```
Input: nums = [-1, 0, 1, 2, -1, -4]
Triplets that sum to 0:
  [-1, -1, 2]  → -1 + (-1) + 2 = 0 ✅
  [-1, 0, 1]   → -1 + 0 + 1 = 0 ✅
Output: [[-1, -1, 2], [-1, 0, 1]]

Input: nums = [0, 1, 1]
No triplets sum to 0
Output: []

Input: nums = [0, 0, 0]
Only one unique triplet
Output: [[0, 0, 0]]
```

### Visualization:
```
nums = [-1, 0, 1, 2, -1, -4]
Sorted: [-4, -1, -1, 0, 1, 2]

Finding triplets:
[-4, -1, -1] → -4 + (-1) + (-1) = -6 ❌
[-4, -1, 0]  → -4 + (-1) + 0 = -5 ❌
[-1, -1, 2]  → -1 + (-1) + 2 = 0 ✅
[-1, 0, 1]   → -1 + 0 + 1 = 0 ✅
```

### Test Cases:
| **Sr. No.** | **Function Call**                             | **Expected Output**                                 |
| ----------- | --------------------------------------------- | --------------------------------------------------- |
| 1           | `threeSum(new int[]{-1, 0, 1, 2, -1, -4})`    | `[[-1, -1, 2], [-1, 0, 1]]`                         |
| 2           | `threeSum(new int[]{0, 1, 1})`                | `[]`                                                |
| 3           | `threeSum(new int[]{0, 0, 0})`                | `[[0, 0, 0]]`                                       |
| 4           | `threeSum(new int[]{-2, 0, 1, 1, 2})`         | `[[-2, 0, 2], [-2, 1, 1]]`                          |
| 5           | `threeSum(new int[]{-1, 0, 1})`               | `[[-1, 0, 1]]`                                      |
| 6           | `threeSum(new int[]{1, 2, -2, -1})`           | `[]`                                                |
| 7           | `threeSum(new int[]{-5, 2, -1, -2, 3, 1, 0})` | `[[-5, 2, 3], [-2, -1, 3], [-2, 0, 2], [-1, 0, 1]]` |

> [!NOTE]
> Output order may vary. Each triplet should be sorted internally.

---