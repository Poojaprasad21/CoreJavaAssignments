//WAP to find the index of an array element. 

package AssignmentsModule;
import java.util.Scanner;
public class P015_FindElementIndex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements in the array: ");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the element to find: ");
	        int elementToFind = scanner.nextInt();

	        int index = findIndex(array, elementToFind);

	        if (index != -1) {
	            System.out.println("Element " + elementToFind + " found at index " + index);
	        } else {
	            System.out.println("Element " + elementToFind + " not found in the array.");
	        }
	        
	        scanner.close();
	    }

	    public static int findIndex(int[] array, int element) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == element) {
	                return i; 
	            }
	        }
	      return -1;
	    }
	}