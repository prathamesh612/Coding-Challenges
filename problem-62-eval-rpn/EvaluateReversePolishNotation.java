import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] { "2", "1", "+", "3", "*" }));
        System.out.println(evalRPN(new String[] { "4", "13", "5", "/", "+" }));
        System.out.println(evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
        System.out.println(evalRPN(new String[] { "3", "11", "+", "5", "-" }));
        System.out.println(evalRPN(new String[] { "18" }));
        System.out.println(evalRPN(new String[] { "5", "1", "2", "+", "4", "*", "+", "3", "-" }));
    }

    // Evaluates an expression written in Reverse Polish Notation (postfix)
    private static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>(); // stack to hold numbers

        for (String token : tokens) {

            // If it's a number push it on the stack
            if (!"+-*/".contains(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                // Pop last two numbers for operation
                int a = stack.pop();
                int b = stack.pop();

                // Apply operator on b and a (order matters)
                switch (token) {
                    case "+":
                        stack.push(b + a);
                        break;
                    case "-":
                        stack.push(b - a);
                        break;
                    case "*":
                        stack.push(b * a);
                        break;
                    case "/":
                        stack.push(b / a);
                        break;
                }
            }
        }

        return stack.pop(); // final result
    }
}

/*
 * This program evaluates Reverse Polish Notation (postfix expressions).
 * It uses a stack: numbers get pushed, and whenever an operator appears,
 * the last two numbers are popped, the operation is applied, and the
 * result is pushed back. Order matters in - and /, so we do b op a.
 * In the end, the stack holds only one number — the final evaluated value.
 */
