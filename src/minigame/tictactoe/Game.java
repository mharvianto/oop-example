package minigame.tictactoe;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Board board;

    public Game() {
        player1 = new Player("X");
        player2 = new Player("O");
        board = new Board();
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        Player currentPlayer = player1;
        while (true) {
            board.display();
            System.out.println(currentPlayer.getSymbol() + "'s turn!");
            System.out.print("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.print("Enter col (0-2): ");
            int col = sc.nextInt();

            if (board.placeMove(row, col, currentPlayer)) {
                if (board.checkWin()) {
                    System.out.println(currentPlayer.getSymbol() + " wins!");
                    board.display();
                    break;
                }

                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
