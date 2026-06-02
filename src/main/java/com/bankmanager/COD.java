package com.bankmanager;

/**
 * COD signifie Certificate Of Deposit.
 * Ce compte ajoute une duree de depot en mois.
 */
public class COD extends BankAccount {
    private int termInMonths;

    public COD() {
    }

    public COD(String account, double balance, int termInMonths) {
        super(account, balance);
        this.termInMonths = termInMonths;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    @Override
    public String toString() {
        return "COD{" +
                "account='" + getAccount() + '\'' +
                ", balance=" + getBalance() +
                ", termInMonths=" + termInMonths +
                '}';
    }
}
