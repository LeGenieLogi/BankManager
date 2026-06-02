package com.bankmanager;

/**
 * Compte d'epargne.
 * Il ajoute un taux d'interet au compte bancaire de base.
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "account='" + getAccount() + '\'' +
                ", balance=" + getBalance() +
                ", interestRate=" + interestRate +
                '}';
    }
}
