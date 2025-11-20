public class StringToInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi(" -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("21474836460"));
        System.out.println(myAtoi("+-12"));
        System.out.println(myAtoi(" +0 123"));
    }

    // Converts string to 32-bit signed integer
    private static int myAtoi(String s) {
        int i = 0, n = s.length();
        int result = 0;
        boolean negative = false;

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ')
            i++;

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            i++;
        }

        // 3. Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 4. Check overflow before it happens
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return negative ? -result : result;
    }

}

/*
 * First the function skips any leading spaces.
 * Then it checks if the next character is '+' or '-' to determine the sign.
 * After that it keeps reading digits one by one.
 * Before multiplying the current result by 10, it checks if doing so will overflow.
 * If overflow is detected, it directly returns INT_MAX or INT_MIN.
 * Otherwise it builds the number normally and applies the sign at the end.
 * 
 * This logic follows the classic atoi rules and ensures safe integer conversion.
 */