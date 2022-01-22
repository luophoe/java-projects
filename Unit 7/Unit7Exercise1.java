/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7exercise1;

/**
 * Phoebe Luo
 * 12/10/2018
 * @author luophoe
 */
public class Unit7Exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] board = new String[5][5];
        for (int row = 0; row < 5; row ++){
            for (int col = 0; col < 5; col ++){
                int x = (int)(15* Math.random()+(15*col+1));
                //the range will always be 15 and the starting number will be 15*col+1
                board[row][col] =" " +x;
            }          
        } 
        for (int row = 0; row < 5; row ++){
            for (int col = 0; col < 5; col ++){
                System.out.print(board[row][col] +"\t");
            }
            System.out.println("");
        }
    }
}
