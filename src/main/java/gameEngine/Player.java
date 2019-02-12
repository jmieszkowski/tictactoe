package gameEngine;

import java.util.Scanner;

@FunctionalInterface
public interface Player {


    boolean insertSymbol(Board board, int k); // used to insert symbol to the board
    default int getInsertKeyFromPlayer(Board board){ // used to get information from Player,
        Scanner inputScanner = new Scanner(System.in); // where he wants to insert the symbol
        int k = inputScanner.nextInt();
        return k;
    }
}
