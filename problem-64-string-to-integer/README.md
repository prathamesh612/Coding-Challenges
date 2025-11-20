# String to Integer (atoi)

### Question:
Implement the `myAtoi(string s)` function, which converts a string to a **32-bit signed integer** (similar to C/C++'s `atoi` function).

### Algorithm:
1. **Whitespace:** Ignore leading whitespace
2. **Sign:** Check for `'+'` or `'-'` sign (default positive if absent)
3. **Conversion:** Read digits until a non-digit character or end of string
4. **Clamping:** If the integer overflows, clamp to `[-2³¹, 2³¹ - 1]` range

### Rules:
- Only the **first sequence of digits** is considered
- Ignore **leading whitespace**
- Handle **optional sign** (`+` or `-`)
- Stop reading at the **first non-digit** character
- Return `0` if no valid conversion can be performed
- **Clamp** result to 32-bit signed integer range: `[-2147483648, 2147483647]`

### Examples:
```
Input: s = "42"
Output: 42
Explanation: No whitespace, no sign, just digits

Input: s = "   -42"
Output: -42
Explanation: Leading whitespace ignored, negative sign detected

Input: s = "4193 with words"
Output: 4193
Explanation: Stop reading at first non-digit space

Input: s = "words and 987"
Output: 0
Explanation: First non-whitespace char is not a digit or sign

Input: s = "-91283472332"
Output: -2147483648
Explanation: Number is less than INT_MIN, clamped to -2³¹
```

### Step-by-Step Example:
```
Input: "   -42"

Step 1: Skip whitespace → "-42"
Step 2: Detect sign '-' → negative
Step 3: Read digits "42" → 42
Step 4: Apply sign → -42
Step 5: Check range → within bounds
Output: -42
```

### Test Cases:
| **Sr. No.** | **Function Call**           | **Expected Output** |
| ----------- | --------------------------- | ------------------- |
| 1           | `myAtoi("42")`              | `42`                |
| 2           | `myAtoi("   -42")`          | `-42`               |
| 3           | `myAtoi("4193 with words")` | `4193`              |
| 4           | `myAtoi("words and 987")`   | `0`                 |
| 5           | `myAtoi("-91283472332")`    | `-2147483648`       |
| 6           | `myAtoi("21474836460")`     | `2147483647`        |
| 7           | `myAtoi("+-12")`            | `0`                 |
| 8           | `myAtoi("   +0 123")`       | `0`                 |
