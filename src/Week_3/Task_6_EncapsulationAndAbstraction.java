package Week_3;

class Bankaccount
{
    private double balance;
    String accHolderName;
    private String accNumber;
    private int pinCode;

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

abstract class Account
{
    abstract void getAccountData();
    public void setAccountData()
    {
        System.out.println("Setting the account data in the database...!");
    }
}
class BankAcccount extends Account
{
    public void getAccountData()
    {
        System.out.println("Getting the account data...!");
    }
}
public class Task_6_EncapsulationAndAbstraction {
    public static void main(String[] args) {
        Bankaccount acc1 = new Bankaccount();
        acc1.setBalance(100000);
        acc1.setAccHolderName("Prathmesh");
        System.out.println("Account 1 details\n" + acc1.getAccHolderName() + " " + acc1.getBalance() + " " +acc1.getPinCode());


        System.out.println();

        BankAcccount account = new BankAcccount();
        account.getAccountData();
        account.setAccountData();
    }
}
