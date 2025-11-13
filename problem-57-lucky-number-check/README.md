# Lucky Number Check     

### Question:     
A number is called **lucky** if the **sum of the digits in its first half** is **equal** to the **sum of the digits in its second half**.     

## Rules:     
- The number should contain an **even number of digits**.     
- Divide the number into **two equal halves**.     
- Calculate the **sum of digits** in each half.     
- If both sums are equal, the number is **lucky**, otherwise it is **not lucky**.     
- Return `true` if the number is lucky and `false` otherwise.     

### Example:     

Number: 123321    
First half: 1 + 2 + 3 = 6    
Second half: 3 + 2 + 1 = 6    
Since both sums are equal, 123321 is a lucky number.    

---     

### Test Cases:     
| **Sr. No.** | **Function Call**         | **Expected Output** |
| ----------- | ------------------------- | ------------------- |
| 1           | `isLuckyNumber(123321)`   | `true`              |
| 2           | `isLuckyNumber(562561)`   | `false`             |
| 3           | `isLuckyNumber(123456)`   | `false`             |
| 4           | `isLuckyNumber(555999)`   | `false`             |
| 5           | `isLuckyNumber(43211234)` | `true`              |
| 6           | `isLuckyNumber(987123)`   | `false`             |
| 7           | `isLuckyNumber(111111)`   | `true`              |
