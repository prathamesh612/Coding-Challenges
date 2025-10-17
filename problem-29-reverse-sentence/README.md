# Reverse Sentence

### Question:
Given a **string of words**, return a new string with the **words in reverse order**.

### Rules:
- **Reverse word order:** First word becomes last, last word becomes first
- **Multiple spaces** between words should be handled (input can have 1+ spaces)
- **Single space** between words in output (normalize spacing)

### Examples:
```
Input:  "world hello"
Output: "hello world"

Input:  "a  b   c"  (multiple spaces)
Output: "c b a"     (single spaces)
```

### Test Cases:
| **Sr. No.** | **Function Call**                                       | **Expected Output**              |
| ----------- | ------------------------------------------------------- | -------------------------------- |
| 1           | `reverseSentence("world hello")`                        | `"hello world"`                  |
| 2           | `reverseSentence("push commit git")`                    | `"git commit push"`              |
| 3           | `reverseSentence("npm  install  sudo")`                 | `"sudo install npm"`             |
| 4           | `reverseSentence("java    is   programming  language")` | `"language programming is java"` |