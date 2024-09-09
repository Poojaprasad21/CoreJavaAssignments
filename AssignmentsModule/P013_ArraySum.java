//WAP to sum values of an array.

package AssignmentsModule;
import java.util.Scanner;
public class P013_ArraySum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the size of the array from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();

	        // Initialize the array with the specified size
	        int[] numbers = new int[size];

	        // Read array elements from the user
	        System.out.println("Enter " + size + " numbers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Calculate the sum of the array elements
	        int sum = calculateSum(numbers);

	        // Print the result
	        System.out.println("The sum of the array values is: " + sum);

	        scanner.close();
	    }

	    // Method to calculate the sum of array elements
	    public static int calculateSum(int[] array) {
	        int sum = 0;
	        for (int number : array) {
	            sum += number;
	        }
	        return sum;
	    }
	}