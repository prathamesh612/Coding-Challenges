# Unorder of Operations

### Question:
Given an **array of integers** and an **array of operators**, apply operations **left-to-right**, ignoring standard order of operations. Repeat operators cyclically until all numbers are used.

### Conditions:
- Apply operations **left-to-right** (no PEMDAS)
- **Cycle through operators** if more numbers than operators
- Valid operators: `+`, `-`, `*`, `/`, `%`

### Example:
```
[1, 2, 3, 4, 5] with ['+', '*']
→ 1 + 2 = 3
→ 3 * 3 = 9
→ 9 + 4 = 13
→ 13 * 5 = 65
```

### Test Cases:
| **Sr. No.** | **Function Call**                                                     | **Expected Output** |
| ----------- | --------------------------------------------------------------------- | ------------------- |
| 1           | `evaluate(new int[]{5, 6, 7, 8, 9}, new String[]{"+", "-"})`          | `3`                 |
| 2           | `evaluate(new int[]{17, 61, 40, 24, 38, 14}, new String[]{"+", "%"})` | `38`                |
| 3           | `evaluate(new int[]{20, 2, 4, 24, 12, 3}, new String[]{"*", "/"})`    | `60`                |
| 4           | `evaluate(new int[]{11, 4, 10, 17, 2}, new String[]{"*", "*", "%"})`  | `30`                |
| 5           | `evaluate(new int[]{33, 11, 29, 13}, new String[]{"/", "-"})`         | `-2`                |

> [!NOTE]
> Java syntax shown. Adjust for other languages.

### Approach:
1. Start with `result = numbers[0]`
2. Loop through remaining numbers
3. Get operator: `operators[(i-1) % operators.length]`
4. Apply: `result = result [operator] numbers[i]`
5. Return final result