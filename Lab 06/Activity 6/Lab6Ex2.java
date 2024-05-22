/**
 * 1211EC / Lab nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab6Ex2 {
    public static void main(String[] args) {
      CheckingAccount account1 = new CheckingAccount(123456, "John Smith", 2000);
      CheckingAccount account2 = new CheckingAccount(789012, "Jane Doe", 1500);
  
      System.out.println("Balance for account 1: " + account1.getBalance());
      System.out.println("Balance for account 2: " + account2.getBalance());
  
      account1.deposit(1000);
      account2.processCheck(1500);
  
      System.out.println("New balance for account 1: " + account1.getBalance());
      System.out.println("New balance for account 2: " + account2.getBalance());
    }
  }
  