//WAP to remove the third element from a array list. 

package AssignmentsModule;
import java.util.ArrayList;
    public class P025_RemoveElement {
    public static void main(String[] args) {
  
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");
        
  
        System.out.println("Original ArrayList:");
        printList(fruits);
        
        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < fruits.size()) {
            fruits.remove(indexToRemove);
        } else {
            System.out.println("Index out of bounds!");
        }
        
        System.out.println("\nUpdated ArrayList:");
        printList(fruits);
    }
    

    private static void printList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}