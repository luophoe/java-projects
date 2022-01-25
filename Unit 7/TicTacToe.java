/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 * Phoebe Luo 12/18/2018
 *
 * @author luophoe
 */
public class TicTacToe {

    public static void showBoard(String[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[col][row]);
            }
            System.out.println("");
        }//display the board by calling the method
    }

    public static boolean checkBoard(String[][] board) {
        for (int r = 0; r < 3; r++) {
            if (board[0][r].equals(board[1][r]) && board[0][r].equals(board[2][r]) && !board[0][r].equals(" [] ")) {
                return true;
            }
            if (board[r][0].equals(board[r][1]) && board[r][0].equals(board[r][2]) && !board[r][0].equals(" [] ")) {
                return true;
            }
        }
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !board[0][0].equals(" [] ")) {
            return true;
        }
        if (board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2]) && !board[2][0].equals(" [] ")) {
            return true;
        }//check if there is a winnig row, column, diaginals
        return false;
    }

    public static boolean checkWin(String[][] board) {
        int x;
        for (x = 0; x <= 2; x++) {
            if (board[x][0].equals(board[x][1]) && board[x][0].equals(" X ") && board[x][2].equals(" [] ")) {
                board[x][2] = " X ";
                return false;
            } else if (board[x][0].equals(board[x][2]) && board[x][0].equals(" X ") && board[x][1].equals(" [] ")) {
                board[x][1] = " X ";
                return false;
            } else if (board[x][1].equals(board[x][2]) && board[x][1].equals(" X ") && board[x][0].equals(" [] ")) {
                board[x][0] = " X ";
                return false;
            } else if (board[0][x].equals(board[1][x]) && board[0][x].equals(" X ") && board[2][x].equals(" [] ")) {
                board[2][x] = " X ";
                return false;
            } else if (board[0][x].equals(board[2][x]) && board[0][x].equals(" X ") && board[1][x].equals(" [] ")) {
                board[1][x] = " X ";
                return false;
            } else if (board[1][x].equals(board[2][x]) && board[1][x].equals(" X ") && board[0][x].equals(" [] ")) {
                board[0][x] = " X ";
                return false;
            }
        }
        if (board[0][0].equals(board[1][1]) && board[0][0].equals(" X ") && board[2][2].equals(" [] ")) {
            board[2][2] = " X ";
            return false;
        } else if (board[0][0].equals(board[2][2]) && board[0][0].equals(" X ") && board[1][1].equals(" [] ")) {
            board[1][1] = " X ";
            return false;
        } else if (board[1][1].equals(board[2][2]) && board[1][1].equals(" X ") && board[0][0].equals(" [] ")) {
            board[0][0] = " X ";
            return false;
        } else if (board[2][0].equals(board[1][1]) && board[2][0].equals(" X ") && board[0][2].equals(" [] ")) {
            board[0][2] = " X ";
            return false;
        } else if (board[2][0].equals(board[0][2]) && board[2][0].equals(" X ") && board[1][1].equals(" [] ")) {
            board[1][1] = " X ";
            return false;
        } else if (board[1][1].equals(board[0][2]) && board[1][1].equals(" X ") && board[2][0].equals(" [] ")) {
            board[2][0] = " X ";
            return false;
            //looking for a chance for a winnig row, column or diaginals
        }
        return true;
    }

    public static boolean checkBlock(String[][] board) {
        int x;
        for (x = 0; x <= 2; x++) {
            if (board[x][0].equals(board[x][1]) && board[x][0].equals(" O ") && board[x][2].equals(" [] ")) {
                board[x][2] = " X ";
                return false;
            } else if (board[x][0].equals(board[x][2]) && board[x][0].equals(" O ") && board[x][1].equals(" [] ")) {
                board[x][1] = " X ";
                return false;
            } else if (board[x][1].equals(board[x][2]) && board[x][1].equals(" O ") && board[x][0].equals(" [] ")) {
                board[x][0] = " X ";
                return false;
            } else if (board[0][x].equals(board[1][x]) && board[0][x].equals(" O ") && board[2][x].equals(" [] ")) {
                board[2][x] = " X ";
                return false;
            } else if (board[0][x].equals(board[2][x]) && board[0][x].equals(" O ") && board[1][x].equals(" [] ")) {
                board[1][x] = " X ";
                return false;
            } else if (board[1][x].equals(board[2][x]) && board[1][x].equals(" O ") && board[0][x].equals(" [] ")) {
                board[0][x] = " X ";
                return false;
            }
        }

        if (board[0][0].equals(board[1][1]) && board[0][0].equals(" O ") && board[2][2].equals(" [] ")) {
            board[2][2] = " X ";
            return false;
        } else if (board[0][0].equals(board[2][2]) && board[0][0].equals(" O ") && board[1][1].equals(" [] ")) {
            board[1][1] = " X ";
            return false;
        } else if (board[1][1].equals(board[2][2]) && board[1][1].equals(" O ") && board[0][0].equals(" [] ")) {
            board[0][0] = " X ";
            return false;
        } else if (board[2][0].equals(board[1][1]) && board[2][0].equals(" O ") && board[0][2].equals(" [] ")) {
            board[0][2] = " X ";
            return false;
        } else if (board[2][0].equals(board[0][2]) && board[2][0].equals(" O ") && board[1][1].equals(" [] ")) {
            board[1][1] = " X ";
            return false;
        } else if (board[1][1].equals(board[0][2]) && board[1][1].equals(" O ") && board[2][0].equals(" [] ")) {
            board[2][0] = " X ";
            return false;
            //looking for a winnig row, column or diaginals for the winners
        }

        return true;
    }

    public static void bestMove(String[][] board, int t) {
        if (t == 0) {
            if (board[1][1].equals(" [] ")) {
                board[1][1] = " X ";
            }
        } else {
            // for every steps the best move should be avoiding places that have no chance to win
            // (to help the computer wins as fast as possible and to try the best to avoid ties)
            if (board[2][0].equals(" [] ")&&!board[0][2].equals(" O ")) {
                board[2][0] = " X ";
            }else if (board[0][2].equals(" [] ")&&!board[2][0].equals(" O ")){
                board[0][2] = " X ";
            }else if (board[0][1].equals(" [] ")&&!board[2][1].equals(" O ")){
                board[0][1] = " X ";
            }else if (board[0][0].equals(" [] ")&&!board[2][2].equals(" O ")){
                board[0][0] = " X ";
            }else if (board[1][0].equals(" [] ")&&!board[1][2].equals(" O ")){
                board[1][0] = " X ";
            }else if (board[2][1].equals(" [] ")&&!board[0][1].equals(" O ")){
                board[2][1] = " X ";
            }else if (board[1][2].equals(" [] ")&&!board[1][0].equals(" O ")){
                board[1][2] = " X ";
            }else if (board[1][2].equals(" [] ")&&!board[1][0].equals(" O ")){
                board[1][2] = " X ";
            }//for the last step if the computer doesn't fill in the last blank
            else if (board[2][0].equals(" [] ")&&board[0][2].equals(" O ")) {
                board[2][0] = " X ";
            }else if (board[0][2].equals(" [] ")&&board[2][0].equals(" O ")){
                board[0][2] = " X ";
            }else if (board[0][1].equals(" [] ")&&board[2][1].equals(" O ")){
                board[0][1] = " X ";
            }else if (board[0][0].equals(" [] ")&&board[2][2].equals(" O ")){
                board[0][0] = " X ";
            }else if (board[1][0].equals(" [] ")&&board[1][2].equals(" O ")){
                board[1][0] = " X ";
            }else if (board[2][1].equals(" [] ")&&board[0][1].equals(" O ")){
                board[2][1] = " X ";
            }else if (board[1][2].equals(" [] ")&&board[1][0].equals(" O ")){
                board[1][2] = " X ";
            }else if (board[1][2].equals(" [] ")&&board[1][0].equals(" O ")){
                board[1][2] = " X ";
            }
        }
    }

    public static void compMove(String[][] board, int t) {
        boolean keepGoing = true;
        //set a boolean for ture at first and then use it to check and also keep the methods flowing
        keepGoing = checkWin(board);
        if (keepGoing == false) {
            //if it became false, computer wins
            showBoard(board);
            System.out.println("\nComputer wins!");
            System.exit(1);
        }//if not, keep running other methods
        if (keepGoing) {
            keepGoing = checkBlock(board);
        }
        if (keepGoing) {
            bestMove(board, t);
        }
        showBoard(board);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[][] board = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = " [] ";
                //display blank board before everything
            }
        }
        showBoard(board);

        System.out.println("Ready to start? 1 palyer or 2 players?");
        int choice = input.nextInt();
        //Choice 1: player vs computer
        if (choice == 1) {
            int pTurn = 1;
            int t = 0;
            System.out.println("Player is O and computer is X.");
            while (t < 9) {
                if (pTurn == 1) {
                    System.out.println("\nIt is the computer's turn.");
                    compMove(board, t);
                    pTurn = 2;
                } else if (pTurn == 2) {
                    System.out.println("\nIt is the player's turn.");
                    System.out.println("What is the X coordinate?");
                    int xcoor = input.nextInt();
                    System.out.println("What is the Y coordinate?");
                    int ycoor = input.nextInt();
                    xcoor--;
                    ycoor--;
                    if (board[xcoor][ycoor].equals(" [] ")){
                    board[xcoor][ycoor] = " O ";
                    pTurn = 1;
                    }else{
                        System.out.println("\nThis is a repeated point. Pick a different point.");
                        pTurn = 2;
                    }
                    //make sure that there's no chance for the player to pick a repeated point
                    showBoard(board);
                    if (checkBoard(board)) {
                        System.out.println("Player won");
                        System.exit(1);
                    }
                }
                t++;
            } 
            //if every spots are taken then it's a tie
            System.out.println("\nIt's a tie.");
            
        //Choice 2: player vs player
        } else if (choice == 2) {
            System.out.println("Player 1 is O and player 2 is X.");
            for (int t = 0; t < 9; t++) {
                int playerTurn = 1;
                while (playerTurn == 1) {
                    System.out.println("\nIt is the player 1's turn.");
                    System.out.println("What is the X coordinate?");
                    int xcoor1 = input.nextInt();
                    System.out.println("What is the Y coordinate?");
                    int ycoor1 = input.nextInt();
                    xcoor1--;
                    ycoor1--;
                    board[xcoor1][ycoor1] = " O ";
                    playerTurn = 2;
                }
                showBoard(board);
                if (checkBoard(board)) {
                    System.out.println("Player 1 wins!");
                    System.exit(1);
                }
                if (playerTurn == 2) {
                    System.out.println("\nIt is the player 2's turn.");
                    System.out.println("What is the X coordinate?");
                    int xcoor2 = input.nextInt();
                    System.out.println("What is the Y coordinate?");
                    int ycoor2 = input.nextInt();
                    xcoor2--;
                    ycoor2--;
                    board[xcoor2][ycoor2] = " X ";
                    playerTurn = 1;
                }
                showBoard(board);
                if (checkBoard(board)) {
                    System.out.println("Player 2 wins!");
                    System.exit(1);
                }
            }
        }
    }
}
