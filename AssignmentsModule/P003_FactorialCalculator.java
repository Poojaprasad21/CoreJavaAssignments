//W.A.J.P to find factorial for Given Number

package AssignmentsModule;
import java.util.Scanner;
public class P003_FactorialCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = calculateFactorial(number);

            // Print the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }

    // Method to calculate factorial using a for loop
    public static long calculateFactorial(int num) {
        long result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}