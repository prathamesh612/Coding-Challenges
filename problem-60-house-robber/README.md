# House Robber

### Question:
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. The only constraint is that **adjacent houses have security systems connected** and will alert the police if two adjacent houses are broken into on the same night.

Given an integer array `nums` representing the amount of money in each house, return the **maximum amount of money** you can rob without alerting the police.

### Rules:
- You **cannot rob two adjacent houses**
- Maximize the total amount of money robbed
- You can skip houses to avoid triggering alarms

### Examples:
```
Input: nums = [1, 2, 3, 1]
Options:
  - Rob house 0 + house 2: 1 + 3 = 4 ✅
  - Rob house 1 + house 3: 2 + 1 = 3
  - Rob house 0 + house 3: 1 + 1 = 2
  - Rob house 1 only: 2
Maximum: 4
Output: 4

Input: nums = [2, 7, 9, 3, 1]
Rob house 0 (2) + house 2 (9) + house 4 (1) = 12 ✅
Output: 12
```

### Test Cases:
| **Sr. No.** | **Function Call**                | **Expected Output** |
| ----------- | -------------------------------- | ------------------- |
| 1           | `rob(new int[]{1, 2, 3, 1})`     | `4`                 |
| 2           | `rob(new int[]{2, 7, 9, 3, 1})`  | `12`                |
| 3           | `rob(new int[]{5, 3, 4, 11, 2})` | `16`                |
| 4           | `rob(new int[]{1, 2})`           | `2`                 |
| 5           | `rob(new int[]{2, 1, 1, 2})`     | `4`                 |
| 6           | `rob(new int[]{10})`             | `10`                |
| 7           | `rob(new int[]{10, 1, 1, 10})`   | `20`                |
