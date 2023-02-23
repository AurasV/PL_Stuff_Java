/**
 * 1211EC / Lab nr 6
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class CheckingAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
  
    public CheckingAccount(int accountNumber, String accountHolder, double balance) {
      this.accountNumber = accountNumber;
      this.accountHolder = accountHolder;
      this.balance = balance;
    }
  
    public void deposit(double amount) {
      balance += amount;
    }
  
    public void processCheck(double amount) {
      if (balance - amount < -100000) {
        balance -= 15;
      }
      balance -= amount;
    }
  
    public double getBalance() {
      return balance;
    }
  }
  