package edu.katkova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void shouldBeEqualDeposit() {
        BankAccount bankAccount = new BankAccount("", 100);
        bankAccount.deposit(100);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    void withdrawMoreThanHave() {
        BankAccount bankAccount = new BankAccount("", 100);
        bankAccount.withdraw(1000);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void withdrawLessThanHave() {
        BankAccount bankAccount = new BankAccount("", 100);
        bankAccount.withdraw(99);
        assertEquals(1, bankAccount.getBalance());
    }
}