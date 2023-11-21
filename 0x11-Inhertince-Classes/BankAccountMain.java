
/*
 * create a class known as "BankAccount" with methods called deposit() and withdraw().
 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
 * If the account balance falls below one hundred.
 */


class BankAccount {
    private String AccountNumber;
    protected double balance;

    public BankAccount(String AccountNumber, double balance) {
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.AccountNumber;
    }

    public double getbalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance)
            System.out.println("Insufficient balance");
        else
            this.balance -= amount;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String AccountNumber, double balance) {
        super(AccountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance - amount < 100)
            System.out.println("Minimum balance of $100 required!");
        else
            super.withdraw(amount);
    }
}

public class BankAccountMain{
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
		//Create a BankAccount object (A/c No. "BA1234") with initial balance of $500
        BankAccount BA1234 = new BankAccount("BA1234", 500);

        // Deposit $1000 into account BA1234
		System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + BA1234.getbalance());

        // Withdraw $600 from account BA1234
		System.out.println("Withdraw $600 from account BA1234:");
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getbalance());

        // Create a SavingsAccount object (A/c No. "SA1234") with initial balance of $450
		System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount SA1234 = new SavingsAccount("SA1234",450);

        // Withdraw $300 from SA1234
        SA1234.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getbalance());

     
		// Create a SavingsAccount object (A/c No. "SA1000") with initial balance of $300
		System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount("SA1000",300);

        // Withdraw $250 from SA1000 (balance falls below $100)
		System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getbalance());      		
    }
}