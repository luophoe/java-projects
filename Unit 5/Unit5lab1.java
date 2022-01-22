/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5lab1;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 10/30/2018
 * @author luophoe
 */
public class Unit5lab1 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void roof(){
        System.out.println("     *");
        System.out.println("   *****");
        System.out.println("  *******");
        System.out.println(" **********");
        }
    public static void wall(){
        System.out.println("  |     |");
        System.out.println("  |_____|");
        }
    public static void walkWay(){
        System.out.println("    : :");
        System.out.println("    : :");
    }
    public static double cdToUd(double money){
        double back1 = money *  .76;
        return back1;        
    }
    public static double udToCd(double money){
        double back2 = money * 1.31;
        return back2;
    }
    public static void main(String[] args) { 
    
    // TODO code application logic here
        System.out.println("***** Exercise 1 *****");
        Scanner input = new Scanner(System.in);
        roof();
        wall();
        walkWay();
        
        System.out.println("\n***** Exercise 2 *****");
        System.out.println("Put in 1 for Canadian dollars to US dollars & 2 for US dollars to Canadian dollars:");
        int choice = input.nextInt();
        System.out.println("Put in the money for calculation:");
        double money = input.nextInt();
       
        
        if (choice == 1){
            System.out.println("\nYou have " + cdToUd(money));
        }else{
            System.out.println("\nYou have " + udToCd(money));
        }
    }
}

