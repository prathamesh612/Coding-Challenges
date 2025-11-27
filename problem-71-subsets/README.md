# Subsets

### Question:
Given an integer array `nums` of **unique elements**, return **all possible subsets** (the power set).

The solution set must **not contain duplicate subsets**. Return the solution in **any order**.

### Rules:
- Array contains **unique elements** (no duplicates)
- Return **all possible subsets** including the empty set
- A subset can have **any number** of elements from 0 to n
- Order of subsets doesn't matter
- Order of elements within a subset doesn't matter

### Examples:
```
Input: nums = [1, 2, 3]
All subsets:
  [] (empty set)
  [1]
  [2]
  [3]
  [1, 2]
  [1, 3]
  [2, 3]
  [1, 2, 3]

Total: 2³ = 8 subsets
Output: [[], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3]]

Input: nums = [0]
All subsets:
  []
  [0]

Total: 2¹ = 2 subsets
Output: [[], [0]]
```

### Test Cases:
| **Sr. No.** | **Function Call**                | **Expected Output**                                              |
| ----------- | -------------------------------- | ---------------------------------------------------------------- |
| 1           | `subsets(new int[]{1, 2, 3})`    | `[[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]`         |
| 2           | `subsets(new int[]{0})`          | `[[], [0]]`                                                      |
| 3           | `subsets(new int[]{1, 2})`       | `[[], [1], [1, 2], [2]]`                                         |
| 4           | `subsets(new int[]{5, 10, 15})`  | `[[], [5], [5, 10], [5, 10, 15], [5, 15], [10], [10, 15], [15]]` |
| 5           | `subsets(new int[]{})`           | `[[]]`                                                           |
| 6           | `subsets(new int[]{1, 2, 3, 4})` | `[[], [1], [1, 2], [1, 2, 3], [1, 2, 3, 4], [1, 2, 4], [1, 3], [1, 3, 4], [1, 4], [2], [2, 3], [2, 3, 4], [2, 4], [3], [3, 4], [4]]`|

> [!NOTE]
> For array of size n, there are 2ⁿ subsets. Output order may vary.
