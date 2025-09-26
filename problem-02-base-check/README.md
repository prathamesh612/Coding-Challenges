### Question : 
Write a function that checks whether a given string is a valid number in a specified base (from 2 to 36).

- **Function Return Type:** boolean (should return true or false)
- **Example of valid digits for bases:**
    - Base 2 → 0–1
    - Base 8 → 0–7
    - Base 10 → 0–9
    - Base 16 → 0–9, A–F
    - Base 36 → 0–9, A–Z
- The check should be **case-insensitive**.
- A string is valid if every character is a **legal digit for the given base**.

### Test Cases : 
| **Sr. No.** | **Function Call**                         | **Expected Output** |
|---------|---------------------------------------|-----------------|
| 1       | `isValidNumber("10101", 2)`           | `true`          |
| 2       | `isValidNumber("10201", 2)`           | `false`         |
| 3       | `isValidNumber("76543210", 8)`        | `true`          |
| 4       | `isValidNumber("9876543210", 8)`      | `false`         |
| 5       | `isValidNumber("9876543210", 10)`     | `true`          |
| 6       | `isValidNumber("ABC", 10)`            | `false`         |
| 7       | `isValidNumber("ABC", 16)`            | `true`          |
| 8       | `isValidNumber("Z", 36)`              | `true`          |
| 9       | `isValidNumber("ABC", 20)`            | `true`          |
| 10      | `isValidNumber("4B4BA9", 16)`         | `true`          |
| 11      | `isValidNumber("5G3F8F", 16)`         | `false`         |
| 12      | `isValidNumber("5G3F8F", 17)`         | `true`          |
| 13      | `isValidNumber("abc", 10)`            | `false`         |
| 14      | `isValidNumber("abc", 16)`            | `true`          |
| 15      | `isValidNumber("AbC", 16)`            | `true`          |
| 16      | `isValidNumber("z", 36)`              | `true`          |
