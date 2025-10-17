# Array Diff

### Question:
Given **two arrays with string values**, return a **new array** containing all values that appear in **only one** of the arrays (symmetric difference).

### Rules:
- Return values that are **unique to each array** (not in both)
- Returned array should be **sorted alphabetically**
- If a value appears in both arrays, **exclude it**

### Examples:
```
Array 1: ["apple", "banana"]
Array 2: ["apple", "banana", "cherry"]

"apple"  → in both ❌
"banana" → in both ❌
"cherry" → only in Array 2 ✅

Result: ["cherry"]
```

```
Array 1: ["one", "two", "three"]
Array 2: ["one", "three", "eight"]

"one"   → in both ❌
"two"   → only in Array 1 ✅
"three" → in both ❌
"eight" → only in Array 2 ✅

Result: ["eight", "two"] (sorted)
```

### Test Cases:
| **Sr. No.** | **Function Call** | **Expected Output** |
| ----------- | ----------------- | ------------------- |
| 1 | `arrayDiff(new String[]{"apple", "banana"}, new String[]{"apple", "banana", "cherry"})` | `["cherry"]` |
| 2 | `arrayDiff(new String[]{"apple", "banana", "cherry"}, new String[]{"apple", "banana"})` | `["cherry"]` |
| 3 | `arrayDiff(new String[]{"one", "two", "three", "four", "six"}, new String[]{"one", "three", "eight"})` | `["eight", "four", "six", "two"]` |
| 4 | `arrayDiff(new String[]{"two", "four", "five", "eight"}, new String[]{"one", "two", "three", "four", "seven", "eight"})` | `["five", "one", "seven", "three"]` |
| 5 | `arrayDiff(new String[]{"I", "like", "freeCodeCamp"}, new String[]{"I", "like", "rocks"})` | `["freeCodeCamp", "rocks"]` |

> [!NOTE]
> Test cases use Java syntax for string arrays. Adjust for other languages.