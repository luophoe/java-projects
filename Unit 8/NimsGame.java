/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nimsgame;
import java.util.Scanner;
/**
 * Phoebe Luo
 * 11/6/2018
 * @author luophoe
 */

public class NimsGame {
    
public static int drawStones(){
    int num = (int) (15*Math.random()+15);
    return num;
}

public static boolean isValidEntry (int draw, int stones){
    if (draw>stones){
        System.out.println("This is not a valid draw!");
        return false;
    }else{
        return true;
    }
}

public static int playerDraw(int stones){
    Scanner input = new Scanner(System.in);
    int draw;
    do{
     System.out.println("\nHow many do you draw?");
    draw = input.nextInt();
    }while(isValidEntry(draw,stones)==false);
    stones=stones-draw;
    return stones;
    
}

public static int compDraw(int stones){
    int cdraw;
    do{
        cdraw = (int) (3*Math.random()+1);
    }while(isValidEntry(cdraw,stones)==false);
    System.out.println("\nThe computer draw is " + cdraw);
    stones = stones- cdraw;
    return stones;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner input = new Scanner(System.in);
        int stones = drawStones();
        int draw;
        int player = 1;
        
        System.out.println("Hi! Ready to start the game? "
                + " The total number of stones is " + stones);
        
       while (stones>0){
           if(player==1){
               stones=playerDraw(stones);
               System.out.println("current stone number: " + stones);
               if (stones ==0){
                   System.out.println("\nYou lose!!!! Sorry!");
               }else{
                   player=2;
               }
           }else{
               stones=compDraw(stones);
               System.out.println("current stone number: " + stones);
               if (stones ==0){
                   System.out.println("\nYou win!!!! Good job!");
               }else{
                   player=1;
                }
            }
        }
    }
}
     
     
