/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosary;
import java.util.Scanner;

/**
 * Phoebe Luo
 * 10/23/2018
 * @author luophoe
 */
public class Rosary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hit enter to start rosary.");
        int hailmary;
        Scanner input = new Scanner(System.in);

        for(int pray=1; pray<=5; pray ++){
        input.nextLine();
        System.out.println("Our Father");
        for (hailmary=1; hailmary<=10; hailmary++){
            System.out.println("Hail Mary");
         }   
        System.out.println("Glory Be\n");
            System.out.println("The " + pray + " joyful mystery");
        }
        
    }
    
}
