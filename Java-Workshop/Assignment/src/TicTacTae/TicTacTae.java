
package TicTacTae;

import java.util.Scanner;

public class TicTacTae {
    public static void main(String[] args) {
        // Initialize the 3x3 board with empty spaces
        char[][] board = new char[3][3];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        // Player = X OR Player = O
        char player = 'X';
        boolean gameOver = false;

        Scanner scan = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " Enter: ");

            int row = scan.nextInt();
            int col = scan.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3
                    && board[row][col] == ' ') {

                board[row][col] = player;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    System.out.println("Player " + player + " Has Won");
                    System.out.println();
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }

            } else {
                System.out.println("Invalid Move, Try Again");
            }
        }

        printBoard(board);
        scan.close();
    }

    public static boolean haveWon(char[][] board, char player) {
        // Winning pattern is Row or Column or Diagonal

        // For Rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player
                    && board[row][1] == player
                    && board[row][2] == player) {
                return true;
            }
        }

        // For Columns
        for (int col = 0; col < board.length; col++) {
            if (board[0][col] == player
                    && board[1][col] == player
                    && board[2][col] == player) {
                return true;
            }
        }

        // For Diagonals
        if (board[0][0] == player
                && board[1][1] == player
                && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player
                && board[1][1] == player
                && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row <  board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
