package com.bankmanager;

/**
 * Compte courant.
 * Il ajoute une limite de decouvert au compte bancaire de base.
 */
public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount() {
    }

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
