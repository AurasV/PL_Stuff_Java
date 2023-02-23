import java.util.Calendar;

/**
 * 1211EC / Lab nr 11
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class CurrentAccount extends BankAccount
{
    String owner;
    double balance;
    int transNr = 0;
    int transCost;
    final int FREE_TRANSACTIONS = 50;
    final int TRANSACTION_COST = 2;
    @Override
    public void endOfMonth() {
        Calendar cal = Calendar.getInstance();
        int res = cal.getActualMaximum(Calendar.DATE);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        if (res == dayOfMonth)
        {
            dischargeExpenses();
        }
    }
    public void dischargeExpenses() {
        if (transNr > FREE_TRANSACTIONS)
        {
            int nr = transNr - FREE_TRANSACTIONS;
            balance -= nr * TRANSACTION_COST;
        }
    }
    public void deposit(double amount)
    {
        balance += amount;
        transNr ++;
    }
    public void withdraw(double amount)
    {
        balance -= amount + transCost;
        transNr ++;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public String getOwner()
    {
        return owner;
    }
    public void setOwner(String owner)
    {
        this.owner = owner;
    }
    public int getTransNr()
    {
        return transNr;
    }
    public int getTransCost()
    {
        return transCost;
    }
    public int setTransNr(int transNr)
    {
        this.transNr = transNr;
        return transNr;
    }
    public int setTransCost(int transCost)
    {
        this.transCost = transCost;
        return transCost;
    }
    @Override
    public String toString()
    {
        return "CurrentAccount [owner=" + owner + ", balance=" + balance + ", transNr=" + transNr + ", transCost="
                + transCost + "]";
    }
}
