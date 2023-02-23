/**
 * 1211EC / Lab nr 11
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Calendar;
public class SavingsAccount extends BankAccount
{

    String owner;
    double balance;
    int id;
    double interestRate;

    @Override
    public void endOfMonth() {
        Calendar cal = Calendar.getInstance();
        int res = cal.getActualMaximum(Calendar.DATE);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (res == dayOfMonth)
        {
            applyInterest();
        }
    }
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
    @Override
    public String getOwner() {
        return owner;
    }
    @Override
    public void setOwner(String owner) {
        this.owner = owner;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public String toString()
    {
        return "SavingsAccount [owner=" + owner + ", balance=" + balance + ", id=" + id + ", interestRate=" + interestRate + "]";
    }
}
