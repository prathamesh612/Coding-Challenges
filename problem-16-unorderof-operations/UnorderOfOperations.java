public class UnorderOfOperations {

    public static void main(String[] args) {
        evaluate(new int[] { 5, 6, 7, 8, 9 }, new String[] { "+", "-" });
        evaluate(new int[] { 17, 61, 40, 24, 38, 14 }, new String[] { "+", "%" });
        evaluate(new int[] { 20, 2, 4, 24, 12, 3 }, new String[] { "*", "/" });
        evaluate(new int[] { 11, 4, 10, 17, 2 }, new String[] { "*", "*", "%" });
        evaluate(new int[] { 33, 11, 29, 13 }, new String[] { "/", "-" });
    }

    private static void evaluate(int[] numbers, String[] operators) {
        // Initialize result with first number
        int result = numbers[0];

        // Apply operations left-to-right
        for (int i = 1; i < numbers.length; i++) {
            // Get operator using modulo for cycling
            int operatorIndex = (i - 1) % operators.length;
            String operator = operators[operatorIndex];
            int currentNumber = numbers[i];

            // Apply the operation using switch statement
            switch (operator) {
                case "+":
                    result += currentNumber;
                    break;
                case "-":
                    result -= currentNumber;
                    break;
                case "*":
                    result *= currentNumber;
                    break;
                case "/":
                    result /= currentNumber;
                    break;
                case "%":
                    result %= currentNumber;
                    break;
            }
        }

        // Print the result
        System.out.println(result);
    }
}

/*
 * This program evaluates mathematical expressions from left-to-right, ignoring standard order of operations.
 * It takes an array of integers and an array of operators, applying operations sequentially.
 * Operators are cycled through using modulo if there are more numbers than operators.
 * Valid operators include: +, -, *, /, and %.
 * Results are printed to the console for each test case.
 */