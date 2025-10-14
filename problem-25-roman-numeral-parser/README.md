# Roman Numeral Parser

### Question:
Given a **string representing a Roman numeral**, return its **integer value**.

### Roman Numeral Symbols:
| Symbol | Value |
| ------ | ----- |
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

### Rules:
- Numerals are read **left to right**
- If a **smaller numeral** appears **before** a **larger** one, the value is **subtracted**
- Otherwise, values are **added**

### Examples:
```
"III"   = 1 + 1 + 1 = 3
"IV"    = -1 + 5 = 4      (I before V, so subtract)
"IX"    = -1 + 10 = 9     (I before X, so subtract)
"XXVI"  = 10 + 10 + 5 + 1 = 26
"XCIX"  = -10 + 100 - 1 + 10 = 99
```

### Test Cases:
| **Sr. No.** | **Function Call**            | **Expected Output** |
| ----------- | ---------------------------- | ------------------- |
| 1           | `parseRomanNumeral("III")`   | `3`                 |
| 2           | `parseRomanNumeral("IV")`    | `4`                 |
| 3           | `parseRomanNumeral("XXVI")`  | `26`                |
| 4           | `parseRomanNumeral("XCIX")`  | `99`                |
| 5           | `parseRomanNumeral("CDLX")`  | `460`               |
| 6           | `parseRomanNumeral("DIV")`   | `504`               |
| 7           | `parseRomanNumeral("MMXXV")` | `2025`              |
