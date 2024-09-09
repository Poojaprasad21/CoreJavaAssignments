//W.A.J.P to check given number is Armstrong or not?

package AssignmentsModule;
import java.util.Scanner;
public class P005_ArmstrongNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
 
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        // Calculate the sum of digits each raised to the power of numberOfDigits
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == originalNumber;
    }
}