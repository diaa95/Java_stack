package com.bankaccount;

public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        System.out.println(account.checkingBalance);
        account.depositChecking(1000);
        System.out.println(account.checkingBalance);
        account.withdrawChecking(200);
        System.out.println(account.checkingBalance);
        account.depositSavings(3000);
        account.withdrawSavings(5000);
        System.out.println(BankAccount.totalMoney);
    }
}
