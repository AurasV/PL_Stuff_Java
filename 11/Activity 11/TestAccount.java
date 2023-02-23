/**
 * 1211EC / Lab nr 11
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class TestAccount
{
    public static void main(String[] args)
    {
        CurrentAccount ca1 = new CurrentAccount();
        SavingsAccount sa1 = new SavingsAccount();
        CurrentAccount ca2 = new CurrentAccount();
        SavingsAccount sa2 = new SavingsAccount();
        ca1.setOwner("Aurel");
        ca1.setBalance(1000);
        System.out.println(ca1.toString());
        ca1.deposit(100);
        ca1.withdraw(50);
        System.out.println(ca1.toString());
        ca1.endOfMonth();
        System.out.println(ca1.toString());
        sa1.setOwner("Viorel");
        sa1.setBalance(1000);
        sa1.setInterestRate(0.1);
        System.out.println(sa1.toString());
        sa1.endOfMonth();
        System.out.println(sa1.toString());
        ca2.setOwner("Frimu");
        ca2.setBalance(1000);
        System.out.println(ca2.toString());
        ca2.deposit(100);
        ca2.withdraw(50);
        System.out.println(ca2.toString());
        ca2.endOfMonth();
        System.out.println(ca2.toString());
        sa2.setOwner("Marian");
        sa2.setBalance(1000);
        sa2.setInterestRate(0.1);
        System.out.println(sa2.toString());
        sa2.endOfMonth();
        System.out.println(sa2.toString());


    }

}
