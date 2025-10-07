# Caught Speeding

### Question:
Given an **array of numbers** representing vehicle speeds and a **number representing the speed limit**, return an array with:
1. The **number of vehicles speeding**
2. The **average amount** they exceeded the speed limit

### Conditions:
- A vehicle is **speeding** if its speed is **greater than** the speed limit.
- If **no vehicles were speeding**, return `[0, 0]`.
- Return values should be **doubles**.

### Test Cases:
| **Sr. No.** | **Function Call**                                     | **Expected Output** |
| ----------- | ----------------------------------------------------- | ------------------- |
| 1           | `speeding(new int[]{50, 60, 55}, 60)`                 | `[0, 0]`            |
| 2           | `speeding(new int[]{58, 50, 60, 55}, 55)`             | `[2, 4.0]`          |
| 3           | `speeding(new int[]{61, 81, 74, 88, 65, 71, 68}, 70)` | `[4, 8.5]`          |
| 4           | `speeding(new int[]{100, 105, 95, 102}, 100)`         | `[2, 3.5]`          |
| 5           | `speeding(new int[]{40, 45, 44, 50, 112, 39}, 55)`    | `[1, 57.0]`         |
| 6           | `speeding(new int[]{70, 75, 80, 85, 90}, 65)`         | `[5, 15.0]`         |
| 7           | `speeding(new int[]{45, 50, 55}, 60)`                 | `[0, 0]`            |
| 8           | `speeding(new int[]{120, 130, 140}, 100)`             | `[3, 30.0]`         |
| 9           | `speeding(new int[]{100}, 100)`                       | `[0, 0]`            |
| 10          | `speeding(new int[]{101}, 100)`                       | `[1, 1.0]`          |

> [!NOTE]
> Test cases use Java syntax (`new int[]{...}`). For other languages, adjust the array syntax accordingly.

### Approach:
1. **Count speeding vehicles** and calculate their **total excess speed**.
2. **Calculate average**: `Total excess speed / Number of speeding vehicles`.
3. Return `[count, average]` or `[0, 0]` if no vehicles were speeding.

### Formula:
```
Average Excess Speed = (Sum of all excess speeds) / (Number of speeding vehicles)
```