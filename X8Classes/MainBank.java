
/*
 * Create a class called "Bank" with a collection of accounts and methods to add and remove accounts
 * And to deposit and withdraw money. Also define a class called "Account" to maintain account 
 * details of a particular customer.
 */

import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        
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