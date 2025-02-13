package org.example.dz2.bank_accaunt;

/**
 * 4. Реализуйте класс BankAccount
 * Поля:
 * String owner (владелец счёта),
 * double balance (баланс).
 * Реализуйте:
 * Конструктор, принимающий owner и balance.
 * Геттеры для получения данных.
 * Сеттер для изменения владельца.
 * Метод deposit(double amount) — увеличивает баланс на amount.
 * Метод withdraw(double amount) — уменьшает баланс на amount.
 * Метод printBalance() для вывода текущего баланса.
 * В методе main создайте банковский счёт, внесите депозит, снимите деньги и выведите текущий баланc
 */

public class BankAccount {
    String owner;
    double balance;
    double amount;

    public BankAccount(String someOwner, double someBalance, double someAmount) {
        this.owner = someOwner;
        this.balance = someBalance;
        this.amount = someAmount;
    }

    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }

    public void setOwner(String someOwner) {
        this.owner = someOwner;

    }public void setbalance(double someBalance) {
        this.balance = someBalance;
    }

    public double deposit(double someAmount) {
        balance = balance + someAmount;
        return balance;
    }

    public double withdraw(double amount) {
        balance = balance - amount;
        return  balance;
    }

    public void printBalance() {
        System.out.println("Текущий баланс: " + balance);
    }


}
