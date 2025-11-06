# Top K Frequent Elements

### Question:
Given an **integer array** and an integer **k**, return the **k most frequent elements**.

### Rules:
- Return the **k elements** that appear most frequently
- The answer can be returned in **any order**
- It is **guaranteed** that the answer is unique (no ties for kth position)

### Examples:
```
Input: nums = [1,1,1,2,2,3], k = 2
Frequency count:
  1 → 3 times
  2 → 2 times
  3 → 1 time
Top 2 frequent: [1, 2]
Output: [1, 2]

Input: nums = [1], k = 1
Output: [1]

Input: nums = [4,4,4,2,2,5], k = 2
Frequency count:
  4 → 3 times
  2 → 2 times
  5 → 1 time
Top 2 frequent: [4, 2]
Output: [4, 2]
```

### Test Cases:
| **Sr. No.** | **Function Call**                                 | **Expected Output**     |
| ----------- | ------------------------------------------------- | ----------------------- |
| 1           | `topKFrequent(new int[]{1,1,1,2,2,3}, 2)`         | `[1, 2]` or `[2, 1]`    |
| 2           | `topKFrequent(new int[]{1}, 1)`                   | `[1]`                   |
| 3           | `topKFrequent(new int[]{4,4,4,2,2,5}, 2)`         | `[4, 2]` or `[2, 4]`    |
| 4           | `topKFrequent(new int[]{1,2,3,4,5}, 3)`           | `[1, 2, 3]` (any order) |
| 5           | `topKFrequent(new int[]{5,5,5,3,3,1}, 1)`         | `[5]`                   |
| 6           | `topKFrequent(new int[]{7,7,7,7,1,1,1,2,2,3}, 2)` | `[7, 1]` or `[1, 7]`    |
| 7           | `topKFrequent(new int[]{-1,-1,-1,2,2,3}, 2)`      | `[-1, 2]` or `[2, -1]`  |

> [!NOTE]
> Output order may vary as the problem allows returning elements in any order.