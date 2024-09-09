//WAP to calculate the average value of array elements.

package AssignmentsModule;
import java.util.Scanner;
public class P014_ArrayAverage {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the size of the array from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();

	        // Initialize the array with the specified size
	        double[] numbers = new double[size];

	        // Read array elements from the user
	        System.out.println("Enter " + size + " numbers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = scanner.nextDouble();
	        }

	        // Calculate the average of the array elements
	        double average = calculateAverage(numbers);

	        // Print the result
	        System.out.println("The average of the array values is: " + average);

	        scanner.close();
	    }

	    // Method to calculate the average of array elements
	    public static double calculateAverage(double[] array) {
	        double sum = 0;
	        for (double number : array) {
	            sum += number;
	        }
	        return sum / array.length;
	    }
	}