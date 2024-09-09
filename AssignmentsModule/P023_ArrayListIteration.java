//WAP to iterate through all elements in an array list. 

package AssignmentsModule;
import java.util.ArrayList;

    public class P023_ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("Using traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing Iterator:");
        java.util.Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Lambda expression:");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}