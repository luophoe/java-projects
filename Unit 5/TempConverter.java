/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconverter;
import java.util.Scanner;

/**
 *Phoebe Luo
 *9/18/2018
 * Exercise Part 2
 * @author luophoe
 */
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("***** Exercise 3 *****");
        System.out.println("Put in your Fahrenheit temperature:");
        Scanner input = new Scanner (System.in);
        double tempf = input.nextDouble();
        double tempc = (tempf-32)*5/9;
        System.out.println("Your Celsius temperature is:" + tempc);
        
    }
    
}
