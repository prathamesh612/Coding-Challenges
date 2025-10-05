# Character Battle

### Question:
Given **two strings** representing your army and an opposing army, each character from your army battles the character at the same position from the opposing army. Determine the outcome of the war based on individual battle results.

### Conditions:
- **Characters a-z** have a strength of **1-26**, respectively.
- **Characters A-Z** have a strength of **27-52**, respectively.
- **Digits 0-9** have a strength of their **face value** (0-9).
- **All other characters** (special characters, spaces, etc.) have a value of **zero**.
- Each character can only fight **one battle** (position-based matching).
- For each battle, the **stronger character wins**.
- The army with **more victories** wins the war.

### Return Values:
- `"Opponent retreated"` if your army has **more characters** than the opposing army.
- `"We retreated"` if the opposing army has **more characters** than yours.
- `"We won"` if your army won **more battles**.
- `"We lost"` if the opposing army won **more battles**.
- `"It was a tie"` if both armies won the **same number of battles**.

### Test Cases:
| **Sr. No.** | **Function Call**                  | **Expected Output**    |
| ----------- | ---------------------------------- | ---------------------- |
| 1           | `battle("Hello", "World")`         | `"We lost"`            |
| 2           | `battle("pizza", "salad")`         | `"We won"`             |
| 3           | `battle("C@T5", "D0G$")`           | `"We won"`             |
| 4           | `battle("kn!ght", "orc")`          | `"Opponent retreated"` |
| 5           | `battle("PC", "Mac")`              | `"We retreated"`       |
| 6           | `battle("Wizards", "Dragons")`     | `"It was a tie"`       |
| 7           | `battle("Mr. Smith", "Dr. Jones")` | `"It was a tie"`       |

### Approach:
1. **Check army sizes** first:
   - If your army has more characters, return `"Opponent retreated"`.
   - If the opposing army has more characters, return `"We retreated"`.
2. **Calculate character strength** for each character:
   - Use ASCII values to determine strength.
   - Lowercase letters: `strength = char - 'a' + 1`
   - Uppercase letters: `strength = char - 'A' + 27`
   - Digits: `strength = char - '0'`
   - Others: `strength = 0`
3. **Compare characters** at each position and count victories for each army.
4. **Determine the winner** based on the battle count:
   - If your army won more battles, return `"We won"`.
   - If the opposing army won more battles, return `"We lost"`.
   - If both won the same number of battles, return `"It was a tie"`.