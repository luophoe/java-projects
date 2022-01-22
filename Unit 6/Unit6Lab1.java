/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6lab1;
import java.util.Scanner;

/**
 *
 * @author luophoe
 */
public class Unit6Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] players = new String[5];
        int[] scores = new int[5];
        
        int p=0;
        for (int i=0; i<5; i++){
            p=i+1;
            System.out.println("What is player " + p + " name");
            String u = input.next();
            players[i]=u;  
            System.out.println("What is player " + p + " score");
            int k = input.nextInt();
            scores[i]=k;  
        }
        
        System.out.println("\nName    Score");
        for (int i=0; i<5; i++){
            System.out.println(players[i] + "\t" + scores[i]);
        }
    }
}
