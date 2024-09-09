/*
 W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show
custom exception otherwise amount will deduct from account
balance.
Account balance is:2000
Enter withdraw amount:2500
Sorry, insufficient balance, you need more 500 Rs.
To perform this transaction.
 */

package AssignmentsModule;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
 private double shortfall;

 public InsufficientBalanceException(double shortfall) {
     super("Sorry, insufficient balance, you need more " + shortfall + " Rs.");
     this.shortfall = shortfall;
 }

 public double getShortfall() {
     return shortfall;
 }
}

public class P031_BankAccount {
 private double balance;
 public P031_BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         double shortfall = amount - balance;
         throw new InsufficientBalanceException(shortfall);
     } else {
         balance -= amount;
         System.out.println("Withdrawal successful. Remaining balance: " + balance);
     }
 }

 public static void main(String[] args) {
  
	 P031_BankAccount account = new P031_BankAccount(2000);
     Scanner scanner = new Scanner(System.in);

     try {
         System.out.print("Enter withdraw amount: ");
         double withdrawAmount = scanner.nextDouble();

         account.withdraw(withdrawAmount);
     } catch (InsufficientBalanceException e) {
   
         System.out.println(e.getMessage());
     } finally {
         scanner.close();
     }
 }
}