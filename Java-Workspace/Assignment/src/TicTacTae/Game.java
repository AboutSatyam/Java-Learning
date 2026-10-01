package TicTacTae;

import java.util.Scanner;

public class Game {

    char[][] board = new char[3][3];
    Scanner input = new Scanner(System.in);


    public Game() {

        for (int row = 0; row < board.length; row++) {

            for (int col = 0; col < board[row].length; col++) {

                board[row][col] = '  ';

            }
        }
    }


}