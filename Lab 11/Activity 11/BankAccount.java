/**
 * 1211EC / Lab nr 11
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
abstract public class BankAccount
{
    double balance;
    String owner;
    int id;
    int idCurrentAccount = 1;

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
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getIdCurrentAccount()
    {
        return idCurrentAccount;
    }
    abstract public void endOfMonth();
}
