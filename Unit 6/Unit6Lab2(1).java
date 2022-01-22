/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit6lab2;

import java.util.Scanner;

/**
 * Phoebe Luo 12/4/2018
 *
 * @author luophoe
 */
public class Unit6Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***** Exercise 2 *****");
        String[] words = {"B", "i", "n", "g", "o"};

        for (int x = 0; x < words.length; x++) {
            System.out.println("And BINGO was his name O!");
            
            //Loop the next part 3 times
            for (int p = 0; p <= 3; p++) {
                //Set y to how many claps
                int y = 0;
                while (y < x) {
                    System.out.print("* ");
                    y++;
                }
               // System.out.println("Value of x is " + x);
                for (int z = x; z < words.length; z++) {
                                    //System.out.println("Value of z is " + z);

                   System.out.print(words[z]+" ");
                }
                System.out.println(",");
            }
            System.out.println("");
        }

        System.out.println("***** Exercise 1 *****");
        Scanner input = new Scanner(System.in);
        System.out.println("Put in your word");
        String name = input.next();
        char[] letters;
        letters = name.toCharArray();
        int c = letters.length;
        int b = c / 2;//middle letter's position is shown when length/2
        char middle1 = name.charAt(b);
        char middle2 = name.charAt(b - 1);
        if (c % 2 == 0) {
            System.out.println("\n1. The middle letter is " + middle2 + " and " + middle1);
            //show the middle letter when the total is 2x+1
        } else {
            System.out.println("\n1. The middle letter is " + middle1);
            //show the middle letter when the total is 2x
        }

        System.out.println("\n2. There are " + c + " letters in your word.");
        System.out.println("\n3. Your word backword is:");
        for (int x =c; x > 0; x--) {
            System.out.println(letters[x-1]);//the number stored starts from 0 so x-1
        }
    }
}
