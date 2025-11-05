# Nth Fibonacci DP

### Question:
Given a **positive integer n**, compute the **nth Fibonacci number** efficiently using **Dynamic Programming**.

### Optimization:
Use **Dynamic Programming** to avoid redundant calculations:
- **Memoization (Top-Down):** Store computed values
- **Tabulation (Bottom-Up):** Build solution iteratively
- **Space Optimized:** Use only two variables

### Examples:
```
n = 5
F(0) = 0
F(1) = 1
F(2) = F(1) + F(0) = 1 + 0 = 1
F(3) = F(2) + F(1) = 1 + 1 = 2
F(4) = F(3) + F(2) = 2 + 1 = 3
F(5) = F(4) + F(3) = 3 + 2 = 5
Output: 5

n = 10
F(10) = 55
```

### Test Cases:
| **Sr. No.** | **Function Call** | **Expected Output** |
| ----------- | ----------------- | ------------------- |
| 1           | `fibonacci(0)`    | `0`                 |
| 2           | `fibonacci(1)`    | `1`                 |
| 3           | `fibonacci(5)`    | `5`                 |
| 4           | `fibonacci(10)`   | `55`                |
| 5           | `fibonacci(15)`   | `610`               |
| 6           | `fibonacci(20)`   | `6765`              |
| 7           | `fibonacci(30)`   | `832040`            |
| 8           | `fibonacci(40)`   | `102334155`         |