# Largest Substring Between Two Equal Characters

### Question:
Given a string, find the **length of the longest substring** that lies **between two equal characters**.  
The two characters must be the **same**, and you count only what is **between** them, not including the characters themselves.

If no such pair exists, return **-1**.

### Rules:
- Characters must match at both ends
- Count only the characters between the matching pair
- If multiple pairs exist, choose the one with the longest distance
- If no matching character pair exists, return -1

### Examples:
```

Input: "aa"
Pair: a _ a
Between them: "" → length = 0
Output: 0

Input: "abca"
Matching chars: a _ _ a
Between them: "bc" → length = 2
Output: 2

Input: "cbzxy"
No repeating characters
Output: -1

```

### Test Cases:
| **Sr. No.** | **Function Call**               | **Expected Output** |
| ----------- | ------------------------------- | ------------------- |
| 1           | `largestSubstring("aa")`        | `0`                 |
| 2           | `largestSubstring("abca")`      | `2`                 |
| 3           | `largestSubstring("cbzxy")`     | `-1`                |
| 4           | `largestSubstring("cabbac")`    | `4`                 |
| 5           | `largestSubstring("abcdefagh")` | `5`                 |
| 6           | `largestSubstring("zzzz")`      | `2`                 |
| 7           | `largestSubstring("abcbda")`    | `4`                 |