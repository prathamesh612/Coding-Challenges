# 0-1 Knapsack Problem

### Question:
Given **weights** and **values** of **n items**, and a knapsack with a maximum **weight capacity**, determine the **maximum value** that can be obtained by selecting items such that the total weight does not exceed the capacity.

### Rules:
- Each item can be selected **at most once** (0 or 1 times)
- Cannot break items into fractions (must take the whole item or leave it)
- Total weight must not exceed the knapsack capacity
- Maximize the total value

### Example:
```
Items:
  Item 1: weight = 2, value = 3
  Item 2: weight = 3, value = 4
  Item 3: weight = 4, value = 5
  Item 4: weight = 5, value = 6

Capacity: 5

Possible combinations:
- Item 1 only: weight = 2, value = 3
- Item 2 only: weight = 3, value = 4
- Item 3 only: weight = 4, value = 5
- Item 4 only: weight = 5, value = 6 ✅
- Item 1 + Item 2: weight = 5, value = 7 ✅ (maximum)

Maximum value: 7
```

### Test Cases:
| **Sr. No.** | **Weights**       | **Values**         | **Capacity** | **Expected Output** |
| ----------- | ----------------- | ------------------ | ------------ | ------------------- |
| 1           | `[2, 3, 4, 5]`    | `[3, 4, 5, 6]`     | `5`          | `7`                 |
| 2           | `[1, 3, 4, 5]`    | `[1, 4, 5, 7]`     | `7`          | `9`                 |
| 3           | `[2, 2, 3]`       | `[10, 5, 15]`      | `5`          | `25`                |
| 4           | `[10, 20, 30]`    | `[60, 100, 120]`   | `50`         | `220`               |
| 5           | `[5, 10, 15, 20]` | `[10, 20, 30, 40]` | `30`         | `60`                |
| 6           | `[1, 2, 3]`       | `[6, 10, 12]`      | `5`          | `22`                |
| 7           | `[3, 4, 5]`       | `[30, 50, 60]`     | `8`          | `90`                |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Adjust for other languages.
