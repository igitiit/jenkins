package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    
    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), 0.001); // This test will pass
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance(), 0.001); // This test will pass
    }

    @Test
    public void testDepositFail() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(200, account.getBalance(), 0.001); // This will fail because the actual balance is 150
    }
}
