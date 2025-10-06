# camelCase Converter

### Question:
Given a **string**, return its **camel case version** by converting words separated by spaces, dashes, or underscores into a single string where each word (except the first) starts with an uppercase letter.

### Conditions:
- **Word separators** include: space (` `), dash (`-`), or underscore (`_`).
- **Any sequence** of these characters should be treated as a **single word break**.
- The **first word** should be all **lowercase**.
- Each **subsequent word** should start with an **uppercase letter**, with the rest of it lowercase.
- **All spaces and separators** should be removed from the final output.

### Test Cases:
| **Sr. No.** | **Function Call**                            | **Expected Output**    |
| ----------- | -------------------------------------------- | ---------------------- |
| 1           | `toCamelCase("hello world")`                 | `"helloWorld"`         |
| 2           | `toCamelCase("HELLO WORLD")`                 | `"helloWorld"`         |
| 3           | `toCamelCase("secret agent-X")`              | `"secretAgentX"`       |
| 4           | `toCamelCase("the_quick_brown_fox")`         | `"theQuickBrownFox"`   |
| 5           | `toCamelCase("convert-this-to-camel")`       | `"convertThisToCamel"` |
| 6           | `toCamelCase("___multiple___separators___")` | `"multipleSeparators"` |
| 7           | `toCamelCase("user ID-number_123")`          | `"userIdNumber123"`    |
| 8           | `toCamelCase("--leading-and-trailing--")`    | `"leadingAndTrailing"` |
| 9           | `toCamelCase("single")`                      | `"single"`             |
| 12          | `toCamelCase("MiXeD_CaSe-StRiNg")`           | `"mixedCaseString"`    |

### Approach:
1. **Split the string** into words using a regular expression that matches one or more separators (space, dash, underscore).
2. **Handle the first word**:
   - Convert it entirely to **lowercase**.
3. **Handle subsequent words**:
   - Convert the **first character** to **uppercase**.
   - Convert the **remaining characters** to **lowercase**.
4. **Concatenate all words** together without any separators.
5. **Return the final camel case string**.

### Edge Cases to Consider:
- Multiple consecutive separators (e.g., `"___"`, `"---"`)
- Leading or trailing separators
- Mixed case input
- Single word input
- Empty or separator-only strings
- Numbers in the string
- Single character words