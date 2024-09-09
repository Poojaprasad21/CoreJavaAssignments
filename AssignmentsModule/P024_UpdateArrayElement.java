//WAP to update specific array element by given element.

package AssignmentsModule;

public class P024_UpdateArrayElement {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original array:");
        printArray(numbers);
        int indexToUpdate = 2;
        int newValue = 99;     

        if (indexToUpdate >= 0 && indexToUpdate < numbers.length) {
            numbers[indexToUpdate] = newValue;
        } else {
            System.out.println("Index out of bounds!");
        }

        System.out.println("\nUpdated array:");
        printArray(numbers);
    }
    
    private static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}