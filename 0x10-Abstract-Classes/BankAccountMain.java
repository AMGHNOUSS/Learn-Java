
/*
 * Create an abstract class BankAccount with abstract methods deposit() and withdraw().
 * Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class
 * Implement the respective methods to handle deposits and withdrawals for each account type.
 */


abstract class BankAccount {

    private String AccountNumber;
    private double balance;

    public BankAccount(String AccountNumber, double balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}


class SavingsAccount extends BankAccount {

    public SavingsAccount(String AccountNumber, double balance) {
        super(AccountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
        System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
    }
}

class CurrentAccount extends BankAccount {


    public CurrentAccount(String AccountNumber, double balance) {
        super(AccountNumber, balance);
    }

    @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    public void withdraw(double amount){
        setBalance(getBalance() - amount);
        System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        double ibal,damt,wamt;
        ibal = 1000.00;
        SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
		System.out.println("Savings A/c: Initial Balace: $"+ibal);
		damt = 500.00;
        savingsAccount.deposit(damt);
		wamt = 250.00;
        savingsAccount.withdraw(wamt);
		wamt = 1600.00;
		System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);

        System.out.println();
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
		System.out.println("Current A/c: Initial Balace: $"+ibal);
		damt = 2500.00;
        currentAccount.deposit(1000.0);
		wamt = 1250.00;
        currentAccount.withdraw(3000.0);
		wamt = 6000.00;
		System.out.println("\nTry to withdraw: $"+wamt);
        savingsAccount.withdraw(wamt);
    }
}
