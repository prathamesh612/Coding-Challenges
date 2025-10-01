import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorializer {
    public static void main(String[] args) {

        // This flag controls whether user wants to re-enter another number
        boolean reEnterNumber = true;

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Outer loop continues as long as user chooses 'y'
        do {
            try {
                System.out.print("\nEnter number between 0 to 20 : ");
                int num = sc.nextInt();

                // check input is within valid range
                if (num >= 0 && num <= 20) {
                    System.out.println("Factorial = " + factorial(num));
                } else {
                    System.out.println("Please enter number between 0 to 20.");
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

    // Recursive function to calculate factorial
    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

/*
 * In this program, I used a Scanner to take input from the user, and a
 * recursive function to calculate the factorial of a number. I applied a
 * try–catch block to handle invalid inputs like characters instead of numbers.
 * To allow the user to calculate factorials multiple times, I used a loop with
 * a boolean flag, and for continuation, I validated the input so that the user
 * must enter 'y' or 'n'. This way, the program keeps running until the user
 * decides to exit.
 */