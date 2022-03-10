/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Kerolos
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);
        SavingsAccount.setAnnualInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("New Balance for Saver1=%f \n",saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver1=%f \n",saver2.getSavingsBalance());
        
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("New Balance for Saver1=%f \n",saver1.getSavingsBalance());
        System.out.printf("New Balance for Saver1=%f \n",saver2.getSavingsBalance());
        
    }
    
}
