# P@ssw0rd Str3ngth!

### Question:
Given a **password string**, evaluate its strength and return `"weak"`, `"medium"`, or `"strong"` based on specific security rules.

### Rules:
A password is evaluated against **4 criteria**:

1. **Length:** At least **8 characters** long
2. **Mixed Case:** Contains both **uppercase** and **lowercase** letters
3. **Numbers:** Contains at least **one digit** (0-9)
4. **Special Characters:** Contains at least one of: `!`, `@`, `#`, `$`, `%`, `^`, `&`, `*`

### Strength Classification:
- **Weak:** Meets **fewer than 2** rules
- **Medium:** Meets **2 or 3** rules
- **Strong:** Meets **all 4** rules

### Test Cases:
| **Sr. No.** | **Function Call**                 | **Expected Output** |
| ----------- | --------------------------------- | ------------------- |
| 1           | `checkStrength("123456")`         | `"weak"`            |
| 2           | `checkStrength("pass!!!")`        | `"weak"`            |
| 3           | `checkStrength("Qwerty")`         | `"weak"`            |
| 4           | `checkStrength("PASSWORD")`       | `"weak"`            |
| 5           | `checkStrength("PASSWORD!")`      | `"medium"`          |
| 6           | `checkStrength("PassWord%^!")`    | `"medium"`          |
| 7           | `checkStrength("qwerty12345")`    | `"medium"`          |
| 8           | `checkStrength("S3cur3P@ssw0rd")` | `"strong"`          |
| 9           | `checkStrength("C0d3&Fun!")`      | `"strong"`          |