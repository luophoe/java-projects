/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5lab3bankmachine;

import java.util.Scanner;

/**
 * Phoebe Luo 
 * 11/14/2018
 * @author luophoe
 */
public class Unit5Lab3BankMachine {

    public static void displayBalance(double balance) {
        System.out.println("Your balance right now is: $" + balance);
        // return balance;
    }

    public static double addFunds(double balance) {
        //ask how much
        System.out.println("Put in the money you want to add:");
        Scanner input = new Scanner(System.in);
        double add = input.nextDouble();
        //add the deposit
        balance = balance + add;
        displayBalance(balance);
        return balance;
    }

    public static double withdrawFunds(double balance) {
        //ask how much
        System.out.println("Put in the money you want to withdraw:");
        Scanner input = new Scanner(System.in);
        double subtract = input.nextDouble();
        //subtract the deposit
        balance = balance - subtract;
        displayBalance(balance);
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Put in your balance:");
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        
        int option = 0;
        while (option != 4) {
            System.out.println("\n        Menu\n" + "1.	Display Balance\n"
                    + "2.	Add Funds\n"
                    + "3.	Withdraw Funds\n"
                    + "4.	Exit");

            System.out.println("\nSelect the options by entering the number:");
            option = input.nextInt();
            if (option == 1) {
                displayBalance(balance);

            } else if (option == 2) {
                addFunds(balance);

            } else if (option == 3) {
                withdrawFunds(balance);

            } else {
                System.out.println("Glad that I helped! Goodbye!");
            }
        }
    }
}
