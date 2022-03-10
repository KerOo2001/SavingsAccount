package javaapplication13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kerolos
 */
public class SavingsAccount {

    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount() {

        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }

    public SavingsAccount(double intRate, double savBal) {
        this.annualInterestRate = intRate;
        this.savingsBalance = savBal;

    }

    public double calculateMonthlyInterest() {

        double intRate = (savingsBalance * annualInterestRate / 12);
        savingsBalance += intRate;
        return intRate;
    }

    public static void modifyInterestRate(double newInteresRate) {
        annualInterestRate = newInteresRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

}
