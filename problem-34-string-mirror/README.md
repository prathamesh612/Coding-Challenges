# String Mirror

### Question:
Given **two strings**, determine if the **second string is a mirror** of the first.

### Rules:
- A string is a **mirror** if it contains the **same letters in reverse order**
- **Case-sensitive:** `'A'` and `'a'` are different
- **Ignore all non-alphabetical characters** (spaces, punctuation, numbers, symbols)
- Only compare **letters** (a-z, A-Z)


### Test Cases:
| **Sr. No.** | **Function Call**                          | **Expected Output** |
| ----------- | ------------------------------------------ | ------------------- |
| 1           | `isMirror("helloworld", "helloworld")`     | `false`             |
| 2           | `isMirror("Hello World", "dlroW olleH")`   | `true`              |
| 3           | `isMirror("RaceCar", "raCecaR")`           | `true`              |
| 4           | `isMirror("RaceCar", "RaceCar")`           | `false`             |
| 5           | `isMirror("Mirror", "rorrim")`             | `false`             |
| 6           | `isMirror("Hello World", "dlroW-olleH")`   | `true`              |
| 7           | `isMirror("Hello World", "!dlroW !olleH")` | `true`              |