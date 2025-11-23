# Container With Most Water

### Question:
Given an integer array `height` of length `n`, where `height[i]` represents the height of a vertical line at position `i`, find two lines that together with the x-axis form a container that holds the **most water**.

Return the **maximum amount of water** the container can store.

### Rules:
- You may **not slant** the container (vertical lines only)
- The **width** is the distance between two lines
- The **height** is determined by the **shorter** of the two lines
- **Area = width × min(height[i], height[j])**

### Examples:
```
Input: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
Index:          0  1  2  3  4  5  6  7  8

Container between index 1 and 8:
  - width = 8 - 1 = 7
  - height = min(8, 7) = 7
  - area = 7 × 7 = 49 (maximum)

Output: 49
```

```
Input: height = [1, 1]
Index:          0  1

Container between index 0 and 1:
  - width = 1 - 0 = 1
  - height = min(1, 1) = 1
  - area = 1 × 1 = 1

Output: 1
```

### Test Cases:
| **Sr. No.** | **Function Call**                                   | **Expected Output** |
| ----------- | --------------------------------------------------- | ------------------- |
| 1           | `maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})`     | `49`                |
| 2           | `maxArea(new int[]{1, 1})`                          | `1`                 |
| 3           | `maxArea(new int[]{4, 3, 2, 1, 4})`                 | `16`                |
| 4           | `maxArea(new int[]{1, 2, 1})`                       | `2`                 |
| 5           | `maxArea(new int[]{2, 3, 4, 5, 18, 17, 6})`         | `17`                |
| 6           | `maxArea(new int[]{1, 3, 2, 5, 25, 24, 5})`         | `24`                |
| 7           | `maxArea(new int[]{1, 8, 100, 2, 100, 4, 8, 3, 7})` | `200`               |