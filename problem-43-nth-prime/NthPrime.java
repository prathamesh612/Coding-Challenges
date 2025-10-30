import java.util.Arrays;

public class NthPrime {

    public static void main(String[] args) {
        System.out.println(nthPrime(5));
        System.out.println(nthPrime(10));
        System.out.println(nthPrime(16));
        System.out.println(nthPrime(99));
        System.out.println(nthPrime(1000));
    }

    // Returns the nth prime number using the Sieve of Eratosthenes
    private static int nthPrime(int n) {
        int limit = 200000; // reasonable upper bound for finding nth prime
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // Mark all non-prime numbers
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;

        // Count primes until reaching the nth one
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i])
                count++;
            if (count == n)
                return i;
        }

        return -1; // not found within limit
    }
}

/*
 * This method finds the nth prime number using the Sieve of Eratosthenes.
 * It precomputes primes up to a set limit by marking multiples as non-prime,
 * then counts prime numbers until it reaches the nth one.
 *
 * Used: Arrays.fill() for initialization and the sieve algorithm for efficiency.
 */
