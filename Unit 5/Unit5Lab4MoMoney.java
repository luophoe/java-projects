/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5lab4momoney;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 11/16/2018
 * @author luophoe
 */
public class Unit5Lab4MoMoney {
    
    public static double getWage(){
        System.out.println("Put in your wage:");
        Scanner input = new Scanner(System.in);
        double wage = input.nextDouble();
        return wage;
        //let the user to put in their wage as double, and return the value to the main method
    }
    
    public static int getHours(){
        System.out.println("Put in your work hours:");
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        return hours;
        //let the user to put in their hours as int, and return the value to the main method
    }
    
    public static double grossPay(int hour, double wage){
        double gross = (double)hour * wage;
        System.out.println("Your gross payment is $" + gross);
        return gross;
        //use the two retuned values to calculate the total wage(hours as double here)
    }
    
    public static double displayDeductions(double pay){
        pay = incomeTax(pay);
        pay = ccp(pay);
        return pay;
        //the two deductions (have to be in order)
    }
    
    public static double incomeTax(double pay){
        pay = pay - pay * .25;
        return pay;
    }
    
    public static double ccp(double pay){
        pay = pay - 8.0;
        return pay;
    }
    
    public static void cutCheck(double check){
        System.out.println("Your paymnet after tax is $" + check);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double wage = getWage();
        int hours = getHours();
        double pay = grossPay(hours, wage);
        double check = displayDeductions(pay);
        cutCheck(check);
    }
    
}
