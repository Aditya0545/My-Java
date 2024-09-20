class BankAccount
{
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to assign initial values
    public BankAccount(String depositorName, String accountNumber, String accountType, double balance)
    {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit an amt
    public void deposit(double amt)
    {
        if (amt > 0)
        {
            balance = balance + amt;
            System.out.println("Deposited " + amt + " to " + depositorName);
        }
        else
        {
            System.out.println("Insufficient Funds");
        }
    }

    public void withdraw(double amt)
    {
        if (amt < balance)
        {
            balance = balance - amt;
            System.out.println("Withdrawn " + amt + " from " + depositorName);
        }
        else
        {
            System.out.println("Insufficient Funds");
        }
    }

    public void display()
    {
        System.out.println("Account Details:\n");
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class TestBankAccount
{
    public static void main(String args[])
    {
        BankAccount obj = new BankAccount("John", "12345", "saving", 500.00);
        obj.deposit(2000);
        obj.withdraw(1500);
        obj.display();
        obj.withdraw(6000);
        obj.display();
    }
}
