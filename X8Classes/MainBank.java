
/*
 * Create a class called "Bank" with a collection of accounts and methods to add and remove accounts
 * And to deposit and withdraw money. Also define a class called "Account" to maintain account 
 * details of a particular customer.
 */

import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList < Account > accounts = bank.getAccounts();

        for (Account account: accounts) {
            account.print();
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.deposit(account1, 1000);
        account1.print();
        System.out.println("No transaction in account2:");
        account2.print();
        System.out.println("After withdrawing 5000 from account3:");
        bank.withdraw(account3, 5000);
        account3.print();
    }
}

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setaccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public String getaccountNumber() {
        return this.accountNumber;
    }
    
    public double getbalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void print(){
        System.out.print("Name : " + this.name);
        System.out.print(", Account Nmber : " + this.accountNumber);
        System.out.println(", balance : " + this.balance + ".");
    }
}


class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank() {
        accounts = new ArrayList < Account > ();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void RemoveAccount(Account a) {
        accounts.remove(a);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public ArrayList <Account> getAccounts() {
        return this.accounts;
    }
}