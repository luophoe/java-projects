/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit4lab1;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 10/10/2018
 * @author luophoe
 */
public class Unit4Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***** Exercise 1 *****");
        int x = 1;
        while (x <= 7){
            System.out.println("Knock Knock\n" + "Who is there?\n" + "Banana!");
            x++;
            }
        System.out.println("Knock Knock\n" + "Who is there?\n" + "Orange!\n" + "Orange Who?\n" + "Orange you glad I didn't say Banana?");
        
        System.out.println("\n***** Exercise 2 *****");
        System.out.println("Put in the number for calculation:");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int x2 = 1;
        int total = 0;
        System.out.println("The calculation will be:");
                while (x2 <= num){
                    System.out.print(total + "+" + x2 + "=");
                    total=total+x2;
                    System.out.println(total);
                      x2++;
                }
                
        System.out.println("\n***** Exercise 3 *****");
        System.out.println("Put in the number for calculation:");
        int num2 = input.nextInt();
        int factor = 1;
        System.out.println("The factors will be:");
        while (factor <= num2){
            if (num2 % factor == 0){
                System.out.println(factor);
            }
            factor++;
        }  
    }
    
}
