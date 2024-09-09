//WAP to concatenate a given string to the end of another string. 

package AssignmentsModule;
import java.util.Scanner;
public class P018_StringConcatenation {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Read the first string from the user
	        System.out.print("Enter the first string: ");
	        String str1 = sc.nextLine();

	        // Read the second string from the user
	        System.out.print("Enter the second string: ");
	        String str2 = sc.nextLine();

	        String concatenatedWithOperator = str1 + str2;
	        System.out.println("Concatenated string using + operator: " + concatenatedWithOperator);
	        sc.close();
	    }
	}
