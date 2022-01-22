/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.util.Scanner;

/**
 *Phoebe Luo
 * 9/18/2018
 * difficult but super interesting
 * @author luophoe
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Put in your costs in dollars and cents:");
        double cost = input.nextDouble();
        System.out.println("Put in your cash in dollars and cents:");
        double cash = input.nextDouble();
        double change = cash - cost; //test number: change = 0.48, 0.26, 0.34
        int dollar = (int)change;
        
        //the idea is using the known unit and its result as a base to calculate the answer of the next unit
        
        double quarter =((change % 1)+ 0.02)/.25;  //put +.02 in to correct roundings
        //System.out.println(quarter);
        
        double dime = (quarter - (int)quarter)*.25;
        //System.out.println(dime);
        dime = dime/0.1;
        
        double nickle = (dime - (int)dime)*.1/0.05;
        
        System.out.println("Your change is: " + dollar + " dollars, " + (int)quarter + " quaters, " + (int)dime + " dimes, " + (int)nickle + " nickles.");
        
    }
    
}
