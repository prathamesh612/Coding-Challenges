# Binary Tree Paths

### Question:
Given the `root` of a binary tree, return **all root-to-leaf paths** in **any order**.

A **leaf** is a node with no children.

### Rules:
- Path starts from the **root** node
- Path ends at a **leaf** node (node with no children)
- Format each path as: `"node1->node2->...->nodeN"`
- Return paths in **any order**

### Examples:
```
Input: root = [1, 2, 3, null, 5]
Tree structure:
     1
    / \
   2   3
    \
     5

Paths:
  - 1 -> 2 -> 5
  - 1 -> 3

Output: ["1->2->5", "1->3"]
```

```
Input: root = [1]
Tree structure:
     1

Only one node (also a leaf)
Output: ["1"]
```

```
Input: root = [1, 2, 3, 4, 5]
Tree structure:
     1
    / \
   2   3
  / \
 4   5

Paths:
  - 1 -> 2 -> 4
  - 1 -> 2 -> 5
  - 1 -> 3

Output: ["1->2->4", "1->2->5", "1->3"]
```

### Test Cases:
| **Sr. No.** | **Input Tree**          | **Expected Output**                            |
| ----------- | ----------------------- | ---------------------------------------------- |
| 1           | `[1, 2, 3, null, 5]`    | `["1->2->5", "1->3"]`                          |
| 2           | `[1]`                   | `["1"]`                                        |
| 3           | `[1, 2, 3, 4, 5]`       | `["1->2->4", "1->2->5", "1->3"]`               |

> [!NOTE]
> Tree is represented as array in level-order. `null` represents absent nodes.