# Longest Palindromic Substring

### Question:
Given a string `s`, return the **longest palindromic substring** in `s`.

A **palindrome** is a string that reads the same forward and backward.

### Rules:
- If there are **multiple answers** of the same length, return **any one** of them
- A single character is considered a palindrome
- The substring must be **contiguous**

### Examples:
```
Input: s = "babad"
Palindromes: "b", "a", "b", "a", "d", "aba", "bab"
Longest: "bab" or "aba" (both length 3)
Output: "bab" (or "aba")

Input: s = "cbbd"
Palindromes: "c", "b", "b", "d", "bb"
Longest: "bb" (length 2)
Output: "bb"

Input: s = "racecar"
Longest: "racecar" (entire string)
Output: "racecar"
```

### Test Cases:
| **Sr. No.** | **Function Call**              | **Expected Output**     |
| ----------- | ------------------------------ | ----------------------- |
| 1           | `longestPalindrome("babad")`   | `"bab"` or `"aba"`      |
| 2           | `longestPalindrome("cbbd")`    | `"bb"`                  |
| 3           | `longestPalindrome("a")`       | `"a"`                   |
| 4           | `longestPalindrome("ac")`      | `"a"` or `"c"`          |
| 5           | `longestPalindrome("racecar")` | `"racecar"`             |
| 6           | `longestPalindrome("noon")`    | `"noon"`                |
| 7           | `longestPalindrome("abcdef")`  | `"a"` (any single char) |