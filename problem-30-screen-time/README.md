# Screen Time

### Question:
Given an **array of seven integers** representing hours spent on your phone each day of the week, determine if it's **too much screen time** based on specific health constraints.

### Rules:
Screen time is considered **too much** if **ANY** of these conditions are true:

1. **Single Day Rule:** Any day has **≥ 10 hours**
2. **Three-Day Average Rule:** Average of any **3 consecutive days** is **≥ 8 hours**
3. **Weekly Average Rule:** Average of all **7 days** is **≥ 6 hours**

### Examples:
```
[1, 2, 3, 11, 1, 3, 4]
→ Day 4 has 11 hours (≥ 10) ❌
→ Too much: true

[3, 9, 4, 8, 5, 7, 6]
→ No single day ≥ 10 ✅
→ Days 1-3: (3+9+4)/3 = 5.33 ✅
→ Days 2-4: (9+4+8)/3 = 7.00 ✅
→ Days 3-5: (4+8+5)/3 = 5.67 ✅
→ Days 4-6: (8+5+7)/3 = 6.67 ✅
→ Days 5-7: (5+7+6)/3 = 6.00 ✅
→ Weekly: (3+9+4+8+5+7+6)/7 = 6.00 ❌ (≥ 6)
→ Too much: true
```

### Test Cases:
| **Sr. No.** | **Function Call**                                    | **Expected Output** |
| ----------- | ---------------------------------------------------- | ------------------- |
| 1           | `tooMuchScreenTime(new int[]{1, 2, 3, 4, 5, 6, 7})`  | `false`             |
| 2           | `tooMuchScreenTime(new int[]{7, 8, 8, 4, 2, 2, 3})`  | `false`             |
| 3           | `tooMuchScreenTime(new int[]{5, 6, 6, 6, 6, 6, 6})`  | `false`             |
| 4           | `tooMuchScreenTime(new int[]{1, 2, 3, 11, 1, 3, 4})` | `true`              |
| 5           | `tooMuchScreenTime(new int[]{1, 2, 3, 10, 2, 1, 0})` | `true`              |
| 6           | `tooMuchScreenTime(new int[]{3, 3, 5, 8, 8, 9, 4})`  | `true`              |
| 7           | `tooMuchScreenTime(new int[]{3, 9, 4, 8, 5, 7, 6})`  | `true`              |

> [!NOTE]
> Test cases use Java syntax for integer arrays. Adjust for other languages.