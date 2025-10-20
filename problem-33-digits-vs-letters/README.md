# Digits vs Letters

### Question:
Given a **string**, determine whether it contains more **digits**, more **letters**, or an equal amount of both.

### Rules:
- **Digits:** Characters `0-9`
- **Letters:** Characters `a-z` and `A-Z` (case-insensitive)
- **Ignore** all other characters (spaces, punctuation, symbols, etc.)
- Return:
  - `"digits"` if more digits than letters
  - `"letters"` if more letters than digits
  - `"tie"` if equal number of digits and letters

### Test Cases:
| **Sr. No.** | **Function Call**                 | **Expected Output** |
| ----------- | --------------------------------- | ------------------- |
| 1           | `digitsOrLetters("abc123")`       | `"tie"`             |
| 2           | `digitsOrLetters("a1b2c3d")`      | `"letters"`         |
| 3           | `digitsOrLetters("1a2b3c4")`      | `"digits"`          |
| 4           | `digitsOrLetters("abc123!@#DEF")` | `"letters"`         |
| 5           | `digitsOrLetters("H3110 W0R1D")`  | `"digits"`          |
| 6           | `digitsOrLetters("P455W0RD")`     | `"tie"`             |