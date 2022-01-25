/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package division.modulus.rounding;
import java.util.Scanner;

/**
 *Phoebe Luo
 * 9/18/2018
 * Exercise Part 1
 * @author luophoe
 */
public class DivisionModulusRounding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***** Exercise 1 *****");
        System.out.println("Put in your first course score:");
        Scanner input = new Scanner (System.in);
        int course1 = input.nextInt();
        int total = 0;
        total = total + course1;
        System.out.println("Put in your second course score:");
        int course2 = input.nextInt();
        total = total + course2;
        System.out.println("Put in your third course score:");
        int course3 = input.nextInt();
        total = total + course3;
        System.out.println("Put in your forth course score:");
        int course4 = input.nextInt();
        total = total + course4;
        double average = (double)total/4;
        average = average + .5;
        System.out.println("Your average is:" + (int) average);
        
        System.out.println("***** Exercise 2 *****");
        System.out.println("Give your first two digit umber:");
        double num1 = input.nextInt();
        System.out.println("Give your second two digit umber:");
        double num2 = input.nextInt();
        double tens = (num1 + num2)/10;
        double ones = (num1 + num2)%10;       
        System.out.println("Your number in the tens place:" + (int) tens + ", your number in the ones place:" + (int)ones);
        

    }
    
}
