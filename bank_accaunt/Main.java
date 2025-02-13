package org.example.dz2.bank_accaunt;

public class Main {
    public static void main (String [] args) {

        BankAccount accaunt1 = new BankAccount("Петя Петров",10000, 0);

        accaunt1.printBalance();
        //пополняем баланс
        accaunt1.balance = accaunt1.deposit(1000);
        accaunt1.printBalance();

        //снимаем деньги с баланса
        accaunt1.balance = accaunt1.withdraw(150);
        accaunt1.printBalance();
    }
}
