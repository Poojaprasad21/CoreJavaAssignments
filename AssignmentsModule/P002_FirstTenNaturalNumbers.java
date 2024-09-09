//W.A.J.P in Java to display the first 10 natural numbers using while loop. 

package AssignmentsModule;

public class P002_FirstTenNaturalNumbers {
    public static void main(String[] args) {
        // Initialize the counter to 1 (the first natural number)
        int number = 1;

        // Loop to display the first 10 natural numbers
        while (number <= 10) {
            System.out.println(number);
            number++; // Increment the counter
        }
    }
}