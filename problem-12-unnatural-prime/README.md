# Unnatural Prime

### Question:
Given an **integer**, determine if that number is a **prime number** or a **negative prime number** and print an appropriate message.

### Conditions:
- A **prime number** is a positive integer greater than 1 that is only divisible by 1 and itself.
- A **negative prime number** is the negative version of a positive prime number.
- **1 and 0** are not considered prime numbers.
- The function should **print a message** indicating whether the number is prime or not.

### Test Cases:
| **Sr. No.** | **Function Call**       | **Expected Output**                 |
| ----------- | ----------------------- | ----------------------------------- |
| 1           | `isUnnaturalPrime(1)`   | `"1 is not a prime number."`        |
| 2           | `isUnnaturalPrime(-1)`  | `"-1 is not a prime number."`       |
| 3           | `isUnnaturalPrime(19)`  | `"19 is a prime number."`           |
| 4           | `isUnnaturalPrime(-23)` | `"-23 is a negative prime number."` |
| 5           | `isUnnaturalPrime(0)`   | `"0 is not a prime number."`        |
| 6           | `isUnnaturalPrime(97)`  | `"97 is a prime number."`           |
| 7           | `isUnnaturalPrime(-61)` | `"-61 is a negative prime number."` |
| 8           | `isUnnaturalPrime(99)`  | `"99 is not a prime number."`       |
| 9           | `isUnnaturalPrime(-44)` | `"-44 is not a prime number."`      |

### Approach:
1. Handle **edge cases**: If the number is `0`, `1`, or `-1`, print that it's not a prime number.
2. Convert the number to its **absolute value** to check if it's prime.
3. Check if the absolute value is **divisible by any number** from `2` to `√n`.
4. If divisible by any number, it's **not prime** — print appropriate message.
5. If no divisors are found, it's **prime**:
   - If the original number was **positive**, print that it's a prime number.
   - If the original number was **negative**, print that it's a negative prime number.