# Two Sum Optimized

### Question:
Given an **array of integers** and a **target sum**, return the **indices of two numbers** that add up to the target.

### Rules:
- You may assume each input has **exactly one solution**
- You **cannot** use the same element twice
- Return the **indices** (not the values)
- Optimize for **O(n)** time complexity

### Examples:
```
nums = [2, 7, 11, 15], target = 9
→ nums[0] + nums[1] = 2 + 7 = 9
→ Return: [0, 1]

nums = [3, 2, 4], target = 6
→ nums[1] + nums[2] = 2 + 4 = 6
→ Return: [1, 2]

nums = [3, 3], target = 6
→ nums[0] + nums[1] = 3 + 3 = 6
→ Return: [0, 1]
```

### Test Cases:
| **Sr. No.** | **Function Call**                           | **Expected Output** |
| ----------- | ------------------------------------------- | ------------------- |
| 1           | `twoSum(new int[]{2, 7, 11, 15}, 9)`        | `[0, 1]`            |
| 2           | `twoSum(new int[]{3, 2, 4}, 6)`             | `[1, 2]`            |
| 3           | `twoSum(new int[]{3, 3}, 6)`                | `[0, 1]`            |
| 4           | `twoSum(new int[]{1, 5, 3, 7, 9}, 10)`      | `[2, 3]`            |
| 5           | `twoSum(new int[]{10, 20, 30, 40, 50}, 90)` | `[3, 4]`            |
| 6           | `twoSum(new int[]{-1, -2, -3, -4, -5}, -8)` | `[2, 4]`            |
| 7           | `twoSum(new int[]{0, 4, 3, 0}, 0)`          | `[0, 3]`            |
