# IPv4 Validator

### Question:
Given a **string**, determine if it is a **valid IPv4 address**.

A valid IPv4 address consists of **four integer numbers** separated by dots (`.`). Each number must satisfy:
- **Range:** Between 0 and 255 (inclusive)
- **No leading zeros:** `0` is allowed, but `01`, `001`, etc. are not
- **Only numeric characters** are allowed

### Examples:
```
✅ Valid:   "192.168.1.1"
✅ Valid:   "0.0.0.0"
❌ Invalid: "255.01.50.111"  (leading zero in "01")
❌ Invalid: "256.101.50.115" (256 > 255)
❌ Invalid: "192.168.101."   (missing fourth number)
```

### Test Cases:
| **Sr. No.** | **Function Call**               | **Expected Output** |
| ----------- | ------------------------------- | ------------------- |
| 1           | `isValidIPv4("192.168.1.1")`    | `true`              |
| 2           | `isValidIPv4("0.0.0.0")`        | `true`              |
| 3           | `isValidIPv4("255.01.50.111")`  | `false`             |
| 4           | `isValidIPv4("255.00.50.111")`  | `false`             |
| 5           | `isValidIPv4("256.101.50.115")` | `false`             |
| 6           | `isValidIPv4("192.168.101.")`   | `false`             |
| 7           | `isValidIPv4("192168145213")`   | `false`             |