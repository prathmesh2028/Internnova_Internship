package Week_3;

class BankAccount
{
    public static int BankAccounts = 0;
    String accHolderName;
    String accNumber;
    double balance;

    BankAccount(String accHolderName , String accNumber , double balance)
    {
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.balance = balance;
        incrementAccounts();
    }
    void incrementAccounts()
    {
        BankAccounts++;
    }

    public void accountDetails()
    {
        System.out.println("Account number : " + accNumber);
        System.out.println("Account Holder Name : " + accHolderName);
        System.out.println("Balance : " + balance);
    }


}

public class Task_3_ThisAndStatic {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Prathmesh" , "9876543545678" , 100);
        BankAccount ba2 = new BankAccount("Bhavesh" , "12345678" , 500);
        BankAccount ba3 = new BankAccount("Piyush" , "92345678" , 1000);

        System.out.println();
        ba1.accountDetails();
        System.out.println();
        ba2.accountDetails();
        System.out.println();
        ba3.accountDetails();
        System.out.println();

        System.out.println("Number of bank accounts are : " + BankAccount.BankAccounts);

    }
}
