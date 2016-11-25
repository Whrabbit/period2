package bank;

import java.util.ArrayList;
import java.util.List;

abstract class Account {
    String owner;
    double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    abstract void print();
}
class SavingsAccount extends Account {

    public SavingsAccount(String owner, double balance) {
        super(owner, balance);
    }
    
    @Override
    void print() {
        System.out.println("Spaarrekening van " + owner);
    }
}
class CheckingAccount extends Account {

    public CheckingAccount(String owner, double balance) {
        super(owner, balance);
    }
    
    @Override
    void print() {
        System.out.println("Betaalrekening van " + owner);
    }
}

public class Bank {
    List<Account> accounts;
    
    public Bank() {
        accounts = new ArrayList<>(); 
    }
    void addAccount(Account saving) {
        accounts.add(saving);
    }
    void print() {
        for(Account account : accounts) {
            account.print();
        }
    }
    public static void test() {
        
        System.out.println("\nTesting Bank\n");

        Bank bank = new Bank();

        bank.addAccount(new SavingsAccount("Henk", 10));
        bank.addAccount(new CheckingAccount("Ingrid", 100));
        
        bank.print();
    }
}

