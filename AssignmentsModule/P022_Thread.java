//WAP to create one thread by extending Thread class in another Class.

package AssignmentsModule;

class MyThread extends Thread {
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

public class P022_Thread {
 public static void main(String[] args) {
     MyThread myThread = new MyThread();
     myThread.start();
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