//W.A.J.P to check given number is Prime or not?


package AssignmentsModule;
import java.util.Scanner;
public class P004_PrimeNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle special cases
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Divisible by 2 or 3
        }

        // Check for factors from 5 to sqrt(num)
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}