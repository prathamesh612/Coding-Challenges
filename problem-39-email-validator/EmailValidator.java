public class EmailValidator {

    public static void main(String[] args) {
        System.out.println(validate("a@b.cd"));
        System.out.println(validate("hell.-w.rld@example.com"));
        System.out.println(validate(".b@sh.rc"));
        System.out.println(validate("example@test.c0"));
        System.out.println(validate("freecodecamp.org"));
        System.out.println(validate("develop.ment_user@c0D!NG.R.CKS"));
        System.out.println(validate("hello.@wo.rld"));
        System.out.println(validate("hello@world..com"));
        System.out.println(validate("git@commit@push.io"));
    }

    // Checks if a given email string follows basic email format rules
    private static boolean validate(String email) {

        String[] emailParts = email.split("@");

        // Email must have exactly one '@' symbol
        if (emailParts.length != 2) {
            return false;
        }

        String local = emailParts[0];
        String domain = emailParts[1];

        // Local part can contain letters, digits, '.', '_', or '-'
        for (char c : local.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c) || c == '.' || c == '_' || c == '-') {
                continue;
            } else {
                return false;
            }
        }

        // Local part should not start or end with '.'
        if (local.startsWith(".") || local.endsWith(".")) {
            return false;
        }

        // Domain part must contain at least one '.'
        if (!domain.contains(".")) {
            return false;
        }

        // Check each part (before and after '@') for valid '.' placement and domain ending
        for (int i = 0; i < emailParts.length; i++) {
            String[] byDot = emailParts[i].split("\\.");

            // Check contain two consecutive dots
            for (String s : byDot) {
                if (s.equals("")) {
                    return false;
                }
            }

            // For the domain part, ensure the last section (TLD) has at least 2 letters
            if (i == emailParts.length - 1) {
                int lettersCount = 0;
                for (char c : byDot[byDot.length - 1].toCharArray()) {
                    if (Character.isLetter(c)) {
                        lettersCount++;
                    }
                }

                if (lettersCount < 2) {
                    return false;
                }
            }
        }

        return true;
    }
}

/*
 * This method validates email format using string operations and character checks.
 * It splits the email into local and domain parts, ensures valid symbols,
 * prevents consecutive dots, checks domain structure, and verifies the top-level
 * domain has at least two letters.
 * 
 * Used: basic String methods (split, startsWith, contains) and Character checks.
 */