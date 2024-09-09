// WAP to create one thread by implementing Runnable interface in Class.

package AssignmentsModule;

class MyRunnable implements Runnable {
 @Override
 public void run() {
    
     for (int i = 1; i <= 5; i++) {
         System.out.println("Running in thread: " + Thread.currentThread().getId() + " - Count: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
}

public class P021_Runnable {
 @SuppressWarnings("deprecation")
public static void main(String[] args) {
     
     MyRunnable myRunnable = new MyRunnable();    
     Thread thread = new Thread(myRunnable);
     thread.start();
     
     for (int i = 1; i <= 5; i++) {
         System.out.println("Running in main thread: " + Thread.currentThread().getId() + " - Count: " + i);
         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted: " + e.getMessage());
         }
     }
 }
}