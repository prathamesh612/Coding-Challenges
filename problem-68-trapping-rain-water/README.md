# Trapping Rain Water

### Question:
Given `n` non-negative integers representing an **elevation map** where the width of each bar is `1`, compute how much **water** it can trap after raining.

### Rules:
- Each element represents the **height** of a bar
- Width of each bar is `1`
- Water gets trapped between **higher bars**
- Calculate **total units** of water trapped

### Examples:

```
Input: height = [4, 2, 0, 3, 2, 5]

Water can be trapped between bars:
  - Between height[0]=4 and height[5]=5: 2+4+1+2 = 9 units

Output: 9
```

### Test Cases:
| **Sr. No.** | **Function Call**                                     | **Expected Output** |
| ----------- | ----------------------------------------------------- | ------------------- |
| 1           | `trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})` | `6`                 |
| 2           | `trap(new int[]{4, 2, 0, 3, 2, 5})`                   | `9`                 |
| 3           | `trap(new int[]{3, 0, 2, 0, 4})`                      | `7`                 |
| 4           | `trap(new int[]{1, 2, 3, 4, 5})`                      | `0`                 |
| 5           | `trap(new int[]{5, 4, 3, 2, 1})`                      | `0`                 |
| 6           | `trap(new int[]{3, 0, 0, 2, 0, 4})`                   | `10`                |
| 7           | `trap(new int[]{2, 1, 2})`                            | `1`                 |
