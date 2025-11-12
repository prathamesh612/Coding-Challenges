# Fractional Knapsack Problem

### Question:
Given **weights** and **values** of **n items**, and a knapsack with a maximum **weight capacity**, determine the **maximum value** that can be obtained. Unlike 0-1 Knapsack, you can take **fractions of items**.

### Rules:
- You can take **fractions** of items (not just whole items)
- Total weight must not exceed the knapsack capacity
- Maximize the total value
- Greedy approach: prioritize items with **highest value-to-weight ratio**

### Example:
```
Items:
  Item 1: weight = 10, value = 60  → ratio = 6.0
  Item 2: weight = 20, value = 100 → ratio = 5.0
  Item 3: weight = 30, value = 120 → ratio = 4.0

Capacity: 50

Solution:
1. Take all of Item 1: weight = 10, value = 60
2. Take all of Item 2: weight = 20, value = 100
3. Take 20/30 of Item 3: weight = 20, value = 80

Total: weight = 50, value = 240
```

### Test Cases:
| **Sr. No.** | **Weights**    | **Profit**       | **Capacity** | **Expected Output** |
| ----------- | -------------- | ---------------- | ------------ | ------------------- |
| 1           | `[10, 20, 30]` | `[60, 100, 120]` | `50`         | `240.0`             |
| 2           | `[5, 10, 15]`  | `[30, 40, 45]`   | `20`         | `85.0`              |
| 3           | `[2, 3, 5, 7]` | `[10, 5, 15, 7]` | `10`         | `30.0`              |
| 4           | `[1, 2, 3]`    | `[6, 10, 12]`    | `5`          | `24.0`              |
| 5           | `[4, 8, 12]`   | `[24, 40, 60]`   | `16`         | `84.0`              |
| 6           | `[10, 20, 30]` | `[100, 60, 120]` | `50`         | `250.0`             |
| 7           | `[7, 3, 9]`    | `[42, 12, 40]`   | `15`         | `77.56`             |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Output may be a decimal value (double).