/*
 W.A.J.P to Print pattern Given Below.
1)
	1
	12
	123
	1234
	12345
2)
	1
	12
	123
	1234
	12345
3)
	1
	01
	101
	01010
	101010
4)
	    1
	   2 2
	  3 3 3
	 4 4 4 4
5)
	     *
	   * * *
	 * * * * *
	   * * *
	     *

 
 */


package AssignmentsModule;

public class P007_Pattern1 {

	    public static void main(String[] args) {
	        int rows = 5; // Number of rows

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}