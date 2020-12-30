package com.bankaccount;

import java.util.Random;

public class BankAccount {
    public String accountNumber;
    public double checkingBalance;
    public double savingsBalance;
    public static double numberOfAccounts;
    public static double totalMoney;

    public BankAccount(){
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }

    public static String generateAccountNumber(){
        String str = "";
        for (int i = 0; i < 10; i++) {
            int x = new Random().nextInt(10);
            str = str.concat(String.valueOf(x));
        }
        return str;
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void depositChecking(double amount){
        this.checkingBalance += amount;
        totalMoney += amount;
        System.out.println("Successfully deposited Checking");
    }
    public void depositSavings(double amount){
        this.savingsBalance += amount;
        totalMoney += amount;
        System.out.println("Successfully deposited Savings");
    }
    public void withdrawSavings(double amount){
        if (this.savingsBalance > amount){
            this.savingsBalance -= amount;
            totalMoney -= amount;
            System.out.println("Successfully withdrawn Savings");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    public void withdrawChecking(double amount){
        if (this.checkingBalance > amount){
            this.checkingBalance -= amount;
            totalMoney -= amount;
            System.out.println("Successfully withdrawn Checking");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    public double getTotalMoney(){
        return totalMoney;
    }
}
