//WAP to find the maximum and minimum value of an array.

package AssignmentsModule;
import java.util.Scanner;
public class P016_MaxMinArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read the size of the array from the user
	        System.out.print("Enter the number of elements in the array: ");
	        int size = sc.nextInt();

	        // Initialize the array with the specified size
	        int[] numbers = new int[size];

	        // Read array elements from the user
	        System.out.println("Enter " + size + " integers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Element " + (i + 1) + ": ");
	            numbers[i] = sc.nextInt();
	        }

	        // Find the maximum and minimum values in the array
	        int[] result = findMaxMin(numbers);
	        int max = result[0];
	        int min = result[1];

	        // Print the results
	        System.out.println("The maximum value in the array is: " + max);
	        System.out.println("The minimum value in the array is: " + min);
	        
	        sc.close();
	    }

	    // Method to find the maximum and minimum values in an array
	    public static int[] findMaxMin(int[] array) {
	        int max = array[0];
	        int min = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }

	        return new int[]{max, min}; // Return an array containing both max and min values
	    }
	}