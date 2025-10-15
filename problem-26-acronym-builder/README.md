# Acronym Builder

### Question:
Given a **string containing one or more words**, return an **acronym** using the first letter of each word.

### Rules:
- Use the **first letter** of each word, **capitalized**
- **Ignore** these words (unless they're the **first word**):
  - `a`, `for`, `an`, `and`, `by`, `of`
- Return letters in the **order given**
- **No spaces** in the output

### Examples:
```
"Search Engine Optimization" → "SEO"
"Federal Bureau of Investigation" → "FBI" (ignores "of")
"For your information" → "FYI" ("For" is first word, so included)
```

### Test Cases:
| **Sr. No.** | **Function Call**                                               | **Expected Output** |
| ----------- | --------------------------------------------------------------- | ------------------- |
| 1           | `buildAcronym("Search Engine Optimization")`                    | `"SEO"`             |
| 2           | `buildAcronym("Frequently Asked Questions")`                    | `"FAQ"`             |
| 3           | `buildAcronym("National Aeronautics and Space Administration")` | `"NASA"`            |
| 4           | `buildAcronym("Federal Bureau of Investigation")`               | `"FBI"`             |
| 5           | `buildAcronym("For your information")`                          | `"FYI"`             |
| 6           | `buildAcronym("By the way")`                                    | `"BTW"`             |
| 7 | `buildAcronym("An unstoppable herd of waddling penguins overtakes the icy mountains and sings happily")` | `"AUHWPOTIMSH"` |