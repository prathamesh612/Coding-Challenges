### Question :  
Write a function that takes an **array of numbers** and a **target value** and finds two unique numbers in the array that add up to the target.  

### Conditions :  
- Print an **indices** of those two numbers.  
- If no such pair exists, print **"Target not found"**.  
- Indices in the result must be in **ascending order**.  

### Test Cases :  

**Sr. No.** | **Function Call**                                     | **Expected Output**  
--------|-----------------------------------------------------------|----------------------------  
1       | `findTarget(new int[]{2, 7, 11, 15}, 9)`                  | `[0, 1]`
2       | `findTarget(new int[]{3, 2, 4, 5}, 6)`                    | `[1, 2]`
3       | `findTarget(new int[]{1, 3, 5, 6, 7, 8}, 15);`            | `[4, 5]`
4       | `findTarget(new int[]{5, 75, 25}, 100)`                   | `[1, 2]`
5       | `findTarget(new int[]{0, 4, 3, 0}, 0)`                    | `[0, 3]`
6       | `findTarget(new int[]{-3, 4, 3, 90}, 0)`                  | `[0, 2]`
7       | `findTarget(new int[]{1, 2, 3, 4, 4}, 8)`                 | `[3, 4]`
8       | `findTarget(new int[]{10, 20, 10, 40, 50, 60, 70}, 50)`   | `[0, 3]`
9       | `findTarget(new int[]{100, 200, 300, 400, 500}, 900)`     | `[3, 4]`
10      | `findTarget(new int[]{1, 3, 5, 7}, 14);`                  | `Target not found`

> [!NOTE]
> The above test cases use Java-compatible array syntax (new int[]{...}).
> If you are using another language (like Python, JavaScript, or C#), 
> change the array format to match that language’s syntax.
