# RGB to Hex

### Question:
Given a **CSS `rgb(r, g, b)` color string**, return its **hexadecimal equivalent**.

### Rules:
- Make all letters **lowercase**
- Return a `#` followed by **exactly six characters**
- **No shorthand** values (e.g., use `#ffffff` not `#fff`)
- Each RGB value (0-255) converts to a **2-digit hex** value (00-ff)

### Test Cases:
| **Sr. No.** | **Function Call**                | **Expected Output** |
| ----------- | -------------------------------- | ------------------- |
| 1           | `rgbToHex("rgb(255, 255, 255)")` | `"#ffffff"`         |
| 1           | `rgbToHex("rgb(1, 2, 3)")`       | `"#010203"`         |
| 2           | `rgbToHex("rgb(1, 11, 111)")`    | `"#010b6f"`         |
| 3           | `rgbToHex("rgb(173, 216, 230)")` | `"#add8e6"`         |
| 4           | `rgbToHex("rgb(79, 123, 201)")`  | `"#4f7bc9"`         |