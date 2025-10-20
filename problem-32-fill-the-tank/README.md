# Fill The Tank

### Question:
Given the **size of a fuel tank**, the **current fuel level**, and the **price per gallon**, return the **cost to fill the tank** completely.

### Rules:
- `tankSize` is the **total capacity** of the tank in gallons
- `fuelLevel` is the **current amount** of fuel in the tank in gallons
- `pricePerGallon` is the **cost** of one gallon of fuel
- Return value should be formatted as: `"$d.dd"` (always 2 decimal places)

### Test Cases:
| **Sr. No.** | **Function Call**           | **Expected Output** |
| ----------- | --------------------------- | ------------------- |
| 1           | `costToFill(20, 0, 4.00)`   | `"$80.00"`          |
| 2           | `costToFill(15, 10, 3.50)`  | `"$17.50"`          |
| 3           | `costToFill(18, 9, 3.25)`   | `"$29.25"`          |
| 4           | `costToFill(12, 12, 4.99)`  | `"$0.00"`           |
| 5           | `costToFill(15, 9.5, 3.98)` | `"$21.89"`          |