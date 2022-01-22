/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit7lab1;

import java.util.Scanner;

/**
 * Phoebe Luo 
 * 12/12/2018
 * @author luophoe
 */
public class Unit7Lab1 {

    public static void showBoard(int[][] board) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(board[col][row] + "\t");
            }
            System.out.println("");
        }//display the board by calling the method
    }

    public static boolean checkBoard(int[][] board) {
        for (int r = 0; r < 5; r++) {
            if (board[0][r] == board[1][r] && board[0][r] == board[2][r] && board[0][r] == board[3][r] && board[0][r] == board[4][r]) {
                return true;
            }
            if(board[r][0] == board[r][1] && board[r][0] == board[r][2] && board[r][0] == board[r][3] && board[r][0] == board[r][4]) {
                return true;
            }
        }
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] == board[3][3] && board[0][0] == board[4][4]) {
                return true;
            }
        if(board[4][0] == board[3][1] && board[4][0] == board[2][2] && board[4][0] == board[1][3] && board[4][0] == board[0][4]) {
                return true;
        }//check if there is a row of 0/ a column of 0/ diaginals of 0
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Here is your Bingo board:");
        int[][] board = new int[5][5];
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                int x = (int) (15 * Math.random() + (15 * col + 1));
                //the range will always be 15 and the starting number will be 15*col+1
                board[col][row] = x;
            }
        }
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                System.out.print(board[col][row] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nLet's begin.");
        for (int x = 0; x <= 25; x++) {//let it call random numbers for 25 times to make sure (even though not necessary)
            int numbers = (int) (75 * Math.random() + 1);
            System.out.println("\nThe number is: " + numbers);
            System.out.println("Do you have that number? Put in 1 for yes and 2 for no!");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("What is the X coordinate of it?");
                int xcoor = input.nextInt();
                System.out.println("What is the Y coordinate of it?");
                int ycoor = input.nextInt();
                xcoor--;
                ycoor--;
                //make it into the coordinates that fits the array (starting from 0)
                board[xcoor][ycoor] = 0;
                //change the number in that spot into 0
            } else if (choice == 2) {
                System.out.println("Next number then.");
            }
            showBoard(board);
            if(checkBoard(board)){
                System.out.println("\nBingo!!");
                System.exit(1);
            }
        }
    }
}
