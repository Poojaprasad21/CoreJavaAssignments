//W.A.J.P for create Fibonacci Series.

package AssignmentsModule;
import java.util.Scanner;
public class P006_FibonacciSeries {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Generate and display the Fibonacci series
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series up to " + terms + " terms:");

            // Print the Fibonacci series
            printFibonacciSeries(terms);
        }

        scanner.close();
    }

    // Method to print the Fibonacci series up to a given number of terms
    public static void printFibonacciSeries(int terms) {
        int first = 0, second = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");

            // Compute the next term
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }

        System.out.println(); // New line after the series
    }
}