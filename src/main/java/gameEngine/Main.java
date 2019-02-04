package gameEngine;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(9);
        PlayerOne playerOne = new PlayerOne("Player 1", new Symbol('X'));
        PlayerTwo playerTwo = new PlayerTwo("Player 2", new Symbol('O'));
        WinnerChecking winnerChecking = new WinnerChecking();
        int k;
        DrawBoard.drawBoard(board.getBoard());

        while (true) {

            System.out.println("PlayerOne, Insert symbol!");
            k = playerOne.getSymbolFromPlayer(board);
            playerOne.insertSymbol(board,k);
            DrawBoard.drawBoard(board.getBoard());
            if (winnerChecking.checkIfPlayerWins(board, playerOne.getSymbol(), k)) {
                System.out.println(playerOne.getName() + " wins!!");
                break;
            }

            if (board.isBoardFull()){
                System.out.println("Tie!!!");
                break;
            }
            System.out.println("PlayerTwo, Insert symbol!");
            k = playerTwo.getSymbolFromPlayer(board);
            playerTwo.insertSymbol(board,k);
            DrawBoard.drawBoard(board.getBoard());
            if (winnerChecking.checkIfPlayerWins(board, playerTwo.getSymbol(), k)) {
                System.out.println(playerTwo.getName() + " wins!!");
                break;
            }

            if (board.isBoardFull()){
                System.out.println("Tie!!!");
                break;
            }

        }


    }
}
