package com.bankmanager;

/**
 * COD signifie Certificate Of Deposit et herite simplement de BankAccount.
 */
public class COD extends BankAccount {
    public COD() {
    }

    public COD(String account, double balance) {
        setAccount(account);
        setBalance(balance);
    }
}
