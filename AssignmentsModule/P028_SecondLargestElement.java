//WAP to find the second largest element in an array. 

package AssignmentsModule;

public class P028_SecondLargestElement {
    public static void main(String[] args) {
  
        int[] array = {10, 5, 20, 8, 15};
        int secondLargest = findSecondLargest(array);
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new RuntimeException("There is no second largest element in the array");
        }

        return secondLargest;
    }
}
