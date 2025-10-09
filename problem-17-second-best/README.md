# Second Best

### Question:
Given an **array of laptop prices** and a **budget**, find the best laptop you can afford using these priority rules:
1. Return the **second most expensive laptop overall** if it's within your budget
2. If not, return the **most expensive laptop within your budget**
3. Return `0` if no laptops are affordable
4. **Ignore duplicate prices** (treat them as one price)

### Test Cases:
| **Sr. No.** | **Function Call**                                                    | **Expected Output** |
| ----------- | -------------------------------------------------------------------- | ------------------- |
| 1           | `getLaptopCost(new int[]{1500, 2000, 1800, 1400}, 1900)`             | `1800`              |
| 2           | `getLaptopCost(new int[]{1500, 2000, 2000, 1800, 1400}, 1900)`       | `1800`              |
| 3           | `getLaptopCost(new int[]{2099, 1599, 1899, 1499}, 2200)`             | `1899`              |
| 4           | `getLaptopCost(new int[]{2099, 1599, 1899, 1499}, 1000)`             | `0`                 |
| 5           | `getLaptopCost(new int[]{1200, 1500, 1600, 1800, 1400, 2000}, 1450)` | `1400`              |

> [!NOTE]
> Test cases use Java syntax. Adjust for other languages.