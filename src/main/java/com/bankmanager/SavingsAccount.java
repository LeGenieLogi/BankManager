package com.bankmanager;

/**
 * Compte d'epargne qui herite simplement de BankAccount.
 */
public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
    }

    public SavingsAccount(String account, double balance) {
        setAccount(account);
        setBalance(balance);
    }
}
