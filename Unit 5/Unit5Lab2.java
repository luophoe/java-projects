/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5lab2;
import java.util.Scanner;

/**
 *
 * @author luophoe
 */
public class Unit5Lab2 {
    
    public static int drawCard(){
        int card = (int)(13*Math.random()+1);
        return card;
    }
    
    public static void showCardType(int card){
        if (card == 11){
            System.out.println("Jack");
        }else if (card == 12){
            System.out.println("Queen");
        }else if (card == 13){
            System.out.println("King");
        }else if (card == 1){
            System.out.println("Ace");
        }else{
            System.out.println(card);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int dcard, pcard;
        int money=100;
        int round = 0;
       
        while (money > 0){
            System.out.println("\nPut in the money for this bet:");
            Scanner input = new Scanner (System.in); 
            int bet = input.nextInt();
            round++;
            dcard = drawCard();
            pcard = drawCard();
            if (dcard < pcard){
                money = money + bet;
                System.out.println("\nYou win! The dealer card is ");
                showCardType(dcard);
                System.out.println("and your card is ");
                showCardType(pcard);
            }else if(dcard > pcard){
                money = money - bet;
                System.out.println("\nYou lost! The dealer card is ");
                showCardType(dcard);
                System.out.println("and your card is ");
                showCardType(pcard);
            }else{
                System.out.println("\nYou got a tie! The bet will be doubled!");
            
                int dcard2 = drawCard();
                int pcard2 = drawCard();
                if (dcard2 < pcard2){
                    money = money + 2 * bet;
                    System.out.println("\nYou win! The dealer card is ");
                    showCardType(dcard2);
                    System.out.println("and your card is ");
                    showCardType(pcard2);
                }else if (dcard2 > pcard2){
                    money = money - 2 * bet;
                    System.out.println("\nYou lost! The dealer card is ");
                    showCardType(dcard2);
                    System.out.println("and your card is ");
                    showCardType(pcard2);
                }else{
                    System.out.println("\nA tie inside a tie! triple $$$ is yours now!");
                    money = money + 30;
                }
            }
        System.out.println("\nYou have been playing " + round + " round! Your money now is $" + money + "!");
        }
    }
}
    

