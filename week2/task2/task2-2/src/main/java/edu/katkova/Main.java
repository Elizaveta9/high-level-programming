package edu.katkova;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("4070 2810 8526 5553 7518", 1000.0);
        System.out.printf("Баланс счета %s: %.2f руб.\n", bankAccount.getAccountNumber(), bankAccount.getBalance());

        //Положить на счет
        bankAccount.deposit(413.12);
        System.out.printf("Баланс счета %s после добавления: %.2f руб.\n", bankAccount.getAccountNumber(), bankAccount.getBalance());

        //Снять со счета
        bankAccount.withdraw(612.31);
        System.out.printf("Баланс счета %s после снятия: %.2f руб.\n", bankAccount.getAccountNumber(), bankAccount.getBalance());

        // Попытка снять больше денег, чем имеется
        bankAccount.withdraw(2000.0);
    }
}
