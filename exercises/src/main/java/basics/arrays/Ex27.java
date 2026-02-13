package basics.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NEXT_PRIME = 0;
        int NEXT_NOTPRIME = 0;
        int[] primes = new int[5];
        int[] notPrimes = new int[5];

        char keepGoing;
        do {
            System.out.print("Number: ");
            int number = scanner.nextInt();

            if (isPrime(number)) {
                primes[NEXT_PRIME++] = number;
            } else {
                notPrimes[NEXT_NOTPRIME++] = number;
            }
            System.out.print("Keep going? (y/n): ");
            keepGoing = scanner.next().charAt(0);
        } while (
                NEXT_PRIME < primes.length &&
                NEXT_NOTPRIME < notPrimes.length &&
                keepGoing != 'n' || keepGoing == 'y'
        );

        System.out.printf("""
                Primes: %s
                Not Primes: %s""", Arrays.toString(primes), Arrays.toString(notPrimes));


        scanner.close();
    }

    private static boolean isPrime(int n) {
        if (n < 1) return false;
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
