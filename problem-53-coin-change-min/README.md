# Coin Change - Minimum Coins

### Question:
Given an array of **coin denominations** and a **total amount**, find the **minimum number of coins** needed to make up that amount.

You have an **infinite supply** of each coin denomination.

### Rules:
- You can use each coin denomination **unlimited times**
- Find the **fewest number** of coins needed
- If the amount **cannot** be made, return `-1`
- If the amount is `0`, return `0` (no coins needed)

### Examples:
```
Input: coins = [1, 2, 5], amount = 11
Ways to make 11:
  - 5 + 5 + 1 = 3 coins ✅ (minimum)
  - 5 + 2 + 2 + 2 = 4 coins
  - 5 + 2 + 2 + 1 + 1 = 5 coins
  - ... many more ways
Output: 3

Input: coins = [2], amount = 3
No way to make 3 with only 2-coins
Output: -1

Input: coins = [1], amount = 0
No coins needed for amount 0
Output: 0
```

### Test Cases:
| **Sr. No.** | **Function Call**                                | **Expected Output** |
| ----------- | ------------------------------------------------ | ------------------- |
| 1           | `coinChange(new int[]{1, 2, 5}, 11)`             | `3`                 |
| 2           | `coinChange(new int[]{2}, 3)`                    | `-1`                |
| 3           | `coinChange(new int[]{1}, 0)`                    | `0`                 |
| 4           | `coinChange(new int[]{1, 3, 4}, 6)`              | `2`                 |
| 5           | `coinChange(new int[]{2, 5, 10}, 27)`            | `4`                 |
| 6           | `coinChange(new int[]{186, 419, 83, 408}, 6249)` | `20`                |
| 7           | `coinChange(new int[]{1, 2, 5}, 100)`            | `20`                |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Adjust for other languages.