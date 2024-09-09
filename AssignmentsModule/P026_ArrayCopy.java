//WAP to Copy one array into another.

package AssignmentsModule;
import java.util.Arrays;


    public class P026_ArrayCopy {
    public static void main(String[] args) {

        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray1 = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray1[i] = originalArray[i];
        }

        System.out.println("Copied Array using loop: " + Arrays.toString(copiedArray1));

        int[] copiedArray2 = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray2, 0, originalArray.length);

        System.out.println("Copied Array using System.arraycopy: " + Arrays.toString(copiedArray2));

        int[] copiedArray3 = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Copied Array using Arrays.copyOf: " + Arrays.toString(copiedArray3));
    }
}