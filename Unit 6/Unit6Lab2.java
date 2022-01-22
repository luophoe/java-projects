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
        
        System.out.println("***** Exercise 1 *****");
        Scanner input = new Scanner(System.in);
        System.out.println("Put in your word");
        String word = input.next();
        char[] letters;
        letters = word.toCharArray();
        int c = letters.length;
        int b = c / 2;//middle letter's position is shown when length/2
        char middle1 = word.charAt(b);
        char middle2 = word.charAt(b - 1);
        if (c % 2 == 0) {
            System.out.println("\n1. The middle letter of the word is " + middle2 + " and " + middle1);
            //show the middle letter when the total is 2x+1
        } else {
            System.out.println("\n1. The middle letter of the word is " + middle1);
            //show the middle letter when the total is 2x
        }
        
        System.out.println("\nPut in your name");
        String name = input.next();
        char[] numbers;
        numbers = name.toCharArray();
        int e = numbers.length;
        int f = e / 2;//middle letter's position is shown when length/2
        System.out.println("\n2. There are " + e + " letters in your name.");
        System.out.println("\n3. Your name backword is:");
        //System.out.println(e);
        for (int y =e; y > 0; y--) {
            System.out.println(numbers[y-1]);//the number stored starts from 0 so x-1
        }
        char middle3 = name.charAt(f);
        char middle4 = name.charAt(f - 1);
        if (e % 2 == 0) {
            System.out.println("\n4. The middle letter is " + middle3 + " and " + middle4);
            //show the middle letter when the total is 2x+1
        } else {
            System.out.println("\n4. The middle letter is " + middle3);
            //show the middle letter when the total is 2x
        }
        
        
        System.out.println("\n***** Exercise 2 *****");
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
    }
}
