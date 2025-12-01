# Happy Number

### Question:
Write an algorithm to determine if a number `n` is **happy**.

A **happy number** is a number defined by the following process:
- Starting with any positive integer, replace the number by the **sum of the squares of its digits**.
- Repeat the process until the number equals `1` (where it will stay), or it **loops endlessly** in a cycle which does not include `1`.
- Those numbers for which this process **ends in 1** are happy.

Return `true` if `n` is a happy number, and `false` if not.

### Rules:
- Replace number with sum of squares of its digits
- Repeat until result is `1` (happy) or enters a cycle (not happy)
- Detect cycles to avoid infinite loops

### Examples:
```
Input: n = 19
Process:
  1² + 9² = 1 + 81 = 82
  8² + 2² = 64 + 4 = 68
  6² + 8² = 36 + 64 = 100
  1² + 0² + 0² = 1 ✅
Output: true

Input: n = 2
Process:
  2² = 4
  4² = 16
  1² + 6² = 1 + 36 = 37
  3² + 7² = 9 + 49 = 58
  5² + 8² = 25 + 64 = 89
  8² + 9² = 64 + 81 = 145
  1² + 4² + 5² = 1 + 16 + 25 = 42
  4² + 2² = 16 + 4 = 20
  2² + 0² = 4 (cycle detected) ❌
Output: false
```

### Test Cases:
| **Sr. No.** | **Function Call** | **Expected Output** |
| ----------- | ----------------- | ------------------- |
| 1           | `isHappy(19)`     | `true`              |
| 2           | `isHappy(2)`      | `false`             |
| 3           | `isHappy(1)`      | `true`              |
| 4           | `isHappy(7)`      | `true`              |
| 5           | `isHappy(10)`     | `true`              |
| 6           | `isHappy(100)`    | `true`              |
| 7           | `isHappy(3)`      | `false`             |