package gameEngine;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(9);
        PlayerHuman playerOne = new PlayerHuman("Player 1", Symbol.cross);
        PlayerHuman playerTwo = new PlayerHuman("Player 2", Symbol.circle);
        DrawBoard drawBoard = new DrawBoard(board.getBoard());
        WinnerChecking winnerCheckingPlayerOne = new WinnerChecking();
        WinnerChecking winnerCheckingPlayerTwo = new WinnerChecking();

        int k;
        drawBoard.drawBoard();

        while (true) {

            System.out.println("PlayerHuman, Insert symbol!");
            for (; true; ) {
                k = playerOne.getInsertKeyFromPlayer(board);
                if (playerOne.insertSymbol(board, k))
                    break;
                else System.out.println("Cell is not empty, choose cell again!");
            }
            drawBoard.drawBoard();
            if (winnerCheckingPlayerOne.checkIfPlayerWins(board, playerOne.getSymbol())) {
                System.out.println(playerOne.getName() + " wins!!");
                break;
            }

            if (board.isBoardFull()) {
                System.out.println("Tie!!!");
                break;
            }
            System.out.println("PlayerTwo, Insert symbol!");
            for (; true; ) {
                k = playerTwo.getInsertKeyFromPlayer(board);
                if (playerTwo.insertSymbol(board, k))
                    break;
                else System.out.println("Cell is not empty, choose cell again!");
            }
            drawBoard.drawBoard();
            if (winnerCheckingPlayerTwo.checkIfPlayerWins(board, playerTwo.getSymbol())) {
                System.out.println(playerTwo.getName() + " wins!!");
                break;
            }

            if (board.isBoardFull()) {
                System.out.println("Tie!!!");
                break;
            }
        }
    }
}
