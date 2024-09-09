package AssignmentsModule;

public class P010_Pattern4 {
	    public static void main(String[] args) {
	        int rows = 4; // Number of rows

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(i + " ");
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}
