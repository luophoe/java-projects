/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randommadness;
import java.util.Scanner;
/**
 * Phoebe Luo
 * 09/28/2018
 * @author luophoe
 */
public class RandomMadness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***** Exercise 1 *****");
        int num1=(int)(49 * Math.random()+1);
        int num2=(int)(49 * Math.random()+1);
        int num3=(int)(48 * Math.random()+1);
        int num4=(int)(48 * Math.random()+1);
        int num5=(int)(48 * Math.random()+1);
        int num6=(int)(48 * Math.random()+1);
        System.out.println("The first number is " + num1 + ", the second is " + num4 + ", the third is " + num3 +", the forth is " + num4 + ", the fifth is " + num5 + ", the sixth is " + num6 + ".");
        
        System.out.println("\n***** Exercise 2 *****");
        Scanner input = new Scanner (System.in);
        System.out.println("Put in you guess as 1 for heads and 2 for tails:");
        int guessside = input.nextInt();
        System.out.println("Put in your bet for the game:");
        int bet1 = input.nextInt();
        int side=(int)(2 * Math.random() + 1);
        if (guessside == side){
            System.out.println("You win! Now you get $" + bet1*2);
        }else{
            if(side == 1){
                System.out.println("You lose. It's a head.");
            }else{
                System.out.println("You lose. It's a tail.");
            }    
        }
        
        System.out.println("\n***** Exercise 3 *****");
        int card1=(int)(13 * Math.random()+1);
        switch (card1) {
            case 1:
                System.out.println("You get an Ace!");
                break;
            case 11:
                System.out.println("You get a Jack!");
                break;
            case 12:
                System.out.println("You get a Queen!");
                break;
            case 13:
                System.out.println("You get a King!");
                break;
            default:
                System.out.println("You get " + card1);
                break;
        }
        
        int card2=(int)(13 * Math.random()+1);
        System.out.println("\nPut in you guess for the next card as 1 for lower than the first one, 2 for higher, and 3 for the same number:");
        int guesscard = input.nextInt();
        System.out.println("Put in your bet for the game:");
        int bet2 = input.nextInt();
        if(guesscard == 1){
            if(card2 < card1){
                System.out.println("You win!" + "the card is " + card2 + " and now you get $" + bet2*2);
            }else{
                System.out.println("You lose." + "the card is " + card2);
            }
        }else if(guesscard == 2){
            if(card2 > card1){
                System.out.println("You win!" + "the card is " + card2 + " and now you get $" + bet2*2);
            }else{
                System.out.println("You lose." + "the card is " + card2);
            }
        }else{
            if(card2 == card1){
                System.out.println("You win! You are very lucky cuz now you get $" + bet2*4);
            }else{
                System.out.println("You lose." + "the card is " + card2);
            }
        }
    }
}
