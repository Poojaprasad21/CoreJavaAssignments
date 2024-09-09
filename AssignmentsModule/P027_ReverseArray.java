//WAP to reverse an array of integer values. 

package AssignmentsModule;
import java.util.Arrays;


	    public class P027_ReverseArray {
	    public static void main(String[] args) {
	      
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int[] reversedArray1 = reverseArrayUsingLoop(originalArray);
	        System.out.println("Reversed Array using loop: " + Arrays.toString(reversedArray1));

	        int[] reversedArray2 = reverseArrayUsingTwoPointers(originalArray);
	        System.out.println("Reversed Array using two-pointer approach: " + Arrays.toString(reversedArray2));

	        Integer[] originalArrayObj = {1, 2, 3, 4, 5}; 
	        Integer[] reversedArray3 = reverseArrayUsingCollections(originalArrayObj);
	        System.out.println("Reversed Array using Collections.reverse: " + Arrays.toString(reversedArray3));
	    }

	    public static int[] reverseArrayUsingLoop(int[] array) {
	        int[] reversedArray = new int[array.length];
	        for (int i = 0; i < array.length; i++) {
	            reversedArray[i] = array[array.length - 1 - i];
	        }
	        return reversedArray;
	    }
	    public static int[] reverseArrayUsingTwoPointers(int[] array) {
	        int[] reversedArray = array.clone(); 
	        int left = 0;
	        int right = reversedArray.length - 1;

	        while (left < right) {
	         
	            int temp = reversedArray[left];
	            reversedArray[left] = reversedArray[right];
	            reversedArray[right] = temp;
	            left++;
	            right--;
	        }
	        return reversedArray;
	    }
	    public static Integer[] reverseArrayUsingCollections(Integer[] array) {
	        java.util.Collections.reverse(java.util.Arrays.asList(array));
	        return array;
	    }
	}