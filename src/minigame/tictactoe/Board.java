package minigame.tictactoe;

public class Board {
    private final int SIZE = 3;
    private String[][] board = new String[SIZE][SIZE];

    public Board() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = "";
            }
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMove(int row, int col, Player player) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || !board[row][col].equals("-")) {
            return false;
        }

        board[row][col] = player.getSymbol();
        return true;
    }

    public boolean checkWin() {
        // Cek baris dan kolom
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("-")) {
                return true;
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("-")) {
                return true;
            }
        }

        // Cek diagonal
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("-")) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("-")) {
            return true;
        }

        return false;
    }

    public boolean checkWinWithArray() {
        String[][] winningCombinations = {
                // Baris
                { board[0][0], board[0][1], board[0][2] },
                { board[1][0], board[1][1], board[1][2] },
                { board[2][0], board[2][1], board[2][2] },
                // Kolom
                { board[0][0], board[1][0], board[2][0] },
                { board[0][1], board[1][1], board[2][1] },
                { board[0][2], board[1][2], board[2][2] },
                // Diagonal
                { board[0][0], board[1][1], board[2][2] },
                { board[0][2], board[1][1], board[2][0] }
        };

        for (String[] combination : winningCombinations) {
            if (combination[0].equals(combination[1]) && combination[1].equals(combination[2])
                    && !combination[0].equals("")) {
                return true;
            }
        }

        return false;
    }

}
