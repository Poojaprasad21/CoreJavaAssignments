//WAP to Compare Two String.

package AssignmentsModule;
import java.util.Scanner;
public class P017_StringComparison {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Read the first string from the user
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.nextLine();

	        // Read the second string from the user
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.nextLine();

	        if (str1.equals(str2)) {
	            System.out.println("The strings are equal.");
	        } else {
	            System.out.println("The strings are not equal.");
	        }
	        scanner.close();
	    }
	}