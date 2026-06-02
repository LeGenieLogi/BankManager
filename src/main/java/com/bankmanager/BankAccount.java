package com.bankmanager;

/**
 * Classe parent qui represente un compte bancaire simple.
 * Les classes enfants vont heriter de account et balance.
 */
public class BankAccount {
    private String account;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
