package AssignmentsModule;

public class P009_Pattern3 {

	    public static void main(String[] args) {
	        int rows = 5; // Number of rows for the pattern

	        // Loop through each row
	        for (int i = 1; i <= rows; i++) {
	            // Loop through each column in the current row
	            for (int j = 1; j <= i; j++) {
	                // Print 1 if the column index is odd, 0 if even
	                // The condition `(i + j) % 2` toggles between 1 and 0
	                System.out.print((i + j) % 2);
	            }
	            // Move to the next line after printing all columns for the current row
	            System.out.println();
	        }
	    }
	}