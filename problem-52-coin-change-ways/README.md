# Coin Change - Maximum Ways

### Question:
Given an array of **coin denominations** and a **total amount**, find the **number of different ways** to make up that amount using the given coins.

You have an **infinite supply** of each coin denomination.

### Rules:
- You can use each coin denomination **unlimited times**
- Different **sequences** are considered the **same combination**
  - Example: `[1,2]` and `[2,1]` count as **one way**
- If the amount **cannot** be made, return `0`
- If the amount is `0`, return `1` (one way: use no coins)

### Examples:
```
Input: coins = [1, 2, 5], amount = 5
Ways to make 5:
  1. 5 (one 5-coin)
  2. 2 + 2 + 1 (two 2-coins, one 1-coin)
  3. 2 + 1 + 1 + 1 (one 2-coin, three 1-coins)
  4. 1 + 1 + 1 + 1 + 1 (five 1-coins)
Output: 4

Input: coins = [2], amount = 3
No way to make 3 with only 2-coins
Output: 0

Input: coins = [10], amount = 10
Only one way: one 10-coin
Output: 1
```

### Test Cases:
| **Sr. No.** | **Function Call**                       | **Expected Output** |
| ----------- | --------------------------------------- | ------------------- |
| 1           | `coinChange(new int[]{1, 2, 5}, 5)`     | `4`                 |
| 2           | `coinChange(new int[]{2}, 3)`           | `0`                 |
| 3           | `coinChange(new int[]{10}, 10)`         | `1`                 |
| 4           | `coinChange(new int[]{1, 2, 3}, 4)`     | `4`                 |
| 5           | `coinChange(new int[]{2, 5, 3, 6}, 10)` | `5`                 |
| 6           | `coinChange(new int[]{1}, 0)`           | `1`                 |
| 7           | `coinChange(new int[]{5, 10}, 12)`      | `0`                 |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Adjust for other languages.