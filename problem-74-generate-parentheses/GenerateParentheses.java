import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
        System.out.println(generateParenthesis(2));
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(0));
    }

    // Generates all valid combinations of n pairs of parentheses
    public static List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int n) {

        // when string reaches length 2*n, it is one valid combination
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // add '(' if we still have open brackets left
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // add ')' if count of close is less than open
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }
}

/*
 * We build the string step by step. At any point we can add '(' if we still
 * have some left, and we can add ')' only if it does not exceed the count of '('.
 * By expanding both choices we explore all valid combinations. Backtracking
 * lets us undo choices and try the next possible option.
 */
