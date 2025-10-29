# Integer Sequence

### Question:
Given a **positive integer**, return a **string containing all integers** from `1` up to and including the given number, in numerical order, concatenated together.

### Rules:
- Start from `1` and go up to the given number (inclusive)
- Return as a **single string** with no separators
- Numbers should be in **ascending order**

### Examples:
```
5 → "12345"
10 → "12345678910"
1 → "1"
```

### Test Cases:
| **Sr. No.** | **Function Call** | **Expected Output**                               |
| ----------- | ----------------- | ------------------------------------------------- |
| 1           | `sequence(5)`     | `"12345"`                                         |
| 2           | `sequence(10)`    | `"12345678910"`                                   |
| 3           | `sequence(1)`     | `"1"`                                             |
| 4           | `sequence(27)`    | `"123456789101112131415161718192021222324252627"` |