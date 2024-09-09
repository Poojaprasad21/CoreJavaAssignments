//WAP to demonstrate multiple catch blocks

package AssignmentsModule;

public class P020_SimpleMultipleCatch {
	    public static void main(String[] args) {
	        try {
	            
	            int result = 10 / 0; 
	            
	           
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]); 
	            
	        } catch (ArithmeticException e) {
	           
	            System.out.println("Error: Cannot divide by zero.");
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            
	            System.out.println("Error: Array index is out of bounds.");
	            
	        } finally {
	           
	            System.out.println("Finally block executed.");
	        }
	        
	        
	        System.out.println("Program continues after try-catch blocks.");
	    }
	}
