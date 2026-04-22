// src/main/java/com/lab11/App.java
package com.lab11;

public class App {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(500);
        acc.deposit(-50);
        acc.withdraw(200);
        acc.withdraw(5000);
        acc.getBalance();
        acc.fatalExample();

        Customer c1 = new Customer("Bat", "bat@gmail.com");
        Customer c2 = new Customer("Bold", null);

        System.out.println(c1.getDomain());
        System.out.println(c2.getDomain());
    }
}