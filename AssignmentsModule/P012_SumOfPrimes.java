//WAP to compute the sum of the first 100 prime numbers.

package AssignmentsModule;

public class P012_SumOfPrimes {

	    public static void main(String[] args) {
	        int count = 0; // Number of primes found
	        long sum = 0;  // Sum of the first 100 primes
	        int number = 2; // Starting number to check for primality

	        while (count < 100) {
	            if (isPrime(number)) {
	                sum += number;
	                count++;
	            }
	            number++;
	        }

	        System.out.println("The sum of the first 100 prime numbers is: " + sum);
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false; // 0 and 1 are not primes
	        if (num <= 3) return true;  // 2 and 3 are primes

	        if (num % 2 == 0 || num % 3 == 0) return false; // Divisible by 2 or 3

	        // Check for factors from 5 to sqrt(num)
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) return false;
	        }

	        return true;
	    }
	}
