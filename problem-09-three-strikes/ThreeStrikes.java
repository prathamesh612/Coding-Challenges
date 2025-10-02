import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeStrikes {

    public static void main(String[] args) {
        // This flag controls whether user wants to re-enter another number
        boolean reEnterNumber = true;

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Outer loop continues as long as user chooses 'y'
        do {
            try {
                System.out.print("\nEnter number between 1 to 10000 : ");
                int num = sc.nextInt();

                // check input is within valid range
                if (num >= 1 && num <= 10000) {
                    System.out.println("Count of squares containing 3 = " + squaresWithThree(num));
                } else {
                    System.out.println("Invalid! Enter number between 1 and 10000.");
                }

            } catch (InputMismatchException e) {
                System.out.println("You gave wrong input.");
            }

            sc.nextLine(); // clear input buffer

            // Inner loop to validate only 'y' or 'n'
            boolean invalidChar;
            do {
                System.out.print("Do you want to enter more? (y/n) : ");
                char c = sc.next().toLowerCase().charAt(0); // read first char, convert to lowercase
                if (c == 'n') {
                    reEnterNumber = false;
                    invalidChar = false;
                } else if (c == 'y') {
                    invalidChar = false;
                } else {
                    invalidChar = true;
                    System.out.println("Please enter (y/n).");
                }

            } while (invalidChar); // repeat until valid char is entered

        } while (reEnterNumber); // repeat main program if user entered 'y'

        sc.close();
    }

    // Using digit extraction (Faster)
    private static int squaresWithThree(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int square = i * i;

            while (square > 0) {
                if (square % 10 == 3) {
                    count++;
                    break;
                }
                square /= 10;
            }
        }
        return count;
    }

}

/*
 * This program counts how many numbers between 1 and a user-entered value (1–10000)
 * have a square that contains at least one digit '3'.
 * It uses Scanner for input, validates the range, and handles invalid entries with try–catch.
 * The check is performed using digit extraction for efficiency.
 * After each run, the user can choose to continue ('y') or exit ('n').
 */

/*
    > We can also use a String-based approach to check for digit '3'.
    > However, converting to String for each square is slower compared to digit extraction.
    
    // Using String.contains("3") (Slower)
    private static int squaresWithThree(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int square = i * i;

            String squareStr = String.valueOf(square);
            if (squareStr.contains("3")) {
                count++;
            }
        }
        return count;
    }
 */