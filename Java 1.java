// src/main/java/com/lab11/BankAccount.java
package com.lab11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BankAccount {

    private static final Logger logger = LogManager.getLogger(BankAccount.class);

    private double balance = 1000;

    public void deposit(double amount) {
        logger.trace("Entering deposit() amount={}", amount);

        if (amount < 0) {
            logger.warn("Negative deposit: {}", amount);
            return;
        }

        logger.debug("Before deposit balance={}", balance);
        balance += amount;
        logger.debug("After deposit balance={}", balance);

        logger.info("Deposit success amount={}", amount);

        logger.trace("Exiting deposit()");
    }

    public void withdraw(double amount) {
        logger.trace("Entering withdraw() amount={}", amount);

        if (amount < 0) {
            logger.warn("Negative withdraw: {}", amount);
            return;
        }

        if (amount > balance) {
            logger.error("Insufficient balance. Tried={}, Balance={}", amount, balance);
            return;
        }

        logger.debug("Before withdraw balance={}", balance);
        balance -= amount;
        logger.debug("After withdraw balance={}", balance);

        logger.info("Withdraw success amount={}", amount);

        logger.trace("Exiting withdraw()");
    }

    public double getBalance() {
        logger.trace("Entering getBalance()");
        logger.info("Current balance={}", balance);
        logger.trace("Exiting getBalance()");
        return balance;
    }

    public void fatalExample() {
        logger.fatal("Critical config missing!");
    }
}