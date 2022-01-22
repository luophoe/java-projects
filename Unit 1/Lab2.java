/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;
import java.util.Scanner;

/**
 *Phoebe Luo
 *9/14/2018
 * @author luophoe
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("***** exercise 1 *****");
        double time = 2.25;
        int velocity = 110;
        double distance = time * velocity;
        System.out.println("You will travel " + distance + "km.");
        
        System.out.println("***** Exercise 2 *****");
        Scanner input = new Scanner (System.in); 
        System.out.println("Put in your first number:");
        int num1 = input.nextInt();
        System.out.println("Put in your second number:");
        int num2 = input.nextInt();
        int total = num1 + num2;
        System.out.println("The sum of the values is:" + total);
        
        System.out.println("***** Exercise 3 *****");
        System.out.println("Put in your first score:");
        int num3 = input.nextInt();
        System.out.println("Put in your second score:");
        int num4 = input.nextInt();
        System.out.println("Put in your third score:");
        int num5 = input.nextInt();
        double average = (double)(num3 + num4 + num5)/3;
        average = average + .5;
        System.out.println("Your average score is:" + (int)average);
        
        System.out.println("***** Exercise 4 *****");
        System.out.println("Put in your radius for a circle:");
        int num6 = input.nextInt();
        final double PI = 3.14;
        double perimeter = 2 * num6 * PI;
        System.out.println("Your perimeter for the circle is:" + perimeter);
        
        System.out.println("***** Exercise 5 *****");
        System.out.println("Put in your work hour this week:");
        int num7 = input.nextInt();
        final double tax = .17;
        final int wage = 15;
        double income = num7 * wage * (1-tax);
        System.out.println("Your income for this week is: $" + income);
        
        
        
        
        
        
                
    }
    
}
