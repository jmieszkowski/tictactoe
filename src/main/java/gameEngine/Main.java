package gameEngine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(9);
        PlayerOne playerOne = new PlayerOne("Player 1", new Symbol('X'));
        PlayerTwo playerTwo = new PlayerTwo("Player 2", new Symbol('O'));
        DrawBoard drawBoard = new DrawBoard(board.getBoard());
        WinnerChecking winnerChecking = new WinnerChecking();
        int k;
        drawBoard.drawBoard();

        while (true) {

            System.out.println("PlayerOne, Insert symbol!");
            for (; true; ) {
                k = playerOne.getSymbolFromPlayer(board);
                if (playerOne.insertSymbol(board, k))
                    break;
                else System.out.println("Cell is not empty, choose cell again!");
            }
            drawBoard.drawBoard();
            if (winnerChecking.checkIfPlayerWins(board, playerOne.getSymbol(), k)) {
                System.out.println(playerOne.getName() + " wins!!");
                break;
            }

            if (board.isBoardFull()) {
                System.out.println("Tie!!!");
                break;
            }
            System.out.println("PlayerTwo, Insert symbol!");
            for (; true; ) {
                k = playerTwo.getSymbolFromPlayer(board);
                if (playerTwo.insertSymbol(board, k))
                    break;
                else System.out.println("Cell is not empty, choose cell again!");
            }
            drawBoard.drawBoard();
            if (winnerChecking.checkIfPlayerWins(board, playerTwo.getSymbol(), k)) {
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
