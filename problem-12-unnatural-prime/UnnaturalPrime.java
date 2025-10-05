public class UnnaturalPrime {
    public static void main(String[] args) {
        isUnnaturalPrime(1);
        isUnnaturalPrime(-1);
        isUnnaturalPrime(19);
        isUnnaturalPrime(-23);
        isUnnaturalPrime(0);
        isUnnaturalPrime(97);
        isUnnaturalPrime(-61);
        isUnnaturalPrime(99);
        isUnnaturalPrime(-44);
    }

    private static void isUnnaturalPrime(int num) {
        boolean isPrime = true;
        
        // Handle edge cases
        if (num >= -1 && num <= 1) {
            isPrime = false;
        } else {
            // Use absolute value for checking
            int absNum = Math.abs(num);
            
            // Check divisibility from 2 to sqrt(absNum)
            for (int i = 2; i <= Math.sqrt(absNum); i++) {
                if (absNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print appropriate message
        if (isPrime) {
            if (num > 0) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is a negative prime number.");
            }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}