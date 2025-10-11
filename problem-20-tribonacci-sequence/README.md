# Tribonacci Sequence

### Question:
Given an **array containing the first three numbers** of a Tribonacci sequence and an **integer representing the sequence length**, return an array containing the Tribonacci sequence of the given length.

The **Tribonacci sequence** is a series where each number is the **sum of the three preceding ones**.

**Example:** Starting with `[0, 0, 1]`:
```
0, 0, 1, 1, 2, 4, 7, 13, 24, 44, ...
```

### Rules:
- Handle sequences of **any length ≥ 0**
- If length is **0**, return an **empty array**
- The **starting numbers are part** of the sequence

### Test Cases:
| **Sr. No.** | **Function Call** | **Expected Output** |
| ----------- | ----------------- | ------------------- |
| 1 | `tribonacciSequence(new int[]{0, 0, 1}, 20)` | `[0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149, 274, 504, 927, 1705, 3136, 5768, 10609, 19513]` |
| 2 | `tribonacciSequence(new int[]{21, 32, 43}, 1)` | `[21]` |
| 3 | `tribonacciSequence(new int[]{0, 0, 1}, 0)` | `[]` |
| 4 | `tribonacciSequence(new int[]{10, 20, 30}, 2)` | `[10, 20]` |
| 5 | `tribonacciSequence(new int[]{10, 20, 30}, 3)` | `[10, 20, 30]` |
| 6 | `tribonacciSequence(new int[]{123, 456, 789}, 8)` | `[123, 456, 789, 1368, 2613, 4770, 8751, 16134]` |

> [!NOTE]
> Test cases use Java syntax. Adjust for other languages.