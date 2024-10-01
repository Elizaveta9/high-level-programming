package edu.katkova;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Положить на счет. amount должно быть больше 0
    public void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        balance += amount;
        System.out.printf("Добавлено %.2f руб.\n", amount);

    }

    // Снять со счета. amount должно быть больше 0, меньше или равно балансу
    public void withdraw(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Снято %.2f руб.\n", amount);
        } else {
            System.out.printf("Невозможно снять %.2f руб. Недостаточно средств.\n", amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return String.format("Баланс счета %s: %.2f руб.", accountNumber, balance);
    }
}
