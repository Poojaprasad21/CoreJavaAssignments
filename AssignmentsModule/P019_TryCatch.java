//WAP to demonstrate try catch block.

package AssignmentsModule;

public class P019_TryCatch {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        try {
	         
	            System.out.println("Accessing element at index 10:");
	            System.out.println(numbers[10]); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            
	            System.out.println("This block is always executed.");
	        }

	        System.out.println("Program continues after try-catch block.");
	    }
	}
