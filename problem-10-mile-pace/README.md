# Mile Pace Calculator

### Question :  
Write a function that takes the **number of miles ran** and the **total time in "MM:SS" (minutes:seconds)** format, and returns the **average pace per mile** in the same `"MM:SS"` format.  

### Conditions :  
- Input time will always be given in `"MM:SS"` format.  
- Miles can be an integer or a decimal (e.g., `26.2`).  
- Output must always be in `"MM:SS"` format with **leading zeros** if needed.  

### Test Cases :  

| **Sr. No.** | **Function Call**          | **Expected Output** |
| ----------- | -------------------------- | ------------------- |
| 1           | `milePace(3, "24:00")`     | `"08:00"`           |
| 2           | `milePace(1, "06:45")`     | `"06:45"`           |
| 3           | `milePace(2, "07:00")`     | `"03:30"`           |
| 4           | `milePace(26.2, "120:35")` | `"04:36"`           |

### Approach :  
1. Convert the input time `"MM:SS"` into **total seconds**.  
2. Divide total seconds by the number of miles to get the **pace in seconds per mile**.  
3. Convert the result back into `"MM:SS"` format.  
4. Add **leading zeros** where needed to maintain proper formatting.