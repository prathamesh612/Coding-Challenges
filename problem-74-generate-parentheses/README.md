# Generate Parentheses

### Question:
Given `n` pairs of parentheses, write a function to **generate all combinations of well-formed parentheses**.

### Rules:
- Generate **all valid** combinations of `n` pairs of parentheses
- Parentheses must be **well-formed** (properly opened and closed)
- Return combinations in **any order**

### Examples:
```
Input: n = 3
Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]

Explanation: All valid combinations using 3 pairs of parentheses

Input: n = 1
Output: ["()"]

Input: n = 2
Output: ["(())", "()()"]
```

### Valid vs Invalid Examples:
```
Valid:
  "()"       ✅
  "(())"     ✅
  "()()"     ✅
  "((()))"   ✅

Invalid:
  "((("      ❌ (not closed)
  "())"      ❌ (extra closing)
  ")("       ❌ (wrong order)
```

### Test Cases:
| **Sr. No.** | **Function Call**        | **Expected Output**                                  |
| ----------- | ------------------------ | ---------------------------------------------------- |
| 1           | `generateParenthesis(1)` | `["()"]`                                             |
| 2           | `generateParenthesis(2)` | `["(())", "()()"]`                                   |
| 3           | `generateParenthesis(3)` | `["((()))", "(()())", "(())()", "()(())", "()()()"]` |
| 4           | `generateParenthesis(0)` | `[""]`                                               |

> [!NOTE]
> For n pairs, there are Catalan number combinations. Output order may vary.