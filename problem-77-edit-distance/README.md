# Edit Distance

### Question:
Given two strings `word1` and `word2`, return the **minimum number of operations** required to convert `word1` to `word2`.

You have the following three operations permitted on a word:
- **Insert** a character
- **Delete** a character
- **Replace** a character

### Rules:
- Find the **minimum number** of operations
- Each operation counts as **1 step**
- Operations can be performed in any order

### Examples:
```
Input: word1 = "horse", word2 = "ros"
Operations:
  1. horse -> rorse (replace 'h' with 'r')
  2. rorse -> rose (remove 'r')
  3. rose -> ros (remove 'e')
Total: 3 operations
Output: 3

Input: word1 = "intention", word2 = "execution"
Operations:
  1. intention -> intension (replace 't' with 's')
  2. intension -> exension (replace 'i' with 'e')
  3. exension -> exection (replace 'n' with 'c')
  4. exection -> execution (insert 'u')
  5. execution -> execution (insert 'o')
Total: 5 operations
Output: 5
```

### Test Cases:
| **Sr. No.** | **Function Call**                       | **Expected Output** |
| ----------- | --------------------------------------- | ------------------- |
| 1           | `minDistance("horse", "ros")`           | `3`                 |
| 2           | `minDistance("intention", "execution")` | `5`                 |
| 3           | `minDistance("", "abc")`                | `3`                 |
| 4           | `minDistance("abc", "")`                | `3`                 |
| 5           | `minDistance("abc", "abc")`             | `0`                 |
| 6           | `minDistance("abc", "def")`             | `3`                 |
| 7           | `minDistance("sunday", "saturday")`     | `3`                 |