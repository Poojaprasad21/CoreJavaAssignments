/*W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It
has two subclasses each having a method with the same name
'message' that prints "This is first subclass" and "This is second
subclass" respectively.
Call the methods 'message' by creating an object for each subclass. 
*/
package AssignmentsModule;
abstract class Parent {

 abstract void message();
}

class FirstSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is the first subclass");
 }
}
class SecondSubclass extends Parent {
 @Override
 void message() {
     System.out.println("This is the second subclass");
 }
}

public class P029_AbstractClass {
 public static void main(String[] args) {
   
     Parent first = new FirstSubclass();
     Parent second = new SecondSubclass();
     first.message(); 
     second.message();
 }
}