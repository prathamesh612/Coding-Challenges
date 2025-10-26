# Email Validator

### Question:
Given a string, determine whether it is a valid email address based on a set of specific rules. The validation should ensure that the format follows general email standards while respecting the provided constraints.

### Rules:
1. The email must contain exactly one `@` symbol.
2. The local part (the text before the `@`) can include letters, digits, dots, underscores, and hyphens.
3. The local part cannot start or end with a dot.
4. The domain part (the text after the `@`) must contain at least one dot.
5. The domain must end with a dot followed by at least two letters.
6. Neither the local part nor the domain part can contain two consecutive dots.

The function should return `true` if the string is a valid email address and `false` otherwise.

### Test Cases:
| **Sr. No.** | **Function Call**                            | **Expected Output** |
| ----------- | -------------------------------------------- | ------------------- |
| 1           | `validate("a@b.cd")`                         | `true`              |
| 2           | `validate("hell.-w.rld@example.com")`        | `true`              |
| 3           | `validate(".b@sh.rc")`                       | `false`             |
| 4           | `validate("example@test.c0")`                | `false`             |
| 5           | `validate("freecodecamp.org")`               | `false`             |
| 6           | `validate("develop.ment_user@c0D!NG.R.CKS")` | `true`              |
| 7           | `validate("hello.@wo.rld")`                  | `false`             |
| 8           | `validate("hello@world..com")`               | `false`             |
| 9           | `validate("git@commit@push.io")`             | `false`             |
