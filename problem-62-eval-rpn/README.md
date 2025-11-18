# Evaluate Reverse Polish Notation

### Question:
Given an array of strings `tokens` representing an arithmetic expression in **Reverse Polish Notation** (RPN), evaluate the expression and return the result.

### Reverse Polish Notation (RPN):
- Operators follow their operands
- Example: `3 + 4` in infix becomes `3 4 +` in RPN
- No parentheses needed

### Rules:
- Valid operators are `+`, `-`, `*`, and `/`
- Each operand may be an **integer** or another **expression**
- Division between two integers **truncates toward zero**
- The result is guaranteed to fit in a **32-bit integer**

### Examples:
```
Input: tokens = ["2", "1", "+", "3", "*"]
Evaluation:
  (2 + 1) * 3
  = 3 * 3
  = 9
Output: 9

Input: tokens = ["4", "13", "5", "/", "+"]
Evaluation:
  4 + (13 / 5)
  = 4 + 2
  = 6
Output: 6

Input: tokens = ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
Evaluation:
  ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
  = 22
Output: 22
```

### How RPN Works:
```
Expression: ["2", "1", "+", "3", "*"]

Stack operations:
1. Push 2 → [2]
2. Push 1 → [2, 1]
3. Pop 1, 2, compute 2+1=3, push 3 → [3]
4. Push 3 → [3, 3]
5. Pop 3, 3, compute 3*3=9, push 9 → [9]

Result: 9
```

### Test Cases:
| **Sr. No.** | **Function Call**                                                                            | **Expected Output** |
| ----------- | -------------------------------------------------------------------------------------------- | ------------------- |
| 1           | `evalRPN(new String[]{"2", "1", "+", "3", "*"})`                                             | `9`                 |
| 2           | `evalRPN(new String[]{"4", "13", "5", "/", "+"})`                                            | `6`                 |
| 3           | `evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"})` | `22`                |
| 4           | `evalRPN(new String[]{"3", "11", "+", "5", "-"})`                                            | `9`                 |
| 5           | `evalRPN(new String[]{"18"})`                                                                | `18`                |
| 6           | `evalRPN(new String[]{"5", "1", "2", "+", "4", "*", "+", "3", "-"})`                         | `14`                |

> [!NOTE]
> Test cases use Java syntax for string arrays. Adjust for other languages.