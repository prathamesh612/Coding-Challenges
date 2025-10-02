import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        // This flag controls whether user wants to re-enter another number
        boolean reEnterNumber = true;

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Outer loop continues as long as user chooses 'y'
        do {
            try {
                System.out.print("\nEnter number between 1 to 1000 : ");
                int num = sc.nextInt();

                // check input is within valid range
                if (num >= 1 && num <= 1000) {
                    System.out.println("Sum of squares = " + sumOfSquares(num));
                } else {
                    System.out.println("Invalid! Enter number between 1 and 1000.");
                }

            } catch (InputMismatchException e) {
                System.out.println("You gave wrong input.");
            }

            sc.nextLine(); // clear input buffer

            // Inner loop to validate only 'y' or 'n'
            boolean inValidChar;
            do {
                System.out.print("Do you want to enter more? (y/n) : ");
                char c = sc.next().toLowerCase().charAt(0); // read first char, convert to lowercase
                if (c == 'n') {
                    reEnterNumber = false;
                    inValidChar = false;
                } else if (c == 'y') {
                    inValidChar = false;
                } else {
                    inValidChar = true;
                    System.out.println("Please enter (y/n).");
                }

            } while (inValidChar); // repeat until valid char is entered

        } while (reEnterNumber); // repeat main program if user entered 'y'

        sc.close();
    }

    // Using mathematical formula to calculate sum of squares
    private static long sumOfSquares(int n) {
        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }

}

/*
 * This program calculates the sum of squares of numbers from 1 up to a user-entered value (1–1000).
 * It uses Scanner for input, validates the range, and handles invalid entries with try–catch.
 * The sum is calculated using a mathematical formula for efficiency.
 * After each run, the user can choose to continue ('y') or exit ('n').
 */

/*
    > We can also use recursion to calculate the sum of squares.
    > However, for large inputs like 1000, recursion will create 1000 function calls.
    > This is safe in Java, but not the most efficient compared to the O(1) formula.
    
    // Recursive function to calculate sum of squares
    private static long sumOfSquares(int i) {
        if (i == 1) {
            return 1;
        }

        // Using Math.pow()
        // return (long) Math.pow(i, 2) + sumOfSquares(i - 1);

        // without Math.pow()
        return i * i + sumOfSquares(i - 1);
    }
 */