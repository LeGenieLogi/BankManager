package com.bankmanager;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        COD codAccount = new COD();

        // On definit account et balance pour chaque classe enfant.
        checkingAccount.setAccount("CHECKING-100");
        checkingAccount.setBalance(1200.50);
        checkingAccount.setLimit(300.00);

        savingsAccount.setAccount("SAVINGS-200");
        savingsAccount.setBalance(3500.00);

        codAccount.setAccount("COD-300");
        codAccount.setBalance(10000.00);

        // On verifie simplement l'acces aux attributs demandés.
        System.out.println("CheckingAccount: account=" + checkingAccount.getAccount()
                + ", balance=" + checkingAccount.getBalance()
                + ", limit=" + checkingAccount.getLimit());
        System.out.println("SavingsAccount: account=" + savingsAccount.getAccount()
                + ", balance=" + savingsAccount.getBalance());
        System.out.println("COD: account=" + codAccount.getAccount()
                + ", balance=" + codAccount.getBalance());
    }
}
