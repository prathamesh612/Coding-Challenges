# Vowel Repeater

### Question:
Given a **string**, return a new version where each vowel is **duplicated one more time** than the previous vowel encountered.

### Rules:
- **First vowel:** appears once (unchanged)
- **Second vowel:** appears twice in a row
- **Third vowel:** appears three times in a row
- And so on...

**Vowel Handling:**
- Vowels: `a`, `e`, `i`, `o`, `u` (case-insensitive)
- **Original vowel** keeps its case
- **Repeated vowels** are lowercase
- **Non-vowel characters** remain unchanged

### Examples:
```
Input:  "hello world"
Output: "helloo wooorld"

Explanation:
h - consonant → h
e - 1st vowel → e (appears 1 time)
l - consonant → l
l - consonant → l
o - 2nd vowel → oo (appears 2 times)
(space) → (space)
w - consonant → w
o - 3rd vowel → ooo (appears 3 times)
r - consonant → r
l - consonant → l
d - consonant → d
```

### Test Cases:
| **Sr. No.** | **Function Call**             | **Expected Output**      |
| ----------- | ----------------------------- | ------------------------ |
| 1           | `repeatVowels("hello world")` | `"helloo wooorld"`       |
| 2           | `repeatVowels("AEIOU")`       | `"AEeIiiOoooUuuuu"`      |
| 3           | `repeatVowels("Java")`        | `"Javaa"`               |
| 4           | `repeatVowels("programming")` | `"prograammiiing"` |
| 5           | `repeatVowels("aAa")`         | `"aAaaaa"`              |
| 6           | `repeatVowels("xyz")`         | `"xyz"`                  |
| 7           | `repeatVowels("I like eating ice cream in Iceland")` | `"I liikeee eeeeaaaaatiiiiiing iiiiiiiceeeeeeee creeeeeeeeeaaaaaaaaaam iiiiiiiiiiin Iiiiiiiiiiiiceeeeeeeeeeeeelaaaaaaaaaaaaaand"` |