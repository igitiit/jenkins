package com.example;

public class BankAccountTest {
    public static void main(String[] args) {
        // Create a new bank account with initial balance of 100
        BankAccount account = new BankAccount(100);
        
        // Test initial balance
        System.out.println("Initial balance: " + account.getBalance());
        assert account.getBalance() == 100 : "Initial balance should be 100";
        
        // Test deposit
        account.deposit(50);
        System.out.println("Balance after deposit: " + account.getBalance());
        assert account.getBalance() == 150 : "Balance after deposit should be 150";
        
        // Test successful withdrawal
        account.withdraw(30);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        assert account.getBalance() == 120 : "Balance after withdrawal should be 120";
        
        // Test insufficient funds
        account.withdraw(200);
        System.out.println("Balance after attempted large withdrawal: " + account.getBalance());
        assert account.getBalance() == 120 : "Balance should remain unchanged after failed withdrawal";
        
        System.out.println("All tests passed successfully!");
    }
}