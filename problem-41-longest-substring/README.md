# Longest Substring

### Question:  
Given a string, find the length of the longest substring that contains no repeating characters. A substring is a sequence of characters within a string that appears consecutively. The goal is to determine the maximum number of unique characters that can appear in a single substring without any repetition.

### Rules:  
1. The input will be a string consisting of letters, digits, or symbols.  
2. The function should return an integer representing the length of the longest substring without repeating characters.  
3. If the string is empty, return 0.  
4. Consecutive characters are considered part of the same substring only if they are unique.  

### Test Cases:  
| **Sr. No.** | **Function Call**              | **Expected Output** |
| ----------- | ------------------------------ | ------------------- |
| 1           | `longestSubstring("abcabcbb")` | `3`                 |
| 2           | `longestSubstring("bbbbb")`    | `1`                 |
| 3           | `longestSubstring("pwwkew")`   | `3`                 |
| 4           | `longestSubstring("")`         | `0`                 |
| 5           | `longestSubstring("abcdef")`   | `6`                 |
| 6           | `longestSubstring("abba")`     | `2`                 |
| 7           | `longestSubstring("dvdf")`     | `3`                 |
