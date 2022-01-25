/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements.pkg1;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 9/24/2018
 * @author luophoe
 */
public class ConditionalStatements1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***** Exercise 1 *****");
        Scanner input = new Scanner (System.in);
        System.out.println("Put in your age:");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("You are old enough to vote.");
        }else{
            System.out.println("You are not old enough to vote.");
        }
        
        System.out.println("***** Exercise 2 *****");
        System.out.println("Put in the temperature outside:");
        int temp = input.nextInt();
        if (temp < 14){
            System.out.println("You need to wear a sweater.");
        }else{
            System.out.println("Have a good day!");
        }
        
        System.out.println("***** Exercise 3 *****");
        System.out.println("Put in the days you have been gone:");
        int day = input.nextInt();
        System.out.println("Put in the money you want to declare:");
        int money = input.nextInt();
        if (day <= 1){
            if (money <= 100){
                System.out.println("Have a good day!");
            }else{
                System.out.println("Go inside.");
            }
        }else{
            if (money <= 350){
                System.out.println("Have a good day!");
            }else{
                System.out.println("Go inside.");
            }
        }
    }
    
}
