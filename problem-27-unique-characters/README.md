# Unique Characters

### Question:
Given a **string**, determine if **all characters** in the string are **unique** (no duplicates).

### Rules:
- **Case-sensitive:** Uppercase and lowercase letters are considered **different** characters
- Return `true` if all characters appear only once
- Return `false` if any character appears more than once

### Examples:
```
"abc"     → true  (all unique)
"aA"      → true  ('a' and 'A' are different)
"hello"   → false (letter 'l' appears twice)
"aa"      → false (letter 'a' appears twice)
```

### Test Cases:
| **Sr. No.** | **Function Call**            | **Expected Output** |
| ----------- | ---------------------------- | ------------------- |
| 1           | `allUnique("abc")`           | `true`              |
| 2           | `allUnique("aA")`            | `true`              |
| 3           | `allUnique("QwErTy123!@")`   | `true`              |
| 4           | `allUnique("~!@#$%^&*()_+")` | `true`              |
| 5           | `allUnique("hello")`         | `false`             |
| 6           | `allUnique("freeCodeCamp")`  | `false`             |
| 7           | `allUnique("!@#*$%^&*()aA")` | `false`             |
