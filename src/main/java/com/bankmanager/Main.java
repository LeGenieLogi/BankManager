package com.bankmanager;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        COD codAccount = new COD();

        // On definit account et balance pour chaque classe enfant.
        checkingAccount.setAccount("CHK-1001");
        checkingAccount.setBalance(1200.50);
        checkingAccount.setLimit(300.00);

        savingsAccount.setAccount("SAV-2001");
        savingsAccount.setBalance(3500.00);
        savingsAccount.setInterestRate(2.5);

        codAccount.setAccount("COD-3001");
        codAccount.setBalance(10000.00);
        codAccount.setTermInMonths(12);

        // On lit les valeurs pour verifier que l'heritage fonctionne.
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);
        System.out.println(codAccount);
    }
}
