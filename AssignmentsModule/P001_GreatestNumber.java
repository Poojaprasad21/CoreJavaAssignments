//W.A.J.P to Take three numbers from the user and print the greatest number.
 

package AssignmentsModule;
import java.util.Scanner;
public class P001_GreatestNumber {
	
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Find the greatest number
        int greatest = findGreatest(number1, number2, number3);

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);
        sc.close();
    }

    // Method to find the greatest number among three numbers
    public static int findGreatest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}