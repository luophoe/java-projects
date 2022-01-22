/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6lab3;

/**
 * Phoebe Luo
 * 12/04/2018
 * @author luophoe
 */
public class Unit6Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[13];
        int rollValue = 1;
        for(int i = 0;i < 100000; i++){
        int dice1 = (int)(6*Math.random()+1);
        int dice2 = (int)(6*Math.random()+1);
        rollValue = dice1 + dice2;
        //keep track of how many times that roll came up
        numbers[rollValue]++;
        }
        //loop through the results
        for(int d = 2;d <= 12; d++){
            System.out.println("Number " + d + " comes out " + numbers[d] + " times.");
        }
        
    }
    
}
