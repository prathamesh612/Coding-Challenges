# Message Decoder

### Question:
Given a **secret message string** and an **integer representing the number of letters** that were used to shift the message to encode it, return the **decoded string**.

### Conditions:
- A **positive number** means the message was shifted **forward** in the alphabet.
- A **negative number** means the message was shifted **backward** in the alphabet.
- **Case matters** — decoded characters should retain the case of their encoded counterparts.
- **Non-alphabetical characters** should not get decoded.

### Test Cases:
| **Sr. No.** | **Function Call**                        | **Expected Output**           |
| ----------- | ---------------------------------------- | ----------------------------- |
| 1           | `decode("Xlmw mw e wigvix qiwweki.", 4)` | `"This is a secret message."` |
| 2           | `decode("Byffi Qilfx!", 20)`             | `"Hello World!"`              |
| 3           | `decode("Zqd xnt njzx?", -1)`            | `"Are you okay?"`             |
| 4           | `decode("oannLxmnLjvy", 9)`              | `"freeCodeCamp"`              |

### Approach:
1. Iterate through each character in the encoded message.
2. For **alphabetical characters**, shift them backward by the given number (or forward if the shift is negative).
3. Handle **wrap-around** for letters (e.g., shifting 'A' backward wraps to 'Z').
4. Preserve the **case** of each letter (uppercase remains uppercase, lowercase remains lowercase).
5. Leave **non-alphabetical characters** (spaces, punctuation, etc.) unchanged.
6. Return the decoded string.