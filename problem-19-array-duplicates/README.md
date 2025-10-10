# Array Duplicates

### Question:
Given an **array of integers**, return an **array of integers that appear more than once** in the initial array, sorted in **ascending order**. If no values appear more than once, return an **empty array**.

**Important:** Only include **one instance** of each duplicate value.

### Test Cases:
| Sr. No. | Function Call                                 | Expected Output        |
| ------- | --------------------------------------------- | ---------------------- |
| 1       | `findDuplicates(new int[]{1, 2, 3, 4, 5})`    | `[]`                   |
| 2       | `findDuplicates(new int[]{1, 2, 3, 4, 1, 2})` | `[1, 2]`               |
| 3       | `findDuplicates(new int[]{2, 34, 0, 1, -6, 23, 5, 3, 2, 5, 67, -6, 23, 2, 43, 2, 12, 0, 2, 4, 4})` | `[-6, 0, 2, 4, 5, 23]` |

> [!NOTE]
> Test cases use Java syntax. Adjust for other languages.