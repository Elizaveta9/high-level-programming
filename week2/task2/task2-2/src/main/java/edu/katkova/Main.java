package edu.katkova;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("4070 2810 8526 5553 7518", 1000.0);
        System.out.println(bankAccount);

        // Поплнить счет
        bankAccount.deposit(413.12);
        System.out.println(bankAccount);

        // Снять со счета
        bankAccount.withdraw(612.31);
        System.out.println(bankAccount);

        // Попытка снять больше, чем имеется
        bankAccount.withdraw(2000.0);
    }

}
