public class Passw0rdStr3ngth {

    public static void main(String[] args) {
        System.out.println(checkStrength("123456"));
        System.out.println(checkStrength("pass!!!"));
        System.out.println(checkStrength("Qwerty"));
        System.out.println(checkStrength("PASSWORD"));
        System.out.println(checkStrength("PASSWORD!"));
        System.out.println(checkStrength("PassWord%^!"));
        System.out.println(checkStrength("qwerty12345"));
        System.out.println(checkStrength("S3cur3P@ssw0rd"));
        System.out.println(checkStrength("C0d3&Fun!"));
    }

    // Evaluates password strength based on 4 criteria.
    private static String checkStrength(String password) {

        // Track the count of satisfied rules (out of 4 total)
        int metRulesCount = 0;

        // Flags for character criteria
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Rule 1: Length check is simple
        if (password.length() >= 8) {
            metRulesCount++;
        }

        String specialChars = "!@#$%^&*";

        // Iterate once to check the remaining three criteria
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialChars.indexOf(c) != -1) {
                hasSpecial = true;
            }

            // Optimization: exit loop early once all flags are set
            if (hasUpper && hasLower && hasDigit && hasSpecial) {
                break;
            }
        }

        // Rule 2: Mixed Case (requires both upper AND lower)
        if (hasUpper && hasLower) {
            metRulesCount++;
        }

        // Rule 3: Numbers
        if (hasDigit) {
            metRulesCount++;
        }

        // Rule 4: Special Characters
        if (hasSpecial) {
            metRulesCount++;
        }

        // Final classification logic
        if (metRulesCount < 2) {
            return "weak";
        } else if (metRulesCount <= 3) {
            return "medium";
        } else {
            return "strong"; // Must be 4
        }
    }
}
/*
 * This method checks password strength against four criteria:
 * Length (>= 8), Mixed Case, Numbers, and Special Characters.
 * We use an integer counter to track satisfied rules, which is cleaner than
 * using floating point arithmetic. A single loop iterates over the string
 * to set character-type flags, optimizing performance with an early exit
 * once all character flags are found. The final strength is determined
 * by the total count of met rules (0-4).
 */