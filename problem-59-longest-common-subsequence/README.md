# Longest Common Subsequence

### Question:
Given **two strings**, find the length of their **longest common subsequence (LCS)**.

A **subsequence** is a sequence that appears in the same relative order, but not necessarily contiguous. For example, `"ace"` is a subsequence of `"abcde"`.

### Rules:
- A subsequence maintains the **relative order** of characters
- Characters don't need to be **consecutive**
- If there is no common subsequence, return `0`

### Examples:
```
Input: text1 = "abcde", text2 = "ace"
Common subsequences: "a", "c", "e", "ac", "ae", "ce", "ace"
Longest: "ace" (length 3)
Output: 3

Input: text1 = "abc", text2 = "abc"
LCS: "abc" (entire string)
Output: 3

Input: text1 = "abc", text2 = "def"
No common characters
Output: 0
```

### Visualization:
```
text1 = "abcde"
text2 = "ace"

Matching characters:
a b c d e
|   |   |
a   c   e

LCS = "ace" → length = 3
```

### Test Cases:
| **Sr. No.** | **Function Call**              | **Expected Output** |
| ----------- | ------------------------------ | ------------------- |
| 1           | `LCS("abcde", "ace")`          | `3`                 |
| 2           | `LCS("abc", "abc")`            | `3`                 |
| 3           | `LCS("abc", "def")`            | `0`                 |
| 4           | `LCS("AGGTAB", "GXTXAYB")`     | `4`                 |
| 5           | `LCS("programming", "gaming")` | `6`                 |
| 6           | `LCS("", "abc")`               | `0`                 |
| 7           | `LCS("abcdef", "fedcba")`      | `1`                 |